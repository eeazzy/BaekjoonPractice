import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String b;
        for(int i=0;i<a;i++){
            b = br.readLine();
            bw.write(b.charAt(0)+""+b.charAt(b.length()-1)+"\n");
        }
        bw.flush();
    }
}