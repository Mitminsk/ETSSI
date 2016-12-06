/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etssi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jehan
 */
public class Dataset {
    private ArrayList<Data> data_array;
    private String fileName;
    
    public Dataset(String fileName) throws IOException {
        this.setFileName(fileName);
        setData_array(this.readFile(this.getResource(this.fileName)));        
    }
    
    public void test_fonction() throws IOException {
       System.out.print(this.readFile(this.getResource(this.fileName)));
    }
    
    private File getResource(String fileName) {
       File file = new File(fileName);
       return file;
   }
    
    private ArrayList<Data> readFile(File file) throws FileNotFoundException, IOException {
        ArrayList<Data> result = new ArrayList<Data>();
        this.getResource(this.getFileName()); 
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            String[] split_data = line.split(",");
            result.add(new Data(split_data[0],Integer.parseInt(split_data[1]),split_data[2],Integer.parseInt(split_data[5]), Integer.parseInt(split_data[6])));
        }

        br.close();
        fr.close();
        return result;
    }

    /**
     * @return the data_array
     */
    public ArrayList<Data> getData_array() {
        return data_array;
    }

    /**
     * @param data_array the data_array to set
     */
    public void setData_array(ArrayList<Data> data_array) {
        this.data_array = data_array;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
