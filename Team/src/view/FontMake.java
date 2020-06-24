package view;

	import java.awt.Font;
	import java.awt.FontFormatException;
	import java.awt.GraphicsEnvironment;
	import java.io.File;
	import java.io.IOException;

	public class FontMake {
	
	   public void FontChange(GraphicsEnvironment ge) {
		   Font Binggrae;
		   Font Binggrae2;
	      String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Binggrae-Bold.ttf"; 
	      String path2 = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Binggrae.ttf";
	     
	      try {
	    	  Binggrae = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
	    	  Binggrae2 = Font.createFont(Font.TRUETYPE_FONT, new File(path2)).deriveFont(12f);
	         ge.registerFont(Binggrae);
	         ge.registerFont(Binggrae2);
	      } catch (FontFormatException e1) {
	         // TODO Auto-generated catch block
	         e1.printStackTrace();
	      } catch (IOException e1) {
	         // TODO Auto-generated catch block
	         e1.printStackTrace();
	      }
	      String[] fonts = ge.getAvailableFontFamilyNames();
	      for (int i = 0; i < fonts.length; i++) {
	         System.out.println(fonts[i]);
	      }
	   

	   }

}
