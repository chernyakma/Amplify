package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "vaadin-confirm-dialog-overlay" )

public class VaadinConfirmDialogView extends TestBenchElement {
	protected ButtonElement getDeleteButton(){

		return  $(ButtonElement.class).first();
	}

	protected ButtonElement getSaveButton(){

		return  $(ButtonElement.class).last();
	}

}
