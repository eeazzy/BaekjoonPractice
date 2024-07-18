import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int a = Integer.parseInt(br.readLine());
        String c; int b;
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine()," ");
            b = Integer.parseInt(st.nextToken());
            c = st.nextToken();
            
            for(int j=0;j<c.length();j++){
                for(int k=0;k<b;k++){
                    bw.write(c.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}