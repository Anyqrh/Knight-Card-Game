package KCG.GUI;
import javax.swing.*;
import java.awt.*;

public class test{
    public static void main(String args[]){
        JFrame mainWindow = new JFrame("Knight Card Game");

        Toolkit tool = mainWindow.getToolkit();
        Image image = tool.getImage("Knight-Card-Game/resource/icon.png");
        mainWindow.setIconImage(image);
        mainWindow.add(mainPanel);
        MainPanel mainPanel = new MainPanel(Toolkit.getDefaultToolkit().getScreenSize());   
        MainPanel mainPanel = new MainPanel(Toolkit.getDefaultToolkit().getScreenSize());
        //mainWindow.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //mainWindow.setResizable(false);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}