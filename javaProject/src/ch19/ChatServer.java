package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSoket=null;
		try {
			//서비스를 위한 포트 개방
			serverSoket=new ServerSocket(5555);
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1); //비정상 종료
		}
		Socket clientSoket=null;
		try {
			//클라이언트의 접속을 기다리다가 접속하면 소켓연결
			clientSoket=serverSoket.accept();
			System.out.println("클라이언트의 ip : "+clientSoket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//발신용 스트림
		PrintWriter writer= new PrintWriter(clientSoket.getOutputStream(),true);
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(clientSoket.getInputStream()));
		String receive="";
		String send="Welcome!!!";
		
		writer.println(send); //메세지 보내기
		Scanner sc = new Scanner(System.in);
		while (true) {
			receive = reader.readLine();
			if(receive == null || receive.equals("quit")) {
				break;
			}
			System.out.println("[client]"+receive);
			System.out.println("서버님 입력하세요(종료:quit) : ");
			send = sc.nextLine();
			writer.println(send);//메세지 보내기
			if(send.equals("quit")) break;
		}
		sc.close();
		writer.close();
		reader.close();
		clientSoket.close();
		serverSoket.close();
	}
}
