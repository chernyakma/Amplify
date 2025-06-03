package com.vaadin.testbenchexample;
import java.beans.PropertyEditor;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import javax.swing.plaf.basic.BasicOptionPaneUI;

import org.apache.commons.compress.harmony.pack200.NewAttributeBands;
import org.h2.engine.Mode;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;


import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.checkbox.testbench.CheckboxElement;
import com.vaadin.flow.component.crud.testbench.CrudElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.formlayout.testbench.FormLayoutElement;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.testbench.DivElement;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.map.configuration.View;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.testbench.VerticalLayoutElement;
import com.vaadin.flow.component.radiobutton.testbench.RadioButtonGroupElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.flow.router.Route;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.annotations.Attribute;
import com.vaadin.testbench.elementsbase.Element;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

@Element("family-insured-view")

//Primary

	public class AddFamilyView extends TestBenchElement {


	protected TextFieldElement getFirstName() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "FirstName" );
	}
	protected TextFieldElement getLastName() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "LastName" );
	}
	protected SelectElement getSuffix() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id("SuffixCode");
	}
	protected SelectElement getPrefix() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id("PrefixCode");
	}
	protected TextFieldElement getMiddleName() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "MiddleName" );
	}
	protected TextFieldElement getTaxID() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "TaxID" );
	}
	protected SelectElement getGender() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id( "Gender" );
	}
	protected DatePickerElement getDateOfBirth () {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( DatePickerElement.class ).id( "DateOfBirth" );
	}
	protected DatePickerElement getDateOfDeath () {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( DatePickerElement.class ).id( "DateOfDeath" );
	}

	protected RadioButtonGroupElement getNonTobacco () {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( RadioButtonGroupElement.class ).first();
	}
	protected RadioButtonGroupElement getTobaccoUse () {

		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( RadioButtonGroupElement.class ).last();
	}
	protected SelectElement getRelationship() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id( "RelationshipType" );
	}
	protected SelectElement getMarriageStatus() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id( "MarriageStatus" );
	}
	protected SelectElement getHealthStatus() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "S0" ).$( FormLayoutElement.class ).first().$( SelectElement.class ).id( "PerceptionOfHealth" );
	}





	//Contact
	protected TextFieldElement getEmail() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "Email" );
	}
	protected TextFieldElement getEmail2() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).first().$( TextFieldElement.class ).id( "Email2" );
	}

	protected TextFieldElement getPhone1() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( TextFieldElement.class ).id( "Phone1" );
	}
	protected SelectElement getPhoneType1() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( SelectElement.class ).id( "PhoneType1" );
	}
	protected TextFieldElement getPhone1Extension() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( TextFieldElement.class ).id( "Phone1Extension" );
	}
	protected TextFieldElement getPhone2() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( TextFieldElement.class ).id( "Phone2" );
	}
	protected SelectElement getPhoneType2() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( SelectElement.class ).id( "PhoneType2" );
	}
	protected TextFieldElement getPhone2Extension() {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( TextFieldElement.class ).id( "Phone2Extension" );
	}

	protected DatePickerElement getLastContactDate () {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$( TestBenchElement.class ).id( "Contact" ).$( FormLayoutElement.class ).last().$( DatePickerElement.class ).id( "LastContactDate" );
	}


	//Save
	protected ButtonElement getSaveButton () {
		return $( TestBenchElement.class ).id( "scenarioComponent" ).$(TestBenchElement.class).id ("componentContent").$( TestBenchElement.class ).id( "buttons" ).$( ButtonElement.class).first();
	}
	protected ButtonElement addBankButton(){
		return  $( TestBenchElement.class ).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id( "BankAccountsTableSection" ).$( TestBenchElement.class ).id( "BankAccountsTable" ).$(ButtonElement.class).first();
	}

	protected ButtonElement deleteBankButton(){
		return  $( TestBenchElement.class ).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id( "BankAccountsTableSection" ).$( TestBenchElement.class ).id( "BankAccountsTable" ).$(ButtonElement.class).get( 3 );
	}
	protected ButtonElement editBankButton(){

		return  $( TestBenchElement.class ).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id( "BankAccountsTableSection" ).$( TestBenchElement.class ).id( "BankAccountsTable" ).$(ButtonElement.class).get( 1 );
	}
	protected ButtonElement FamilyButton(){

		return  $( TestBenchElement.class ).id("viewContent").$("scenario-component").first().$(ButtonElement.class).get( 3 );
	}



	public void addFamily( ) {

		List<String[]> testData = ExcelUtils.readExcelData( "src/test/resources/AmplifyTestdata.xlsx" );
		for( String[] dataRow : testData ) {
			String firstName = dataRow[0];
			String lastName = dataRow[1];
			String middleName = dataRow[2];
			String taxID = dataRow[3];
			String email = dataRow[4];
			String email2 = dataRow[5];
			String phone1 = dataRow[6];
			String phone2 = dataRow[7];
			String extens1 = dataRow[8];
			String extens2 = dataRow[9];
			getLastName().sendKeys( lastName );
			getFirstName().sendKeys( firstName );
			getMiddleName().setValue( middleName );
			getTaxID().setValue( taxID );
			getEmail().sendKeys( email );
			getEmail2().sendKeys( email2 );
			getPhone1().sendKeys( phone1 );
			getPhone1Extension().sendKeys( extens1 );
			getPhone2().sendKeys( phone2 );
			getPhone2Extension().sendKeys( extens2 );

			//	waitUntil( ExpectedConditions.textToBePresentInElement( getFirstName(),"Harry"));
			//	getSaveButton().click();

			//
		}


	}

	public void addSpouse( ) {

		List<String[]> testData = ExcelUtils.readExcelData( "src/test/resources/AmplifyTestSpouseData.xlsx" );
		for( String[] dataRow : testData ) {
			String firstName = dataRow[0];
			String lastName = dataRow[1];
			String middleName = dataRow[2];

			String taxID = dataRow[3];
			String email = dataRow[4];
			String email2 = dataRow[5];
			String phone1 = dataRow[6];
			String phone2 = dataRow[7];
			String extens1 = dataRow[8];
			String extens2 = dataRow[9];

			getLastName().sendKeys( lastName );
			getFirstName().sendKeys( firstName );
			getMiddleName().setValue( middleName );

			getTaxID().setValue( taxID );
			getEmail().sendKeys( email );
			getEmail2().sendKeys( email2 );
			getPhone1().sendKeys( phone1 );
			getPhone1Extension().sendKeys( extens1 );
			getPhone2().sendKeys( phone2 );
			getPhone2Extension().sendKeys( extens2 );

			//	waitUntil( ExpectedConditions.textToBePresentInElement( getFirstName(),"Harry"));
			//	getSaveButton().click();

			//
		}

	}
}




