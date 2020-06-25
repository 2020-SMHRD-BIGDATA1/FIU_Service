package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Map extends JFrame{
	
	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = "울산고래축제";
	private JLabel googleMap;
	
	public Map() {
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle("광주광역시청");
		setVisible(true);
		pack();
	}
}
