package IPAddress;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class getUrlConnection {
	 public static void main(String[] args) {
	 URL u;
	 URLConnection uc;
		 try {
		 u = new URL("https://iuh.edu.vn");
		 uc=u.openConnection();
		 System.out.println(uc);
		 } catch (MalformedURLException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	 }
}


