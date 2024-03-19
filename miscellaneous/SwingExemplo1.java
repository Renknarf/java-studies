import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;//requisitando a classe jlabel
import javax.swing.JPanel;
//essas linhas são importantes pois sem elas o programa nem compila

public class SwingExemplo1 extends JFrame  // O nome do arquivo será SwingExemplo1 e poderá herdar por padrão o jframe que é disponibilizada no jlabel e jpanel abaixo
{
     JPanel panel;
     JLabel msg;
     
     public SwingExemplo1()//declaração de duas vaiaveis que representam o painel onde ficam os componentes e a label de texto
     {
          super("Java!");
     }
   public void criaJanela ()//tem o mesmo nome do nosso programa, e é chamada de "construtor". Dentro dele chamamos um método da classe pai - JFrame - a qual herdamos. Esta linha configura o título da janela para "Java!". Em seguida criamos um método chamado "criaJanela", o qual usaremos para criar os componentes e mostrar a nossa aplicação. Dentro deste método ( para quem não sabe, um método é nada mais do que uma função normal, porém pertencente a uma determinada classe ) é que fazemos todo o "trabalho sujo". Primeiramente criamos um painel para acomodar os componentes e por fim é criado um label de texto contendo a frase "www.vivaolinux.com.br". Tudo isso pode é feito nas linhas 
   {
      panel = new JPanel();
      msg = new JLabel ("www.vivaolinux.com.br");
      
      panel.add(msg);
      
      getContentPane ().add(panel,BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//executa a tarefa de adicionar o nosso componente de texto ao painel. Um programa gráfico em Java pode conter 3 tipos diferentes de janela: Um JFrame, o qual usamos em nosso exemplo, para representar a janela "principal" da aplicação, um JDialog para representar uma janela de diálogo (uma janela secundária, como uma janela de formatação de fonte do texto, por exemplo ), e, por último, um JApplet para ser usado em Browsers
      
      pack();
      setVisible(true);
      
   }
   public static void main(String[] args)
   {
      SwingExemplo1 s = new SwingExemplo1();
      s.criaJanela();


   }

}
