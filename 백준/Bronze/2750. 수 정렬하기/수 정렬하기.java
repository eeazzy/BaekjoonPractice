import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> array = new ArrayList<>();

        int a;
        for(int i=0;i<n;i++){
            a = Integer.parseInt(br.readLine());
            array.add(a);
        }
        Collections.sort(array);
        for(int i=0;i<array.size();i++){
            bw.write(array.get(i)+"\n");
        }
        bw.flush();
    }
}