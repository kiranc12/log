package script;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic.BaseTest;

public class Demo extends BaseTest {
@Test
public void test() {
	System.out.println("open");
	
	}
@Test
public void test1() {
	System.out.println("close");
	SoftAssert asserts = new SoftAssert();
	asserts.fail();
	asserts.assertAll();
	}
}

