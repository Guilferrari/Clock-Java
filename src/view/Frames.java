package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;



public class Frames extends JFrame {


    public Frames(){

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("Clock Program");
        super.setLayout(new FlowLayout());
        super.setSize(400,300);
        super.setResizable(false);


        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial",Font.PLAIN,55));
        timeLabel.setForeground(new Color(50, 100, 50));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        JLabel dayLabel = new JLabel();
        JLabel dateLabel = new JLabel();
        dayLabel.setFont(new Font("Arial",Font.PLAIN,50));
        dateLabel.setFont(new Font("Arial",Font.PLAIN,50));

        super.add(timeLabel);
        super.add(dayLabel);
        super.add(dateLabel);
        super.setVisible(true);

        new Thread(() -> reloadTime(timeLabel)).start();

        reloadDay(dayLabel);
        reloadDate(dateLabel);

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

    private void reloadDay(JLabel dayLabel){

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

        String day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
    }

    private void reloadDate(JLabel dateLabel){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
    }
}
