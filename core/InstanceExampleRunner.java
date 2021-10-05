class InstanceExampleRunner{
public static void main(String[] args){
Internet internet = new Internet();
System.out.println(internet.provider);
System.out.println(internet.speed);

Deodrant deodrant = new Deodrant();
System.out.println(deodrant.brand);
System.out.println(deodrant.price);
System.out.println(deodrant.quantity);
System.out.println(deodrant.color);

PowerBank powerbank = new PowerBank();
System.out.println(powerbank.capacity);
System.out.println(powerbank.company);
System.out.println(powerbank.price);
System.out.println(powerbank.usage);

Wallet wallet = new Wallet();
System.out.println(wallet.price);
System.out.println(wallet.color);
System.out.println(wallet.countrymade);

System.out.println("Default values of instance variables printed");
}
}