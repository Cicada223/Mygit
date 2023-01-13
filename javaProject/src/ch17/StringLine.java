package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet
//라이프사이클 init()-start()-stop()-destroy()
//init()은 필수 나머진 자동처리, 특정 웹브라우저의 페이지 이동 및 강제종료에 쓰임
public class StringLine extends JApplet {
	@Override
	public void init() { //애플릿 초기화
		getContentPane().setBackground(new Color(255,255,255));//배경색상
		setSize(300,300);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);//색상설정
		g.drawLine(205, 50, 30, 160);//선그리기 drawline(x1,y1,x2,y2)
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
	}
}
