import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int min = Integer.parseInt(br.readLine());
        
        int a = h*60+m;
        a += min;
        h = a/60; m = a%60;
        if(h>=24){
            h = h%24;
        }
        m = (m==60)?0:m;
        
        System.out.println(h+" "+m);
    }
}