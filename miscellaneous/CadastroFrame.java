import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CadastroFrame extends JFrame implements ActionListener{
   private JPanel _mainPanel = null;
         
   public CadastroFrame(){
      setTitle("Cadastro de Contatos: ");
      setSize(300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      initComponentes();

   }
   
   private void initComponentes() {
      _mainPanel = new JPanel();
      getContentPane().add(_mainPanel);
      _mainPanel.setLayout(new GridBagLayout());
   
      addMenu();
      
      addLabelNome();
      addLabelTelefone();
      addLabelEnd();
      addTexFieldNome();
      addTexFieldTelefone();
      addTextFieldEndereço();
      addButtonOK();
   }
   
   private void addMenu() {
      JMenuBar menuBar = new JMenuBar();

      JMenu menuArquivo = new JMenu("Arquivo");

      JMenuItem menuItemSair = new JMenuItem("Sair");
      menuItemSair.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            System.exit(0);
         }
      });
      
      menuArquivo.add(menuItemSair);

      menuBar.add(menuArquivo);
      setJMenuBar(menuBar);
   }

   private void addLabelNome() {
      JLabel label = new JLabel("Nome:");
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 0;
      
      _mainPanel.add(label, gbc);
   }

   private void addLabelTelefone() {
      JLabel label = new JLabel("Telefone:");
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 1;
      
      _mainPanel.add(label, gbc);
   }
   
   private void addLabelEnd() {
      JLabel label = new JLabel("End.:");
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 2;
      
      _mainPanel.add(label, gbc);
   }
   private void addTexFieldNome() {
      JTextField textfield = new JTextField();
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 0;
      textfield.setPreferredSize(new Dimension(100, 22));
      
      _mainPanel.add(textfield, gbc);
   }

   private void addTexFieldTelefone() {
      JTextField textfield = new JTextField();
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 1;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      
      _mainPanel.add(textfield, gbc);
   }
   
   private void addTextFieldEndereço() {
      JTextField textfield = new JTextField();
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 2;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      
      _mainPanel.add(textfield, gbc);
   }
   private void addButtonOK() {
      JButton button = new JButton("OK");
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.gridwidth = 2;
      _mainPanel.add(button, gbc);
   }
   
   public static void main(String[] args) {
      new CadastroFrame().setVisible(true);
   }

   public void actionPerformed(ActionEvent arg0) {
      //não foi implementado o método      
   }
}
