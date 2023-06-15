import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainThink {

	public static void main(String[] args) throws IOException {
		// 현재 날짜와, 주제, 내용을 쓴타
		System.out.println("Please input think! \n");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String brrl = br.readLine();
		String[] brrlsplit = brrl.split(",", -1);
		
		// true는 추가 쓰기 가능한 상태로 파일을 여는 것
		PrintWriter pw = new PrintWriter(new FileWriter("d:\\Think.txt", true));
		
		// ArrayIndexOutOfBoundsException 이 발생해서 try catch 문 사용
		try {
			System.out.println("Think! " + brrlsplit[0] + " " + brrlsplit[1]);
			LocalDateTime ldt = LocalDateTime.now();
			String ldts = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			
			// PtintWriter는 문장의 끝에 \n을 추가해서 라인을 넘긴다.			
			pw.println(ldts + ", " + brrlsplit[0] + "," + brrlsplit[1]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Clear! \n");
			pw.close();
			br.close();
		}		
		pw.close();
		br.close();
	}
}
