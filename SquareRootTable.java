package squareroottable;

import java.text.DecimalFormat;

public class SquareRootTable {

    public static void main(String[] args) {

        System.out.println("Square Root Square:");
        System.out.print("Number\t");

        for (float i = 0.0f; i <= 1.0; i = (float) (i + 0.1)) {
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(1);
            System.out.print(df.format(i) + "\t");
        }
        System.out.println();
        for (float i = 0.0f; i <= 9.0; i++) {
            System.out.print(i + "\t");
            for (float j = 0.0f; j <= 1.0; j = (float) (0.1 + j)) {
                double sr;
                sr = (float) Math.sqrt(i + j);
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(2);
                System.out.print(df.format(sr) + "\t");
            }
            System.out.println();
        }
    }
}
