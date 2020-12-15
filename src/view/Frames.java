package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;


public class Frames extends JFrame {


    public Frames(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(400,300);
        this.setResizable(false);

        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial",Font.PLAIN,55));
        timeLabel.setForeground(new Color(50, 100, 50));
        this.add(timeLabel);
        this.setVisible(true);

        reloadTime(timeLabel);

    }

    private void reloadTime(JLabel timeLabel){

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

        while(true) {
            String time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
