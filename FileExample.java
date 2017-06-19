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

	public void WriteFile () {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true); // mở file
			OutputStreamWriter osw = new OutputStreamWriter(fos); // 
			
			PrintWriter write = new PrintWriter(osw);
			
			String[] Ho 	= {"Tran", "Nguyen", "Le", "Phan"};
			String[] HoDem	= {"Quoc", "Van", "Thi", "Dinh", "Son"};
			String[] Ten 	= {"Vu", "Hung", "Kim", "Ngan", "Thuy", "Son"};
			
			int ddHo 	= Ho.length;
			int ddHoDem = HoDem.length;
			int ddTen 	= Ten.length;
			
			Random r = new Random();
			
			for (int i = 0; i < 100; i++) {
				String RandomHo 	= Ho[r.nextInt(ddHo - 1)];
				String RandomHoDem 	= HoDem[r.nextInt(ddHoDem - 1)];
				String RandomTen 	= Ten[r.nextInt(ddTen - 1)];
				double RandomHSL	= r.nextDouble() * 10;
				
				write.println(i + ";" +RandomHo+RandomHoDem+ RandomTen + ";" + RandomHSL);
			}
			
			write.close(); // đóng file
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
