import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a,b;
        String line = br.readLine();
        while(line!=null){
            st = new StringTokenizer(line, " ");
            a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
            line = br.readLine();
        }
        bw.flush();
    }
}