import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class TitleBar extends JPanel{
    TitleBar(){
    // customizing title bar
        this.setPreferredSize(new Dimension(500, 80));
        this.setLayout(null);
        this.setBackground(new Color(0xFFFF66));

    // customizing title text
        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 40));
        titleText.setBounds(15,0,500,80);
        titleText.setForeground(Color.black);

    // adding stuff
        this.add(titleText);
    }
}
