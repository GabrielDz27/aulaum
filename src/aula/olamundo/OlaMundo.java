package aula.olamundo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OlaMundo extends JFrame {
    /**
     Aprendendo uma Jframe
     @author Gabriel 
     @since 2024-09-05
     */
    
    private static JLabel directionsLabel = new JLabel("Coloca o seu nome na caixa");
    private static JLabel outputLabel = new JLabel("                           ");
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Me aperta");

    public static void main(String[] args) throws Exception {
       
        OlaMundo window = new OlaMundo();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Meu primeiro JFrame");
        //configuracao da janela como eu quero

        window.setLayout(new GridLayout(3,2));
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputLabel);

        //  window.pack();
        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                buttonClick(e);
            }
        });
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void buttonClick (ActionEvent e){
    
     //   JOptionPane.showMessageDialog(directionsLabel, "ola", "Ola mundo", JOptionPane.INFORMATION_MESSAGE);
        String yourname = nameBox.getText();
        String outputMessage = " Ola " + yourname;
        outputLabel.setText(outputMessage);
    
    }

}
