package basicSwings;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello there");
        setLayout( new BorderLayout());         // creating border look:

        toolbar = new Toolbar();
        textPanel = new TextPanel();

        toolbar.setStringListener(new StringListener(){
            public void textEmitted(String text) {
                 textPanel.appendText(text);
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

}
