/*
ID: aster.d1
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test {
    public static void main (String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("test.in"));
        PrintWriter pw = new PrintWriter("test.out");

        StringTokenizer st = new StringTokenizer(r.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        pw.println(a + b);
        pw.close();

    }
}