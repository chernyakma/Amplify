package com.vaadin.testbenchexample;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.formlayout.testbench.FormLayoutElement;
import com.vaadin.flow.component.html.testbench.DivElement;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.IPAddress;
import com.vaadin.testbench.TestBenchElement;

public class AddFamilyIT extends BaseLoginTest {
	
	
	





	@Test

	public void addFamily() {

		getDriver().get( "http://localhost:8080/amplify_webui/familyInsured" );
	//	getDriver().get( "http://" + IPAddress.findSiteLocalAddress() + ":8080/navy_webui/familyInsured");
	//	getDriver().get( "https://test.navymutual.calcfocus.net/policyadmin/familyInsured/" );
		AddFamilyView family = $( AddFamilyView.class ).first();
		family.addFamily(  );
		family.getSuffix().selectByText("Sr.");
		family.getGender().selectItemByIndex( 0 );
		family.getDateOfBirth().setDate( LocalDate.of( 1960, 10, 15 ) );
		family.getTobaccoUse().selectByText( "Tobacco" );
		family.getHealthStatus().selectByText("Same as my peers");
		family.getMarriageStatus().selectByText("Married");
		family.getPhoneType1().selectItemByIndex( 1 );
		family.getPhoneType2().selectItemByIndex( 2 );
		family.getPrefix().selectByText("Mr.");


		Assertions.assertEquals( "David", family.getFirstName().getValue() );
		Assertions.assertEquals( "Palmer", family.getLastName().getValue() );
		Assertions.assertEquals( "Male", family.getGender().getSelectedText() );
		Assertions.assertEquals( "10/15/1960", family.getDateOfBirth().getInputValue() );
 //       family.getSaveButton().click();
	}

	@Test
	public void addSpouse (){

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 3 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchBySSN().sendKeys( "511-20-7943" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();

		ScenarioView addMember= $(ScenarioView.class).first();
		addMember.addMemberButton().click();
		AddFamilyView family = $( AddFamilyView.class ).first();
		family.getRelationship().selectByText( "Spouse" );
		family.addSpouse(  );
		family.getGender().selectItemByIndex( 1 );
		family.getDateOfBirth().setDate( LocalDate.of( 1965, 01, 05 ) );
		family.getNonTobacco().doubleClick();

		family.getPhoneType1().selectItemByIndex( 2 );
		family.getPhoneType2().selectItemByIndex( 1 );

		Assertions.assertEquals( "Emma", family.getFirstName().getValue() );
		Assertions.assertEquals( "Spouse", family.getLastName().getValue() );
		Assertions.assertEquals( "Female", family.getGender().getSelectedText() );
		Assertions.assertEquals( "1/5/1965", family.getDateOfBirth().getInputValue() );
		family.getSaveButton().click();
		family.FamilyButton().click();
	//	NaviMenuView getFamilybutton = $( NaviMenuView.class ).first();
	//	getFamilybutton.getFamily().click();
		ScenarioView deleteMember= $(ScenarioView.class).first();
		deleteMember.getDeleteSpouseButton().click();
		VaadinConfirmDialogView deleteSpouse = $(VaadinConfirmDialogView.class).first();
		deleteSpouse.getSaveButton().click();

	}
	@Test
	public void addBank() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 3 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchBySSN().sendKeys( "511-20-7943" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		ScenarioView editMember= $(ScenarioView.class).first();
		editMember.getEditFamilyButton().click();
		NaviMenuView getBank = $( NaviMenuView.class ).first();
		getBank.getBankInformation().click();
		AddFamilyView addBankAccount = $(AddFamilyView.class).first();
		addBankAccount.addBankButton().click();
		EntryDialogContent bankAccount =$(EntryDialogContent.class).first();
		bankAccount.addAccount( "Bank of America","Norfolk","051000017" );
        bankAccount.getBankState().selectByText( "VA" );
		bankAccount.getAccountType().selectByText( "Checking" );
		Assertions.assertEquals( "Bank of America",bankAccount.getFinancialInstitutionName().getValue() );

		Assertions.assertEquals( "051000017",bankAccount.getRoutingNumber().getValue() );
		Assertions.assertEquals( "VA",bankAccount.getBankState().getSelectedText() );
		Assertions.assertEquals( "Checking",bankAccount.getAccountType().getSelectedText() );
		bankAccount.okButton().click();
		AddFamilyView saveButton = $ (AddFamilyView.class).first();
		saveButton.getSaveButton().click();
		addBankAccount.deleteBankButton().click();
		saveButton.getSaveButton().click();
	}

	@Test

	public void familyAddress() throws InterruptedException {
	VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
    getSelectButton.getSelectItem().selectItemByIndex( 3 );
	SearchComponentView getFamily = $( SearchComponentView.class ).first();
	getFamily.searchBySSN().sendKeys( "511-20-7943" );
	getFamily.searchButton().click();
	getFamily.family().getCell( "Palmer" ).click();
	NaviMenuView getAddress = $(NaviMenuView.class).first();
    getAddress.getAddresses().click();
	ScenarioView addAddress = $(ScenarioView.class).first();
	addAddress.getAddButton().click();
	AddressView setAddress=$ (AddressView.class).first();
	setAddress.getCountry().selectByText( "USA" );
	setAddress.address( "11 Liberty Street","22 Fox Street","Norfolk","23503" );
	setAddress.getState().selectByText( "VA" );
	setAddress.getAddressType().selectItemByIndex( 2 );
	Assertions.assertEquals( "Mailing",setAddress.getAddressType().getSelectedText() );
	setAddress.getDefaultMailing().click();
//	setAddress.getDefaultBilling().click();
//	setAddress.getDefaultResidence().click();
	Assertions.assertEquals( "VA", setAddress.getState().getSelectedText());
	Assertions.assertEquals( "11 Liberty Street", setAddress.getLine1().getValue());
	Assertions.assertEquals( "22 Fox Street", setAddress.getLine2().getValue());
//	Assertions.assertTrue( setAddress.getDefaultMailing().isChecked() );
	Assertions.assertTrue( setAddress.getDefaultMailing().isChecked() );
//	Assertions.assertTrue( setAddress.getDefaultResidence().isChecked() );
	setAddress.getOkButton().click();
	addAddress.getSaveButton().click();
	addAddress.getDeleteButton().click();
	addAddress.getSaveButton().click();


}
	@Test

	public void editAddress() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 3 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchBySSN().sendKeys( "511-20-7943" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView getAddress = $( NaviMenuView.class ).first();
		getAddress.getAddresses().click();
		ScenarioView edit = $( ScenarioView.class ).first();
		edit.getEditAddressButton().click();
		AddressView setAddress = $( AddressView.class ).first();
		setAddress.clearAddress();
		setAddress.address( "111 Main Street", "234 Street", "Norfolk", "23503" );
		setAddress.getState().selectByText( "VA" );
	//	setAddress.getDefaultBilling().click();
		setAddress.getDefaultResidence().click();
		Assertions.assertEquals( "VA", setAddress.getState().getSelectedText() );
		Assertions.assertEquals( "111 Main Street", setAddress.getLine1().getValue() );
		Assertions.assertEquals( "234 Street", setAddress.getLine2().getValue() );
		Assertions.assertTrue( setAddress.getDefaultResidence().isChecked() );
		Assertions.assertEquals( "23503",setAddress.getZip().getValue() );
		setAddress.getCancelButton().click();
	//	setAddress.getEditOkButton().click();
	//	edit.getSaveButton().click();

	}

/*	@Test

	public void deleteAddress() {


		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		NaviMenuView getAddress = $( NaviMenuView.class ).first();
		getAddress.getAddresses().click();
		ScenarioView delete = $( ScenarioView.class ).first();
		delete.getDeleteButton().click();
		delete.getSaveButton().click();
	}
*/
}





