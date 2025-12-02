package net.niclaszockt97.utility;

import javax.swing.*;
import java.awt.*;
import java.util.UUID;

public class window {

    //Frame Methode.
    public static JFrame addFrame(String frame_title, int dim_x, int dim_y, LayoutManager layout, boolean visible) {
        // Init Frame
        JFrame frame = new JFrame(frame_title);
        frame.setSize(dim_x, dim_y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(layout);

        // Set unique identifier
        String id = UUID.randomUUID().toString();
        frame.getRootPane().putClientProperty("id", id);

        frame.setVisible(visible);
        return frame;
    }

    //JMenuBar
    public static JMenuBar createMenuBar(){
        JMenuBar menu_bar = new JMenuBar();
        menu_bar.createToolTip();

        return menu_bar;
    }

    //MenuBar Methode
    public static JMenu createMenu(String s, String text, boolean vis) {
        JMenu menu = new JMenu(s);
        menu.setText(text);

        menu.setVisible(vis);
        return menu;
    }

}
