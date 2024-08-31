import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int num1,num2,a,b,result;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            if(num1>num2){
                a = num1; b = num2;
            }else{
                a = num2; b = num1;
            }
            for (int j=1; j<=a; j++) {
    			result = a * j;
    			if (result % b==0) {
    				bw.write(result+"\n");
    				break;
    			}
    		}	
        }
        bw.flush();
    }
}