package pack1;

public class Class3 {
	public static void launchBrowser() {
		System.out.println("grr");
		System.out.println("opening  Browser");
		System.out.println("launch browser successful/not successful " + "\r\n");

	}

	public static void AccessApplication() {
		System.out.println("Entering url in address bar and clicking on go button");
		System.out.println("Access Application successful/not successful" + "\r\n");

	}

	public static void userLogin() {
		System.out.println("Entering username, password and click on ok button" );
		System.out.println("User login successful/not successful"+ "\r\n");

	}

	public static void userLogout() {
		System.out.println("Clicking on logout");
		System.out.println("User logout successful/not successful" + "\r\n");

	}

	public static void quitBrowser() {
		System.out.println("Closing the browser");
		System.out.println("Browser closed successful/not successful" + "\r\n");

	}

	public static void main(String[] args) {
		launchBrowser();
		AccessApplication();
		userLogin();
		userLogout();
		quitBrowser();
	}

}
