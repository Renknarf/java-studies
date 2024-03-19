import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PasswordField extends JFrame {

   private JLabel label;
   private JPasswordField passwordField;

   public PasswordField()
   {
      super( "Testing JTextField and JPasswordField" );

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      label = new JLabel("Digite algo e pressione Enter. \n");
      container.add( label );
      passwordField = new JPasswordField( "Viva o Linux" );
      container.add( passwordField );

      TextFieldHandler handler = new TextFieldHandler();
      passwordField.addActionListener( handler );

      setSize( 325, 100 );
      setVisible( true );
   }

    public static void main( String args[] )
   { 
      PasswordField application = new PasswordField();

      application.setDefaultCloseOperation( 
         JFrame.EXIT_ON_CLOSE );
   }

   private class TextFieldHandler implements ActionListener {

      public void actionPerformed( ActionEvent event )
      {
         String string = "";
         if ( event.getSource() == passwordField ) {
            JPasswordField pwd = ( JPasswordField ) event.getSource();
            string = "passwordField: " +
                new String( passwordField.getPassword() );
         }
         JOptionPane.showMessageDialog( null, string );
      }
   }  
}
