import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        int[] b = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int sum=0;
        for(int i=0;i<a.length();i++){
            sum += b[a.charAt(i)-'A'];
        }
        bw.write(sum+"");
        bw.flush();
    }
}