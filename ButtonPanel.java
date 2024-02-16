import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ButtonPanel extends JPanel{
JButton addTask;
JButton delTask;

    ButtonPanel(){
    // customizing button panel
        this.setPreferredSize(new Dimension(500, 100));
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0xFFFF66));
        this.setBorder(
            BorderFactory.createCompoundBorder(new EmptyBorder(20,30,20,30), 
            this.getBorder())
        );

    // customizing add Task button 

        addTask = new JButton("+");
        addTask.setPreferredSize(new Dimension(60, 0));
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 45));
        addTask.setFocusable(false);
        addTask.setBackground(new Color(0xFFF8DC));


    // customizing delete task button
        delTask = new JButton("-");
        delTask.setPreferredSize(new Dimension(60, 0));
        delTask.setFont(new Font("Sans-serif", Font.PLAIN, 45));
        delTask.setFocusable(false);
        delTask.setBackground(new Color(0xFFF8DC));

    // adding stuff
        this.add(addTask, BorderLayout.EAST);
        this.add(delTask, BorderLayout.WEST);
    }

    public JButton getAddTask(){
        return addTask;
    }
    public JButton getDelTask(){
        return delTask;
    }
}
