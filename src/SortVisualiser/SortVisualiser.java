package SortVisualiser;

import javax.swing.*;

public class SortVisualiser {
    public static final int WIN_WIDTH = 1200;
    public static final int WIN_HEIGHT = 720;
    private JFrame window;

    public SortVisualiser() {
        window = new JFrame("Sort Visualiser");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIN_WIDTH, WIN_HEIGHT);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SortVisualiser sortVisualiser = new SortVisualiser();
    }
}
