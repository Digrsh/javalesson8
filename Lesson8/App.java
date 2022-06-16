package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {
    int counter = 0;
    public App() {
        setTitle("My 1st window app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,300,300);

        Font font = new Font ("Arrial", Font.BOLD, 20);


        JButton jButton = new JButton();
        jButton.setFont(font);
        add(jButton, BorderLayout.NORTH);

        JButton jButton2 = new JButton("bottom button");
        jButton2.setFont(font);
        add(jButton2, BorderLayout.SOUTH);



        jButton.setText(String.valueOf(0));


        //ButtonAction buttonAction = new ButtonAction(jButton);

        jButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButton.setText(generateTelephoneNumber());
                    }
                }
        );

        setVisible(true);
    }

    public String generateTelephoneNumber () {
        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(999)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;
    }

}