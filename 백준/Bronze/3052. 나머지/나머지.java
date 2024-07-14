import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a;
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            a = Integer.parseInt(br.readLine()) % 42;
            if(!num.contains(a)){
                num.add(a);
            }
        }
        bw.write(num.size()+"\n");
        bw.flush();
    }
}