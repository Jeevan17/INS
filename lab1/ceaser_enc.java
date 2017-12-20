import java.util.*;
import java.io.*;
class ceaser_enc
{
        public static void main(String args[]) throws Exception
        {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                
                FileReader fr=new FileReader("plain.txt");
                BufferedReader br=new BufferedReader(fr);

                File r=new File("cipher.txt");
                FileWriter fw=new FileWriter(r);
                PrintWriter bw=new PrintWriter(fw);

                String s;
                while((s=br.readLine())!=null)
                {
                        System.out.println();
                        for(int i=0;i<s.length();i++)
                        {
                                int x=(int) s.charAt(i);
                                int e=x+n;
                                bw.write((int)e);
                                System.out.print((char)e);
                                }
                        }
                }
                System.out.println();
        }
}
