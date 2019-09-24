package s091ex;
// DA CAPIRE

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//
public class scannerEx2 {
	public static void main(String[] args) throws Throwable {// DA CAPIRE

		File f = new File("C:/Users/Administrator/Desktop/temp/Exe2.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			pw.println("12");
			pw.println("27");
			pw.println("0");
			pw.println("51");

			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(f);
		int d = 0;
		while (scanner.hasNextInt()) {

			d = scanner.nextInt();
			if (d == 0) {

				break;
			} else if (d % 2 == 0) {
				System.out.println(d + " " + "è pari");
			} else if (d % 2 != 0) {
				System.out.println(d + " " + "è dispari");
			}

		}
		scanner.close();
	}

}
