package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Map extends JFrame {
	
	FestivalInformationDAO dao = new FestivalInformationDAO();
	

	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = null;
	private JLabel googleMap;
	
	public Map(String name) {
		location=dao.getPlace(name);
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle(name);
		setVisible(true);
		pack();
	}
}
