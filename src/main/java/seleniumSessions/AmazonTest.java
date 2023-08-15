package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome ");
		brUtil.launchUrl("https://www.amazon.com");
		String actTitle = brUtil.getTitle();
		System.out.println(actTitle);
//		if (actTitle.contains("Amazon.com")) {
//			System.out.println("PASS Title");
//		} else {
//			System.out.println("Fail Title");
//		}
		
		Verify.equalValues(actTitle, "Amazon.com. Spend less. Smile more.");
		String actURL = brUtil.getPageURL();
		System.out.println(actURL);
//		if (actURL.contains("amazon")) {
//			System.out.println("PASS URL");
//		} else {
//			System.out.println("Fail URL");
//		}
		Verify.containValues(actTitle, "amazon.com");
		
		brUtil.quitBrowser();
	}

}
