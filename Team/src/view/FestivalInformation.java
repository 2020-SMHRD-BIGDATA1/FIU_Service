package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import model.MapExecute;

public class FestivalInformation {

	private JFrame frame;
	private JButton btnMore;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FestivalInformation window = new FestivalInformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FestivalInformation() {
		initialize();
	
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		

	
	
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 734, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnMore = new JButton("\uD6C4\uAE30 \uB354\uBCF4\uAE30");
		btnMore.setBounds(345, 628, 86, 33);
		btnMore.setFont(new Font("굴림", Font.PLAIN, 10));
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FestivalMore.main(null);
			}
		});
		panel.add(btnMore);
		
		JLabel lblFestivalPlace = new JLabel("\uC81C\uC8FC\uD2B9\uBCC4\uC790\uCE58\uB3C4 \uC11C\uADC0\uD3EC\uC2DC \uB0A8\uC6D0\uC74D \uC2E0\uB840\uB3D9\uB85C 256");
		lblFestivalPlace.setBounds(10, 597, 329, 21);
		lblFestivalPlace.setFont(new Font("굴림", Font.PLAIN, 11));
		panel.add(lblFestivalPlace);
		
		JButton btnMap = new JButton("\uC9C0\uB3C4");
		btnMap.setBounds(345, 597, 86, 17);
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MapExecute.main(null);
			}
		});
		panel.add(btnMap);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\수국.jpg";
		
		JLabel lblImage = new JLabel(new ImageIcon(path));
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 133, SpringLayout.WEST, panel);
		panel.add(lblImage);
		lblImage.setBounds(10, 65, 405, 212);
				
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 638, 321, 22);
		spinner.setModel(new SpinnerListModel(new String[] {"참 이쁘네여","수국이 별로 없어서 실망이었어요"}));
		panel.add(spinner);
		
		JButton menu = new JButton("");
		menu.setBorderPainted(false);
		menu.setBackground(Color.WHITE);
		menu.setBorderPainted(false);
		menu.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\menu.png"));
		menu.setBounds(355, 10, 60, 45);
		panel.add(menu);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\uC2DC\uC791\uC77C\t2020.03.20\uC885\uB8CC\uC77C\t2020.07.19\r\n\uC804\uD654\uBC88\uD638\t064-732-2114\r\n\uD648\uD398\uC774\uC9C0\thttp://hueree.com\r\n\uC8FC\uCD5C\t\uD734\uC560\uB9AC \uC790\uC5F0\uC0DD\uD65C\uACF5\uC6D0 \uC8FC\uAD00 \uD734\uC560\uB9AC \uC790\uC5F0\uC0DD\uD65C\uACF5\uC6D0\r\n\uC774\uC6A9\uC694\uAE08\t\uC131\uC778:13,000\uC6D0/\uB2E8\uCCB4:11,000\uC6D0/\uB3C4\uBBFC,\uC7A5\uC560\uC778,\r\n\uC720\uACF5\uC790,\uACBD\uB85C\uC6B0\uB300:6,500\uC6D0/\uCCAD\uC18C\uB144:11,000\uC6D0/\uB2E8\uCCB4:9,000\uC6D0\r\n\uB3C4\uBBFC, \uC7A5\uC560\uC778 :5,500\uC6D0/\uC5B4\uB9B0\uC774:10,000\uC6D0/\uB2E8\uCCB4:8,0000\uC6D0\r\n\uB3C4\uBBFC, \uC7A5\uC560\uC778 :5,000\uC6D0\r\n\uB2E8\uCCB4\uB294 30\uC778 \uC774\uC0C1[\uD559\uC0DD\uB2E8\uCCB4(\uC218\uD559\uC5EC\uD589)\uB4F1 \uBC29\uBB38 \uC2DC \uBCC4\uB3C4 \uBB38\uC758 \uC694\uB9DD]\r\n\uACBD\uB85C\uD560\uC778\uC740 \uB9CC 65\uC138 \uC774\uC0C1(\uC2E0\uBD84\uC99D \uC81C\uCD9C)\r\n\uB9CC 24\uAC1C\uC6D4\uAE4C\uC9C0\uB294 \uBB34\uB8CC\uC785\uC7A5\r\n\uC138\uC790\uB140 50%\uD560\uC778(\uC790\uB140\uB9CC \uD560\uC778\uD61C\uD0DD, \uACE0\uB4F1\uD559\uC0DD\uAE4C\uC9C0)\r\n\uC81C\uC8FC\uD2B9\uBCC4\uC790\uCE58\uB3C4\uBBFC, \uC7A5\uC560\uC778, \uAD70\uACBD\uC740 \uBC18\uB4DC\uC2DC \uC2E0\uBD84\uC99D \uBC0F \uC99D\uBA85\uC11C\uB97C \uC81C\uC2DC\uD574\uC57C \uD569\uB2C8\uB2E4.\r\n\uACF5\uC5F0\uC2DC\uAC04\t10:00, 11:00, 12:00, 13:00, 14:00, 15:00, 16:00, 17:00");
		textPane.setBounds(10, 315, 405, 258);
		panel.add(textPane);
		
		JLabel lblFestivalName = new JLabel("\uD734\uC560\uB9AC \uC218\uAD6D\uCD95\uC81C");
		lblFestivalName.setFont(new Font("바탕", Font.PLAIN, 20));
		lblFestivalName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFestivalName.setBounds(33, 279, 362, 33);
		panel.add(lblFestivalName);
		
		JButton btnNewButton = new JButton("\u25BD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FestivalInformation2.main(null);
			}
		});
		btnNewButton.setBounds(168, 576, 97, 23);
		panel.add(btnNewButton);
	}
}
