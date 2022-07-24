package com.expedia.pages;

import com.expedia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage { // Emanuil

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Flights']")
    public WebElement flights;

    @FindBy(xpath = "//button[.='Leaving from']")
    public WebElement leavingFrom;

    @FindBy(css ="#location-field-leg1-origin" )
    public WebElement leavingFromInput;

    @FindBy(xpath = "//button[.='Going to']")
    public WebElement goingTo;

    @FindBy (css = "#location-field-leg1-destination")
    public WebElement goingToInput;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement search;

    @FindBy(xpath = "//button[@id ='d1-btn']")
    public WebElement dateTable;
    @FindBy(xpath = "//button[@data-stid ='apply-date-picker']")
    public WebElement doneBtn;


    public void selectDate(String currentDate){
        WebElement date = Driver.getDriver().findElement(By.xpath("//button[@aria-label ='"+currentDate+"']"));
        date.click();
    }

}
