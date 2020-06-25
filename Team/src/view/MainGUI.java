package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.DropMode;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainGUI {

	private JFrame frame;
	private FontMake fm = new FontMake();
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		
		 GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		 fm.FontChange(ge);
		 
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uCD95\uC81C\uC5B4\uB54C");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("ºù±×·¹Ã¼", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 10, 200, 50);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 181, 434, 105);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 100, 105);
		panel_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(113, 0, 100, 105);
		panel_1.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(225, 0, 100, 105);
		panel_1.add(panel_4);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(334, 0, 100, 105);
		panel_1.add(panel_4_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 334, 434, 258);
		panel.add(panel_5);

		JLabel lblNewLabel_1 = new JLabel("  \uCD95\uC81C NOW");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 124, 200, 31);
		panel.add(lblNewLabel_1);
	
		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo_default.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(155, 175, Image.SCALE_SMOOTH);   // »çÀÌÁîÁ¶Àý
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		
		JLabel lbl_logo = new JLabel(Icon4);
		lbl_logo.setBounds(0, 0, 75, 75);
		panel.add(lbl_logo);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 83, 434, 33);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btn_review = new JButton("\uD6C4\uAE30");
		btn_review.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewGUI reviewGUI = new ReviewGUI();
				frame.dispose();
			}
		});
		
				JButton btn_search = new JButton("\uAC80\uC0C9");
				panel_6.add(btn_search);
				btn_search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SearchGUI searchGUI = new SearchGUI();
						frame.dispose();
					}
				});
				btn_search.setBorderPainted(false);
				btn_search.setBackground(Color.WHITE);
		
		btn_review.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 15));
		btn_review.setBorderPainted(false);
		btn_review.setBackground(Color.WHITE);
		panel_6.add(btn_review);
		
				JButton btn_my = new JButton("My FEST");
				btn_my.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					MyPage mypage = new MyPage();
					frame.dispose();
					}
				});
				btn_my.setFont(new Font("ºù±×·¹Ã¼", Font.BOLD, 12));
				btn_my.setBorderPainted(false);
				btn_my.setBackground(Color.WHITE);
				panel_6.add(btn_my);
				
				JLabel lblNewLabel_2 = new JLabel("\uC9C4\uD589\uC911\uC778 \uC774\uBCA4\uD2B8");
				lblNewLabel_2.setBounds(13, 155, 131, 15);
				panel.add(lblNewLabel_2);
				
				textField = new JTextField();
				textField.setFont(new Font("±¼¸²", Font.BOLD, 12));
				textField.setText("\uACE0\uB798\uC758 \uAFC8! \uBC14\uB2E4\uC758 \uAFC8! \uC6B8\uC0B0\uC758 \uAFC8!");
				textField.setBounds(0, 592, 434, 31);
				panel.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("  \uAC00\uC790! \uD398\uC2A4\uD2F0\uBC1C!");
				lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
				lblNewLabel_3.setBounds(0, 300, 200, 31);
				panel.add(lblNewLabel_3);

	}
}
