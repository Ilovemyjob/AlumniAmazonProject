package amazon.com.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import amazon.com.ui.utilities.Driver;


import java.util.List;

public class AmazonWebElements {

    public AmazonWebElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement accountLists;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "signInSubmit")
    public WebElement signInButton;

    @FindBy(tagName = "h4")
    public WebElement thereWasAProblem;

    @FindBy(className = "a-list-item")
    public WebElement yourPasswordIsIncorrect;
//ALL-MENU
    @FindBy(id = "nav-hamburger-menu")
    public WebElement allMenu;

    @FindBy (className = "hmenu-item")
    public List <WebElement> headersInAll;

    @FindBy (xpath = "(//a[@class='hmenu-item hmenu-compressed-btn'])[1]")
    public WebElement seeAll;

    @FindBy (xpath = "//ul[@data-menu-id='1']")
    public WebElement parentAllMenu;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> resultsList;



    //us03

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allButton;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//a")
    public List<WebElement> categoriMenu;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//a")
    public List<WebElement> subCategoriMenu;


    //us04
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTextBox;

    @FindBy (id = "nav-search-submit-button")
    public WebElement searchIcon;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public WebElement searchResults;
    @FindBy(xpath ="//span[contains(text(), 'Nutella')]")
    public List<WebElement> searchResult;
    @FindBy(xpath ="(//input[@type='submit'])[1]")
    public WebElement searchSubmitBtn;
    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])")
    public WebElement sonucYazisi;

    //us05
    @FindBy(xpath ="//span[text()='Featured']")
    public WebElement sortByFeatured;

    @FindBy(xpath ="//a[text()='Price: Low to High']")
    public WebElement lowToHighhOption;
    @FindBy (id = "s-result-sort-select")
    public WebElement sortBy;

    @FindBy (xpath = "//*[contains(@id, 'browse-bin-title')]")
    public List <WebElement> filtersHeader;

    @FindBy (className = "a-dropdown-item")
    public List <WebElement> sortbyDropdown;

    @FindBy (xpath = "//i[@class='a-icon a-icon-checkbox']")
    public List <WebElement> filtersInner;

    @FindBy (className = "a-dropdown-prompt")
    public WebElement sortByIcon;

    @FindBy (xpath = "//i[@class='a-size-medium a-color-base a-text-normal']")
    public List <WebElement> resultsAfterFilter;
    //us06
    @FindBy (id = "add-to-cart-button")
    public  WebElement addToCartButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    public WebElement cartItemCount;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public List <WebElement> itemCountPriceList;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")
    public WebElement subTotalText;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[*]//*/h2/a/span")
    public List <WebElement> searcResultDescriptionsList;


    //us07
    @FindBy (xpath = "//tbody//td[3]")
    public List<WebElement> linkList;

    @FindBy (xpath = "//tbody//td[3]//span[@class='navFooterDescText']")
    public List<WebElement>linksExtraInformation;

    //Shopping List

    @FindBy (xpath ="//span[text()='Create a List']")
    public WebElement createAList;

    @FindBy (xpath ="(//input[@class='a-button-input a-declarative'])[3]")
    public WebElement createAListButton;

    @FindBy (id = "profile-list-name")
    public WebElement shoppingListHeader;

    @FindBy (id = "overflow-menu-popover-trigger")
    public WebElement more;

    @FindBy (id = "editYourList")
    public WebElement manageList;

    @FindBy (xpath ="(//input[@class='a-button-input'])[7]")
    public WebElement deleteList;

    @FindBy (id = "a-popover-content-3")
    public WebElement confirmDelete;

    @FindBy (name = "submit.save")
    public WebElement yesButton;

    @FindBy (xpath ="(//a[@class='a-link-normal'])[10]")
    public WebElement addIdeaToList;

    @FindBy (xpath ="//input[@id='wfa-note-add-button']")
    public WebElement addToList;

    @FindBy (id = "wfaTextInput")
    public WebElement saveAnIdea;

    @FindBy (xpath = "(//input[@name='submit.deleteItem'])[1]")
    public WebElement deleteButton;

    @FindBy (xpath ="(//div[@class='a-alert-content'])[12]")
    public WebElement deletedAlert;

}



