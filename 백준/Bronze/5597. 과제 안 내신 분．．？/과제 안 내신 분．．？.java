import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[30];
        int num;
        for(int i=0;i<28;i++){
            num = Integer.parseInt(br.readLine());
            arr[num-1] = num;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                bw.write((i+1)+"\n");
            }
        }
        bw.flush();
    }
}