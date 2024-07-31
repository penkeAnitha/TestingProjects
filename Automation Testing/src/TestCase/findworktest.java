package TestCase;

import ActionsPackage.ActionsClass;
import DriverSetup.Chromedriversetup;
import Pages.findworkhandle;
import Pages.login;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findworktest extends findworkhandle {

    public static void main(String[] args) throws InterruptedException, IOException {
        Chromedriversetup driverSetup = new Chromedriversetup();
        driverSetup.Chromedriversetup();
        WebDriver driver = driverSetup.getdriver();
        findworkhandle find = new findworkhandle();
        login log = new login();
        ActionsClass actionsClass = new ActionsClass();
        log.loginMethod();
        find.findworkClick();

        // verifying the filters
        String[] expectedFilters = {"Category", "Budget", "Project Type", "Available Time", "Country", "State"};
        List<String> expectedFiltersfromArray = Arrays.asList(expectedFilters);  // converted array into array list
       /*  Directling adding values into array List.
        ArrayList<String> expectedFilters = new ArrayList<String>();
        expectedFilters.add("Category");
        expectedFilters.add("Budget");
        expectedFilters.add("Project Type");
        expectedFilters.add("Available Time");
        expectedFilters.add("Country");
        expectedFilters.add("State");*/

        ArrayList<String> listfromweb = find.getFindWorkFilters();

        if (expectedFiltersfromArray.equals(listfromweb)) {
            System.out.println("expectedResult" + expectedFiltersfromArray);
            System.out.println("listfromweb" + listfromweb);
            System.out.println("findwork filters passed");
        } else {
            System.out.println("expectedResult" + expectedFiltersfromArray);
            System.out.println("listfromweb" + listfromweb);
            System.out.println("findwork filters test failed");
        }

        //verifying the title
        String expectedTitle = "FID WORK";
        String actualTitle = find.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("title test case passed");
        }else{
            System.out.println("title test case failed");
            actionsClass.Screenshot("findWork");
        }


        //verifying the search bar visibility
        boolean isSearchBarVisible = find.verifySearchField();
        if(isSearchBarVisible){
              System.out.println("searchbar case passed");
        }else{
              System.out.println("searchbar case failed");
              actionsClass.Screenshot("searchBarVisibility");
        }

        driver.quit();
    }
}

