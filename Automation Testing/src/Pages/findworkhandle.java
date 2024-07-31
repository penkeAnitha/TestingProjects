package Pages;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class findworkhandle extends Chromedriversetup {
    Chromedriversetup driverSetUp = new Chromedriversetup();
    WebDriver driver = driverSetUp.getdriver();
    WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(50));

    public void findworkClick(){
        WebElement work = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //a [@class=\"jss1\"and@ href=\"/findwork\"]")));
        work.click();
    }

    public String getTitle() {
        WebElement findworktitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //p[text()=\"FIND WORK\"]")));
        String title = findworktitle.getText();
        return title;
    }
    public boolean verifySearchField(){
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"] ")));
         return  search.isDisplayed();
    }

    public ArrayList<String> getFindWorkFilters(){
        ArrayList<String> filtersList = new ArrayList<String>();
        List<WebElement> filterelements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-tc9djq\"]")));
        List<WebElement>  filterelements2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item css-14wsdbg\"] ")));
        for (WebElement element : filterelements) {
            String filterName = element.getText();
            filtersList.add(filterName);
        }
        for(WebElement element1 : filterelements2 ){
            String filtername1 = element1.getText();
            filtersList.add(filtername1);
        }
        return filtersList;
    }

    public int getRequestsCount(){
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(" //div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-xl-3 css-1rs68s8\"]")));
       int RequestsCount = elements.size();
       return RequestsCount;
    }

}









