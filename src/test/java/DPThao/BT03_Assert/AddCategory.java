package DPThao.BT03_Assert;

import DPThao.Common.BaseTest;
import DPThao.Locators.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddCategory extends BaseTest {

    @BeforeMethod
    public void LoginCMS(){
        driver.get("https://cms.anhtester.com/login");
        driver.findElement(By.xpath(LocatorCMS.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.buttonLogin)).click();

    }
    @Test
    public void AddCategorySuccess (){
        SoftAssert softAssert = new SoftAssert();
        //Menu Dashboard
        // Check text menu Products
        String checkTextMenuProducts = driver.findElement(By.xpath(LocatorCMS.menuProducts)).getText();
        softAssert.assertEquals(checkTextMenuProducts, "Products", "Giá trị menu Products không đúng");
        driver.findElement(By.xpath(LocatorCMS.menuProducts)).click();

        // Check text menu Category
        String checkTextMenuCategory = driver.findElement(By.xpath(LocatorCMS.menuCategory)).getText();
        sleep(2);
        softAssert.assertEquals(checkTextMenuCategory, "Category", "Giá trị menu Category không đúng");
        driver.findElement(By.xpath(LocatorCMS.menuCategory)).click();

        // Check display and enable button Add New Category
        boolean checkDisplayButtonAddnewCategory =  driver.findElement(By.xpath(LocatorCMS.buttonAddNewCategory)).isDisplayed();
        softAssert.assertTrue(checkDisplayButtonAddnewCategory, "Nút Add New Category không hiển thị");

        boolean checkEnableButtonAddnewCategory =  driver.findElement(By.xpath(LocatorCMS.buttonAddNewCategory)).isEnabled();
        softAssert.assertTrue(checkEnableButtonAddnewCategory, "Nút Add New Category không enable");

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

        // Check display and enable button Save Add Category
        boolean checkDisplayButtonSaveAddCategory =  driver.findElement(By.xpath(LocatorCMS.buttonSaveAddCategory)).isDisplayed();
        softAssert.assertTrue(checkDisplayButtonSaveAddCategory, "Nút Save Add Category không hiển thị");

        boolean checkEnableButtonSaveAddCategory =  driver.findElement(By.xpath(LocatorCMS.buttonSaveAddCategory)).isEnabled();
        softAssert.assertTrue(checkEnableButtonSaveAddCategory, "Nút Save Add Category không enable");

        driver.findElement(By.xpath(LocatorCMS.buttonSaveAddCategory)).click();

        // Check Add category successfully
        boolean checkDisplayPopupAddCategorySuccess = driver.findElement(By.xpath(LocatorCMS.popupAddCategorySuccess)).isDisplayed();
        softAssert.assertTrue(checkDisplayPopupAddCategorySuccess, "Không hiển thị popup Add Category Successfully");

        String checkTextPopupAddCategorySuccess = driver.findElement(By.xpath(LocatorCMS.popupAddCategorySuccess)).getText();
        softAssert.assertEquals(checkTextPopupAddCategorySuccess, "Category has been inserted successfully", "Giá trị hiển thị trong popup không đúng.");

        //Search Category added
        driver.findElement(By.xpath(LocatorCMS.searchCategory)).sendKeys(Category_Name);
        driver.findElement(By.xpath(LocatorCMS.searchCategory)).sendKeys(Keys.ENTER);
        sleep(3);


        //Check Category added

        String NameofCategory = driver.findElement(By.xpath(LocatorCMS.firstItemOnCategoryTable)).getText();

        Assert.assertEquals(NameofCategory, Category_Name, "Giá trị Name của Category vừa thêm không đúng");

        // Delete Category
        driver.findElement(By.xpath(LocatorCMS.iconDeleteCategory)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonDeleteCategory)).click();


        boolean checkDisplayPopupDeleteCategorySuccess = driver.findElement(By.xpath(LocatorCMS.popupDeleteCategorySuccess)).isDisplayed();
        softAssert.assertTrue(checkDisplayPopupDeleteCategorySuccess, "Không hiển thị popup Delete Category Successfully");
        String checkTextPopupDeleteCategorySuccess = driver.findElement(By.xpath(LocatorCMS.popupDeleteCategorySuccess)).getText();
        softAssert.assertEquals(checkTextPopupDeleteCategorySuccess, "Category has been deleted successfully", "Giá trị hiển thị trong popup không đúng.");

        softAssert.assertAll();

    }

}
