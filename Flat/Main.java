package Flat;
class OneBHK{
  String roomArea;
  String hallArea;
  int price;
  OneBHK(String roomArea, String hallArea, int price) {
    this.roomArea = roomArea;
    this.hallArea = hallArea;
    this.price = price;
  }
  OneBHK(){
  }
  public void show(OneBHK oneBHKHouses[]){
    for(OneBHK house : oneBHKHouses){
      System.out.println("Room Area : "+ house.roomArea + " Hall Area : " + house.hallArea + " Price: " + house.price);
    }
  }
}

class TwoBHK extends OneBHK{
  String roomArea;
  String hallArea;
  int price;
  TwoBHK(String roomArea, String hallArea, int price) {
    this.roomArea = roomArea;
    this.hallArea = hallArea;
    this.price = price;
  }
  TwoBHK(){
  }
  public void show(TwoBHK TwoBHKHouses[]){
    for(TwoBHK house : TwoBHKHouses){
      System.out.println("Room Area : "+ house.roomArea + " Hall Area : " + house.hallArea + " Price: " + house.price);
    }
  }
}

public class Main {
  public static void main(String[] args){
    OneBHK obj1 = new OneBHK();
    OneBHK house1 =  new OneBHK("120 sq.ft","240 sq.ft",10000);
    OneBHK house2 =  new OneBHK("130 sq.ft","210 sq.ft",11900);
    OneBHK house3 =  new OneBHK("120 sq.ft","190 sq.ft",9500);

    OneBHK oneBHKHouses[] = {house1,house2,house3};
    obj1.show(oneBHKHouses); 
    // show(oneBHKHouses);
    
    TwoBHK obj2 = new TwoBHK();
    TwoBHK house4 =  new TwoBHK("390 sq.ft","240 sq.ft",20000);
    TwoBHK house5 =  new TwoBHK("350 sq.ft","280 sq.ft",22500);
    TwoBHK house6 =  new TwoBHK("300 sq.ft","250 sq.ft",19900);
    TwoBHK twoBHKHouses[] = {house4,house5,house6};
    obj2.show(twoBHKHouses);
  }   
}

// Room Area : 120 sq.ft Hall Area : 240 sq.ft Price: 10000
// Room Area : 130 sq.ft Hall Area : 210 sq.ft Price: 11900
// Room Area : 120 sq.ft Hall Area : 190 sq.ft Price: 9500
// Room Area : 390 sq.ft Hall Area : 240 sq.ft Price: 20000
// Room Area : 350 sq.ft Hall Area : 280 sq.ft Price: 22500
// Room Area : 300 sq.ft Hall Area : 250 sq.ft Price: 19900

