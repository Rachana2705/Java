import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;

class StringStarter{
public static void main(String[] words){

String str = "encyclopaedia";
String name1 = "Jack";
String name2 = "Jame";

int[] interger = {75,76,77,78,79,80};
byte[] num = {65,66,67,68,69,70,71,72,73,74};
char[] characters = {'a',' ','b','o','y',' ','a','n','d',' ','a',' ','g','i','r','l'};

System.out.println(new String(str)); //String(String original)

System.out.println(new String(num)); //String(byte[] bytes)

System.out.println(new String(num,1,3)); //String(byte[] bytes, int offset, int length)

System.out.println(new String(characters)); //String(char[] value)

System.out.println(new String(characters,2,5)); //String(char[] value, int offset, int count)

System.out.println(new String(interger,1,4)); //String(int[] codePoints, int offset, int count)

try {
      System.out.println(new String(num,1,3,"ASCII"));
	  //String(byte[] bytes, int offset, int length, String charsetName)

    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }


      System.out.println(new String(num,1,5,Charset.forName("UTF-8"))); 
    //String(byte[] bytes, int offset, int length, Charset charset)

	  
	  
try {
      System.out.println(new String(num, "ISO-8859-1"));
	  //String(byte[] bytes, Charset charset)

    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  
int str1 = str.codePointAt(3);
System.out.println("codePointAt : "+str1);

int str2 = str.codePointBefore(5);
System.out.println("codePointBefore : "+str2);

int str3 = str.codePointCount(3,4);
System.out.println("codePointCount : "+str3);

int str4 = str.offsetByCodePoints(2,3);
System.out.println("offsetCodePoints : "+str4);

try{
byte[] str5 = str.getBytes("ASCII");
      for(int i=0; i< str5.length ; i++) {
         System.out.print(str5[i] +" ");
      }
	  System.out.println();
} catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

int str6 = name1.compareTo(name2);

if (str6 < 0){
System.out.println( name1+" is less than " +name2);
        }
else if (str6 == 0)
        {
System.out.println(name1 +" is equal to " +name2);
        }
else // if (str6 > 0)
        {
System.out.println(name1 +" is greater than " +name2);
		}

String str7 = String.copyValueOf(characters);
System.out.println("copyValueOf : "+str7);

String str8 = String.copyValueOf(characters,1,7);
System.out.println("copyValueOf with offset : "+str8);

boolean str9 = name1.endsWith("ck");
System.out.println("endsWith : "+str9);

int str10 = str.indexOf('y');
System.out.println("indexOf : "+str10);

int str11 = str.indexOf('a',5);
System.out.println("indexOf with offset : "+str11);

int str12 = str.length();
System.out.println("length : "+str12);

String str13 = str.replace('e','o');
System.out.println("replace : "+str13);

boolean str14 = str.startsWith("Jo");
System.out.println("startsWith : "+str14);

String str15 = str.substring(4);
System.out.println("substring : "+str15);

}
}