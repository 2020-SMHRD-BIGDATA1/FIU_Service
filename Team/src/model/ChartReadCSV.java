package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChartReadCSV {

	public ArrayList<ChartVO> getList() {
		// TODO Auto-generated method stub
		ArrayList<ChartVO>  list = new ArrayList<ChartVO>();
		//1. 파일의 정보를 가지고 있는 객체 생성 (위치)
		File csv = new File("C:\\Users\\SMHRD\\Desktop\\chartlib\\광주광역시 계약구분별 사용량 데이터.csv");
		//2. 파일을 읽어들이는 Input 스트림 객체 생성
		
		try {
			Scanner sc = new Scanner(csv);
			sc.nextLine();
			while(sc.hasNext()) {
				String line = sc.nextLine();
				// , 기분으로 문자열을 잘라내세요
				// 건설 11112 1~4
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
