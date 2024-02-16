import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class List extends JPanel{

    List(){
    // customizing grid layout 
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);        
        this.setLayout(layout);
        this.setBorder(
            BorderFactory.createCompoundBorder(new EmptyBorder(0,30,0,20), 
            this.getBorder())
        );
        this.setBackground(new Color(0xFFFF66));

    }
}
