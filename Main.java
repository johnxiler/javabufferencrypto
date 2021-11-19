
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
  public static void main(String[] args) throws IOException{
      
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in)); 
        
        int i,counta=0,countb=0,countc=0,countd=0,counte=0,countf=0,countg=0,counth=0,counti=0,countj=0,countk=0,countl=0,countm=0,countn=0,counto=0,countp=0,countq=0,countr=0,counts=0,countt=0,countu=0,countv=0,countw=0,countx=0,county=0,countz=0,count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count=0,incount=0;
        int spaceCount= 0;
        char x =' ';
        
        System.out.print("Enter Your Fullname: ");
        
        String name = cin.readLine();
        
        System.out.print("Enter your favorite motto or bible verse: ");
        String str = cin.readLine();
        System.out.println("***************************************");
        System.out.println ("CHARACTER STATISTICS:");

        for (i = 0; i < str.length(); i++){
		System.out.print(str.charAt(i));
		if (str.charAt(i) == 'a' || str.charAt(i) == 'A'){
			counta++;
			System.out.println(" - " + counta);
		}
		else if (str.charAt(i) == 'b' || str.charAt(i) == 'B'){
			countb++;
			System.out.println(" - " + countb);
		}
		else if (str.charAt(i) == 'c' || str.charAt(i) == 'C'){
			countc++;
			System.out.println(" - " + countc);
		}
		else if (str.charAt(i) == 'd' || str.charAt(i) == 'D'){
			countd++;
			System.out.println(" - " + countd);
		}
		else if (str.charAt(i) == 'e' || str.charAt(i) == 'E'){
			counte++;
			System.out.println(" - " + counte);
		}
		else if (str.charAt(i) == 'f' || str.charAt(i) == 'F'){
			countf++;
			System.out.println(" - " + countf);
		}
		else if (str.charAt(i) == 'g' || str.charAt(i) == 'G'){
			countg++;
			System.out.println(" - " + countg);
		}
		else if (str.charAt(i) == 'h' || str.charAt(i) == 'H'){
			counth++;
			System.out.println(" - " + counth);
		}
		else if (str.charAt(i) == 'i' || str.charAt(i) == 'I'){
			counti++;
			System.out.println(" - " + counti);
		}
		else if (str.charAt(i) == 'j' || str.charAt(i) == 'J'){
			countj++;
			System.out.println(" - " + countj);
		}
		else if (str.charAt(i) == 'k' || str.charAt(i) == 'K'){
			countk++;
			System.out.println(" - " + countk);
		}
		else if (str.charAt(i) == 'l' || str.charAt(i) == 'L'){
			countl++;
			System.out.println(" - " + countl);
		}
		else if (str.charAt(i) == 'm' || str.charAt(i) == 'M'){
			countm++;
			System.out.println(" - " + countm);
		}
		else if (str.charAt(i) == 'n' || str.charAt(i) == 'N'){
			countn++;
			System.out.println(" - " + countn);
		}
		else if (str.charAt(i) == 'o' || str.charAt(i) == 'O'){
			counto++;
			System.out.println(" - " + counto);
		}
		else if (str.charAt(i) == 'p' || str.charAt(i) == 'P'){
			countp++;
			System.out.println(" - " + countp);
		}
		else if (str.charAt(i) == 'q' || str.charAt(i) == 'Q'){
			countq++;
			System.out.println(" - " + countq);
		}
		else if (str.charAt(i) == 'r' || str.charAt(i) == 'R'){
			countr++;
			System.out.println(" - " + countr);
		}
		else if (str.charAt(i) == 's' || str.charAt(i) == 'S'){
			counts++;
			System.out.println(" - " + counts);
		}
		else if (str.charAt(i) == 't' || str.charAt(i) == 'T'){
			countt++;
			System.out.println(" - " + countt);
		}
		else if (str.charAt(i) == 'u' || str.charAt(i) == 'U'){
			countu++;
			System.out.println(" - " + countu);
		}
		else if (str.charAt(i) == 'v' || str.charAt(i) == 'V'){
			countv++;
			System.out.println(" - " + countv);
		}
		else if (str.charAt(i) == 'w' || str.charAt(i) == 'W'){
			countw++;
			System.out.println(" - " + countw);
		}
		else if (str.charAt(i) == 'x' || str.charAt(i) == 'X'){
			countx++;
			System.out.println(" - " + countx);
		}
		else if (str.charAt(i) == 'y' || str.charAt(i) == 'Y'){
			county++;
			System.out.println(" - " + county);
		}
		else if (str.charAt(i) == 'z' || str.charAt(i) == 'Z'){
			countz++;
			System.out.println(" - " + countz);
		}
		else if (str.charAt(i) == '0'){
			count0++;
			System.out.println(" - " + count0);
		}
		else if (str.charAt(i) == '1'){
			count1++;
			System.out.println(" - " + count1);
		}
		else if (str.charAt(i) == '2'){
			count2++;
			System.out.println(" - " + count2);
		}
		else if (str.charAt(i) == '3'){
			count3++;
			System.out.println(" - " + count3);
		}
		else if (str.charAt(i) == '4'){
			count4++;
			System.out.println(" - " + count4);
		}
		else if (str.charAt(i) == '5'){
			count5++;
			System.out.println(" - " + count5);
		}
		else if (str.charAt(i) == '6'){
			count6++;
			System.out.println(" - " + count6);
		}
		else if (str.charAt(i) == '7'){
			count7++;
			System.out.println(" - " + count7);
		}
		else if (str.charAt(i) == '8'){
			count8++;
			System.out.println(" - " + count8);
		}
		else if (str.charAt(i) == '9'){
			count9++;
			System.out.println(" - " + count9);
		}
		else if (str.charAt(i) == ' '){
			count++;
			System.out.println(" - " + count);
		}
	 }//int count_Words = ;{
       String en = encrypt(str);
         System.out.println("Encrypted Code: " + en);//for encryption
       int number = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int sad = 0; sad < str.length(); sad++)
            {
                if (str.charAt(sad) == ' ')
                {
                    number++;
                }
                if(!Character.isWhitespace(str.charAt(sad))){
                  incount++;
                }  
                if(str.charAt(sad) != ' ') { 
               spaceCount++; 
                }
        }  //To count the last word present in the string, increment wordCount by 1 
}
            number = number + 1; 
            System.out.println("Total Number of Words: " + number); 
            System.out.println("Characters count: " + spaceCount);//output characters including space
           System.out.println("Characters count without spaces: "+ incount);//output character without space 
           System.out.println("------------------------------------------------");
          System.out.println("Submitted by: " + name);
          cin.close();
}
 
 //encrypting value
public static String encrypt(String key) {
String result = "";
int l = key.length();
char ch;
for(int i = 0; i < l; i++){
ch = key.charAt(i);
ch += 10;
result += ch;
}
return result;
}
}