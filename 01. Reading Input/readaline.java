import java.io.*;
class Readaline{
    public static void main(String args[]) {
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String line;
            System.out.println("Enter a string");
            line=br.readLine();
            System.out.println("You have entered :"+line);
            System.out.println("The line consists of"+line.length()+" Chars");
                      
        } catch (Exception e) {
            System.out.println(e.toString()+"\n"+e.getMessage());
        }
    }
}