package stepDefinitions;

import utils.ReadConfigFile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadConfigFile file = new ReadConfigFile();
		String browserName = file.getBrowser();
		System.out.println(browserName);

	}

}
