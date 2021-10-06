class TrainRunner{
public static void main(String[] args){
Train train = new Train();
train.traintype = "Shatabdi Express";
train.numofstops = 3;
System.out.println(train.traintype);
System.out.println(train.numofcompartments);
System.out.println(train.seatsincompartment);
System.out.println(train.priceofticket);
System.out.println(train.numofstops);
}
}