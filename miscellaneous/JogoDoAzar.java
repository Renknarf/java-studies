import javax.swing.JOptionPane;
 import java.text.NumberFormat;
public class JogoDoAzar extends javax.swing.JFrame {
    
     public static String tamanho;
    public static double valorAposta, valorBanco, valorJogador;
    public static boolean jogada;
    public static NumberFormat nf = NumberFormat.getCurrencyInstance();
    public static int dado1, dado2, soma, pontos,cont;
    
    public JogoDoAzar() {
        initComponents();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        bIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfBanco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfJogador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfAposta = new javax.swing.JTextField();
        bApostar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bJogar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfDado1 = new javax.swing.JTextField();
        tfDado2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfSoma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPontos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do azar");
        jPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        bIniciar.setBackground(java.awt.Color.black);
        bIniciar.setForeground(java.awt.Color.red);
        bIniciar.setText("Iniciar");
        bIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        jPanel1.add(bIniciar);
        bIniciar.setBounds(20, 90, 88, 19);

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("R$ Banco");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 80, 70, 15);

        tfBanco.setBackground(java.awt.Color.black);
        tfBanco.setForeground(java.awt.Color.red);
        tfBanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfBanco);
        tfBanco.setBounds(130, 100, 90, 19);

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("R$ Jogador");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 80, 90, 15);

        tfJogador.setBackground(java.awt.Color.black);
        tfJogador.setForeground(java.awt.Color.red);
        tfJogador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfJogador);
        tfJogador.setBounds(260, 100, 100, 19);

        jSeparator1.setBackground(java.awt.Color.black);
        jSeparator1.setForeground(java.awt.Color.red);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 130, 400, 10);

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Valor da aposta");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 110, 15);

        tfAposta.setBackground(java.awt.Color.black);
        tfAposta.setForeground(java.awt.Color.red);
        tfAposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        tfAposta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApostaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfApostaFocusLost(evt);
            }
        });
        tfAposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApostaKeyPressed(evt);
            }
        });

        jPanel1.add(tfAposta);
        tfAposta.setBounds(20, 170, 110, 19);

        bApostar.setBackground(java.awt.Color.black);
        bApostar.setForeground(java.awt.Color.red);
        bApostar.setText("APOSTAR");
        bApostar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApostarActionPerformed(evt);
            }
        });

        jPanel1.add(bApostar);
        bApostar.setBounds(140, 140, 100, 50);

        jSeparator2.setBackground(java.awt.Color.black);
        jSeparator2.setForeground(java.awt.Color.red);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 400, 10);

        bJogar.setBackground(java.awt.Color.black);
        bJogar.setForeground(java.awt.Color.red);
        bJogar.setText("JOGAR DADOS");
        bJogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJogarActionPerformed(evt);
            }
        });

        jPanel1.add(bJogar);
        bJogar.setBounds(270, 140, 130, 60);

        jLabel4.setBackground(java.awt.Color.black);
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Dado 1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 230, 45, 15);

        jLabel5.setBackground(java.awt.Color.black);
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Dado 2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 230, 45, 15);

        tfDado1.setBackground(java.awt.Color.black);
        tfDado1.setForeground(java.awt.Color.red);
        tfDado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfDado1);
        tfDado1.setBounds(30, 260, 80, 19);

        tfDado2.setBackground(java.awt.Color.black);
        tfDado2.setForeground(java.awt.Color.red);
        tfDado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfDado2);
        tfDado2.setBounds(130, 260, 70, 19);

        jLabel6.setBackground(java.awt.Color.black);
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Soma");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 230, 45, 15);

        jSeparator3.setBackground(java.awt.Color.black);
        jSeparator3.setForeground(java.awt.Color.red);
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(250, 130, 10, 80);

        tfSoma.setBackground(java.awt.Color.black);
        tfSoma.setForeground(java.awt.Color.red);
        tfSoma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfSoma);
        tfSoma.setBounds(210, 260, 80, 19);

        jLabel7.setBackground(java.awt.Color.black);
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Pontos");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 230, 45, 15);

        tfPontos.setBackground(java.awt.Color.black);
        tfPontos.setForeground(java.awt.Color.red);
        tfPontos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfPontos);
        tfPontos.setBounds(310, 260, 80, 19);

        jLabel8.setBackground(java.awt.Color.black);
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Status");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 300, 39, 15);

        tfStatus.setBackground(java.awt.Color.black);
        tfStatus.setForeground(java.awt.Color.red);
        tfStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(tfStatus);
        tfStatus.setBounds(30, 330, 360, 19);

        jLabel9.setBackground(java.awt.Color.black);
        jLabel9.setFont(new java.awt.Font("Liberty BT", 1, 48));
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("Jogo do Azar");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 10, 260, 50);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-425)/2, (screenSize.height-392)/2, 425, 392);
    }// </editor-fold>                        

    private void bJogarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        dado1 = 1+(int) (Math.random()*5);
        dado2 = 1+(int) (Math.random()*5);
        soma = dado1 + dado2;
        tfDado1.setText(String.valueOf(dado1));
        tfDado2.setText(String.valueOf(dado2));
        tfSoma.setText(String.valueOf(soma));
        tfPontos.setText(String.valueOf(pontos));
        if (cont<1){
             pontos = soma;
             tfPontos.setText(String.valueOf(pontos));
             tfStatus.setText("Você precisa tirar outro "+soma);
             cont = cont +1;
        }else {
                    jogada = false;
                    if (soma == pontos) {
                        tfStatus.setText("Você venceu esta aposta!!!");
                        valorBanco -= valorAposta;
                        valorJogador += valorAposta;
                    } else {
                        tfStatus.setText("Você perdeu a aposta!!!");
                        valorBanco += valorAposta;
                        valorJogador -= valorAposta;
                    }
                    tfJogador.setText(nf.format(valorJogador));
                    tfBanco.setText(nf.format(valorBanco));
                    tfAposta.setEnabled(true);
                    bJogar.setEnabled(false);
                    valorAposta = 0;
                    tfAposta.requestFocus();
        cont=0;        
        }
                if (valorBanco == 0) {
                    JOptionPane.showMessageDialog(null,"Parabéns, você ganhou o jogo!!!");
                    bIniciar.setEnabled(true);
                    bJogar.setEnabled(false);
                    tfAposta.setEnabled(false);
                }
                if (valorJogador == 0) {
                    JOptionPane.showMessageDialog(null, "Você tem muito azar...perdedor!!!");
                    bIniciar.setEnabled(true);
                    bJogar.setEnabled(false);
                    tfAposta.setEnabled(false);
                }
        
    }                                      

    private void bApostarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (valorAposta>valorBanco || valorAposta>valorJogador || valorAposta==0) {
            tfStatus.setText("Valor inválido para aposta!!!");
            tfAposta.requestFocus();
            bApostar.setEnabled(true);
        } else {
            tfAposta.setEnabled(false);
            bJogar.setEnabled(true);
            bApostar.setEnabled(false);
            tfStatus.setText("Clique no botão Jogar Dados para fazer a sua jogada!!!");
            tfDado1.setText(null);
            tfDado2.setText(null);
            tfSoma.setText(null);
            tfPontos.setText(null);
        }
    }                                        

    private void tfApostaKeyPressed(java.awt.event.KeyEvent evt) {                                    
        tamanho= tfAposta.getText();
        if (tamanho.length()>0) {
            bApostar.setEnabled(true);
        } else {
            bApostar.setEnabled(false);
        }
    }                                   

    private void tfApostaFocusLost(java.awt.event.FocusEvent evt) {                                   
        try {
            valorAposta = Double.parseDouble(tfAposta.getText());
            tfAposta.setText(nf.format(valorAposta));
        } catch (NumberFormatException e) {
            tfAposta.setText("R$ 0,00");
            valorAposta = 0;
        }
    }                                  

    private void tfApostaFocusGained(java.awt.event.FocusEvent evt) {                                     
        tfAposta.setText(String.valueOf(valorAposta));
        tfAposta.selectAll();
    }                                    

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tfBanco.setText("R$ 1000,00");
        tfJogador.setText("R$ 1000,00");
        tfStatus.setText("Boa Sorte!!!");
        tfDado1.setText(null);
        tfDado2.setText(null);
        tfSoma.setText(null);
        tfPontos.setText(null);
        tfAposta.setEnabled(true);
        bIniciar.setEnabled(false);
        tfAposta.requestFocus();
        valorAposta=0;
        valorBanco=1000;
        valorJogador=1000;
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDoAzar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton bApostar;
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bJogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField tfAposta;
    private javax.swing.JTextField tfBanco;
    private javax.swing.JTextField tfDado1;
    private javax.swing.JTextField tfDado2;
    private javax.swing.JTextField tfJogador;
    private javax.swing.JTextField tfPontos;
    private javax.swing.JTextField tfSoma;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration                   
    
}
