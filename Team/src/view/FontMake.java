package view;

	import java.awt.Font;
	import java.awt.FontFormatException;
	import java.awt.GraphicsEnvironment;
	import java.io.File;
	import java.io.IOException;

	public class FontMake {
	
	   public void FontChange(GraphicsEnvironment ge) {
		   Font Wol;
	      String path = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\Wolyeonggyo.ttf"; // ��Ʈ�� ��θ� �������°�
	      // font�� ���Ӱ� ������ �Ұǵ�, �Ű������� ���� �� (�Ÿ������ ��Ʈ�� ���� ����, ����)
	      try {
	    	  Wol = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
	         ge.registerFont(Wol);
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
