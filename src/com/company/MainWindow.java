package com.company;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    public MainWindow(){
        super("Dining philosophers");
        GridLayout layout = new GridLayout(4, 0, 5, 12);
        setLayout(layout);
        //for (int i = 0; i < 8; i++) {
           // add(new JButton("Кнопка " + i));
        //}
        add(new LogPanel().button);
        setSize(1200, 800);
        setVisible(true);
    }
}
