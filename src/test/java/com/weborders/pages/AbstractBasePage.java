package com.weborders.pages;

/*it meant to be extended*/

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,20);
    //use wait in base pages , not in test classes..

   public AbstractBasePage(){   //this is constructor
       PageFactory.initElements(driver,this);
       // we need this line to findBy annotations
       //whenever object is created this code will immediately,automatically be executed
   }



}
