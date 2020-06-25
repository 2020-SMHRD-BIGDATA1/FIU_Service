package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class FestivalInformation {

	private JFrame frame;
	private JButton btnMore;
	String name = "ÈÞ¾Ö¸® ¼ö±¹ÃàÁ¦";
	
	public FestivalInformation() {
		initialize();
		frame.setVisible(true);
	}

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
		
		btnMore = new JButton("\uD6C4\uAE30 \uBCF4\uAE30");
		btnMore.setBounds(345, 628, 86, 33);
		btnMore.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FestivalMore.main(null);
			}
		});
		panel.add(btnMore);
		
		FestivalInformationDAO dao = new FestivalInformationDAO();
		
		String place = dao.getPlace(name);
		
		JLabel lblFestivalPlace = new JLabel(place);
		lblFestivalPlace.setBounds(10, 597, 329, 21);
		lblFestivalPlace.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		panel.add(lblFestivalPlace);
		
		JButton btnMap = new JButton("\uC9C0\uB3C4");
		btnMap.setBounds(345, 597, 86, 17);
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MapExecute.main(name);
			}
		});
		panel.add(btnMap);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\¼ö±¹.jpg";
		
		JLabel lblImage = new JLabel(new ImageIcon(path));
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 133, SpringLayout.WEST, panel);
		panel.add(lblImage);
		lblImage.setBounds(10, 65, 405, 212);
				
		JButton menu = new JButton("");
		menu.setBorderPainted(false);
		menu.setBackground(Color.WHITE);
		menu.setBorderPainted(false);
		menu.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\menu.png"));
		menu.setBounds(355, 10, 60, 45);
		
		panel.add(menu);
		
		JLabel lblFestivalName = new JLabel(name);
		lblFestivalName.setFont(new Font("¹ÙÅÁ", Font.PLAIN, 20));
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
		
		String list = dao.getList(name);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setBackground(new Color(240, 248, 255));
		txtpnInfo.setText(list);
		txtpnInfo.setBounds(12, 310, 419, 257);
		panel.add(txtpnInfo);
		
		
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

