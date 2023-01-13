package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame {
	private JButton button1, button2, button3, button4;

	public class Action implements ActionListener {

		private JFrame f;
		private Color c;
		private Container con;

		public Action (JFrame f,Color c) {
			this.f = f;
			this.c = c;
			con = f.getContentPane();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			con.setBackground(c);
		}

	}
	
	public MyEventColor() {
		super("선택한 색깔");
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		button1 = new JButton("red");
		button2 = new JButton("gren");
		button3 = new JButton("blue");
		button4 = new JButton("yellow");
		
		add(button1,"North");
		add(button2,"East");
		add(button3,"South");
		add(button4,"West");
		
		button1.addActionListener(new Action(this,Color.red));
		button2.addActionListener(new Action(this,Color.green));
		button3.addActionListener(new Action(this,Color.blue));
		button4.addActionListener(new Action(this,Color.yellow));

	}

	public static void main(String[] args) {
		new MyEventColor();
	}
}
