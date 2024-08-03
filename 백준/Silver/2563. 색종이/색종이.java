import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int x,y,count=0;
        int[][] sq = new int[100][100];
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                sq[i][j] = 0;
            }
        }
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken()); y = Integer.parseInt(st.nextToken());
            for(int p=x;p<x+10;p++){
                for(int q=y;q<y+10;q++){
                    sq[p][q] = 1;
                }
            }
        }
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(sq[i][j]==1){
                    count++;
                }
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}