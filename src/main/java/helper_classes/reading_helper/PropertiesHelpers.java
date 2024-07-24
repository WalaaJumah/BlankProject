package helper_classes.reading_helper;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertiesHelpers {
    private static final String filePath = "src/test/resources/ConfigFiles/config.properties";
    static Properties prop = new Properties();

    public static Properties loadProperties() {
        Properties properties = new Properties();
        try (FileInputStream fileInput = new FileInputStream(filePath)) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
        return properties;
    }

    public static String getValue(String key) {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            prop.load(bufferedReader);

            return prop.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printAllKeysAndValues(String filePath) throws IOException {
        File configFile = new File(filePath);
        InputStream stream = new FileInputStream(configFile);
        prop.load(stream);
        prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
    }

    public static List<String> getListFromProperty(String propertyValue) {
        propertyValue = PropertiesHelpers.getValue(propertyValue);
        if (propertyValue != null && !propertyValue.isEmpty()) {
            return Arrays.asList(propertyValue.split(","));
        }
        return null;
    }

}
