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
					int port = Integer.parseInt(portS);   // 将字符串portS转换成Int型
					
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
				}catch(Exception e) {System.out.println("服务器已经断开"+e);}
			System.out.println("客户端说话(退出请输入n)");
			while(scanner.hasNext()){   // 第一个停止
				String speak = null;
				try {
					  speak = scanner.next();
					  if("n".contentEquals(speak))  System.exit(0);
			  }catch(InputMismatchException e) { System.out.println("出错");System.exit(0);}
				
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
					System.out.println("服务器说话：  "+in.readUTF());  // 有可能会堵塞
					System.out.println("客户端说话(退出请输入n)");
				}catch(IOException e) {System.out.println("与服务器已断开"+e);
										break;}
				
			}
		}
	}



