package com.expedia.pages;

import com.expedia.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {

    public SearchResultPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@data-test-id='sortDropdown']")
    public WebElement dropdown;

    @FindBy(xpath = "//button[@class='uitk-card-link']//span")
    public List<WebElement> flightOptions;

    @FindBy(xpath ="//button[@name='showMoreButton']")
    public WebElement showMoreButton;

}
