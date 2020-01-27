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

    public long read() throws FileNotFoundException, IOException, InterruptedException {

        long startTime = System.currentTimeMillis();
        int array[] = new int[500000];
        String input = null;
        String[] tmp = null;
        System.out.println("path: "+path);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

            tmp = null;
            int cont = 0;
            for (int i = 0; i < 100000; i++) {
                input = br.readLine();
                //Thread.sleep(100);
                //System.out.println("input: "+input);
                tmp = input.split(" ");
                //System.out.println("temp[0]: "+tmp[0]);
                for (int j = 0; j < 5; j++) {
                    //System.out.println("intero in posizione: "+cont+ " = " + Integer.parseInt(tmp[j]));
                    if (cont < 490000) {
                        array[cont] = Integer.parseInt(tmp[j]);
                        cont++;
                    }
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
