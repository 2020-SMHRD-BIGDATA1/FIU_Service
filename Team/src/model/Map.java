package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Map extends JFrame{
	
	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = "堡林堡开矫没";
	private JLabel googleMap;
	
	public Map() {
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle("堡林堡开矫没");
		setVisible(true);
		pack();
	}
}
