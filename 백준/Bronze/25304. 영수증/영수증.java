import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int p,n;
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            p = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            sum += (p*n);
        }
        
        if(sum == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}