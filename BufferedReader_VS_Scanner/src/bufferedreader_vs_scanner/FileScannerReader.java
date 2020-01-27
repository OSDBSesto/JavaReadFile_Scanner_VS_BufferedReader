/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pogliani.mattia
 */
public class FileScannerReader {
    String path;

    public FileScannerReader(String path) {
        this.path = path;
    }
    
    public void read(){
    }
//    
//    BufferedReader_VS_Scanner streams = new BufferedReader_VS_Scanner();
//
//        long startTime = System.currentTimeMillis();
//
//        int nLines = 0, nQueries = 0;
//        int size = 0;
//        String input = null;
//        String[] tmp = null;
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")))) {
//
//            input = br.readLine();
//            nLines = Integer.parseInt(input);
//
//            if ((nLines >= 1) && (nLines <= 100_000)) {
//
//                for (int i = 0; i < nLines; i++) {
//                    input = br.readLine();
//                    tmp = input.split(" ");
//                    StatsRecord sr = new StatsRecord(Long.parseLong(tmp[0]), Long.parseLong(tmp[1]), Integer.parseInt(tmp[2]));
//                    streams.stats.add(sr);
//                }
//
//            }
//
//            input = br.readLine();
//            nQueries = Integer.parseInt(input);
//
//            if ((nQueries >= 1) && (nQueries <= 100_000)) {
//
//                tmp = null;
//                for (int i = 0; i < nQueries; i++) {
//                    input = br.readLine();
//                    tmp = input.split(" ");
//                    Interval in = new Interval(Long.parseLong(tmp[0]), Long.parseLong(tmp[1]));
//                    streams.queries.add(in);
//                }
//
//            }
//
//            System.out.println("Streams: " + streams.stats.size());
//            System.out.println("Queries: " + streams.queries.size());
//
//            long endTime = System.currentTimeMillis();
//            System.out.println("Tempo di esecuzione:  " + ((endTime - startTime)) + " millisecondi");
//        } catch (IOException | NumberFormatException e) {
//            System.out.println("Errore nel processamento del file!");
//        }
//    }
    
}
