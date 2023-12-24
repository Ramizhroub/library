/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.projectjavaramiz;

/**
 *
 * @author Smart
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler2 {

    public static void saveData(List<String> data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately in a real application
        }
    }

    public static List<String> loadData(String fileName) {
        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately in a real application
        }

        return data;
    }
}

    

