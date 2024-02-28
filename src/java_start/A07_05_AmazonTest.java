package java_start;

public class A07_05_AmazonTest {

	public static void main(String[] args) {

		String browser = "firefox";
		A07_02_WebDriver driver = null;

		//cross browser logic:
		if (browser.equals("chrome")) {
			A07_04_ChromeDriver driver1 = new A07_04_ChromeDriver();
		} else if (browser.equals("firefox")) {
			A07_03_FirefoxDriver driver2 = new A07_03_FirefoxDriver();
		} else {
			System.out.println("plzzz pass the right browser...");
		}
		
	}

}
