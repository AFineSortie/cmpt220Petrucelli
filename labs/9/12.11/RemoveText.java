import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class RemoveText {

	public static void main(String[] args) throws java.io.IOException {
		File file = new File(args[1]);
		File tempfile = new File("tempfile.txt");
		
		Scanner input = new Scanner(file);
		PrintWriter output = new PrintWriter(tempfile);
		while (input.hasNext()) {
			String s1 = input.nextLine();
			// JA: Here you should replace the text
			if (!s1.equals(args[0])) {
				output.println(s1);
			}
		}
		
		input.close();
		output.close();
		file.delete();
		tempfile.renameTo(file);
	}

}
