package com.company;
import javax.swing.*;

public class LogPanel extends JPanel{
    public JButton button;
    public LogPanel(){
        DefaultListModel<String> logStrings = new DefaultListModel<>();
        logStrings.addElement("Hi");
        logStrings.addElement("Bro");
        button = new JButton("Кнопка ");
    }
}
