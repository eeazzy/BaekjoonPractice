import java.io.*;
import java.util.*;

public class Main{
    public static void  main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] l = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(st.nextToken());
            dq.addLast(i+1);
        }

        bw.write(dq.removeFirst()+" ");
        if(l[0]>0){
            for(int j=0;j<l[0]-1;j++){
                dq.addLast(dq.removeFirst());
            }
        }else{
            for(int j=0;j<Math.abs(l[0]);j++){
                dq.addFirst(dq.removeLast());
            }
        }

        int item;
        for(int i=1;i<=n;i++){

            if(dq.size()==1){
                bw.write(dq.remove()+"");
                break;
            }
            item = dq.removeFirst();
            if(l[item-1]>0){
                for(int j=0;j<l[item-1]-1;j++){
                    dq.addLast(dq.removeFirst());
                }
            }else{
                for(int j=0;j<Math.abs(l[item-1]);j++){
                    dq.addFirst(dq.removeLast());
                }
            }
            bw.write(item+" ");

        }

        bw.flush();
    }
}
