import javax.swing.JOptionPane;

public class Mostra_Info {

   public static void main(String args[]) {

      String nome;
      int idade;
      float salario;
      
      nome = JOptionPane.showInputMessage("Digite o nome:");
      
      idade = Integer.parseInt(JOptionPane.showInputMessage("Digite a idade:"));
      
      salario = Float.parseFloat(JOptionPane.showInputMessage("Digite o salario:"));
      
      JOptionPane.showMessageDialog(null, "Nome = "+nome, "Nome", JOptionPane.PLAIN_MESSAGE);
      
      JOptionPane.showMessageDialog(null, "Idade = "+idade, "Idade", JOptionPane.PLAIN_MESSAGE);
      
      JOptionPane.showMessageDialog(null, "Salário = "+salario, "Salario", JOptionPane.PLAIN_MESSAGE);
        
         System.exit( 0 );

   }

} 
