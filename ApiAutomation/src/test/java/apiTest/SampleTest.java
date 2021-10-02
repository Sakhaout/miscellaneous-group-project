package apiTest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.automation.Utils;

public class SampleTest {

	@Test
	public void validateReadFileFromResourcesFunction() {
		try {
			String data = Utils.readFileFromResources("sample.json");
			System.out.println("Data from File: " + data);
			Assert.assertNotNull(data, "Did NOT read data from resources file");
		} catch (URISyntaxException e) {
			e.printStackTrace();
			Assert.fail();
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void validateReadPropertiesFileFunction() {
		try {
			Properties prop = Utils.readPropertiesFile("conf.properties");
			System.out.println("Data from properties File: " + prop.size());
			Assert.assertTrue(prop.size() > 0, "No data in the properties file");
			System.out.println("UserName: " + prop.getProperty("userName"));
			System.out.println("password: " + prop.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
