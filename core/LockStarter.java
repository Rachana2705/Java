class LockStarter{
public static void main(String[] values){
Lock lock = new Lock();
lock.open();
lock.close();
System.out.println("Exit main method");
}
}