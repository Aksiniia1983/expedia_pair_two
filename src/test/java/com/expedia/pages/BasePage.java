package com.expedia.pages;

import com.expedia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage { // Emanuil
public BasePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//span[.='Flights']")
 private WebElement flights;

@FindBy(xpath = "//button[@type='button']//span[.='Leaving from']")
private WebElement leavingFrom;

@FindBy(xpath = "//button[@type='button']//span[.='Going to']")
private WebElement goingTo;

@FindBy(xpath = "//button[@id='d1-btn']")
private WebElement departingDate;

@FindBy(xpath = "//button[@id='d2-btn']")
private WebElement returningDate;


@FindBy(xpath = "//button[@type='submit']")
private WebElement search;










}
