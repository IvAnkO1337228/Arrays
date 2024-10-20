package catalog_2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PiePlot;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

//написать программу, котрая введет с клавиатуры список магазинов. Случайным образом сгенерировать товарооборот для каждого магазина. построить круговую диаграмму по полученным данным



//для этой задачи надо спользовать IDE Eclipse, так как я не нашел зависимоти SWT в maven repository для vscode. Но по сути, если найти правильные зависимоти, то и тут будет работать
public class Shop {
    public static void main(String[] args) {
        Map<String, Double> turnovers = new HashMap<>();
        String[] shops = {"Магазин 1", "Магазин 2", "Магазин 3"};

        for (String shop : shops) {
            turnovers.put(shop, Math.random() * 100000);
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : turnovers.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart chart = ChartFactory.createPieChart("Товарооборот магазинов", dataset, true, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();

        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Круговая диаграмма");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
