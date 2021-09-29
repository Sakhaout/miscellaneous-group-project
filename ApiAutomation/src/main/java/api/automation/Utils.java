package api.automation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
	
	/**
	 * This function will read file under resources and return as String
	 * @param filename
	 * @return Data in file as String
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public static String readFileFromResources(String filename) throws URISyntaxException, IOException {
	    URL resource = Utils.class.getClassLoader().getResource(filename);  
	    byte[] bytes = Files.readAllBytes(Paths.get(resource.toURI()));  
	    return new String(bytes);
	}
}
