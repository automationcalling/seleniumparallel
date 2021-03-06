package com.automation.pagefactory;

import com.automationcalling.seleniumcore.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class Automationcallinghome extends SeleniumUtil {
    private WebDriver driver;

    @FindBy(id = "menu-item-129")
    private WebElement articleLink;

    public Automationcallinghome(String browserType, String executionType) throws IOException {
        this.driver=returnDriver(browserType,executionType);
        PageFactory.initElements(driver, this);
        maximizeWindow();
    }

    public void clickArticlelink() {
        articleLink.click();
    }

    public void destroyPage() {
        closeBrowser();
    }

    public WebElement returnDynamicXpath(String identifier)
    {
        return driver.findElement(By.xpath("//*[@id=\"menu-item-103\"]/"+identifier+""));
    }

}
