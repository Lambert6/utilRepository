package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class testswing extends JFrame {
	public testswing() {
		this.setTitle("���Ա���");
		this.setSize(500, 500);
		JButton j = new JButton("��ť");
		this.setLayout(new FlowLayout());
		this.add(j);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new testswing();
	}
}
