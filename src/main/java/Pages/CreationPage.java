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

    @FindBy(css = "div.MuiTablePagination-actions>button:nth-child(2)")
    private WebElement paginationNextButton;

    @FindBy(css = "div.MuiTablePagination-actions>button:nth-child(1)")
    private WebElement paginationPreviousButton;

    @FindBy(css = ".sfly-logo")
    private WebElement logoImage;

    @FindBy(css = "header > h2")
    private WebElement pageNameImage;

    @FindBy(css = "th:nth-child(1) > span")
    private WebElement partnerSortingButton;

    @FindBy(css = "th:nth-child(1) > span")
    private WebElement partnerSortrtingButton;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(2)")
    private WebElement dateAndStartTimeInfo;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(3)")
    private WebElement endTimeInfo;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > div")
    private WebElement statusInfo;

    @FindBy(css = "tr:nth-child(1)>td:nth-child(5)")
    private WebElement numberOfProductsInfo;

    @FindBy(css = "tr:nth-child(1)>td:nth-child(6)>button")
    private WebElement allStatusesButton;

    @FindBy(css = ".MuiDialog-container.MuiDialog-scrollPaper>div")
    private WebElement feedConfigWindow;

    @FindBy(css = "#customized-dialog-title")
    private WebElement tilteFeedConfigWindow;

    @FindBy(css = "#customized-dialog-title > button")
    private WebElement feedConfigCloseButton;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(2) > label")
    private WebElement saveFeedGoogleSwitch;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(3) > label")
    private WebElement TPFeedGoogleSwitch;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > label")
    private WebElement runNightlyGoogleSwitch;

    @FindBy(css = "tr:nth-child(2) > td:nth-child(2) > label")
    private WebElement saveFeedBloomreachSwitch;

    @FindBy(css = "tr:nth-child(2) > td:nth-child(3) > label")
    private WebElement fTPFeedBloomreachSwitch;

    @FindBy(css = "tr:nth-child(2) > td:nth-child(4) > label")
    private WebElement runNightlyBloomreachSwitch;

    @FindBy(css = "tr:nth-child(3) > td:nth-child(2) > label")
    private WebElement saveFeedPowerReviewsSwitch;

    @FindBy(css = "tr:nth-child(3) > td:nth-child(3) > label")
    private WebElement fTPFeedPowerReviewsSwitch;

    @FindBy(css = "tr:nth-child(3) > td:nth-child(4) > label")
    private WebElement runNightlyPowerReviewsSwitch;

    @FindBy(css = "tr:nth-child(1)>td:nth-child(5)>button")
    private WebElement googleUpdateButton;

    @FindBy(css = "tr:nth-child(2)>td:nth-child(5)>button")
    private WebElement bloomreachUpdateButton;

    @FindBy(css = "tr:nth-child(3)>td:nth-child(5)>button")
    private WebElement powerReviewsUpdateButton;



















//Getters
//to get and check info about the user, check error massage, get quantity -
// \ussualy for assert that element is shown


//Actions
//enter fields, clicks

//Boolean
//is checkboxes are clicked, is color of the element valid ect.

}
