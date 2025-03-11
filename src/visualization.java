// Ethan Dykes
// class with main that will show the data visualization
// implements separate GUI objects like charts and panels from their own classes. Limitations on its capability and you will see
// several degraded objects. Time crunch (once again)

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

// Broke separate GUI elements into classes cause Java
// Visualization class is where all of the GUI objects are created, and then applied in Main

// If your reading this and its only grading the console portion, ignore these. lol

public class visualization extends JFrame {
    public visualization(List<String[]> data) {
        setTitle("Data Visualizer");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tablePanel tablePanel = new tablePanel(data);
        statistics statsPanel = new statistics(data);
        chartPanel chartPanel = new chartPanel(data);
        detailsPanel detailsPanel = new detailsPanel();

        add(tablePanel, BorderLayout.CENTER);
        add(statsPanel, BorderLayout.NORTH);
        add(chartPanel, BorderLayout.EAST);
        add(detailsPanel, BorderLayout.SOUTH);
    }
// Invokes dataReader, which parses the data, and then throws it into the GUI
    public static void main(String[] args) {
        dataReader reader = new dataReader();
        List<String[]> fileData = new ArrayList<>();
        List<String> lines = reader.getLines();
        lines.remove(0); // remove header data
        for (String line : lines) {
            String[] columns = line.split("\t"); // .txt file, delimited via tab
            if (columns.length > 15) { // If data is missing a column (some have incomplete data) skips that row, prevents bad by having a date thrown into an average calculation
                fileData.add(new String[]{columns[0], columns[1], columns[6], columns[15]});
            }
        }
        SwingUtilities.invokeLater(() -> new visualization(fileData).setVisible(true));
    }
}

// think this is enough comments? I was only intoxicated for 1/3 of it this time, so my understanding is still here
// mostly because this one was easier, and I've done a lot of data parsing in other programming languages for more than school
// it was mostly turning things into objects and generating GUI objects that got me. I pulled an all nighter learning swing from youtube and geeksforgeeks.
// I do NOT write enough comments for Java, idk why.