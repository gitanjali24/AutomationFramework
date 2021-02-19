package testcases;

import java.io.IOException;

import pages.HomePage;

public class HomePageTest extends BaseTest{
	
	
	public static void main(String[] args) throws IOException {
		
		HomePage ht=new HomePage();
		ht.basetest();
		ht.selectLanguage();
		
		
	}

}
