package DPThao.BT01;

import DPThao.Common.BaseTest;
import DPThao.Locators.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AddCategory extends BaseTest_BT01 {
    public static void main(String[] args) {
        createBrowser("chrome");
        driver.get("https://cms.anhtester.com/login");

        //Login CMS

        driver.findElement(By.xpath(LocatorCMS.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.buttonLogin)).click();

        //Menu Dashboard

        driver.findElement(By.xpath(LocatorCMS.menuProducts)).click();
        driver.findElement(By.xpath(LocatorCMS.menuCategory)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonAddNewCategory)).click();

        //Add new category

        String Category_Name = "Name of Category";

        driver.findElement(By.xpath(LocatorCMS.inputName)).sendKeys(Category_Name);

        driver.findElement(By.xpath(LocatorCMS.dropdownParentCategory)).click();
        driver.findElement(By.xpath(LocatorCMS.searchParentCategory)).sendKeys("Cake");
        driver.findElement(By.xpath(LocatorCMS.searchParentCategory)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(LocatorCMS.inputOrderingNumber)).sendKeys("10");

        Select selectType = new Select(driver.findElement(By.xpath(LocatorCMS.selectType)));
        selectType.selectByIndex(1);

        driver.findElement(By.xpath(LocatorCMS.buttonBanner)).click();
        driver.findElement(By.xpath(LocatorCMS.selectBanner)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonAddFilesBanner)).click();

        driver.findElement(By.xpath(LocatorCMS.buttonIcon)).click();
        driver.findElement(By.xpath(LocatorCMS.selectIcon)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonAddFilesIcon)).click();

        driver.findElement(By.xpath(LocatorCMS.inputMetaTitle)).sendKeys("Bánh kẹo");

        driver.findElement(By.xpath(LocatorCMS.texteareMetadescription)).sendKeys("Hàng hóa bánh kẹo Tết");

        driver.findElement(By.xpath(LocatorCMS.dropdownFilteringAttributes)).click();
        driver.findElement(By.xpath(LocatorCMS.selectFilterAttributes)).click();

        driver.findElement(By.xpath(LocatorCMS.buttonSaveAddCategory)).click();

        //Search Category added
        driver.findElement(By.xpath(LocatorCMS.searchCategory)).sendKeys(Category_Name);
        driver.findElement(By.xpath(LocatorCMS.searchCategory)).sendKeys(Keys.ENTER);
        sleep(3);

        //Check Category added
        if (driver.findElement(By.xpath(LocatorCMS.firstItemOnCategoryTable)).getText().equals(Category_Name)){
            System.out.println("Giá trị Name của Category đã thêm là đúng.");
        }
        closeBrowser();
    }
}
