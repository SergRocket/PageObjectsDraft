package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreationPage {
//elements

    @FindBy(css = "button:nth-last-child(4)")
    private WebElement bloomreachItemsButton;

    @FindBy(css = "button:nth-child(3)")
    private WebElement googleItemsButton;

    @FindBy(css = "button:nth-child(4)")
    private WebElement powerReviewsItemsButton;

    @FindBy(css = "button:nth-child(5)")
    private WebElement baseFeedItemsButton;

    @FindBy(css = ".MuiSwitch-root")
    private WebElement densePaddingSwitcher;

    @FindBy(css = "svg:nth-last-child(2)")
    private WebElement historyButton;

    @FindBy(css = "section>div>svg>path")
    private WebElement settingsButton;

    @FindBy(css = "li:nth-child(1)")
    private WebElement changeFeedsConfigButton;

    @FindBy(css = "li:nth-child(2)")
    private WebElement generateFeedsConfigButton;

    @FindBy(css = ".MuiTablePagination-select")
    private WebElement rowsPerPageButton;
















//Getters
//to get and check info about the user, check error massage, get quantity -
// \ussualy for assert that element is shown


//Actions
//enter fields, clicks

//Boolean
//is checkboxes are clicked, is color of the element valid ect.

}
