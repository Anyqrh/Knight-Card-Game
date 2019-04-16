package KCG.GUI;


	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.net.InetAddress;
	import java.net.InetSocketAddress;
	import java.net.Socket;
	import java.util.InputMismatchException;
	import java.util.Scanner;

public class Client {
		private static String IP = null;
		private static String portS = null;
		public static void setIPandPort(String ip, String port) {
			IP = ip;
			portS = port;
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Socket mysocket = null;
			DataInputStream in = null;
			DataOutputStream out = null;
			Thread readData;
			Read read = null;
			try {	mysocket = new Socket();
					read = new Read();
					readData = new Thread(read);
					int port = Integer.parseInt(portS);   // ���ַ���portSת����Int��
					
					if(mysocket.isConnected()) {}
					else {
							InetAddress address = InetAddress.getByName(IP);
							InetSocketAddress socketAddress = new InetSocketAddress(address,port);
							mysocket.connect(socketAddress);   
							in = new DataInputStream(mysocket.getInputStream());
							out = new DataOutputStream(mysocket.getOutputStream());
							read.setDataInputStream(in);
							readData.start();
						}
				}catch(Exception e) {System.out.println("�������Ѿ��Ͽ�"+e);}
			System.out.println("�ͻ���˵��(�˳�������n)");
			while(scanner.hasNext()){   // ��һ��ֹͣ
				String speak = null;
				try {
					  speak = scanner.next();
					  if("n".contentEquals(speak))  System.exit(0);
			  }catch(InputMismatchException e) { System.out.println("����");System.exit(0);}
				
				try { 
					  out.writeUTF(speak);
				}catch(Exception e) {System.out.println(e);}
			}
			
		}

	}


	class Read implements Runnable {
		DataInputStream in;
		public void setDataInputStream(DataInputStream in) {
			this.in = in;
		}
		public void run() {
			while(true) {
				try {	
					System.out.println("������˵����  "+in.readUTF());  // �п��ܻ����
					System.out.println("�ͻ���˵��(�˳�������n)");
				}catch(IOException e) {System.out.println("��������ѶϿ�"+e);
										break;}
				
			}
		}
	}



