import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class First {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ArrayList rows = new ArrayList();
		ArrayList c = new ArrayList();
		ArrayList l = new ArrayList();
		ArrayList i = new ArrayList();

		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				
				int occurency = 0;
				if (line.charAt(0) != '#') {
					rows.add(Integer.parseInt(String.valueOf(line.charAt(0))));
					
					int temp = Integer.parseInt(String.valueOf(line.charAt(2)));
					i.add(temp);
					System.out.println(line);


					try (BufferedReader br2 = new BufferedReader(new FileReader("file.txt"))) {
						String line2;
						while ((line2 = br2.readLine()) != null) {
							if (line.charAt(0) == line2.charAt(0)) {
								occurency++;
							}

						}
						double temp2 = (double) 1 / occurency;
						c.add(temp2);
					}

				}
			}
		}
		
		System.out.println("******");
		l.add(0);
		
		for(int j=1;j<rows.size();j++) {
			if((int)rows.get(j-1)!=(int)rows.get(j)) {
				l.add(j);
			}
			
		}
		l.add(rows.size());
		
		System.out.println("*****");
		
		for (int j=0;j<l.size();j++) {
			System.out.println(l.get(j));
			
		}
		System.out.println("*******");
		for (int j=0;j<c.size();j++) {
			System.out.println(c.get(j));
			
		}
		
		System.out.println("******");
		for (int j=0;j<i.size();j++) {
			System.out.println(i.get(j));
			
		}
		
	}

}
