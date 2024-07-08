import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int[] n = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());
        String line;
        int a,b,c;
        for(int i=0;i<count;i++){
            line = br.readLine();
            st = new StringTokenizer(line," ");
            a = Integer.parseInt(st.nextToken())-1; b = Integer.parseInt(st.nextToken())-1; c = Integer.parseInt(st.nextToken());
            
            for(int j=a;j<=b;j++){
                n[j] = c;
            }
        }
        for(int i=0;i<n.length;i++){
            bw.write(n[i]+" ");
        }
        bw.flush();
    }
}