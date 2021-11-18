

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

public class Nickname2 extends JFrame {//닉네임 등록하시겠습니까?(가위바위보)

	public static String bb;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nickname2 frame = new Nickname2();
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
	public Nickname2(String bb) {//Nickname2와 연동
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774 \uB2C9\uB124\uC784\uC73C\uB85C \uB4F1\uB85D\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?\r\n");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(157, 77, 205, 15);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(bb);//입력한 닉네임 출력
		JButton btn1 = new JButton("   Cancle");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new NicknameCreate2().setVisible(true);
				
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
				
				 new Result2(bb).setVisible(true);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.CYAN);
		btn2.setBounds(213, 123, 221, 56);
		contentPane.add(btn2);
		
		JLabel label = new JLabel("\uC544\uB798 \uB2C9\uB124\uC784\uC73C\uB85C \uB4F1\uB85D\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(41, 32, 351, 24);
		contentPane.add(label);
	}

	public Nickname2() {
		setTitle("닉네임 등록하기");
	}
	}
	

