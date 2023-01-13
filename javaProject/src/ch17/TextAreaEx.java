package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrameEx{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(6,20);//6행 20열
	public TextAreaEx() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));//textarea 는 scrollpane과 함께써야함.
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t =(JTextField) e.getSource();
				//데이터 타입이 다를땐 최소한 좌변의 타입으로
				ta.append(t.getText()+"\n");//텍스트필드의 문자열 textarea영역으로 옮김
				t.setText("");//현재 텍스트 필드에 입력된 내용 지우기
				
			}
		});
		setSize(250,200);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
