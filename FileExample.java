package FileExample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExample {
	
	public void ReadFile () {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
		
			while (true) {
				try {
					String st = br.readLine();
					if(st == null || st == "") break;
					System.out.println(st);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
