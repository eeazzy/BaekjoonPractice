import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a;
        while((a=br.readLine())!=null){
            bw.write(a+"\n");
        }
        bw.flush();
    }
}