class WrapperStarter{

public static void main(String[] values){

//Integer class constructors and methods
System.out.println("===================================");
System.out.println("Integer class constructors and methods");
System.out.println("===================================");
//Integer class constructors

Integer integer1 = new Integer(26);
System.out.println(integer1);

String name = "27";
try{
System.out.println( new Integer(name));
}catch(NumberFormatException e) {
      e.printStackTrace();
    }

//Integer methods

int number1 = 20;
int number2 = 40; 

//1.
int numOfOnesInBinary = Integer.bitCount(number1);
System.out.println("num Of Ones In Binary : "+numOfOnesInBinary);

//2.	
Integer integer2 = new Integer(30);
byte byteValueOfNum = integer2.byteValue();
System.out.println("byte Value Of Num: "+byteValueOfNum);

//3.
int compare2Num = Integer.compare(number1,number2);
if(compare2Num<0){
	System.out.println(number1+" is less than "+number2);
}else if(compare2Num==0){
    System.out.println(number1+" is equal to "+number2);
}else{
	System.out.println(number1+" is greater than "+number2);
}

//4.
Integer num1 = new Integer(10);  
Integer num2 = new Integer(20); 
int number3 = num1.compareTo(num2);
System.out.println("Comparing two instance variables : ");  
if(number3<0){                                            //number3 == -1
	System.out.println(num1+" is less than "+num2);
}else if(number3==0){                                    //number3 == 0
    System.out.println(num1+" is equal to "+num2);
}else{                                                  //number3 == 1
	System.out.println(num1+" is greater than "+num2);
}

//5.
String name2 = "0x267";	
try{
	System.out.println("decode the hex num: "+ Integer.decode(name2));
}catch(NumberFormatException e){
	e.printStackTrace();
}
	
//6.
double number5 = integer1.doubleValue();
System.out.println(number5);

//7.
float number6 = integer2.floatValue();
System.out.println(number6);

//8.
int number7 = 0007;
System.out.println("num of leading zeros: "+Integer.numberOfLeadingZeros(number7));

//9.
int number8 = 980000;
System.out.println("num of trailing zeros: "+Integer.numberOfTrailingZeros(number8));

//10.
int number9 = 123456;
System.out.println("reverse the number: "+Integer.reverse(number9));

//Byte class Constructors and methods
System.out.println("===================================");
System.out.println("Byte class Constructors and methods");
System.out.println("===================================");

//Byte constructors
Byte byte3 = new Byte((byte)1101);

Byte byte1 = new Byte((byte)11);
System.out.println(byte1);

Byte byte2 = new Byte("101");
System.out.println(byte2);

// Byte methods
//1.
byte bytevalue = byte1.byteValue();
System.out.println(bytevalue);

//2.
int compare2byte = Byte.compare(byte1,byte2);
if(compare2byte<0){                                           
	System.out.println(byte1+" is less than "+byte2);
}else if(compare2byte==0){                                   
    System.out.println(byte1+" is equal to "+byte2);
}else{                                                  
	System.out.println(byte1+" is greater than "+byte2);
}

//3.
double doublevalue = byte2.doubleValue();
System.out.println(doublevalue);

//4.
float floatvalue = byte3.floatValue();
System.out.println(floatvalue);

//5.
try{
System.out.println(Byte.parseByte("11"));
}catch(NumberFormatException e){
	e.printStackTrace();
}
//6.
try{
System.out.println(Byte.valueOf("10"));
}catch(NumberFormatException e){
	e.printStackTrace();
}

//7.
System.out.println(Byte.decode("-#78"));

//8.
Short shortvalue = new Short((short)45);
System.out.println(shortvalue.shortValue());

//9.
Long longvalue = new Long(12345678L);
System.out.println(longvalue.longValue());

//10.
Integer integer3 = new Integer(68);
System.out.println(integer3.hashCode());

//Character class Constructors and methods
System.out.println("===================================");
System.out.println("char class Constructors and methods");
System.out.println("===================================");
	
//char constructors

Character character1 = new Character('r');
Character character2 = new Character('A');
System.out.println(character1);

//char methods
//1.
int char2 = Character.charCount(22);
System.out.println(char2);

//2.
char char3 = character1.charValue();
System.out.println(char3);

//3.
Integer integer4 = new Integer(100);
int hash = integer4.hashCode();
System.out.println(hash);

//4.
int number10 = character2.hashCode();
System.out.println(number10);

//5.
char[] characters = {'a',' ','b','o','y',' ','a','n','d',' ','a',' ','g','i','r','l'};
int number11 = Character.codePointAt(characters,3);
System.out.println(number11);

//6.
int number12 = Character.codePointAt(characters,2,4);
System.out.println(number12);

//7.
CharSequence seq = "wonderfull";
int number13 = Character.codePointBefore(seq,4);
System.out.println(number13);

//8.
int number14 = Character.codePointBefore(characters,8);
System.out.println(number14);

//9.
int number15 = Character.codePointBefore(characters,5,3);
System.out.println(number15);
	
//10.
int num3 = 0x0088;
char[] number16 = Character.toChars(num3);
System.out.println(number16);

	
//Short class constructors and methods

System.out.println("===================================");
System.out.println("short class Constructors and methods");
System.out.println("===================================");	
	
//short constructors

Short short1 = new Short((short)13);
System.out.println(short1);

Short short2 = new Short("98");
System.out.println(short2);

Short short3 = new Short((short)99);
Short short4 = new Short((short)78);

//short methods
//1.
byte byte4 = short1.byteValue();
System.out.println(byte4);
	
//2.
int number17 = short3.intValue();
System.out.println(number17);

//3.
float number18 = short3.floatValue();
System.out.println(number18);

//4.
long number19 = short1.longValue();
System.out.println(number19);

//5.
double number20 = short1.doubleValue();
System.out.println(number20);

//6.
int number21 = short2.hashCode();
System.out.println(number21);


//7.
int number22 = Short.hashCode((short)67);
System.out.println(number22);

//8.
int number23 = short1.compareTo(short2);
if(number23<0){                                           
	System.out.println(short1+" is less than "+short2);
}else if(number23==0){                                   
    System.out.println(short1+" is equal to "+short2);
}else{                                                  
	System.out.println(short1+" is greater than "+short2);
}

//9.
int number24 = Short.compare(short3,short4);
if(number24<0){                                           
	System.out.println(short3+" is less than "+short4);
}else if(number24==0){                                   
    System.out.println(short3+" is equal to "+short4);
}else{                                                  
	System.out.println(short3+" is greater than "+short4);
}

//10.
short short5 = Short.reverseBytes(short4);
System.out.println(short5);

//Float class constructors and methods

System.out.println("===================================");
System.out.println("float class Constructors and methods");
System.out.println("===================================");

//float constructors

Float float1 = new Float(567.9876);
System.out.println(float1);

Float float2 = new Float(452.22f);
System.out.println(float2);

Float float3 = new Float("675.7");
System.out.println(float3);

//float methods
//1.
byte number25 = float1.byteValue();
System.out.println(number25);

//2.
int number26 = Float.compare(float1,float2);
System.out.println(number26);

//3.
int number27 = float1.compareTo(float2);
if(number27<0){                                           
	System.out.println(float1+" is less than "+float2);
}else if(number27==0){                                   
    System.out.println(float1+" is equal to "+float2);
}else{                                                  
	System.out.println(float1+" is greater than "+float2);
}

//4.
float number28 = Float.intBitsToFloat(123);
System.out.println(number28);

//5.
float number29 = Float.floatToRawIntBits(98.5f);
System.out.println(number29);

//6.
float number30 = Float.floatToIntBits(98.5f);
System.out.println(number30);

//7.
int number31 = float1.hashCode();
System.out.println(number31);

//8.
double number32 = float2.doubleValue();
System.out.println(number32);

//9.
int number33 = float3.intValue();
System.out.println(number33);

//10.
int number34 = float2.shortValue();
System.out.println(number34);


//Double class constructors and methods
System.out.println("===================================");
System.out.println("Double class Constructors and methods");
System.out.println("===================================");

//double class constructors

Double double1 = new Double(234.756);
System.out.println(double1);

Double double2 = new Double("67.87");
System.out.println(double2);

Double double3 = new Double(-9876.009);
Double double4 = new Double(782376.97);

//double class methods
//1.
byte number35 = double1.byteValue();
System.out.println(number35);

//2.
int number36 = double3.intValue();
System.out.println(number36);

//3.
int number37 = Double.hashCode(double3);
System.out.println(number37);

//4.
long number38 = Double.doubleToLongBits(double4);
System.out.println(number38);

//5.
long number39 = Double.doubleToRawLongBits(37864.0923);
System.out.println(number39);

//6.
double number40 = Double.longBitsToDouble(838216372L);
System.out.println(number40);

//7.
int number41 = double1.compareTo(double3);

if(number41<0){                                           
	System.out.println(double1+" is less than "+double2);
}else if(number41==0){                                   
    System.out.println(double1+" is equal to "+double2);
}else{                                                  
	System.out.println(double1+" is greater than "+double2);
}

//8.
int number42 = Double.compare(double1,double3);
if(number42<0){                                           
	System.out.println(double1+" is less than "+double2);
}else if(number42==0){                                   
    System.out.println(double1+" is equal to "+double2);
}else{                                                  
	System.out.println(double1+" is greater than "+double2);
}

//9.
double number43 = Double.sum(double3,double4);
System.out.println(number43);

//10.
double number44 = Double.max(double3,double4);
System.out.println(number44);

//Boolean class constructors and methods

System.out.println("===================================");
System.out.println("Boolean class Constructors and methods");
System.out.println("===================================");

//Boolean class constructors
Boolean boolean1 = new Boolean(true);
System.out.println(boolean1);

Boolean boolean2 = new Boolean("false");
System.out.println(boolean2);

Boolean boolean3 = new Boolean(false);
Boolean boolean4 = new Boolean(true);


//Boolean class methods
//1.
boolean number45 = boolean1.booleanValue();
System.out.println(number45);

//2.
Boolean number46 = Boolean.valueOf(boolean3);
System.out.println(number46);

//3.
Boolean number47 = Boolean.valueOf("true");
System.out.println(number47);

//4.
String number48 = Boolean.toString(boolean4);
System.out.println(number48);

//5.
int number49 = boolean1.hashCode();
System.out.println(number49);

//6.
int number50 = Boolean.hashCode(false);
System.out.println(number50);

//7.
boolean number51 = Boolean.getBoolean("true");
System.out.println(number51);

//8.
int number52 = boolean1.compareTo(boolean4);
System.out.println(number52);
if(number52==0){  
    System.out.println("Both values are equal");  
    }  
else if(number52>0){  
    System.out.println("boolean1 value is true");  
    }  
else{  
    System.out.println("boolean4 value is true");  
    }  

//9.
int number53 = Boolean.compare(boolean3,boolean4);
if(number53==0){  
    System.out.println("Both values are equal");  
    }  
else if(number53>0){  
    System.out.println("boolean3 value is true");  
    }  
else{  
    System.out.println("boolean4 value is true");  
    } 

//10.
boolean number54 = Boolean.logicalAnd(boolean1,boolean4);
System.out.println(number54);


//Long class constructors and methods
System.out.println("===================================");
System.out.println("Long class Constructors and methods");
System.out.println("===================================");

//long class constructors

Long long1 = new Long(2767988);
System.out.println(long1);

Long long2 = new Long("612090");
System.out.println(long2);

Long long3 = new Long(-12359877);
Long long4 = new Long(9736);


//long class methods
//1.
int number55 = Long.bitCount(long2);
System.out.println(number55);

//2.
byte number56 = long3.byteValue();
System.out.println(number56);

//3.
int number57 = Long.compare(long1,long4);
if(number57<0){                                           
	System.out.println(long1+" is less than "+long4);
}else if(number57==0){                                   
    System.out.println(long1+" is equal to "+long4);
}else{                                                  
	System.out.println(long1+" is greater than "+long4);
}

//4.
int number58 = long3.compareTo(long1);
System.out.println(number58);

//5.
long number59 = Long.decode("89709");
System.out.println(number59);

//6.
float number60 = long4.floatValue();
System.out.println(number60); 

/*long number60 = long4.floatValue();
System.out.println(number60);*/

//7.
long long6 = 98900000l;
int number62 = Long.numberOfTrailingZeros(long6);
System.out.println(number62);

//8.
long long5 = 98l;
int number61 = Long.numberOfLeadingZeros(long5);
System.out.println(number61);

//9.
long number63 = Long.reverse(long4);
System.out.println(number63);

//10.
long number64 = Long.parseLong("8793298378");
System.out.println(number64);
	
}
}