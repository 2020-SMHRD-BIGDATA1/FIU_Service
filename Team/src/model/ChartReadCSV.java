package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChartReadCSV {

	public ArrayList<ChartVO> getList() {
		// TODO Auto-generated method stub
		ArrayList<ChartVO>  list = new ArrayList<ChartVO>();
		//1. ������ ������ ������ �ִ� ��ü ���� (��ġ)
		File csv = new File("C:\\Users\\SMHRD\\Desktop\\chartlib\\���ֱ����� ��౸�к� ��뷮 ������.csv");
		//2. ������ �о���̴� Input ��Ʈ�� ��ü ����
		
		try {
			Scanner sc = new Scanner(csv);
			sc.nextLine();
			while(sc.hasNext()) {
				String line = sc.nextLine();
				// , ������� ���ڿ��� �߶󳻼���
				// �Ǽ� 11112 1~4
				String[] value = line.split(",");
				String division = value[0];
				int usage =  Integer.parseInt(value[1]);
				String month = value[2];
				ChartVO vo = new ChartVO(division, usage, month);
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		}
		return list;
	}

}
