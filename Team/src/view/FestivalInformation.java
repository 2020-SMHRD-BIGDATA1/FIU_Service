package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import model.FestivalInformationDAO;
import model.MapExecute;

import javax.swing.JTextPane;

public class FestivalInformation {

	private JFrame frame;
	private JButton btnMore;
	private String name = "휴애리 수국축제";
	
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
		panel.setBackground(new Color(240, 248, 255));
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
		
		JLabel lblFestivalName = new JLabel(name);
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
		
		
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 317, 419, 249);
		
		
		FestivalInformationDAO dao = new FestivalInformationDAO();
		String list = dao.getList(name);
		
		JTextPane txtpnFasdfadf = new JTextPane();
		txtpnFasdfadf.setBackground(new Color(240, 248, 255));
		txtpnFasdfadf.setText(list);
		txtpnFasdfadf.setBounds(12, 310, 419, 257);
		panel.add(txtpnFasdfadf);
		
		
//		ArrayList<String> list = dao.getList();
//		
//		String[] header = {"정보"};
//		String[][] data = new String[list.size()][1];
//		for (int i = 0; i < data.length; i++) {
//			data[i][0] = list.get(i);
//		}
//		JTable table = new JTable(data, header);
//		panel_1.add(new JScrollPane(table));
//		
//		panel.add(panel_1);ㄴ
//		frame.setVisible(true);
	}
}

