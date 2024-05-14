package DPThao.Locators;

public class LocatorCMS {
    //Login CMS

    public static String headerLogin = "//h1[@class='h3 text-primary mb-0']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String checkboxRememberMe = "//input[@type='checkbox']";
    public static String textlinkForgotpassword = "//a[normalize-space()='Forgot password ?']";
    public static String buttonLogin = "//button[@type='submit']";

    //Dashboard CMS

    public static String menuProducts = "//span[normalize-space()='Products']";
    public static String menuCategory = "//span[normalize-space()='Category']";

    //Categories
    public static String buttonAddNewCategory = "//a[normalize-space()='Add New category']";
    public static String searchCategory ="//input[@placeholder='Type name & Enter']";
    public static String firstItemOnCategoryTable ="//tbody/tr[1]/td[2]";
    public static String popupAddCategorySuccess = "//div[@class='aiz-notify alert alert-success']";

    public static String iconDeleteCategory = "//a[@title = 'Delete']";
    public static String popupDeleteCategorySuccess = "//div[@class='aiz-notify alert alert-success']"; // Category has been deleted successfully

    // Popup Delete information
    public static String buttonDeleteCategory = "//a[@id= 'delete-link']";


    //Category Information
    public static String inputName = "//input[@id='name']";
    public static String dropdownParentCategory = "//button[@title='No Parent']";
    public static String searchParentCategory = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
    public static String inputOrderingNumber = "//input[@id='order_level']";
    public static  String selectType = "//select[@name='digital']";
    public static String buttonBanner = "//label[.='Banner (200x200)']/following-sibling::div//child::div[@class='input-group-prepend']";
    public static String selectBanner = "//div[@data-value='2349']";
    public static String buttonAddFilesBanner = "//button[normalize-space()='Add Files']";
    public static String buttonIcon = "//label[.='Icon (32x32)']/following-sibling::div//child::div[@class='input-group-prepend']";
    public static String selectIcon = "//div[@data-value='2349']";
    public static String buttonAddFilesIcon = "//button[normalize-space()='Add Files']";
    public static String inputMetaTitle = "//input[@name='meta_title']";
    public static String texteareMetadescription = "//textarea[@name='meta_description']";
    public static String dropdownFilteringAttributes = "//button[@title='Nothing selected']";
    public static String selectFilterAttributes = "//a[@id='bs-select-3-0']"; //Atribute: Size
    public static String buttonSaveAddCategory = "//button[@type='submit']";


}
