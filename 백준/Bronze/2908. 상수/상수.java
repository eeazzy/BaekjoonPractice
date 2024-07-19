import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder a = new StringBuilder(st.nextToken());
        StringBuilder b = new StringBuilder(st.nextToken());
        
        String ra = a.reverse().toString();
        String rb = b.reverse().toString();
        int c = (Integer.parseInt(ra)>Integer.parseInt(rb))?Integer.parseInt(ra):Integer.parseInt(rb);
        bw.write(c+"");
        bw.flush();
    }
}