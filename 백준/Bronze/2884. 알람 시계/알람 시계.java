import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
         int min = h*60+m;
        min -= 45;

        if(min<0){
            min = min+60*24;
        }
        h=min/60;
        m=min%60;
        System.out.println(h+" "+m);
    }
}