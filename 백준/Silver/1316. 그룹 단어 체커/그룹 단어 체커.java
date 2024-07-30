import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Character> word = new ArrayList<>();
        
        int a = Integer.parseInt(br.readLine());
        String b;
        char pre, cur;
        int count = 0;
        for(int i=0;i<a;i++){
            b = br.readLine();
            pre = b.charAt(0);
            word.add(pre);
            for(int j=1;j<b.length();j++){
                cur = b.charAt(j);
                if(cur!=pre){
                    if(word.contains(cur)){
                        count--;
                        break;
                    }
                    word.add(cur);
                    pre = cur;
                }
            }
            count++;
            word.clear();
        }
        
        bw.write(count+"");
        bw.flush();
    }
}