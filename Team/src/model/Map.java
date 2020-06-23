package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Map extends JFrame{
	
	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = "���ֱ�����û";
	private JLabel googleMap;
	
	public Map() {
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle("���ֱ�����û");
		setVisible(true);
		pack();
	}
}
