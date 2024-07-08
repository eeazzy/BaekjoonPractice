import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] n = new int[Integer.parseInt(st.nextToken())];
        int m = Integer.parseInt(st.nextToken());
        int a,b,temp;
        for(int i=0;i<n.length;i++){
            n[i] = i+1;
        }
        
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken())-1; b = Integer.parseInt(st.nextToken())-1;
            temp = n[a];
            n[a] = n[b];
            n[b] = temp;
        }
        
        for(int i=0;i<n.length;i++){
            bw.write(n[i]+" ");
        }
        bw.flush();
    }
}