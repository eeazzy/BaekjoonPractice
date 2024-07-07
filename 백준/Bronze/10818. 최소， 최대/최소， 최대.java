import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int min = Integer.parseInt(st.nextToken()), max = min, num;
        for(int i=0;i<n-1;i++){
            num = Integer.parseInt(st.nextToken());
            min = (min<=num)?min:num;
            max = (max>=num)?max:num;
        }
        bw.write(min+" "+max);
        bw.flush();
    }
}