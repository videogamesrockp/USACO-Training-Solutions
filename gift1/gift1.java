/*
ID: aster.d1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
    public static void main (String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter pw = new PrintWriter("gift1.out");

        int N = Integer.parseInt(r.readLine());
        HashMap<String, Integer> balance = new HashMap<String, Integer>();
        String[] order = new String[N];

        for (int i = 0; i < N; i ++) {
            String person = r.readLine();
            balance.put(person, 0);
            order[i] = person;
        }

        for (int i = 0; i < N; i ++) {
            String giver = r.readLine();
            StringTokenizer st = new StringTokenizer(r.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            if (people == 0) {
                continue;
            }
            amount /= people;

            for (int j = 0; j < people; j ++) {
                String person = r.readLine();
                balance.put(person, balance.get(person) + amount);
            }

            balance.put(giver, balance.get(giver) - (amount * people));
        }

        for (String i: order) {
            pw.println(i + " " + balance.get(i));
        }

        pw.close();

    }
}