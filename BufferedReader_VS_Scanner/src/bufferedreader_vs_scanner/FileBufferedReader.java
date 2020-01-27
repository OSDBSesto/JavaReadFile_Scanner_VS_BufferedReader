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

/**
 *
 * @author pogliani.mattia
 */
public class FileBufferedReader {

    String path;

    public FileBufferedReader(String path) {
        this.path = path;
    }

    public long read() throws FileNotFoundException, IOException {

        long startTime = System.currentTimeMillis();
        int array[] = new int[500000];
        String input = null;
        String[] tmp = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")))) {

            input = br.readLine();
            tmp = null;
            int cont = 0;
            for (int i = 0; i < 100000; i++) {
                input = br.readLine();
                tmp = input.split(" ");
                for (int j = 0; j < 5; j++) {
                    array[cont] = Integer.parseInt(tmp[j]);
                    cont++;
                }

            }
            long endTime = System.currentTimeMillis();
            return (endTime - startTime);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Errore nel processamento del file!");
        }
        return 0;
    }

}
