import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        boolean next;
        String w;
        for(int i=0;i<n;i++){
            w = br.readLine();
            next = false;
            for(int j=0;j<w.length();j++){
                if(w.charAt(j)=='('){
                    s.push(w.charAt(j));
                }else{
                    if(s.isEmpty()){
                        bw.write("NO\n");
                        next = true;
                        break;
                    }
                    s.pop();
                }
            }
            if(next==false){
                if(s.isEmpty()){
                    bw.write("YES\n");
                }else{
                    bw.write("NO\n");
                }
            }
            s.clear();
        }
        bw.flush();
    }
}