




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;





import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;



public class NicknameCreate2 extends JFrame {//�г��� ���â(����������)

	
	private JPanel contentPane;
	private JTextField tex1;
	private JButton button;
	static String bb;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NicknameCreate2 frame = new NicknameCreate2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	/**
	 * Create the frame.
	 */
	public NicknameCreate2() {
		setTitle("�г��� ����ϱ�");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 569, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tex1 = new JTextField();
		tex1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			
				
				
				
			}
		});
		tex1.setBounds(190, 165, 157, 30);
		contentPane.add(tex1);
		tex1.setColumns(10);
		
		JLabel label = new JLabel("  \uB2C9\uB124\uC784 \uB4F1\uB85D\r\n");//�г��� ���
		label.setFont(new Font("����", Font.BOLD, 20));
		label.setBounds(200, 76, 189, 30);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NicknameCreate2.class.getResource("/images/2.png")));//�̹���
		lblNewLabel.setBounds(152, 140, 58, 74);
		contentPane.add(lblNewLabel);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(NicknameCreate2.class.getResource("/images/Confirm.png")));
	
		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				bb = tex1.getText();
				
	            String str = "";
	            
	            if(bb.equals(str)) {//������ ���� �� NicError ���
	              
	               new NickError().setVisible(true);
	              
	            }
	            else {//�ƴҶ� Nickname2�� �Ѿ
	               dispose();
	               setVisible(false);
	              
	               new Nickname2(bb).setVisible(true);
	              
	             
	            }
	        
			
			
			
			}
			
			
			
		});
		button.setBounds(348, 165, 60, 30);
		contentPane.add(button);
	}
}
