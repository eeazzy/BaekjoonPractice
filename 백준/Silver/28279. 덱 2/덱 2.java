import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> dq = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int a,item;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            if(a==1){
                item = Integer.parseInt(st.nextToken());
                dq.addFirst(item);
            }else if(a==2){
                item = Integer.parseInt(st.nextToken());
                dq.addLast(item);
            }else if(a==3){
                if(dq.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.removeFirst()+"\n");
                }
            }else if(a==4){
                if(dq.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.removeLast()+"\n");
                }
            }else if(a==5){
                bw.write(dq.size()+"\n");
            }else if(a==6){
                if(dq.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }else if(a==7){
                if(dq.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekFirst()+"\n");
                }
            }else if(a==8){
                if(dq.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(dq.peekLast()+"\n");
                }
            }
        }
        bw.flush();
    }
}