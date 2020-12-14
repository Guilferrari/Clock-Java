package view;

import javax.swing.*;
import java.awt.*;

public class Frames extends JFrame {
    public Frames(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(400,300);
        this.setResizable(false);
        this.setVisible(true);
    }
}
