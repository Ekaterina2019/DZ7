// второе окно 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WindowsTwo extends JPanel {

   WindowsTwo(){
       JButton button = new JButton("Open new Windows");
       add(button);
       button.addActionListener((ActionListener) listenerList);

       ActionListener listenerList = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent event)
           {
               Random rnd = new Random();
               Windows  frame;
               frame = new Windows(rnd.nextInt(800), rnd.nextInt(500));
           }
       };



       }
    }

