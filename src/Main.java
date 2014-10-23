import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	final private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("test/TestStrings")));
		String line;
		while ((line = br.readLine()) != null) {
			logger.debug("原String是: " + line);
			logger.debug("新 String是: " + StringUtil.replace(line, line.length()));
		}
		br.close();
	}
}
