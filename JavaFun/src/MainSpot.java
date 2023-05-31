import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Spot;

public class MainSpot {	
	
	public static void main(String[] args) throws IOException {
		// spot 파일을 읽어서 객체화 후 print
		// 파일을 라인 단위로 읽으려면 bufferedreader 클래스 이용
		// 객체 배열 선언		
		List<Spot> spots = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\Projects\\Mountain\\Data\\spot.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			// System.out.println(line);
			String[] spotSplit = line.split(", ", -1);			
			Spot s = new Spot(spotSplit[0], Integer.parseInt(spotSplit[1]), spotSplit[2], spotSplit[3], spotSplit[4] );
			spots.add(s);			
		}		
		br.close();
		
		for (Spot s : spots) {
			s.print();
		}
		
		
		System.out.println("\n Sorted spot height!");
		Collections.sort(spots, new SpotHeightComparator());
		for (Spot s : spots) {
			s.print();
		}
		
	}
}

class SpotHeightComparator implements java.util.Comparator<Spot> {
	public int compare(Spot a, Spot b) {
		return b.height - a.height;
	}
}
