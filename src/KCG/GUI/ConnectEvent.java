package KCG.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ConnectEvent implements ActionListener {
	private String IP;
	private String port;
		
	public ConnectEvent(JButton connectButton, JTextField field1, JTextField field2) {
		connectButton.addActionListener(new ActionListener() {   // 这个自己还无法理解可以这样实现
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			IP = field1.getText();
			port = field2.getText();
			if("Connect".equals(cmd)){
				System.out.println("ssss");
				if(IP.equals("127.0.0.1") && port.equals("2010")){
					
					Client.setIPandPort(IP, port);   // 将客户输入的IP与端口号放入Client中
					String [] args = new String[2];
					Client.main(args);
					
					}	
				}
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}



