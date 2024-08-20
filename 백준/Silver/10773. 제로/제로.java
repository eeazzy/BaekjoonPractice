import java.io.*;
import java.util.*;

public class Main{
    public static void  main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int num;
        for(int i=0;i<n;i++){
            num = Integer.parseInt(br.readLine());
            if(!s.isEmpty() && num==0){
                s.pop();
            }else {
                s.push(num);
            }
        }

        int sum = 0;
        while (!s.isEmpty()){
            sum += s.pop();
        }

        bw.write(sum+"");
        bw.flush();
    }
}
