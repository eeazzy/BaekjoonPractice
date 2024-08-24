import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            q.addLast(i);
        }
        
        int index = 0;
        while(true){
            if(q.size()==1){
                break;
            }
            if(index%2==0){
                q.remove();
            }else{
                q.addLast(q.remove());
            }
            index++;
        }
        bw.write(q.peek()+"");
        bw.flush();
    }
}