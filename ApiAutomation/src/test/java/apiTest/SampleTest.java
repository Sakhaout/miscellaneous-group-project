package apiTest;

import java.io.IOException;
import java.net.URISyntaxException;

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
}
