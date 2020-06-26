package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
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
import javax.imageio.ImageIO;
import javax.swing.DropMode;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
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
import java.io.File;
import java.io.IOException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

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
		lblNewLabel.setFont(new Font("∫˘±◊∑π√º", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 10, 200, 50);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 181, 434, 100);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel event1 = new JPanel() {
			public void paintComponent(Graphics g){
				  g.fillRect(0, 0, 60, 100);
				  Image image = new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\event1.PNG").getImage();
				  g.drawImage(image,0,0,this);
				 }
				};
		event1.setBounds(0, 0, 100, 100);
		panel_1.add(event1);

		JPanel event2 = new JPanel(){
			public void paintComponent(Graphics g){
			  g.fillRect(0, 0, 60, 100);
			  Image image = new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\event2.PNG").getImage();
			  g.drawImage(image,0,0,this);
			}
		};
		event2.setBounds(113, 0, 100, 100);
		panel_1.add(event2);

		JPanel event3 = new JPanel(){
			public void paintComponent(Graphics g){
				  g.fillRect(0, 0, 60, 100);
				  Image image = new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\event3.PNG").getImage();
				  g.drawImage(image,0,0,this);
				}
			};
		event3.setBounds(225, 0, 100, 100);
		panel_1.add(event3);

		JPanel event4 = new JPanel(){
			public void paintComponent(Graphics g){
				  g.fillRect(0, 0, 60, 100);
				  Image image = new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\event4.PNG").getImage();
				  g.drawImage(image,0,0,this);
				}
			};
		event4.setBounds(334, 0, 100, 100);
		panel_1.add(event4);

		JPanel main1 = new JPanel(){
			public void paintComponent(Graphics g){
				  Image image = new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\gofest.PNG").getImage();
				  g.drawImage(image,0,0,this);
				}
			};
		main1.setBounds(0, 334, 434, 258);
		panel.add(main1);
		main1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 191, 255)));

		JLabel lblNewLabel_1 = new JLabel("  \uCD95\uC81C NOW");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 124, 200, 31);
		panel.add(lblNewLabel_1);
	
		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo_default.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(155, 175, Image.SCALE_SMOOTH);   // ªÁ¿Ã¡Ó¡∂¿˝
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		
		JLabel lbl_logo = new JLabel(Icon4);
		lbl_logo.setBounds(0, 0, 75, 75);
		panel.add(lbl_logo);

		JPanel menu_bar = new JPanel();
		menu_bar.setBounds(0, 83, 434, 33);
		panel.add(menu_bar);
		menu_bar.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btn_review = new JButton("");
		btn_review.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uD6C4\uAE30.png"));
		btn_review.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_review.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uD6C4\uAE302.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_review.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uD6C4\uAE30.png"));
			}
		});
		btn_review.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewGUI reviewGUI = new ReviewGUI();
				frame.dispose();
			}
		});
		
				JButton btn_search = new JButton("");
				btn_search.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btn_search.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uAC80\uC0C92.png"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btn_search.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uAC80\uC0C9.png"));
					}
				});
				btn_search.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\\uAC80\uC0C9.png"));
				btn_search.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 15));
				menu_bar.add(btn_search);
				btn_search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SearchGUI searchGUI = new SearchGUI();
						frame.dispose();
					}
				});
				btn_search.setBorderPainted(false);
				btn_search.setBackground(Color.WHITE);
		
		btn_review.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 15));
		btn_review.setBorderPainted(false);
		btn_review.setBackground(Color.WHITE);
		menu_bar.add(btn_review);
		
				JButton btn_my = new JButton("");
				btn_my.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\myfest.png"));
				btn_my.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btn_my.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\myfest2.png"));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btn_my.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\myfest.png"));
					}
				});
				btn_my.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					MyPage mypage = new MyPage();
					frame.dispose();
					}
				});
				btn_my.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15));
				btn_my.setBorderPainted(false);
				btn_my.setBackground(Color.WHITE);
				menu_bar.add(btn_my);
				
				JLabel lblNewLabel_2 = new JLabel("\uC9C4\uD589\uC911\uC778 \uC774\uBCA4\uD2B8");
				lblNewLabel_2.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 12));
				lblNewLabel_2.setBounds(13, 155, 131, 15);
				panel.add(lblNewLabel_2);
				
				textField = new JTextField();
				textField.setFont(new Font("±º∏≤", Font.BOLD, 12));
				textField.setText("\uACE0\uB798\uC758 \uAFC8! \uBC14\uB2E4\uC758 \uAFC8! \uC6B8\uC0B0\uC758 \uAFC8!");
				textField.setBounds(0, 592, 434, 31);
				panel.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("  \uAC00\uC790! \uD398\uC2A4\uD2F0\uBC1C!");
				lblNewLabel_3.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
				lblNewLabel_3.setBounds(0, 300, 200, 31);
				panel.add(lblNewLabel_3);

	}
}
