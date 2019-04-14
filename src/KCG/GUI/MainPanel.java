package KCG.GUI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
    private static final long serialVersionUID = 1L;
    int screenWidth;
    int screenHeight;
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JLabel label1 = new JLabel("IP:");
    JLabel label2 = new JLabel("Port:");
    JLabel labelConnectF = new JLabel("Connection failed.",JLabel.CENTER);
    JLabel labelConnectS = new JLabel("Connection successful!",JLabel.CENTER);
    JButton connectButton = new JButton("Connect");
    JButton startButton = new JButton("Start Game");
    public MainPanel(Dimension dimension){
        screenWidth = (int)dimension.getWidth();
        screenHeight = (int)dimension.getHeight();
        setLayout(null);
        add(text1);
        add(text2);
        add(label1);
        add(label2);
        add(labelConnectF);
        add(labelConnectS);
        add(connectButton);
        add(startButton);
        labelConnectS.setVisible(false);
        labelConnectF.setVisible(false);
        label1.setFont(new Font(null, Font.PLAIN, 40));
        label2.setFont(new Font(null, Font.PLAIN, 40));
        labelConnectF.setFont(new Font(null, Font.PLAIN, 30));
        labelConnectF.setForeground(Color.RED);
        labelConnectS.setFont(new Font(null, Font.PLAIN, 30));
        labelConnectS.setForeground(Color.GREEN);
        text1.setFont(new Font(null, Font.PLAIN, 38));
        text2.setFont(new Font(null, Font.PLAIN, 38));
        connectButton.setFont(new Font(null, Font.PLAIN, 35));
        startButton.setFont(new Font(null, Font.PLAIN, 40));
        label1.setBounds((screenWidth-680)/2,(int)(screenHeight*0.15),180,50);
        text1.setBounds((screenWidth-680)/2+180+1,(int)(screenHeight*0.15),500,50);
        label2.setBounds((screenWidth-680)/2,(int)(screenHeight*0.15)+60,180,50);
        text2.setBounds((screenWidth-680)/2+180+1,(int)(screenHeight*0.15)+60,500,50);
        connectButton.setBounds((screenWidth-500)/2,(int)(screenHeight*0.15)+150,500,50);
        labelConnectS.setBounds((screenWidth-300)/2,(int)(screenHeight*0.15)+210,300,50);
        labelConnectF.setBounds((screenWidth-300)/2,(int)(screenHeight*0.15)+210,300,50);
        startButton.setBounds((screenWidth-400)/2,(int)(screenHeight*0.7),400,80);
    }
}