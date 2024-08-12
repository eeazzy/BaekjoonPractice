import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int count,min = 10000,sum = 0;
        
        for(int i=n;i<=m;i++){
            count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                min = (i<min)?i:min;
                sum+=i;
            }
        }

        if(sum==0){
            bw.write("-1");
        }else{
            bw.write(sum+"\n"+min);
        }
        bw.flush();
    }
}