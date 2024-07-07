import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n," ");
        int result = Integer.parseInt(br.readLine());
        int[] num = new int[a];
        int s = 0;
        
        for(int i=0;i<a;i++){
            num[i] = Integer.parseInt(st.nextToken());
            if(result == num[i]){
                s++;
            }
        }
        bw.write(s+"\n");
        bw.flush();
        
    }
}