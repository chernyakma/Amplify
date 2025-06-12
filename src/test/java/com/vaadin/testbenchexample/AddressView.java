package com.vaadin.testbenchexample;
import java.util.Collections;

import org.openqa.selenium.Keys;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.checkbox.testbench.CheckboxElement;
import com.vaadin.flow.component.icon.testbench.IconElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.HasHelper;
import com.vaadin.testbench.HasLabel;
import com.vaadin.testbench.HasPlaceholder;
import com.vaadin.testbench.HasStringValueProperty;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "entry-dialog-content" )
public class AddressView extends TestBenchElement
	implements HasStringValueProperty, HasLabel, HasPlaceholder, HasHelper {



	protected SelectElement getCountry() {
	    return $( TestBenchElement.class ).id("S0").$( SelectElement.class ).id( "Country" );
	}
	protected TextFieldElement getLine1() {
		return $( TestBenchElement.class ).id("S1").$( TextFieldElement.class ).id( "Line1" );
	}
	protected TextFieldElement getLine2() {
		return $( TestBenchElement.class ).id("S1").$( TextFieldElement.class ).id( "Line2" );
	}
	protected TextFieldElement getCity() {
		return $( TestBenchElement.class ).id("S1").$( TextFieldElement.class ).id( "City" );
	}
	protected SelectElement getState() {
		return $( TestBenchElement.class ).id("S1").$( SelectElement.class ).id( "State" );
	}
	protected TextFieldElement getZip() {
		return $( TestBenchElement.class ).id("S1").$( TextFieldElement.class ).id( "Zip" );
	}
	protected SelectElement getAddressType() {
		return $( TestBenchElement.class ).id("S1").$( SelectElement.class ).id( "AddressType" );
	}
    protected CheckboxElement getDefaultResidence ( ) {
		return $(TestBenchElement.class).id( "S2" ).$(CheckboxElement.class).first() ;
	}
	protected CheckboxElement getDefaultMailing ( ) {
		return $(TestBenchElement.class).id( "S2" ).$(CheckboxElement.class).get( 1 );
	}
	protected CheckboxElement getDefaultBilling ( ) {
		return $(TestBenchElement.class).id( "S2" ).$(CheckboxElement.class).get(2);
	}
	protected ButtonElement getOkButton(){
		return $(ButtonElement.class).first();
	}
	protected ButtonElement getEditOkButton(){
		return $(TestBenchElement.class).id( "buttons" ).$(ButtonElement.class).first();
	}
	protected ButtonElement getCancelButton(){
		return $(ButtonElement.class).last();
	}


	@Override
	public void setValue(String string) {

		HasStringValueProperty.super.setValue( string );
		dispatchEvent( "change", Collections.singletonMap( "bubbles", true ) );
		dispatchEvent( "blur" );
	}


	public void address(String address1,String address2,String city,String zip){
		getLine1().sendKeys( address1 );
		getLine2().sendKeys( address2 );
		getCity().sendKeys( city );
		getZip().sendKeys( zip );
	}


	public void clearAddress(){
		getLine1().sendKeys( Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE );
		getLine2().sendKeys( Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE );
		getCity().sendKeys( Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE );
		getZip().sendKeys( Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE );
	}
}
