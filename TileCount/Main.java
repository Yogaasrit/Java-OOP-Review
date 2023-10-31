package TileCount;

class Tile{
  int tileLength;
  Tile(int tileLength)
  {
    this.tileLength = tileLength;
  }
}
class Floor{
  int floorLength;
  int floorWidth;
  Floor(int floorLength,int floorWidth)
  {
    this.floorLength = floorLength;
    this.floorWidth = floorWidth;
  }
  public void totalTile(Tile T)
  {
    int areaOfTile = T.tileLength * T.tileLength;
    int areaOfFloor = this.floorLength * this.floorWidth;
    int totalTileCount = areaOfFloor/areaOfTile;
    System.out.println("The total tile needed : "+totalTileCount);
  }
}
public class Main 
{
  public static void main(String[] args)
  {
    int tileLength = 5;
    int floorLength = 30;
    int floorWidth = 20;
    Tile tile = new Tile(tileLength);
    Floor floor = new Floor(floorLength,floorWidth);
    floor.totalTile(tile);
  }
}
