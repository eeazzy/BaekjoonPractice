import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder output = new StringBuilder();
        int num=0, sum;
        ArrayList<Integer> n = new ArrayList<>();
        while(true){
            sum = 0;
            num = Integer.parseInt(br.readLine());
            if(num == -1) break;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    n.add(i);
                }
            }
            for(int i=0;i<n.size();i++){
                sum += n.get(i);
            }
            if(sum==num){
                output.append(num+" = ");
                for(int i=0;i<n.size();i++){
                   output.append(n.get(i)+" + ");
                }
                bw.write(output.substring(0, output.length() - 2));
            }else{
                bw.write(num+" is NOT perfect.");
            }
            output.setLength(0);
            n.clear();
            bw.write("\n");
        }
        bw.flush();
    }
}