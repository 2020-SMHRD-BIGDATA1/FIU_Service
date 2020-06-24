package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Controller;
import model.FestivalVO;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class SearchGUI {
	
	private JFrame frame;
	public JTextField txt_search;
	
	public static Controller controller = new Controller();
	private ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
	protected ArrayList<FestivalVO> result;
	private JPanel result_panel;
	
	private JTable table;
	private String[] header = {"축제명","도시명","연락처","시작일","종료일"};
	
	

	public SearchGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lb_logo = new JLabel("\uCD95\uC81C\uC5B4\uB54C");
		lb_logo.setForeground(new Color(255, 69, 0));
		lb_logo.setBackground(Color.WHITE);
		lb_logo.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 30));
		lb_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lb_logo.setBounds(117, 5, 200, 50);
		panel.add(lb_logo);

		JButton btn_back = new JButton("");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mainGUI = new MainGUI();
				frame.setVisible(false);
			}
		});
		btn_back.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_back.png"));
		btn_back.setBorderPainted(false);
		btn_back.setBackground(Color.WHITE);
		btn_back.setBounds(0, 0, 65, 60);
		panel.add(btn_back);

		JButton btn_list = new JButton("");
		btn_list.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_list.png"));
		btn_list.setBorderPainted(false);
		btn_list.setBackground(Color.WHITE);
		btn_list.setBounds(369, 0, 65, 60);
		panel.add(btn_list);
		
		JButton btn_search = new JButton("");
		//전체 검색
		btn_search.addActionListener(new ActionListener() {

			

			public void actionPerformed(ActionEvent arg0) {
				
				String search = txt_search.getText();
				result = controller.searchList(search);
				
				String[][] values = new String[result.size()][5];
				
				for (int i = 0; i < values.length; i++) {
					values[i][0] = result.get(i).getFest_name();
					values[i][1] = result.get(i).getCity();
					values[i][2] = result.get(i).getFest_tel();
					values[i][3] = result.get(i).getFest_date1();
					values[i][4] = result.get(i).getFest_date2();	
				}
				
				table = new JTable(values, header);
				result_panel.add(new JScrollPane(table));
				result_panel.setVisible(true);
			}
		});
		
		btn_search.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_search.png"));
		btn_search.setBorderPainted(false);
		btn_search.setBackground(Color.WHITE);
		btn_search.setBounds(369, 87, 45, 45);
		panel.add(btn_search);

		txt_search = new JTextField();
		txt_search.setBounds(12, 84, 410, 50);
		panel.add(txt_search);
		txt_search.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 144, 410, 45);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn_area = new JButton("\uC9C0\uC5ED");
		panel_1.add(btn_area);
		
		JButton btn_date = new JButton("\uB0A0\uC9DC");
		panel_1.add(btn_date);
		
		JButton btn_age = new JButton("\uC5F0\uB839");
		panel_1.add(btn_age);
		
		JPanel result_panel = new JPanel();
		result_panel.setBounds(12, 199, 410, 452);
		panel.add(result_panel);

	}
}
