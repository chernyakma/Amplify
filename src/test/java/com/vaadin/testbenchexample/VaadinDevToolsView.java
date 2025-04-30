package com.vaadin.testbenchexample;
import com.vaadin.flow.component.messages.testbench.MessageElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "vaadin-dev-tools" )
public class VaadinDevToolsView extends TestBenchElement {

	protected MessageElement dismissMessage (){

		return $(MessageElement.class).first();
	}

}
