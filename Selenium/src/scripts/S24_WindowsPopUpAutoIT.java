package scripts;

import java.io.IOException;

public class S24_WindowsPopUpAutoIT {

	public static void main(String[] args) throws IOException {

     Runtime.getRuntime().exec("Notepad");
     
     Runtime.getRuntime().exec(".//AutoIT//Test.exe");

	}

}
