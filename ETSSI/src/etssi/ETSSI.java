/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etssi;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author jehan
 */
public class ETSSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
       Dataset job = new Dataset("JOB");
       Dataset samedi = new Dataset("samedi");
       Dataset dimanche = new Dataset("dimanche");
       final Graphique demo = new Graphique("Graphique", job, samedi, dimanche);
       demo.pack();
       RefineryUtilities.centerFrameOnScreen(demo);
       demo.setVisible(true);      
    }  
    
}
