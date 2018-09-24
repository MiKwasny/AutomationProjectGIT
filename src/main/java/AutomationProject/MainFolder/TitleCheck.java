package AutomationProject.MainFolder;

public class TitleCheck {


    public static void TitleChecking(String expectedTitle) {


        if (expectedTitle.equals(Driver.driver.getTitle())) {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
        } else {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }

    }
}