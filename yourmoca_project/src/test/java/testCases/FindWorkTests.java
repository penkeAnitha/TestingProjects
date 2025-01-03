package testCases;

import BaseTest.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import ym_pages.Findworkpage;
import ym_pages.Login;

public class FindWorkTests extends BaseClass {
    @Test//(priority = 2)
    public void Verifyfindworksearchbar() {
        Login login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        Assert.assertTrue(findworkpage.findworksearchbar());
    }

    @Test//(priority = 1)
    public void Verifyselectedfindworkfilter() {
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        findworkpage.Dropdownfilter();
        String expectedResult = findworkpage.Selectedfilterbudgetdata;
       Assert.assertEquals(expectedResult,findworkpage.selectedremenurationprice());
    }

    @Test//(priority=3)
    public void Verifyremunarationprice() {
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        findworkpage.Dropdownfilter();
        findworkpage.selectedremenurationprice();
    }

}