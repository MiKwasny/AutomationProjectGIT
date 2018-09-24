package AutomationProject.MainFolder;


public class WebBrowserLaunch {


    public static void Launch() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Comarch\\Desktop\\Selenium Webdriver\\geckodriver.exe");
        String appUrl = "http://www.phptravels.net/";
        Driver.driver.get(appUrl);
        //Driver.driver.manage().window().maximize();
        //String Title = Driver.driver.getTitle();
        //System.out.println("Actual title is " + Title);

    }

}