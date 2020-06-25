package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Map extends JFrame {
	
	FestivalInformationDAO dao = new FestivalInformationDAO();
	

	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = null;
	private JLabel googleMap;
	
	public Map(String f_name) {
		location=dao.getPlace(f_name);
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle(f_name);
		setVisible(true);
		pack();
	}
}
