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

		JButton btn_search = new JButton("");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchGUI searchGUI = new SearchGUI();
				frame.dispose();
			}
		});
		btn_search.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_search.png"));
		btn_search.setBorderPainted(false);
		btn_search.setBackground(Color.WHITE);
		btn_search.setBounds(369, 0, 65, 60);
		panel.add(btn_search);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 138, 434, 105);
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
		panel_5.setBounds(0, 314, 434, 258);
		panel.add(panel_5);

		JLabel lblNewLabel_1 = new JLabel("  \uCD95\uC81C UP");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 261, 200, 41);
		panel.add(lblNewLabel_1);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 15));
		spinner.setModel(new SpinnerListModel(
				new String[] { "2020.06.20 OOÃàÁ¦ ²ÜÀë", "2020.06.20 OOÃàÁ¦ ³ëÀë", "2020.06.20 OOÃàÁ¦ Àç¹æ¹® ÀÇ»çÀÖÀ½ !!" }));
		spinner.setBounds(0, 602, 434, 33);
		panel.add(spinner);
		
		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo_default.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(170, 170, Image.SCALE_SMOOTH);   // »çÀÌÁîÁ¶Àý
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		
		JLabel lbl_logo = new JLabel(Icon4);
		lbl_logo.setBounds(0, 0, 84, 81);
		panel.add(lbl_logo);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 83, 434, 33);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 5, 0, 0));

		JButton btn_info = new JButton("\uCD95\uC81C");
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_info.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 15));
		btn_info.setBorderPainted(false);
		btn_info.setBackground(Color.WHITE);
		panel_6.add(btn_info);

		JButton btn_now = new JButton("NOW");
		btn_now.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 15));
		btn_now.setBorderPainted(false);
		btn_now.setBackground(Color.WHITE);
		panel_6.add(btn_now);

		JButton btn_mark = new JButton("\uCC1C");
		btn_mark.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 15));
		btn_mark.setBorderPainted(false);
		btn_mark.setBackground(Color.WHITE);
		panel_6.add(btn_mark);

		JButton btn_review = new JButton("\uD6C4\uAE30");
		btn_review.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewGUI reviewGUI = new ReviewGUI();
				frame.dispose();
			}
		});
		
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

	}
}
