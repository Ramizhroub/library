/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjavaramiz;

/**
 *
 * @author Smart
 */

import java.util.List;

public class Library {

    private List<Book> books;

    public void saveBooksToFile(String fileName) {
            List<String> bookData = /* Convert book objects to a list of strings */;
      
        FileHandler.saveData(bookData, fileName);
    }

    public void loadBooksFromFile(String fileName) {
        List<String> bookData = FileHandler.loadData(fileName);
        // Process the loaded data and create book objects
    }
}

    

