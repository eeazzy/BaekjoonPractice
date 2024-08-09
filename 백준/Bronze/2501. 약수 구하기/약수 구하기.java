import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
            if(count==b){
                bw.write(i+"");
                break;
            }
        }

        if(count<b){
            bw.write("0");
        }
        bw.flush();
    }
}