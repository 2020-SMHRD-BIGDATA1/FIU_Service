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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Controller;
import model.FestivalVO;

public class SearchGUI {
	
	private JFrame frame;
	public JTextField txt_search;
	private JPanel tpanel_1;
	public static Controller controller = new Controller();
	public ArrayList<FestivalVO> list = new ArrayList<FestivalVO>();
	protected ArrayList<FestivalVO> result;

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

		JLabel lblNewLabel = new JLabel("\uCD95\uC81C\uC5B4\uB54C");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 5, 200, 50);
		panel.add(lblNewLabel);

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
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String search = txt_search.getText();
//				System.out.println(search);
				result = controller.searchList(search);
//				System.out.println(result.get(0).getFest_name());
				for (int i = 0; i < result.size(); i++) {
					System.out.print(result.get(i).getFest_name()+"(");
					System.out.print(result.get(i).getCity()+") ");
					System.out.print(result.get(i).getFest_tel()+"\t");
					System.out.print("기간 : "+result.get(i).getFest_date1()+"~");
					System.out.println(result.get(i).getFest_date2());
				}
				
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

		JTabbedPane searchTab = new JTabbedPane(JTabbedPane.TOP);
		searchTab.setBackground(Color.WHITE);

		JPanel tpanel = new JPanel();
		tpanel.setBackground(Color.WHITE);
		searchTab.addTab("연령별", tpanel);
		tpanel.setLayout(null);

		tpanel_1 = new JPanel();
		tpanel_1.setBackground(Color.WHITE);
		searchTab.addTab("지역별", tpanel_1);
		tpanel_1.setLayout(null);

		MapPanel map_panel = new MapPanel();
		map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");

		map_panel.setBackground(Color.WHITE);
		map_panel.setBounds(90, 0, 339, 472);
		tpanel_1.add(map_panel);
		map_panel.setLayout(new CardLayout(0, 0));

		JPanel areaList = new JPanel();
		areaList.setBounds(0, 0, 91, 472);
		tpanel_1.add(areaList);
		areaList.setLayout(new GridLayout(17, 1, 0, 0));

		JButton btn_1 = new JButton("\uC11C\uC6B8");
		btn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\서울.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_1.setBackground(Color.WHITE);
		areaList.add(btn_1);

		JButton btn_2 = new JButton("\uACBD\uAE30");
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\경기.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_2.setBackground(Color.WHITE);
		areaList.add(btn_2);

		JButton btn_3 = new JButton("\uC778\uCC9C");
		btn_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\인천.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_3.setBackground(Color.WHITE);
		areaList.add(btn_3);

		JButton btn_4 = new JButton("\uC138\uC885");
		btn_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\세종.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_4.setBackground(Color.WHITE);
		areaList.add(btn_4);

		JButton btn_5 = new JButton("\uB300\uC804");
		btn_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\대전.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_5.setBackground(Color.WHITE);
		areaList.add(btn_5);

		JButton btn_6 = new JButton("\uB300\uAD6C");
		btn_6.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\대구.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_6.setBackground(Color.WHITE);
		areaList.add(btn_6);

		JButton btn_7 = new JButton("\uAD11\uC8FC");
		btn_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\광주.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_7.setBackground(Color.WHITE);
		areaList.add(btn_7);

		JButton btn_8 = new JButton("\uC6B8\uC0B0");
		btn_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\울산.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});

		btn_8.setBackground(Color.WHITE);
		areaList.add(btn_8);

		JButton btn_9 = new JButton("\uBD80\uC0B0");
		btn_9.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\부산.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_9.setBackground(Color.WHITE);
		areaList.add(btn_9);

		JButton btn_10 = new JButton("\uAC15\uC6D0");
		btn_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\강원.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_10.setBackground(Color.WHITE);
		areaList.add(btn_10);

		JButton btn_11 = new JButton("\uCDA9\uBD81");
		btn_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\충북.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_11.setBackground(Color.WHITE);
		areaList.add(btn_11);

		JButton btn_12 = new JButton("\uCDA9\uB0A8");
		btn_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\충남.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_12.setBackground(Color.WHITE);
		areaList.add(btn_12);

		JButton btn_13 = new JButton("\uACBD\uBD81");
		btn_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\경북.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_13.setBackground(Color.WHITE);
		areaList.add(btn_13);

		JButton btn_14 = new JButton("\uACBD\uB0A8");
		btn_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\경남.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_14.setBackground(Color.WHITE);
		areaList.add(btn_14);

		JButton btn_15 = new JButton("\uC804\uBD81");
		btn_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전북.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_15.setBackground(Color.WHITE);
		areaList.add(btn_15);

		JButton btn_16 = new JButton("\uC804\uB0A8");
		btn_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전남.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_16.setBackground(Color.WHITE);
		areaList.add(btn_16);

		JButton btn_17 = new JButton("\uC81C\uC8FC");
		btn_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\제주.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				map_panel.setVisible(false);
				map_panel.setPath("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\전국.PNG");
				map_panel.repaint();
				map_panel.setVisible(true);
			}
		});
		btn_17.setBackground(Color.WHITE);
		areaList.add(btn_17);

		JPanel tpanel_2 = new JPanel();
		tpanel_2.setBackground(Color.WHITE);
		searchTab.addTab("날짜별", tpanel_2);
		tpanel_2.setLayout(null);

		JPanel Calendar_Panel = new JPanel();
		Calendar_Panel.setBounds(12, 10, 405, 452);
		tpanel_2.add(Calendar_Panel);

		searchTab.setBounds(0, 160, 434, 501);
		panel.add(searchTab);

	}

}
