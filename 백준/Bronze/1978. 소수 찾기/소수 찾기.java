import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int num, count = 0, c;
     
        for(int i=0;i<n;i++){
            c = 0;
            num = Integer.parseInt(st.nextToken());
            for(int j=1;j<num;j++){
                if(num%j==0){
                    c++;
                }
            }
            if(c==1){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}