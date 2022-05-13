package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManualGeneratorPage {

    @FindBy(css = "#root>form")
    private WebElement creationForm;

    @FindBy(css = "form>h1")
    private WebElement creationalFormName;

    @FindBy(css = "div:nth-child(3) > div")
    private WebElement partnerSelectionDropDown;

    @FindBy(css = "div:nth-child(6) > div")
    private WebElement catalogSelectionDropDown;

    @FindBy(css = "div:nth-child(9) > div")
    private WebElement feedtypeSelectionDropDown;

    @FindBy(css = "ul>li:nth-child(1)")
    private WebElement partnerDropDownOptionGoogle;

    @FindBy(css = "ul>li:nth-child(2)")
    private WebElement partnerDropDownOptionBloomReach;

    @FindBy(css = "ul>li:nth-child(3)")
    private WebElement partnerDropDownOptionPowerReviews;

    @FindBy(css = "ul>li:nth-child(4)")
    private WebElement partnerDropDownOptionPIM;

    @FindBy(css = "span.MuiIconButton-label")
    private WebElement ftpFeedsSwitch;

    @FindBy(css = "ul>li:nth-child(1)")
    private WebElement catalogDropDownOptionShutterfly;

    @FindBy(css = "ul>li:nth-child(2)")
    private WebElement catalogDropDownOptionTinyPrint;

    @FindBy(css = "ul>li:nth-child(1)")
    private WebElement feedtypeDropDownOptionComplete;

    @FindBy(css = "ul>li:nth-child(2)")
    private WebElement feedtypeDropDownOptionMerged;

    @FindBy(css = "ul>li:nth-child(3)")
    private WebElement feedtypeDropDownOptionPartial;

    @FindBy(css = "button:nth-child(1)")
    private WebElement generateButton;

    @FindBy(css = "button:nth-child(2)")
    private WebElement goBackButton;






}
