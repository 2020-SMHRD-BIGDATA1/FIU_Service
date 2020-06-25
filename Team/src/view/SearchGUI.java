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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import model.FestivalInformationDAO;
import model.FestivalVO;

public class SearchGUI {

	private JFrame frame;

	public static Controller controller = new Controller();
	private ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
	protected ArrayList<FestivalVO> result;
	private CardLayout cl_result_panel = new CardLayout(0, 0);
	private JTable table;
	private String[] header = { "축제명", "도시명", "연락처", "시작일", "종료일" };
	private JPanel result_panel;
	
	private JPanel search;
	private JPanel area;
	private JPanel calendar;
	private JPanel age;

	private FestivalInformationDAO fdao;
	DefaultTableModel model = new DefaultTableModel();
	private JTable table_1;
	private JTable table_2;

	private String word;

	private FestivalInformation FestivalInformation;

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
		// 검색버튼 끝

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 108, 410, 45);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btn_area = new JButton("\uC9C0\uC5ED");
		btn_area.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				search.setVisible(false);
				area.setVisible(true);
				calendar.setVisible(false);
				age.setVisible(false);
			}
		});
 
		panel_1.add(btn_area);

		JButton btn_date = new JButton("\uB0A0\uC9DC");
		btn_date.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				search.setVisible(false);
				area.setVisible(false);
				calendar.setVisible(true);
				age.setVisible(false);
			}
		});

		panel_1.add(btn_date);

		JButton btn_age = new JButton("\uC5F0\uB839");
		btn_age.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				search.setVisible(false);
				area.setVisible(false);
				calendar.setVisible(false);
				age.setVisible(true);
			}
		});

		panel_1.add(btn_age);

		result_panel = new JPanel();
		result_panel.setBounds(12, 199, 410, 452);
		panel.add(result_panel);
		result_panel.setLayout(cl_result_panel);

	
		search = new JPanel();
		result_panel.add(search, "name_65526670868800");
		search.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		search.add(scrollPane_1, "name_71518854043800");

		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);

		// 지역별 검색결과
		area = new JPanel();
		result_panel.add(area, "name_61996813277100");
		area.setLayout(null);
		
		JPanel areaList = new JPanel();
		areaList.setBounds(0, 0, 100, 452);
		area.add(areaList);
		areaList.setLayout(new GridLayout(17, 1, 0, 0));
		
		JButton btn_1 = new JButton("\uC11C\uC6B8");
		areaList.add(btn_1);
		
		JButton btn_2 = new JButton("\uACBD\uAE30");
		areaList.add(btn_2);
		
		JButton btn_3 = new JButton("\uC778\uCC9C");
		areaList.add(btn_3);
		
		JButton btn_4 = new JButton("\uC138\uC885");
		areaList.add(btn_4);
		
		JButton btn_5 = new JButton("\uB300\uC804");
		areaList.add(btn_5);
		
		JButton btn_6 = new JButton("\uB300\uAD6C");
		areaList.add(btn_6);
		
		JButton btn_7 = new JButton("\uAD11\uC8FC");
		areaList.add(btn_7);
		
		JButton btn_8 = new JButton("\uC6B8\uC0B0");
		areaList.add(btn_8);
		
		JButton btn_9 = new JButton("\uBD80\uC0B0");
		areaList.add(btn_9);
		
		JButton btn_10 = new JButton("\uAC15\uC6D0");
		areaList.add(btn_10);
		
		JButton btn_11 = new JButton("\uCDA9\uBD81");
		areaList.add(btn_11);
		
		JButton btn_12 = new JButton("\uCDA9\uB0A8");
		areaList.add(btn_12);
		
		JButton btn_13 = new JButton("\uACBD\uBD81");
		areaList.add(btn_13);
		
		JButton btn_14 = new JButton("\uACBD\uB0A8");
		areaList.add(btn_14);
		
		JButton btn_15 = new JButton("\uC804\uBD81");
		areaList.add(btn_15);
		
		JButton btn_16 = new JButton("\uC804\uB0A8");
		areaList.add(btn_16);
		
		JButton btn_17 = new JButton("\uC81C\uC8FC");
		areaList.add(btn_17);
		
		JPanel mapPanel = new JPanel();
		mapPanel.setBounds(98, 0, 312, 452);
		area.add(mapPanel);

		// 지역별 출력문
//		DefaultTableModel model = new DefaultTableModel(header, 0);
//		
//		ArrayList<FestivalVO> arr = controller.getlist();
//		
//		for (int i = 0; i < arr.size(); i++) {
//            model.addRow(new Object[]{
//            				arr.get(i).getFest_name(),
//            				arr.get(i).getCity(),
//            				arr.get(i).getFest_tel(),
//            				arr.get(i).getFest_date1(),
//            				arr.get(i).getFest_date2()});
//         }
//		
//		table_1 = new JTable(model);
//		scrollPane.setViewportView(table_1);

		// 날짜별 검색결과
		calendar = new JPanel();
		result_panel.add(calendar, "name_61998025331300");
		calendar.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		calendar.add(scrollPane, "name_68862466593000");

		// 날짜테이블 출력문
		model = new DefaultTableModel(header, 0);

		ArrayList<FestivalVO> arr = controller.getlist();

		for (int i = 0; i < arr.size(); i++) {
			model.addRow(new Object[] { arr.get(i).getFest_name(), arr.get(i).getCity(), arr.get(i).getFest_tel(),
					arr.get(i).getFest_date1(), arr.get(i).getFest_date2() });
		}

		table_1 = new JTable(model);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FestivalInformation Fest = new FestivalInformation();

				int row = table_1.getSelectedRow();
				String f_name = table_1.getModel().getValueAt(row, 0).toString();
				
				FestivalVO f = new FestivalVO(f_name);
//				System.out.println(f_name);
//				vo.setFest_name(f_name);
			}
		});
		scrollPane.setViewportView(table_1);

		// 연령별 검색결과
		age = new JPanel();
		result_panel.add(age, "name_61999898250100");
		age.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("age");
		age.add(lblNewLabel_2, "name_68883418327099");

//		table_1 = new JTable();
//		age.add(table_1);

//		//테이블 넣기
//        DefaultTableModel model = new DefaultTableModel(header, 0);
//        
//        table_1 = new JTable(model);
//        
//        JScrollPane scrollPane = new JScrollPane(table_1);
//        scrollPane.setBounds(26, 80, 580, 323);
//        frame.getContentPane().add(scrollPane);

	}
}
