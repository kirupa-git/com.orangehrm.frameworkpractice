package com.orangehrm.commonutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationfile {

    public static Properties config() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\Trial Projects\\com.orangehrm.frameworkpractice\\config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }
}
