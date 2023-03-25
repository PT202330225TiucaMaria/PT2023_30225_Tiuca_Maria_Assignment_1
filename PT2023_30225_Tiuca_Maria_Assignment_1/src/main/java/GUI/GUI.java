package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener{

    int count=0;
    JFrame frame;
    JLabel label;
    JPanel panel;

    public GUI() {
        frame=new JFrame();
        //ADAUGARE BUTON
        JButton button=new JButton("click me");
        button.addActionListener(this);
        //adaugare scris
        label=new JLabel("Nr click: "+count);
        panel=new JPanel();
        JLabel userLabel=new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        JTextField userText=new JTextField(20);
        userText.setBounds(100,20,165,25);

        JLabel pLabel=new JLabel("Parola:");
        userLabel.setBounds(10,50,80,25);
        JTextField pText=new JTextField(20);
        pText.setBounds(100,20,165,25);


        panel.setBorder(BorderFactory.createEmptyBorder(250,250,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        panel.add(userLabel);
        panel.add(pLabel);
        panel.add(userText);
        panel.add(pText);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Centru  Spatial");
        frame.pack();
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Nr click: "+ count);
    }
}
