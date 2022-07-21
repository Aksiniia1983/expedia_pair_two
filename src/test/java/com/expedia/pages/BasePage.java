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
 public WebElement flights;

@FindBy(xpath = "//button[@type='button']//span[.='Leaving from']")
public WebElement leavingFrom;

@FindBy(xpath = "//button[@type='button']//span[.='Going to']")
public WebElement goingTo;

@FindBy(xpath = "//button[@id='d1-btn']")
public WebElement departingDate;

@FindBy(xpath = "//button[@id='d2-btn']")
public WebElement returningDate;

@FindBy(xpath = "//button[@type='submit']")
public WebElement search;










}
