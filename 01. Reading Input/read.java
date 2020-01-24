import java.io.*;
class Read{
    public static void main(String args[]) {
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            int i;
            System.out.println("Enter a Number");
            i=Integer.parseInt(br.readLine());
            System.out.println(i*i);
            
        } catch (Exception e) {
            System.out.println(e.toString()+"\n"+e.getMessage());
        }
    }
}