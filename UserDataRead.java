import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDataRead {
	public UserDataRead() throws IOException{
		BufferedReader br = null;
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
		
	}
	
	
}
