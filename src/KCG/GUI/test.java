package KCG.GUI;
import javax.swing.*;
import java.awt.*;

public class test{
    public static void main(String args[]){
        JFrame mainWindow = new JFrame("Knight Card Game");
        MainPanel mainPanel = new MainPanel(Toolkit.getDefaultToolkit().getScreenSize());
        mainWindow.add(mainPanel);
        mainWindow.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        System.out.println("hellsssssssso");
        System.out.println("·ëÌìÑô¼ÐÈû£¬¼Ð¿§°Ë");
    }
}