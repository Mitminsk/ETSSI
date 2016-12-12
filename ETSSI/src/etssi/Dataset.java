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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jehan
 */
public class Dataset {
    private ArrayList<Data> array = new ArrayList<Data>();
    private String day; 


    
    public Dataset(String day) throws IOException, SQLException {
       Model model = new Model();        
       this.initialize(model.select(day));       
       
    }
    
    private void initialize(ResultSet resultset) throws SQLException{
        ArrayList<Data> result = new ArrayList<Data>();
        ArrayList<Integer> zero = new ArrayList<Integer>();
        ArrayList<Integer> un = new ArrayList<Integer>(); 
        ArrayList<Integer> deux = new ArrayList<Integer>(); 
        ArrayList<Integer> trois = new ArrayList<Integer>(); 
        ArrayList<Integer> quatre = new ArrayList<Integer>(); 
        
        while (resultset.next()){
            
           if (resultset.getInt("horaire") == 0) 
           {
               zero.add(resultset.getInt("nombre"));
           }
           
           else if (resultset.getInt("horaire") == 1)
           {
               un.add(resultset.getInt("nombre"));
           }
           else if (resultset.getInt("horaire") == 2)
           {
               deux.add(resultset.getInt("nombre"));
           }
           else if (resultset.getInt("horaire") == 3)
           {
               trois.add(resultset.getInt("nombre"));
           }
           else 
           {
               quatre.add(resultset.getInt("nombre"));
           }
        }  
        
        int moyenne = 0 ;
        
        for(Integer nb : zero){
           moyenne += nb;
        }
        
        moyenne = moyenne / zero.size(); 
        this.getArray().add(new Data(this.getDay(), 0, moyenne));
        moyenne = 0;
        
        for(Integer nb : un){
            moyenne += nb;
        }
        
        moyenne = moyenne / un.size();
        this.getArray().add(new Data(this.getDay(), 1, moyenne));
        moyenne = 0;
        
        for(Integer nb : deux){
            moyenne += nb;
        }
        
        moyenne = moyenne / deux.size();
        this.getArray().add(new Data(this.getDay(), 2, moyenne));
        moyenne = 0;
        
        for(Integer nb : trois){
            moyenne += nb;
        }
        
        moyenne = moyenne / trois.size();
        this.getArray().add(new Data(this.getDay(), 3, moyenne));
        moyenne = 0;
        
            for(Integer nb : un){
            moyenne += nb;
        }
        
        moyenne = moyenne / quatre.size();
        this.getArray().add(new Data(this.getDay(), 4, moyenne));
        moyenne = 0;
    }
  /*  private File getResource(String fileName) {
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

    /**
     * @return the array
     */
    public ArrayList<Data> getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(ArrayList<Data> array) {
        this.array = array;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }
    
    
   
}
