package ch17;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		super("로그인");
		setSize(250,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("I             D   :"));
		c.add(new JTextField(10));
		c.add(new JLabel("비밀번호   :"));
		c.add(new JPasswordField(10));
		c.add(new JLabel("이  메  일   :"));
		c.add(new JTextField(10));
		c.add(new JLabel("H            P   :"));
		c.add(new JTextField(10));
		
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
