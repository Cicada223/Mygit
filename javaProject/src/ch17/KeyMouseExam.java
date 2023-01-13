package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
//MouseListener : 마우스 이벤트 처리를 위한 기본 인터페이스
//MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트 처리
public class KeyMouseExam extends JApplet 
implements MouseListener,MouseMotionListener,KeyListener {
	private int x,y; //이미지를 출력할 x,y좌표값
	private int width,height; //이미지의 가로,세로 사이즈
	private Image img;
	private boolean flag= false; //이미지가 처음 실행할땐 안보이게
	
	
	@Override
	public void init() {
		setSize(300,300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true);//키 입력을 받을 수 있도록 설정
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {
			g.drawImage(img, x, y, this);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을때 호출
		System.out.println(e.getKeyCode()); //키 코드값
		System.out.println(e.getKeyChar()); //키 문자값
		switch (e.getKeyCode()) {			//키코드 값에 따라 분기
		//max(값,값) 앞의 값과 뒤의 값중 최대값 구함.
		case KeyEvent.VK_UP: // 키보드 위쪽 방향키
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-width, x+5); break;
		default: repaint();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// 마우스를 드래그할 때
		System.out.println("mouse drag : x: "+x+"y: "+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스가 이동했지만 버튼이 작동하지 않았을 때
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move : x: "+x+"y: "+y);
		repaint();
	}
	//컴퍼넌트상에서 마우스 버튼을 클릭(눌렀다 놓을때) 했을 때 호출
	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴퍼넌트상 마우스 버튼을 누르는 시점		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스를 떼어 놓아질 때
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 해당 컴퍼넌트에 진입할 때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 해당 컴퍼넌트가 종료될 때
	}
	
	
	

}
