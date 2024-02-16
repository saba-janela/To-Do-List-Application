import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class AppFrame extends JFrame implements ActionListener{
    TitleBar titleBar;
    List list;
    ButtonPanel buttonPanel;
    Task task;
    JButton addTask;
    JButton delTask;
    ArrayList<Task> taskArr = new ArrayList<Task>();

    AppFrame(){
    // customizing the frame
        this.setTitle("To-Do List");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 700);
        this.setResizable(false);
        this.setVisible(true);

    // creating other classes
        titleBar = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();

    // adding stuff
        this.add(titleBar, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        addTask.addActionListener(this);

        delTask = buttonPanel.getDelTask();
        delTask.addActionListener(this);
    }

// adding functionns
    @Override
    public void actionPerformed(ActionEvent e) {
    // function to add task
        if(e.getSource() == addTask){
            Task task = new Task();
            list.add(task);
            taskArr.add(task);
            revalidate();
        }
        
    // function to delete task
        if (e.getSource() == delTask) {
            Iterator<Task> iterator = taskArr.iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();
                if (task.isChecked) {
                    list.remove(task);
                    iterator.remove();
                    revalidate();
                    repaint();
                }
            }
        }
    }
}
