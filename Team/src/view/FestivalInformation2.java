package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import model.FestivalInformationDAO;

import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class FestivalInformation2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	
	public FestivalInformation2(String f_name) {
		initialize(f_name);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String f_name) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 671, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 444, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		String path = "C:\\\\Users\\\\SMHRD\\\\Desktop\\\\¼ö±¹.jpg";
		JLabel lblImage = new JLabel(new ImageIcon(path));
		lblImage.setBackground(new Color(240, 248, 255));
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 133, SpringLayout.WEST, panel);
		panel.add(lblImage);
		lblImage.setBounds(12, 62, 420, 240);
		
		FestivalInformationDAO dao = new FestivalInformationDAO();
		
		String infor = dao.getInfor(f_name);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 248, 255));
		textArea.setText(infor);
		textArea.setLineWrap(true);
		textArea.setBounds(12, 62, 420, 599);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_back.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FestivalInformation Fest = new FestivalInformation(f_name);
			}
		});		
		btnNewButton.setBounds(12, 10, 62, 38);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton);

		
	}

	
}
