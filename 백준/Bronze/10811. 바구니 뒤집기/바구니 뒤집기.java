import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n,m,temp;
        int[] num = new int[a];
        for(int i=0;i<a;i++){
            num[i] = i+1;
        }
        
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken())-1; m = Integer.parseInt(st.nextToken())-1;
            while(n<m){
                temp = num[n];
                num[n] = num[m];
                num[m] = temp;
                n++; m--;
            }
        }
        
        for(int i=0;i<a;i++){
            bw.write(num[i]+" ");
        }
        bw.flush();
    }
}