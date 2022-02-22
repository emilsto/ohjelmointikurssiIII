import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HenkiloApp{

    public static void main( String args[]){
        ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

        JFrame mainWindow = new JFrame("Henkilo App");
        mainWindow.setSize(400,400);

        mainWindow.setLayout(new GridLayout(10,1));

        JButton addPersonBtn = new JButton("Add person");
        JButton printPersonBtn = new JButton("Print all (console)");
        JLabel addNameLabel = new JLabel("Enter person's name:");
        JLabel addAgeLabel = new JLabel("Enter person's age:");
        JLabel addAddressLabel = new JLabel("Enter person's address:");
        JLabel addPostalLabel = new JLabel("Enter person's postalcode:");
        JLabel addKuntaLabel = new JLabel("Enter person's kunta:");
        JTextField firstNameTextField = new JTextField();
        JTextField AgeTextField = new JTextField();
        JTextField AddressTextField = new JTextField();
        JTextField PostalTextField = new JTextField();
        JTextField KuntaTextField = new JTextField();


        mainWindow.getContentPane().add(addNameLabel);
        mainWindow.getContentPane().add(firstNameTextField);
        mainWindow.getContentPane().add(addAgeLabel);
        mainWindow.getContentPane().add(AgeTextField);
        mainWindow.getContentPane().add(addAddressLabel);
        mainWindow.getContentPane().add(AddressTextField);
        mainWindow.getContentPane().add(addPostalLabel);
        mainWindow.getContentPane().add(PostalTextField);
        mainWindow.getContentPane().add(addKuntaLabel);
        mainWindow.getContentPane().add(KuntaTextField);
        mainWindow.getContentPane().add(addPersonBtn);
        mainWindow.getContentPane().add(printPersonBtn);




        mainWindow.setVisible(true);

                //Lisätään tapahtuman käsittelijät
                addPersonBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){ 
                        String nimi = firstNameTextField.getText();
                        int ika = Integer.parseInt(AgeTextField.getText());
                        String katu = AddressTextField.getText();
                        String postinro = PostalTextField.getText();
                        String kunta = KuntaTextField.getText();

                        henkilot.add(new Henkilo(nimi, ika, new Osoite(katu, postinro, kunta)));

                        System.out.println(nimi);

                        firstNameTextField.setText("");
                        AgeTextField.setText("");
                        AddressTextField.setText("");
                        PostalTextField.setText("");
                        KuntaTextField.setText("");
                    }
                });

                printPersonBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){ 
                        int index = 1;
                        for (Henkilo h: henkilot ) {
                            System.out.println("Henkilo #" + index);
                            h.tulostaTiedot();
                            System.out.println("------------------------");
                            index++;
                        }
                    }
                });

    }



}