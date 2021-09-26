package apiTest;

import org.springframework.context.annotation.Configuration;
import org.testng.annotations.Test;
import apiTest.ReadData;

@Configuration
public class SampleTest {

	@Test
	public void test() {
		System.out.println("First Test ID: " + ReadData.ID);
	}
}
