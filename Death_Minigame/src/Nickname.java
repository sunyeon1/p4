

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Nickname extends JFrame {//�г��� ����Ͻðڽ��ϱ�?(��Ģ����)

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nickname frame = new Nickname();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param bb 
	 */
	public Nickname(String bb) {//Nickname�� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774 \uB2C9\uB124\uC784\uC73C\uB85C \uB4F1\uB85D\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?\r\n");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel.setBounds(157, 77, 205, 15);
		setLocationRelativeTo(null);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(NicknameCreate.bb);//�Է��� �г��� ���
		JButton btn1 = new JButton("   Cancle");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new NicknameCreate().setVisible(true);
				
			}
		});
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(0, 123, 215, 56);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton(" ok");
		btn2.addMouseListener(new MouseAdapter() {
		

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				 new Result1(bb).setVisible(true);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.CYAN);
		btn2.setBounds(213, 123, 221, 56);
		contentPane.add(btn2);
		
		JLabel label = new JLabel("\uC544\uB798 \uB2C9\uB124\uC784\uC73C\uB85C \uB4F1\uB85D\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		label.setFont(new Font("����", Font.BOLD, 20));
		label.setBounds(41, 32, 351, 24);
		contentPane.add(label);
	}

	public Nickname() {
		setTitle("�г��� ���â");
	}
	}
	

