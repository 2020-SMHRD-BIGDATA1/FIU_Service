package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
import model.FestivalVO;
import model.MapExecute;

import javax.swing.JTextPane;

public class FestivalInformation{

	private JFrame frame;
	private JButton btnMore;
	private FontMake fm = new FontMake();
	
	public FestivalInformation(String f_name) {
		initialize(f_name);
		frame.setVisible(true);
	}

	private void initialize(String f_name) {
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
		
		btnMore = new JButton("\uD6C4\uAE30 \uBCF4\uAE30");
		btnMore.setBounds(345, 628, 86, 33);
		btnMore.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 12));
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FestivalMore FestMore = new FestivalMore(f_name);
			}
		});
		panel.add(btnMore);
		
		FestivalInformationDAO dao = new FestivalInformationDAO();
//		String name = SearchGUI.f_name;
		
		String place = dao.getPlace(f_name);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.FontChange(ge);
		
		JLabel lblFestivalPlace = new JLabel(place);
		lblFestivalPlace.setBounds(10, 597, 329, 21);
		lblFestivalPlace.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 11));
		panel.add(lblFestivalPlace);
		
		JButton btnMap = new JButton("\uC9C0\uB3C4");
		btnMap.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 13));
		btnMap.setBounds(345, 591, 86, 23);
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MapExecute.main(f_name);
			}
		});
		panel.add(btnMap);
		
		String path = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\"+f_name+".jpg";
		
		JLabel lblImage = new JLabel(new ImageIcon(path));
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 133, SpringLayout.WEST, panel);
		panel.add(lblImage);
		lblImage.setBounds(10, 65, 405, 212);
				
		JButton menu = new JButton("");
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SearchGUI sc = new SearchGUI();
			}
		});
		menu.setBorderPainted(false);
		menu.setBackground(new Color(240, 248, 255));
		menu.setBorderPainted(false);
		menu.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_search.png"));
		menu.setBounds(357, 10, 52, 45);
		
		panel.add(menu);
		
		JLabel lblFestivalName = new JLabel(f_name);
		lblFestivalName.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 20));
		lblFestivalName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFestivalName.setBounds(33, 279, 362, 33);
		panel.add(lblFestivalName);
		JButton btnNewButton = new JButton("\uB354\uBCF4\uAE30");
		btnNewButton.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FestivalInformation2 Fest2 = new FestivalInformation2(f_name);
			}
		});
		btnNewButton.setBounds(168, 566, 97, 33);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 317, 419, 249);
		
		String list = dao.getList(f_name);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setBackground(new Color(240, 248, 255));
		txtpnInfo.setText(list);
		txtpnInfo.setBounds(12, 310, 419, 257);
		panel.add(txtpnInfo);
		
		JButton back = new JButton("");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mainGUI = new MainGUI();
				frame.setVisible(false);
			}
		});
		back.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_back.png"));
		back.setBorderPainted(false);
		back.setBackground(new Color(240, 248, 255));
		back.setBounds(33, 10, 52, 45);
		panel.add(back);
		
//		ArrayList<String> list = dao.getList();
//		
//		String[] header = {"Á¤º¸"};
//		String[][] data = new String[list.size()][1];
//		for (int i = 0; i < data.length; i++) {
//			data[i][0] = list.get(i);
//		}
//		JTable table = new JTable(data, header);
//		panel_1.add(new JScrollPane(table));
//		
//		panel.add(panel_1);
//		frame.setVisible(true);
	}
}

