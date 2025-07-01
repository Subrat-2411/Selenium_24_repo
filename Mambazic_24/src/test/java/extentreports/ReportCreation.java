package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportCreation {
	@Test
	public void createAccount()
	{
		
		//Step 1: create ExtentSparkReporter Object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreport.html");
		
		//Step 2: Create ExtentReports class Object
		ExtentReports eReport=new ExtentReports();
		
//		Step 3: attach ExtentSparkReporter to ExtentReports
		eReport.attachReporter(spark);
		
		//Step 4: create ExtentTest Object
		ExtentTest test=eReport.createTest("createReport");
		
		//Step 5: call log(status,"message")
		test.log(Status.PASS,"log message added into report");
		
		//Step 6: call flush
		eReport.flush();
		
		
	}
}
