package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "illustration-view" )
public class IllustrationView extends TestBenchElement {

	protected ComboBoxElement getAgentNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Agent" ).$( TestBenchElement.class ).id( "section" ).$( ComboBoxElement.class ).first();
	}

	protected ButtonElement getApplyButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( ButtonElement.class ).get( 2 );
	}

	protected ButtonElement getApplyButtonReport() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( ButtonElement.class ).get( 4 );
	}

	protected ButtonElement getApplyButtonResult() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "componentContent" ).$( ButtonElement.class ).get( 3 );
	}

	protected ButtonElement getSaveButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( ButtonElement.class ).first();
	}

	protected SelectElement payOutOption() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( SelectElement.class ).id( "PayoutOption" );
	}

	protected SelectElement periodCertainYears() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( SelectElement.class ).id( "PeriodCertain" );
	}

	protected SelectElement paymentMode() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( SelectElement.class ).id( "PaymentMode" );
	}

	protected TextFieldElement federalTaxWithholdingPercentage() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( TextFieldElement.class ).id( "FederalTaxWithholdingPercentage" );
	}

	protected SelectElement disbursementMethod() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( SelectElement.class ).id( "ReoccurringPaymentDisbursementMethod" );
	}

	protected DatePickerElement paymentStartDate() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( DatePickerElement.class ).id( "PaymentStartDate" );
	}

	protected DatePickerElement policyEffectiveDate() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "Policy" ).$( DatePickerElement.class ).id( "PolicyEffectiveDate" );
	}
}



