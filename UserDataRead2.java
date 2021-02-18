import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDataRead2 {
	public UserDataRead2() {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("/Users/jae/Downloads/Userdata.csv"));
			ArrayList <User> userList = new ArrayList <User>();
			
			String line = "";
			br.readLine();
			while((line = br.readLine()) != null) {
				String[] userDetails = line.split(",");
				if (userDetails.length > 0) {
					User u = new User(userDetails[0], userDetails[1], 
							userDetails[2], userDetails[3]);
					userList.add(u);
				}
			}
			
			for (User us : userList) {
				System.out.println(us);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch(IOException ioe) {
				System.out.println("Error occurred while closing the Buffered Reader.");
				ioe.printStackTrace();
			}
		}
	}

}
