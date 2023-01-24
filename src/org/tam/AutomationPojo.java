package org.tam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPojo extends BaseClass {
public AutomationPojo() {
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//i[@class='fa fa fa-user']")
private WebElement accountbtn;
@FindBy(id="phone")
private WebElement usernametxtbox;
@FindBy(id="password")
private WebElement passwordtxtbox;
@FindBy(name="login")
private WebElement loginbtn;
@FindBy(xpath="//li[contains(text(),'Mobile ')]")
private WebElement invalidtxt;
@FindBy(xpath="//span[text()='Home']")
private WebElement homebtn;
@FindBy(xpath = "//h3[text()='Popular Items']")
private WebElement dropdosa;
@FindBy(xpath ="(//a[@class='lte-item'])[4]")
private WebElement dosabtn;
@FindBy(xpath = "//h2[text()='Masala Dosa']")
private WebElement masaladosabtn;
@FindBy(xpath = "(//span[text()='Available at 08:00 AM'])[1]")
private WebElement masaldosaAvailabletime;
@FindBy(id="name")
private WebElement registerusername;
@FindBy(id="email")
private WebElement emailtxtbox;
@FindBy(xpath="(//input[@autocomplete='phone'])[2]")
private WebElement phonenotxtbox;
@FindBy(id="password_reg")
private WebElement regpasstxtbox;
@FindBy(name="cpwd")
private WebElement confirmpasstxtbox;
@FindBy(xpath="(//button[@value='Log in'])[2]")
private WebElement registerbtn;
@FindBy(id="lte-top-search-ico")
private WebElement searchicon;
@FindBy(xpath="//h2[text()='Coke Can 12oz']")
private WebElement cokebtn;
@FindBy(xpath="//span[text()=' 1.50 ']")
private WebElement cokeprice;
@FindBy(xpath="//h2[text()='Spanish omelet']")
private WebElement omeletbtn;
@FindBy(xpath="//span[text()=' 13.00 ']")
private WebElement problityofomelet;
@FindBy(id="menu-item-3557")
private WebElement ourstorybtn;
@FindBy(xpath="(//p[contains(text(),'Bistro ')])[2]")
private WebElement spelling;
public WebElement getAccountbtn() {
	return accountbtn;
}
public WebElement getUsernametxtbox() {
	return usernametxtbox;
}
public WebElement getPasswordtxtbox() {
	return passwordtxtbox;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public WebElement getInvalidtxt() {
	return invalidtxt;
}
public WebElement getHomebtn() {
	return homebtn;
}
public WebElement getDropdosa() {
	return dropdosa;
}
public WebElement getDosabtn() {
	return dosabtn;
}
public WebElement getMasaladosabtn() {
	return masaladosabtn;
}
public WebElement getMasaldosaAvailabletime() {
	return masaldosaAvailabletime;
}
public WebElement getRegisterusername() {
	return registerusername;
}
public WebElement getEmailtxtbox() {
	return emailtxtbox;
}
public WebElement getPhonenotxtbox() {
	return phonenotxtbox;
}
public WebElement getRegpasstxtbox() {
	return regpasstxtbox;
}
public WebElement getConfirmpasstxtbox() {
	return confirmpasstxtbox;
}
public WebElement getRegisterbtn() {
	return registerbtn;
}
public WebElement getSearchicon() {
	return searchicon;
}
public WebElement getCokebtn() {
	return cokebtn;
}
public WebElement getCokeprice() {
	return cokeprice;
}
public WebElement getOmeletbtn() {
	return omeletbtn;
}
public WebElement getProblityofomelet() {
	return problityofomelet;
}
public WebElement getOurstorybtn() {
	return ourstorybtn;
}
public WebElement getSpelling() {
	return spelling;
}























}
