import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int[] n = {1,1,2,2,2,8};
        int a;
        for(int i=0;i<n.length;i++){
            a = Integer.parseInt(st.nextToken());
            n[i] -= a;
            bw.write(n[i]+" ");
        }
        bw.flush();
    }
}