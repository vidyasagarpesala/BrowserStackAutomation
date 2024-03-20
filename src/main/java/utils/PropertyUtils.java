package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtils {

    public static Properties properties = new Properties();
    public static Map<String,String> fileMap = new HashMap<>();

    public static String fetchEnvProperties(String key) {

        String env = System.getenv().getOrDefault("ENV","staging");
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+env+"/"+env+"_env.properties");
            properties.load(fileInputStream);
            fileMap.put(key,properties.getProperty(key));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileMap.get(key);
    }

    public static String fetchTestDataProperties(String key) {
        String env = System.getenv().getOrDefault("ENV","staging");
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+env+"/"+env+"_testData.properties");
            properties.load(fileInputStream);
            fileMap.put(key,properties.getProperty(key));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileMap.get(key);
    }
}
