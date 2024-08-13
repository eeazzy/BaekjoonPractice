import java.io.*;
import java.util.*;

public class Main{
    public static void  main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        while(n>1) {
            for (int i = 2; i <= n; i++) {
                    if(n%i==0){
                        result.add(i);
                        n/=i;
                        break;
                    }
            }
        }

        if(result.isEmpty()){
            bw.write("");
        }else {
            Collections.sort(result);
            for(int i=0;i<result.size();i++){
                bw.write(result.get(i)+"\n");
            }
        }

        bw.flush();
    }
}
