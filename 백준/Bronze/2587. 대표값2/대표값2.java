import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> array = new ArrayList<>();
        
        int n, sum = 0;
        for(int i=0;i<5;i++){
            n = Integer.parseInt(br.readLine());
            sum += n;
            array.add(n);
        }

        bw.write(sum/5+"\n");
        Collections.sort(array);
        bw.write(array.get(2)+"");
        bw.flush();
    }
}