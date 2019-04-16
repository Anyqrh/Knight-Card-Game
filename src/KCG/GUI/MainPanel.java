package KCG.GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	
	
    private static final long serialVersionUID = 1L;
    int screenWidth;
    int screenHeight;
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JLabel label1 = new JLabel("IP:");
    JLabel label2 = new JLabel("Port:");
    JLabel labelTitle = new JLabel("Knight Card Game",JLabel.CENTER);
    JLabel labelConnectF = new JLabel("Connection failed.",JLabel.CENTER);
    JLabel labelConnectS = new JLabel("Connection successful!",JLabel.CENTER);
    JButton connectButton = new JButton("Connect");     // 设置Connect按钮
    JButton startButton = new JButton("Start Game");    
    public MainPanel(Dimension dimension){
    	
        screenWidth = (int)dimension.getWidth();
        screenHeight = (int)dimension.getHeight();
        setLayout(null);  // 设置null布局
        add(text1);
        add(text2);
        add(label1);
        add(label2);
        add(labelTitle);
        add(labelConnectF);
        add(labelConnectS);
        add(connectButton);
        add(startButton);
        labelConnectS.setVisible(false);    // 判断连接成功
        labelConnectF.setVisible(false);    // 判断连接失败
        
        label1.setFont(new Font(null, Font.PLAIN, 40));
        label2.setFont(new Font(null, Font.PLAIN, 40));
        labelTitle.setFont(new Font(null, Font.BOLD, 70));
        labelConnectF.setFont(new Font(null, Font.PLAIN, 30));
        labelConnectF.setForeground(Color.RED);
        labelConnectS.setFont(new Font(null, Font.PLAIN, 30));
        labelConnectS.setForeground(Color.GREEN);
        text1.setFont(new Font(null, Font.PLAIN, 38));
        text2.setFont(new Font(null, Font.PLAIN, 38));
        connectButton.setFont(new Font(null, Font.PLAIN, 35));
        startButton.setFont(new Font(null, Font.PLAIN, 40));
        
    	ActionListener listener = new ConnectEvent(connectButton, text1, text2);// 创建connectevent的监视器 将text和text2传入ConnectEvent中
    	
        
        labelTitle.setBounds((screenWidth-1000)/2,(int)(screenHeight*0.02),1000,100);
        label1.setBounds((screenWidth-680)/2,(int)(screenHeight*0.17),180,50);
        text1.setBounds((screenWidth-680)/2+180+1,(int)(screenHeight*0.17),500,50);
        label2.setBounds((screenWidth-680)/2,(int)(screenHeight*0.17)+60,180,50);
        text2.setBounds((screenWidth-680)/2+180+1,(int)(screenHeight*0.17)+60,500,50);
        connectButton.setBounds((screenWidth-500)/2,(int)(screenHeight*0.17)+150,500,50);
        labelConnectS.setBounds((screenWidth-500)/2,(int)(screenHeight*0.17)+210,500,50);
        labelConnectF.setBounds((screenWidth-500)/2,(int)(screenHeight*0.17)+210,500,50);
        startButton.setBounds((screenWidth-400)/2,(int)(screenHeight*0.7),400,80);
    }
}