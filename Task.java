import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel implements ActionListener{
    JTextField taskName;
    JCheckBox doneCheckBox;
    boolean isChecked;

    Task(){
    // customizing task panel 
        this.setPreferredSize(new Dimension(440, 60));
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.gray, 1));

    // customizing the checkox
        doneCheckBox = new JCheckBox();
        doneCheckBox.setPreferredSize(new Dimension(40, 0));
        doneCheckBox.setBackground(new Color(0xFFF8DC));
        doneCheckBox.setFocusable(false);
        doneCheckBox.setLayout(new BorderLayout());
        doneCheckBox.setHorizontalAlignment(JCheckBox.CENTER);
        doneCheckBox.setVerticalAlignment(JCheckBox.CENTER);
        doneCheckBox.setBackground(new Color(0xFFF8DC));

    // customizing the task name 
        taskName = new JTextField();
        taskName.setText("Enter your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        taskName.setBackground(new Color(0xFFF8DC));
        taskName.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if(taskName.getText().equals("Enter your task here")){
                    taskName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(taskName.getText().equals("")){
                    taskName.setText("Enter your task here");
                }
            }
        });     
        
    // adding stuff
        this.add(doneCheckBox, BorderLayout.WEST);
        this.add(taskName, BorderLayout.CENTER);

    // adding function to done button
        doneCheckBox.addActionListener(this);
    }

    public void changeState(){
        // if button is isChecked select certain color
        if(!isChecked){
            doneCheckBox.setBackground(new Color(0x90EE90));
            taskName.setBackground(new Color(0x90EE90));
            isChecked = true;
        }else{
        // if button is not isChecked select certain color
            doneCheckBox.setBackground(new Color(0xFFF8DC));
            taskName.setBackground(new Color(0xFFF8DC));
            isChecked = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == doneCheckBox){
            changeState();
        }
    }
}
