import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        String a,c;
        float b, sum = 0, s = 0;
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine()," ");
            a = st.nextToken(); b = Float.parseFloat(st.nextToken()); c = st.nextToken();
            if(!c.equals("P")){
                switch (c){
                    case "A+": sum += 4.5*b; s+=b; break;
                    case "A0": sum += 4.0*b; s+=b; break;
                    case "B+": sum += 3.5*b; s+=b; break;
                    case "B0": sum += 3.0*b; s+=b; break;
                    case "C+": sum += 2.5*b; s+=b; break;
                    case "C0": sum += 2.0*b; s+=b; break;
                    case "D+": sum += 1.5*b; s+=b; break;
                    case "D0": sum += 1.0*b; s+=b; break;
                    case "F": sum += 0.0*b; s+=b; break;
                }
            }
        }
        bw.write((sum/s)+"");
        bw.flush();
    }
}