package data;


import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

public class ConfigProperties {
    static Properties properties = new Properties();
    //TODO properties class
/*
    public static String getProperty(String param) {
        if(properties.toString().equals("{}")) {
            initProperty();
        }
        return properties.getProperty(param);
    }

    private static void initProperty() {
        String target = System.getProperty("target", "prod");
        String path = String.format("src/test/resources/%s.properties", target);
        try (FileReader fileReader = new FileReader(path)) {
            properties.load(fileReader);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }*/
}
