/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author pogliani.mattia
 */
public class FileWriter {

    String path;

    public FileWriter(String path) {
        this.path = path;
    }

    public void write() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(path, "UTF-8");
        for (int i = 0; i < 100000; i++) {
            String s = "";
            for (int j = 0; j < 5; j++) {
                s = s + ((int) (Math.random() * 255)) + " ";
            }
            writer.println(s);
        }
    }

}
