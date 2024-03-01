package helper_classes.reading_helper;///**
// * @author w.jumaa
// * @projectName price_comparison_tool
// * @classDescription
// */
//
//package reading_helper;
//
//import java.io.*;
//import java.util.Enumeration;
//import java.util.List;
//import java.util.Properties;
//
//public class PropReader {
//    Properties properties = new Properties();
//
//
//    /**
//     * method to read the config fle of the core automation
//     *
//     * @param key      he key param is being passed to determine the key on the config file
//     * @param filePath the desired file path.
//     * @return the value of the config key.
//     */
//    public static String readConfig(String key, String filePath) {
//        File file = new File(filePath);
//        return getPropValue(key, file);
//    }
//
//    /**
//     * method to read the config file from automation modules.
//     *
//     * @param key the key param is being passed to determine the key on the config file
//     * @return the value of the config key.
//     */
//    public static String readConfig(String key) {
//        File file = new File("configFiles/client_info.properties");
//        return getPropValue(key, file);
//    }
//
//    private static String getPropValue(String key, File file) {
//
//        Properties properties = new Properties();
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            properties.load(bufferedReader);
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return properties.getProperty(key);
//    }
//
//    public static void printSystemProperties(Properties prop) {
//        for (Object key : prop.keySet()) {
//            System.out.println(key + ": " + prop.getProperty(key.toString()));
//        }
//    }
//
//    public static void printAllKeys() throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File("configFiles/client_info.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            System.out.println("Key : " + key);
//        }
//    }
//
//    public static void printAllValues() throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File("configFiles/client_info.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//
//
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            System.out.println("value : " + value);
//        }
//    }
//
////    public static Set getAllKeys() throws IOException {
////        Properties prop = new Properties();
////        File configFile = new File("configFiles/client_info.properties");
////        InputStream stream = new FileInputStream(configFile);
////        prop.load(stream);
////       return prop.keySet();
////    }
//
////    public static Collection<Object> getAllValues() throws IOException {
////        Properties prop = new Properties();
////        File configFile = new File("configFiles/client_info.properties");
////        InputStream stream = new FileInputStream(configFile);
////        prop.load(stream);
////        return prop.values();
////    }
//
//    public static void saveValuesInList(List<String> list, String filename) throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File(filename);
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
//        int i = 0;
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            list.add(i, value);
//            i++;
//        }
//
//    }
//
//    public static void saveKeysInList(List<String> list, String filename) throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File(filename);
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
//        int i = 0;
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            list.add(i, key);
//            i++;
//        }
//
//    }
//
//    //    public  void printAll(String filename) {
////
////        try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {
////            Properties prop = new Properties();
////
////            if (input == null) {
////                System.out.println("Sorry, unable to find " + filename);
////                return;
////            }
////
////            prop.load(input);
////
////            // Java 8 , print key and values
////            prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
////
////            // Get all keys
////            prop.keySet().forEach(x -> System.out.println(x));
////
////            Set<Object> objects = prop.keySet();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////
////    }
//    public void printAllKeysAndValues(String filename) throws IOException {
//
//        Properties prop = new Properties();
//        File configFile = new File("configFiles/client_info.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
//
////            prop.load(stream);
//
//        // Java 8 , print key and values
//        prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
//
//        // Get all keys
////            prop.keySet().forEach(x -> System.out.println(x));
////
////            Set<Object> objects = prop.keySet();
//
//
//    }
//
//    public String getAllKeys(String filename) throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File("configFiles/client_info.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//
//
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            return key;
////        System.out.println("Key : " + key + ", Value : " + value);
//        }
//        return null;
//    }
//      public String getReadFrom() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//          String fileType= prop.getProperty("read-from");
//        return fileType;
//    }
//          public String getAPIEndPoint() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//          String APIEndpoint= prop.getProperty("APIEndpoint");
//        return APIEndpoint;
//    }
//
//    public String getFilePath() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//        String filePath = prop.getProperty("file-path");
//        return filePath;
//    }
//       public String getApiKey() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//        String apiKey = prop.getProperty("apiKey");
//        return apiKey;
//    }
//
//         public String getWriteFile() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//          String fileType= prop.getProperty("write-File");
//        return fileType;
//    }
//
//      public String getClient() throws IOException {
//        Properties prop = new Properties();
////        File configFile = new File("resources/configFiles/client_info.properties");
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//          String fileType= prop.getProperty("client-name");
//        return fileType;
//    }
//
//
//
//    public String getAllValues(String filename) throws IOException {
//        Properties prop = new Properties();
//        File configFile = new File("configFiles/client_info.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
////    prop.keySet().forEach(x -> System.out.println(x));
//
//
//        Enumeration e = prop.propertyNames();
//        while (e.hasMoreElements()) {
//            String key = (String) e.nextElement();
//            String value = prop.getProperty(key);
//            return value;
//        }
//        return null;
//    }
//    public static int getFirstRandomWaitTime() throws IOException {
//        Properties prop = new Properties();
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
//        int firstRandomWaitTime= Integer.parseInt(prop.getProperty("first_random_wait_time"));
//        return firstRandomWaitTime;
//    }
//
//    public static int getSecondRandomWaitTime() throws IOException {
//        Properties prop = new Properties();
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
//        int secondRandomWaitTime= Integer.parseInt(prop.getProperty("second_random_wait_time"));
//        return secondRandomWaitTime;
//    }
//    public static int getWaitTime() throws IOException {
//        Properties prop = new Properties();
//        InputStream stream = PropReader.class.getClassLoader().getResourceAsStream("configFiles/client_info.properties");
//        prop.load(stream);
//        int waitTime= Integer.parseInt(prop.getProperty("wait_time"));
//        return waitTime;
//    }
//
//
//
//
//
//
//}
