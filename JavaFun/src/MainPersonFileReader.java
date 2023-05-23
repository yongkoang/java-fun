import java.io.FileInputStream;
import java.io.IOException;

public class MainPersonFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("D:\\Projects\\person\\data\\person.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
	}
}
