import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long sum = 0;
        for(long i=1;i<=n;i++){
            if(n==1){
                bw.write("4");
            }else if(i==n){
                sum+=(3+n);
                bw.write(sum+"");
            }else{
                sum+=3;
            }
        }
        bw.flush();
    }
}