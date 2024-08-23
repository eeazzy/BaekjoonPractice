import java.io.*;
import java.util.*;

public class Main{
    public static void  main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Long> q = new LinkedList<>();
        String a; long e;
        for(int i=0;i<n;i++){
           st = new StringTokenizer(br.readLine()," ");
           a = st.nextToken();
            if(a.equals("push")){
                e = Long.parseLong(st.nextToken());
                q.add(e);
            }else if(a.equals("pop")){
                if(q.isEmpty()){
                    bw.write("-1\n");
                }else {
                    bw.write(q.remove() + "\n");
                }
            }else if(a.equals("size")){
                bw.write(q.size()+"\n");
            }else if(a.equals("empty")){
                if(q.isEmpty()){
                    bw.write("1\n");
                }else {
                    bw.write( "0\n");
                }
            }else if(a.equals("front")){
                if(q.isEmpty()){
                    bw.write("-1\n");
                }else {
                    bw.write(q.peek()+"\n");
                }
            }else if(a.equals("back")){
                if(q.isEmpty()){
                    bw.write("-1\n");
                }else {
                    bw.write(q.peekLast()+"\n");
                }
            }
        }
        bw.flush();
    }
}
