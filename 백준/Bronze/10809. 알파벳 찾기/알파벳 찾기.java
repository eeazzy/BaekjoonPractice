import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        int[] result = new int[26];

        for(int i='a';i<='z';i++){
            result[i-'a'] = -1;
            for(int j=0;j<a.length();j++){
                if(i==a.charAt(j)){
                    result[i-'a'] = j;
                    break;
                }
            }
        }

        for(int i=0;i<26;i++){
            bw.write(result[i]+" ");
        }
        bw.flush();
    }
}