/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pogliani.mattia
 */
public class BufferedReader_VS_Scanner {

    static FileWriter fw;
    static String path = "file.txt";
    
    static FileBufferedReader fbr;
    
    static FileScannerReader fsr;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        fw = new FileWriter(path);
        fw.write();
        fbr = new FileBufferedReader(path);
        System.out.println(fbr.read());        
    }

}
