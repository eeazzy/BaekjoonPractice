import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n1,n2;
        
        int a = Integer.parseInt(br.readLine());
        for(int i=1;i<=a;i++){
            st = new StringTokenizer(br.readLine(), " ");
            n1 = Integer.parseInt(st.nextToken()); n2 = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+n1+" + "+n2+" = "+(n1+n2)+"\n");
        }
        bw.flush();
    }
}