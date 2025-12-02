package net.niclaszockt97;

import net.niclaszockt97.utility.window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame main_win = window.addFrame("Game",500,300,null, true);
        JFrame modifier = window.addFrame("Modifier", 200, 150,null, false);

        JMenu main_menu = window.createMenu("test", "TEST", true);
        main_win.add(main_menu);

        System.out.println(main_win.getRootPane().getClientProperty("id"));
        System.out.println(modifier.getRootPane().getClientProperty("id"));
    }
}
