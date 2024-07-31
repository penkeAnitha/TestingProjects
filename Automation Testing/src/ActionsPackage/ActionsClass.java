package ActionsPackage;

import DriverSetup.Chromedriversetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;

import java.io.File;
import java.io.IOException;

public class ActionsClass extends Chromedriversetup {

    public void Screenshot(String screenshotname) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) getdriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots" + "/"+ screenshotname +".png"));
        System.out.println(" screenshot captured");
    }

}

