package basicSwings;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private JButton btn;

    public MainFrame(){
        super("Hello there");
        setLayout( new BorderLayout());         // creating border look:

        textPanel = new TextPanel();
        btn = new JButton("General Kenobi!");

        btn.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                textPanel.appendText("Hello\n");

            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

}
