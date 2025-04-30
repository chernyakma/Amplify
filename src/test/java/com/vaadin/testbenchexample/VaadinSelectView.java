package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.annotations.Attribute;
import com.vaadin.testbench.elementsbase.Element;

@Element("div")
@Attribute( name = "class", contains = "jumper" )

public class VaadinSelectView extends TestBenchElement {

	protected SelectElement getSelectItem(){

		return $(SelectElement.class).first();
	}



	}
