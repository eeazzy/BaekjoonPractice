import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }else if((a==b && b!=c)||
                 (b==c && c!=a)){
            System.out.println(1000+b*100);
        }else if(a==c && a!=b){
            System.out.println(1000+a*100);
        }else{
            int max = a;
            max = (max>b)?max:b;
            max = (max>c)?max:c;
            System.out.println(max*100);
        }
    }
}