import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CounterApp {
    static int counter = 0;
    public static void main( String args[]){

        
        JFrame mainWindow = new JFrame("Counter App");
        mainWindow.setSize(400,400);


        mainWindow.setLayout(new GridLayout(10,1));

        //Swing widgettejä mm. JLabel, JButton, JSwitch, JInputField

        JLabel counterLabel = new JLabel(String.valueOf(counter));
        JTextField firstNameTextField = new JTextField();

        counterLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JButton clickmeButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");

        mainWindow.getContentPane().add(counterLabel);
        mainWindow.getContentPane().add(clickmeButton);
        mainWindow.getContentPane().add(decrementButton);
        mainWindow.getContentPane().add(firstNameTextField);

        mainWindow.setVisible(true);

        //Lisätään tapahtuman käsittelijä
        clickmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                counter++;
                counterLabel.setText( "" + counter );
            }
        });
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                counter--;
                counterLabel.setText( "" + counter );
            }
        });


    }
}
