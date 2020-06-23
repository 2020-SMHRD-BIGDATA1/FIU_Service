package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import model.ChartReadCSV;
import model.ChartVO;

import java.awt.Color;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FestivalMore {

	private JFrame frame;

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
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		ChartReadCSV readCSV = new ChartReadCSV();
		ArrayList<ChartVO> list = readCSV.getList();
		
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
		
		for(int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getUsage(),list.get(i).getMonth(),list.get(i).getDivision());		
		}
		
		JFreeChart barChart = ChartFactory.createBarChart("연령대 평점","연령대","평점",dataset1, PlotOrientation.VERTICAL,true,true,true);
		//한글을 적용하기 위한 Font 객체 생성
		// 1.폰트종류 2.폰트타입 3.크기
		Font f = new Font("Gulim",Font.BOLD, 10);
		barChart.getTitle().setFont(f);
		
	
		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		
		sl_panel.putConstraint(SpringLayout.NORTH, chartPanel, 64, SpringLayout.NORTH, panel);
		chartPanel.setPreferredSize(new java.awt.Dimension(300,300));
		sl_panel.putConstraint(SpringLayout.WEST, chartPanel, 41, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, chartPanel, -57, SpringLayout.EAST, panel);
		panel.add(chartPanel);
		chartPanel.setLayout(new SpringLayout());
		
		JLabel lblNewLabel = new JLabel("\uD6C4\uAE30");
		sl_panel.putConstraint(SpringLayout.SOUTH, chartPanel, -6, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, -425, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 41, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 377, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		Button button_back = new Button("\u25C0");
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FestivalInformation.main(null);
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, button_back, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, button_back, 41, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, button_back, 43, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, button_back, 102, SpringLayout.WEST, panel);
		panel.add(button_back);
	}	
}
