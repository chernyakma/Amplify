package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.radiobutton.testbench.RadioButtonGroupElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

import java.io.File;
import java.util.Random;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;

@Element( "application-view" )
public class ApplicationView extends TestBenchElement {

	protected RadioButtonGroupElement applicationReceived() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Application" ).$( RadioButtonGroupElement.class ).id( "ApplicationReceivedIndicator" );
	}

	protected DatePickerElement applicationReceivedDate() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Application" ).$( DatePickerElement.class ).id( "ApplicationReceivedDate" );

	}
	protected SelectElement paymentMethod() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Policy" ).$( SelectElement.class ).id( "PaymentMethod" );

	}

	protected DatePickerElement applicationSignedDate() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Application" ).$( DatePickerElement.class ).id( "ApplicationSignedDate" );

	}

	protected ButtonElement downloadButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "document-page" ).first().$( TestBenchElement.class ).id( "pageContent" ).$( "search-component" ).first().$( TestBenchElement.class ).id( "componentResult" ).$( ButtonElement.class ).get( 1 );
	}

	protected ButtonElement saveButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( ButtonElement.class ).first();
	}

	protected RadioButtonGroupElement applicationFundsReceived() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "InitialPayment" ).$( RadioButtonGroupElement.class ).id( "ApplicationFundsReceivedIndicator" );
	}

	protected RadioButtonGroupElement cashWithApplication() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "InitialPayment" ).$( RadioButtonGroupElement.class ).id( "CashReceivedWithApplicationIndicator" );
	}

	protected DatePickerElement cashWithApplicationReceivedDate() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "InitialPayment" ).$( DatePickerElement.class ).id( "CashWithApplicationReceivedDate" );

	}

	protected ButtonElement threeDotsButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "annotate" ).$( ButtonElement.class ).first();
	}

	protected ButtonElement addSuspense() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "suspense-page" ).first().$( ButtonElement.class ).first();
	}

	protected ButtonElement issueButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( ButtonElement.class ).last();
	}

	protected GridElement missingRequiredDocument() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "igo-check-page" ).first().$( TestBenchElement.class ).id( "pageContent" ).$( GridElement.class ).first();
	}

	//WL
	protected ComboBoxElement getAgentNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Agent" ).$( TestBenchElement.class ).id( "section" ).$( ComboBoxElement.class ).first();
	}

	protected TextFieldElement getCaseNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "Application" ).$( TestBenchElement.class ).id( "section" ).$( TextFieldElement.class ).id( "PolicyNumber" );
	}

	public void addRundomCaseNumber() {

		Random random = new Random();
		int randomNumber = 100000000 + random.nextInt( 900000000 );  // Generate a random number between 100000000 and 900000000
		getCaseNumber().sendKeys( String.valueOf( randomNumber ) );
	}

	public void compareAndDeleteDownloadedPdfFPIUL() throws Exception {

	//	String downloadDir = "C:\\Users\\MariiaCherniak\\Documents\\GitHub\\Amplify\\downloadFiles";
		String downloadDir = System.getProperty("user.dir") + "/downloadFiles";
		String fileName = "Point of Sale.pdf";
		File downloadedFile = new File(downloadDir + "\\" + fileName);

		File referenceFile = new File(System.getProperty("user.dir") + "/src/test/resources/Reference.pdf");
	//	File referenceFile = new File("C:\\Users\\MariiaCherniak\\Documents\\GitHub\\Amplify\\downloadFiles\\Reference.pdf");
	//	File referenceFile = new File("C:\\Users\\MariiaCherniak\\Downloads\\Change Management Request -  CM400.pdf");
		boolean testPassed = false;
		try {
		boolean result = PdfComparator.comparePdfTextIgnoringDates( downloadedFile,referenceFile);
			// Assert or log the result
			Assert.assertTrue( "PDFs do not match!", result);
			System.out.println("The PDFs match (ignoring dates).");

			// If the assertion passes, mark test as passed
			testPassed = true;
		} catch (AssertionError | Exception e) {
			System.err.println("Test failed: " + e.getMessage());
		} finally {
			// Delete the file only if the test passed
			if (testPassed && downloadedFile.exists()) {
				boolean isDeleted = downloadedFile.delete();
				if (isDeleted) {
					System.out.println("Downloaded file was successfully deleted.");
				} else {
					System.out.println("Failed to delete the downloaded file.");
				}
			} else if (!testPassed) {
				System.out.println("Test failed. File not deleted.");
			}
		}
		}

	public void compareAndDeleteDownloadedPdfFPIULEFT() throws Exception {

		//	String downloadDir = "C:\\Users\\MariiaCherniak\\Documents\\GitHub\\Amplify\\downloadFiles";
		String downloadDir = System.getProperty("user.dir") + "/downloadFiles";
		String fileName = "Point of Sale.pdf";
		File downloadedFile = new File(downloadDir + "\\" + fileName);

		File referenceFile = new File(System.getProperty("user.dir") + "/src/test/resources/ReferenceEFT.pdf");
		//	File referenceFile = new File("C:\\Users\\MariiaCherniak\\Documents\\GitHub\\Amplify\\downloadFiles\\Reference.pdf");
		//	File referenceFile = new File("C:\\Users\\MariiaCherniak\\Downloads\\Change Management Request -  CM400.pdf");
		boolean testPassed = false;
		try {
			boolean result = PdfComparator.comparePdfTextIgnoringDates( downloadedFile,referenceFile);
			// Assert or log the result
			Assert.assertTrue( "PDFs do not match!", result);
			System.out.println("The PDFs match (ignoring dates).");

			// If the assertion passes, mark test as passed
			testPassed = true;
		} catch (AssertionError | Exception e) {
			System.err.println("Test failed: " + e.getMessage());
		} finally {
			// Delete the file only if the test passed
			if (testPassed && downloadedFile.exists()) {
				boolean isDeleted = downloadedFile.delete();
				if (isDeleted) {
					System.out.println("Downloaded file was successfully deleted.");
				} else {
					System.out.println("Failed to delete the downloaded file.");
				}
			} else if (!testPassed) {
				System.out.println("Test failed. File not deleted.");
			}
		}
	}

}
