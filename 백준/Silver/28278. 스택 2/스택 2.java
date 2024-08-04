import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        String word; int num;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine(), " ");
            word = st.nextToken();
            if(word.equals("1")){
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if(word.equals("2")){
                if(stack.isEmpty()){
                    bw.write(-1+"\n");
                }else {
                    bw.write(stack.pop()+"\n");
                }
            } else if(word.equals("3")){
                bw.write(stack.size()+"\n");
            } else if(word.equals("4")){
                if(stack.isEmpty()) {
                    bw.write(1 + "\n");
                }else {
                    bw.write(0 + "\n");
                }
            } else {
                if(stack.isEmpty()){
                    bw.write(-1+"\n");
                }else {
                    bw.write(stack.peek()+"\n");
                }
            }
        }

        bw.flush();
    }
}