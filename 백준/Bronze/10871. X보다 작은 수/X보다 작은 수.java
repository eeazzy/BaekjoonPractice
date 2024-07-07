import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        String line = br.readLine();
        st = new StringTokenizer(line," ");
        int n = Integer.parseInt(st.nextToken()); int x = Integer.parseInt(st.nextToken());
        line = br.readLine();
        st = new StringTokenizer(line," "); int num;
        for(int i=0;i<n;i++){
            num = Integer.parseInt(st.nextToken());
            if(num<x){
                bw.write(num+" ");
            }
        }
        bw.flush();
    }
}