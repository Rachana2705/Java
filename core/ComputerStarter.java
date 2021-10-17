class ComputerStarter{

public static void main(String[] values){

Computer computer = new Computer();
computer.displayDetails();
computer.displayTotalPrice();
computer.displayTotalOfAllPrice();

Computer computer1 = new Computer();
computer1.brand = "Lenovo";
computer1.modelNo = "p123";
computer1.price = 40.f;
computer1.quantity = 5;
computer1.type = ComputerType.WORKSTATION;
computer1.displayDetails();
computer1.displayTotalPrice();
computer1.displayTotalOfAllPrice();

Computer computer2 = new Computer();
computer2.brand = "Dell Super";
computer2.modelNo = "d1243";
computer2.price = 35.f;
computer2.quantity = 8;
computer2.type = ComputerType.LAPTOP;
computer2.displayDetails();
computer2.displayTotalPrice();
computer2.displayTotalOfAllPrice();

Computer computer3 = new Computer();
computer3.brand = "thinkpad";
computer3.modelNo = "b782";
computer3.price = 25.f;
computer3.quantity = 15;
computer3.type = ComputerType.DESKTOP;
computer3.displayDetails();
computer3.displayTotalPrice();
computer3.displayTotalOfAllPrice();

Computer computer4 = new Computer();
computer4.brand = "HP";
computer4.modelNo = "f89";
computer4.price = 45.f;
computer4.quantity = 3;
computer4.type = ComputerType.MINICOMPUTER;
computer4.displayDetails();
computer4.displayTotalPrice();
computer4.displayTotalOfAllPrice();

Computer computer5 = new Computer();
computer5.brand = "Sony";
computer5.modelNo = "s812";
computer5.price = 48.f;
computer5.quantity = 12;
computer5.type = ComputerType.SUPERCOMPUTER;
computer5.displayDetails();
computer5.displayTotalPrice();
computer5.displayTotalOfAllPrice();
}
}