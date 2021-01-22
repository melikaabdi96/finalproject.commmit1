package com.company.ball;

import com.company.Sound;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class FirstScreen {
    private JFrame f;
    JButton startButton;
    JLabel nameL;
    JTextField name;
    Sound sound;
    public FirstScreen() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        f = new JFrame();
        sound = new Sound("background.wav");
        f.setTitle("First Screen");
        nameL = new JLabel("Please enter your name : ");f.add(nameL);// player ba username password
        name = new JTextField();f.add(name);
        startButton = new JButton("Let's play ");f.add(startButton);
        f.setLayout(new BorderLayout());
        f.setContentPane(new JLabel(new ImageIcon("images\\first_screen.jpg")));
        f.setLayout(new FlowLayout());
        startButton.addActionListener(e -> {
            //88888888888888888888888888888888888888888888888
            f.setVisible(false);
        });
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem exitItem = new JMenuItem("Exit"); // create exit item

        fileMenu.setBounds(0, 0, 100, 100);
        fileMenu.add(exitItem); // add exit item to file menu
        mb.add(fileMenu);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.ALT_MASK));
        exitItem.addActionListener(e -> {
            f.dispose();
            // System.exit(0);
        });
        f.setJMenuBar(mb);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //-------------------------------------------------------------------------------------------------------------------------------
        f.setFont(new Font("Arial", Font.PLAIN, 18));
    }

}

