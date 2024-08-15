import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int topBottom = ((w-x)<(x-0)) ? (w-x) : (x-0);
        int leftRight = ((h-y)<(y-0)) ? (h-y) : (y-0);
        int result = (topBottom<leftRight) ? topBottom : leftRight;

        bw.write(result+"");
        bw.flush();
    }
}