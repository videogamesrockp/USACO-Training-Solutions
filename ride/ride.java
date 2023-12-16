/*
ID: aster.d1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main (String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("ride.in"));
        PrintWriter pw = new PrintWriter("ride.out");

        char[] comet = r.readLine().toCharArray();
        char[] group = r.readLine().toCharArray();

        int comet_product = 1;
        int group_product = 1;

        for (int i = 0; i < comet.length; i ++) {
            comet_product *= (comet[i] - 64);
        }

        for (int i = 0; i < group.length; i ++) {
            group_product *= (group[i] - 64);
        }


        if (comet_product % 47 == group_product % 47) {
            pw.println("GO");
        }
        else {
            pw.println("STAY");
        }

        pw.close();

    }
}