package test;

public abstract class BrowserClass {
	String Name;
	int Version;
	
	public void display() {
		
	}
	
	//Child class will take responsibility of this abstract methods.
	
	public abstract void OpenBrowser();
	
	public abstract void CloseBrowser();

}
