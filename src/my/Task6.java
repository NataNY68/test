package my;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};

        for (int i=0; i<fahrenheits.length; i++) {
            fahrenheits[i] = (fahrenheits[i]-32)*(5/9);
        }
        System.out.println(Arrays.toString(fahrenheits));

    }
}
