import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max=0, r=0, c=0, a;
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9;j++){
                a = Integer.parseInt(st.nextToken());
                if(max<a){
                    max = a; r = i; c = j;
                }
            }
        }
        bw.write(max+"\n");
        bw.write((r+1)+" "+(c+1));
        bw.flush();
    }
}