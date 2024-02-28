package java_start;

public interface A07_02_WebDriver extends A07_01_SearchContext{

public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void close();
	
	
	@Override
	public void findElement(String element);
}
