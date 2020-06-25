package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import model.ChartReadCSV;
import model.ChartVO;
import model.FestivalInformationDAO;
import model.listVO;
import view.FestivalInformation;

public class FestivalMore {

	private JFrame frame;
	int age10 = 0;
	int age20 = 0;
	int age30 = 0;
	int age40 = 0;
	int cnt10 = 0;
	int cnt20 = 0;
	int cnt30 = 0;
	int cnt40 = 0;
	String name = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FestivalMore window = new FestivalMore();
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
	public FestivalMore() {
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
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		
		name = "센텀맥주축제";
		
		ChartReadCSV readCSV = new ChartReadCSV();
		ArrayList<ChartVO> list = readCSV.getList(name);
		
		double score10 = 0;
		double score20 = 0;
		double score30 = 0;
		double score40 = 0;
		int cnt10 = 0;
		int cnt20 = 0;
		int cnt30 = 0;
		int cnt40 = 0;
	
	
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getAge() == 10) {
				score10 += list.get(i).getRating();
				cnt10++;
			}else if(list.get(i).getAge() == 20) {
				score20 += list.get(i).getRating();
				cnt20++;
			}else if(list.get(i).getAge() == 30) {
				score30 += list.get(i).getRating();
				cnt30++;
			}else {
				score40 += list.get(i).getRating();
				cnt40++;
			}
		}
		
	
		listVO voo10 = new listVO(score10/cnt10,"10대");
		listVO voo20 = new listVO(score20/cnt20,"20대");
		listVO voo30 = new listVO(score30/cnt30,"30대");
		listVO voo40 = new listVO(score40/cnt40,"40대");
		
	
		ArrayList<listVO> list2 = new ArrayList<listVO>();
		list2.add(voo10);
		list2.add(voo20);
		list2.add(voo30);
		list2.add(voo40);
	
	
		
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
		
		
		
		for (int i = 0; i < list2.size(); i++) {
			dataset1.addValue(list2.get(i).getScore(), "역대 축제평점", list2.get(i).getAge()+"");
		}
		
		
		
		
	
		
		
		// 그래프를 그려주는 객체 dataset을 넣어준다
		// 1.제목 2.x축 제목 3.y축제목 4.그래프 데이터
		// 5. 그래프 가로로 할건지 세로로 할건지
		// 6,7,8 그래프의 기능 넣을것인지
		JFreeChart barChart = ChartFactory.createBarChart(name,"연령대","평점",dataset1, PlotOrientation.VERTICAL,false,true,true);
		
		//한글을 적용하기 위한 Font 객체 생성
		// 1.폰트종류 2.폰트타입 3.크기
		Font f = new Font("Gulim",Font.BOLD, 14);
		barChart.getTitle().setFont(f);
		
		
		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		panel.setLayout(null);
		//파이차트
		
		
		
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setBounds(10,64,422,300);
		chartPanel.setPreferredSize(new java.awt.Dimension(300,300));
		panel.add(chartPanel);
		chartPanel.setLayout(null);
		
		
		FestivalInformationDAO dao = new FestivalInformationDAO();
		
		ArrayList<String> review = dao.getReview(name);
		
		String[] header = {"후기"};
		String[][] data = new String[review.size()][1];
		for (int i = 0; i < data.length; i++) {
			data[i][0] = review.get(i);
		}
		frame.setVisible(true);
		
		Button button_back = new Button("\u25C0");
		button_back.setBounds(10, 10, 60, 48);
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				FestivalInformation info = new FestivalInformation();
			}
		});
		panel.add(button_back);
		JTable table = new JTable(data, header);
		table.setFillsViewportHeight(true);
		table.setRowHeight(35);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFont(new Font("굴림", Font.PLAIN, 20));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 374, 422, 234);
		panel.add(scrollPane);
	}	
}
