package apiTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReadData {
	public static String ID;
	
	@Value("${application.name.id}")
	private void setValue(String value) {
		this.ID = value;
	}

}
