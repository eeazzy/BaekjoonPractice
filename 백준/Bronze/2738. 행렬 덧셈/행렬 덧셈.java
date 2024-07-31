import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
        int[][] n1 = new int[a][b]; int[][] n2 = new int[a][b];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<b;j++){
                n1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<b;j++){
                n2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                bw.write((n1[i][j]+n2[i][j])+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}