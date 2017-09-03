package basicSwings;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener{
    private JButton hodor;
    private JButton obiwan;
    private StringListener textListener;

    public Toolbar(){
        hodor = new JButton("Hodor");
        obiwan = new JButton("Obiwan");

        hodor.addActionListener(this);
        obiwan.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(hodor);
        add(obiwan);
    }
    public void setStringListener(StringListener listener){
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton)e.getSource();

        if(clicked == hodor){
            if(textListener != null)
                textListener.textEmitted(("Hold the door!\n"));
        }
        else if( clicked == obiwan){
            if(textListener != null)
                textListener.textEmitted("Hello there!\n");
        }
    }
}
