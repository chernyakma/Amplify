package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextAreaElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.flow.component.upload.testbench.UploadElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "entry-dialog-content" )
public class EntryDialogContent extends TestBenchElement {

	protected TextFieldElement getFinancialInstitutionName() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "FinancialInstitutionName" );

	}
	protected TextFieldElement getBankCity() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "BankCity" );

}
	protected TextFieldElement getAccountLastName() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "AccountLastName" );

	}
	protected TextFieldElement getAccountNumber() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "AccountNumber" );

	}
	protected TextFieldElement getRoutingNumber() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "RoutingNumber" );

	}
	protected SelectElement getBankState() {
		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$(SelectElement.class).id( "BankState" );
	}
	protected SelectElement getAccountType() {
		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$(SelectElement.class).id( "AccountType" );
	}

	protected ButtonElement okButton (){
		return $(ButtonElement.class).first();
	}
	protected ButtonElement closeButton (){	return $(ButtonElement.class).last();}

	protected ButtonElement processButton (){	return $(ButtonElement.class).first();}

	protected ButtonElement addNoteButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(ButtonElement.class).first();
	}
	protected ButtonElement DeleteNoteButton(){
		return $(ButtonElement.class).get( 2 );
	}
	protected TextAreaElement noteText(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TextAreaElement.class).first();
	}
	protected ButtonElement attachButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "viewContent" ).$(ButtonElement.class).id( "addButton" );
	}
	protected DatePickerElement expiresDate(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "timesDiv" ).$(DatePickerElement.class).first();
	}
	protected SelectElement attachmentType(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "attachmentTypeDiv" ).$(SelectElement.class).first();
	}
	protected UploadElement uploadFileButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "uploadDiv" ).$(UploadElement.class).first();
	}
	protected SelectElement suspenseSource(){
		return $(TestBenchElement.class).id( "mainContent" ).$(SelectElement.class).first();
	}
	protected SelectElement depositAccount(){
		return $(TestBenchElement.class).id( "mainContent" ).$(SelectElement.class).last();
	}
	protected TextFieldElement suspenseAmount(){
		return $(TestBenchElement.class).id( "mainContent" ).$(TextFieldElement.class).first();
	}
	protected DatePickerElement effectveDate() {
		return $(TestBenchElement.class).id( "mainContent" ).$(DatePickerElement.class).first();
	}
	protected SelectElement fromAccount () {

		return $( TestBenchElement.class ).id( "mainContent" ).$( "transfer-suspense-component" ).first().$( TestBenchElement.class ).id( "fromContent" ).$( "select-transfer-financial-account-component" ).first().$( SelectElement.class ).first();
	}
	protected SelectElement toAccount (){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "toContent" ).$("select-transfer-financial-account-component").first().$(SelectElement.class).first();

	}
	protected TextFieldElement searchFamily (){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "toContent" ).$("select-transfer-financial-account-component").first().$(TestBenchElement.class).id( "searchContent" ).$(TextFieldElement.class).first();
	}

	protected GridElement family(){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "toContent" ).$("select-transfer-financial-account-component").first().$(TestBenchElement.class).id( "searchContent" ).$("search-component").first().$(GridElement.class).first();
	}
	protected ButtonElement search (){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "toContent" ).$("select-transfer-financial-account-component").first().$(TestBenchElement.class).id( "searchContent" ).$(ButtonElement.class).last();
	}
	protected TextAreaElement note (){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "inputContent" ).$(TextAreaElement.class).first();
	}
	protected TextFieldElement transferAmount(){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "inputContent" ).$(TextFieldElement.class).first();
	}
	protected DatePickerElement transferEffectveDate(){
		return $(TestBenchElement.class).id( "mainContent" ).$("transfer-suspense-component").first().$(TestBenchElement.class).id( "inputContent").$(DatePickerElement.class).first();
	}
	protected TextFieldElement loanAmount (){
		return $(TestBenchElement.class).id( "InputsSection" ).$( TextFieldElement.class).id( "AmountRequested" );
	}
	protected TextFieldElement disbursedAmount (){
		return $(TestBenchElement.class).id( "InputsSection" ).$( TextFieldElement.class).id( "AmountDisbursed" );
	}
	protected SelectElement disbursementMethod (){
		return $(TestBenchElement.class).id( "InputsSection" ).$( SelectElement.class).id( "DisbursementMethod" );
	}
	public void addAccount(String bankName,String bankCityName,String routingNumber ){
		getFinancialInstitutionName().sendKeys( bankName );
		getBankCity().sendKeys( bankCityName );
		getRoutingNumber().sendKeys( routingNumber );

	}

}
