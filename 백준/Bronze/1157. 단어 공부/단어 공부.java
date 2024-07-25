import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        a = a.toUpperCase();
        int[] b = new int[26];
        for(int i=0;i<26;i++){
            b[i]=0;
        }
        for(int i=0;i<a.length();i++){
            b[a.charAt(i) - 'A']++;
        }
        int max = b[0]; int index=0;
        for(int i=0;i<26;i++){
            if(max<b[i]){
                max = b[i];
                index = i;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(b[i]==max){
                count++;
            }
        }

        if(count==1){
            bw.write('A'+index);
        }else{
            bw.write("?");
        }
        bw.flush();
    }
}