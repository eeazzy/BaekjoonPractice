import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a,b;
        
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }else{
                bw.write((a+b)+"\n");
            }
        }
        bw.flush();
    }
}