package api.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

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

	/**
	 * This function will read the properties file.
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static Properties readPropertiesFile(String fileName) throws IOException {
		InputStream inputStream = Utils.class.getClassLoader().getResourceAsStream(fileName);
		Properties prop = null;
		try {
			prop = new Properties();
			prop.load(inputStream);
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			inputStream.close();
		}
		return prop;
	}
}
