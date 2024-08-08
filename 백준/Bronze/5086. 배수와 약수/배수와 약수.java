import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b; String num;
        while (!(num = br.readLine()).equals("0 0")){
            st = new StringTokenizer(num, " ");
            a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
            if(b%a==0){
                bw.write("factor\n");
            }else if(a%b==0){
                bw.write("multiple\n");
            }else{
                bw.write("neither\n");
            }
        }
        bw.flush();
    }
}