import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Deque<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.addLast(i);
        }
        
        bw.write("<");
        while(true){
            if(q.size()==1){
                break;
            }
            for(int i=0;i<m-1;i++){
                q.addLast(q.remove());
            }
            bw.write(q.remove()+", ");
        }
        bw.write(q.remove()+">");
        bw.flush();
    }
}