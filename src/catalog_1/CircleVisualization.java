package catalog_1;

//Задать cлучайныv образом два массива X и Y, содержащих по n чисел из промежутка [200; 500] и два массива R1 и R2, содержащие n чисел из промежутка [50; 100]. Посторить на экране разноцыетные кольца, координаты центров которых хранятся в массивах X и Y, а радиусы в массивах R1 и R2 


import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class CircleVisualization extends JPanel {

    private int n = 10;
    private int[] X, Y, R1, R2;
    
    public CircleVisualization() {
        X = generateRandomArray(n, 100, 400);
        Y = generateRandomArray(n, 100, 400);
        R1 = generateRandomArray(n, 30, 70);
        R2 = generateRandomArray(n, 30, 70);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < n; i++) {
            int centerX = X[i];
            int centerY = Y[i];
            int radius1 = R1[i];
            int radius2 = R2[i];

            g.setColor(Color.RED);
            g.drawOval(centerX - radius1, centerY - radius1, 2 * radius1, 2 * radius1);
            g.drawOval(centerX - radius2, centerY - radius2, 2 * radius2, 2 * radius2);
        }
    }

    private int[] generateRandomArray(int n, int min, int max) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Circle Visualization");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new CircleVisualization());
            frame.setSize(900, 900);
            frame.setVisible(true);
        });
    }
}

