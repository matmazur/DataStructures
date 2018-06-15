package com.infoshareacademy.mateuszmazur.task08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

    public static final String fileName = "/home/mateuszmazur/IdeaProjects/StrukturyDanych/src/com/infoshareacademy/mateuszmazur/task08/f.properties";

    public static void main(String[] args) {

        Properties prop = new Properties();
        Path path = Paths.get(fileName);

        try {


            prop.load(new FileInputStream((fileName)));
            Enumeration<?> enumeration = prop.propertyNames();


            while (enumeration.hasMoreElements()) {
                String propertyName = enumeration.nextElement().toString();
                System.out.println(propertyName + "  =>   " + prop.getProperty(propertyName));

            }
            prop.setProperty("newKey", "" + System.currentTimeMillis());
            prop.setProperty("newKey2", "" + System.currentTimeMillis());
            prop.store(new FileOutputStream(fileName), null);


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
