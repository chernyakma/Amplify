package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "new-illustration-view" )
public class NewIllustrationView extends TestBenchElement {

	protected SelectElement getProductType(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(SelectElement.class).id( "ProductType" );

	}
	protected SelectElement getProduct(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(SelectElement.class).id( "ProductID" );

	}
	protected SelectElement getRateLockPeriod(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(SelectElement.class).id( "GuaranteePeriod" );

	}

	protected SelectElement getInsured(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(SelectElement.class).id( "InsuredID" );

	}
	protected SelectElement getState(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(SelectElement.class).id( "StateCode" );

	}
	protected TextFieldElement getDepositAmount(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(TextFieldElement.class).id( "DepositAmount" );

	}
//Whole Life
	protected TextFieldElement getFaceAmount(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(TextFieldElement.class).id( "FaceAmount" );

	}
	protected ButtonElement getOkButton(){
		return $( ButtonElement.class).first();

	}
	protected DatePickerElement effectiveDate(){
		return $(TestBenchElement.class).id( "NewIllustrationSection" ).$(DatePickerElement.class).id("EffectiveDate");
	}





}
