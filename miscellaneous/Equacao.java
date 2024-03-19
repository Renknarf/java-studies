import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Equacao extends JFrame implements ActionListener {

   static JPanel pNorte,jp1,jp2,jp3;
   static JLabel lb,l1,l2,l3,l4,l5,l6;
   static JTextField tf1,tf2,tf3;
   static JButton b1,b2;
   private Container janela;
   
   public Equacao() {
   
      setTitle("");
      setSize(300,300);
      setResizable(false);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      pNorte = new JPanel();
      pNorte.setLayout(new FlowLayout());
      lb = new JLabel("A*x^2 + B*x + C = 0");
      
      jp1 = new JPanel();
      jp1.setLayout(new GridLayout(6,1,10,10));
      
      jp2 = new JPanel();
      jp2.setLayout(new GridLayout(6,1,10,10));
      
      jp3 = new JPanel();
      jp3.setLayout(new FlowLayout());
      
      l1 = new JLabel("Entre com o valor de a:");
      tf1 = new JTextField(10);
      l2 = new JLabel("Entre com o valor de b:");
      tf2 = new JTextField(10);
      l3 = new JLabel("Entre com o valor de c:");
      tf3 = new JTextField(10);
      l4 = new JLabel("");
      l5 = new JLabel("");
      l6 = new JLabel("");
      
      b1 = new JButton("Calcular");
      b1.addActionListener(this);
      b2 = new JButton("Novo cálculo");
      b2.addActionListener(this);
      
      janela = getContentPane();
      jp1.add(l1);   jp2.add(tf1);  jp3.add(b1);
      jp1.add(l2);   jp2.add(tf2);  jp3.add(b2);
      jp1.add(l3);   jp2.add(tf3);
      jp1.add(l4);
      jp1.add(l5);
      jp1.add(l6);
      pNorte.add(lb);
      janela.add(pNorte,BorderLayout.NORTH);
      janela.add(jp1,BorderLayout.WEST);
      janela.add(jp2,BorderLayout.CENTER);
      janela.add(jp3,BorderLayout.SOUTH);
   }
   
   public void actionPerformed(ActionEvent evt) {
      try {
         Object source = evt.getSource();
         if(source == b1) {
         
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = Double.parseDouble(tf3.getText());
            
            calcula_equacao(a,b,c);
            
         }
         if(source == b2) {
           
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
         }
      } catch(RuntimeException e) {
         System.out.println("Caught Runtime Exception " +e);
      }
      catch(Exception e) {
         System.out.println("\nCaught Exception " +e);
      }
   }
   
   public void calcula_equacao(double a,double b,double c) {
   
         if(a == 0.00) 
         JOptionPane.showMessageDialog(null,"O valor de a deve ser maior que zero!","Atenção",JOptionPane.WARNING_MESSAGE);
         else {
	           
	            delta = (b*b - 4*(a*c));
    	        l4.setText("Delta: " +delta);
    	       
    	        if(delta == 0.00) {
	               x1 = -b/2*a;
    	           x2 = -b/2*a;
    	           l5.setText("Raiz 1 = " +x1);
    	           l6.setText("Raiz 2 = " +x2);
    	        }
    	        
            else if(delta > 0.00) {
            
               x1 = ((-b/2*a) - (Math.sqrt(delta))/2*a);
               x2 = ((-b/2*a) + (Math.sqrt(delta))/2*a);
               l5.setText("Raiz 1 = " +x1);
               l6.setText("Raiz 2 = " +x2);
            }
            else if(delta < 0.00) {
            
                delta = -delta;
                real = -b/2*a;
                img = (Math.sqrt(delta)/2*a);
                l5.setText("parte real: " +real);
                l6.setText("parte imaginária: " +img);
            }
         }
      
    }
   public static void main(String args[]) {
   
      Equacao window = new Equacao();
      window.setVisible(true);
      
   }
   
	private double delta = 0.00;
	private double x1 = 0.00;
	private double x2 = 0.00;
	private double real = 0.00;
	private double img = 0.00;

}
