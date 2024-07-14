import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] num = new int[a];
        int max=0; double e = 0;
        for(int i=0;i<a;i++){
            num[i] = Integer.parseInt(st.nextToken());
            max = (max>num[i])?max:num[i];
        }

        for(int i=0;i<a;i++){
            e += (double)num[i]/max*100;
        }

        bw.write((e/a)+"\n");
        bw.flush();
    }
}