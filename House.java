public class House
{
  String houseName;
  String[] spells;

  public House(String houseName, String[] spells)
  {
    this.houseName = houseName;
    this.spells = spells;
  }
  public void printInfo()
  {
    System.out.println("House: " + houseName);
    System.out.println("Spells: ");
    for(int i=0; i<spells.length; i++)
      {
        System.out.print(spells[i]);
        if(i<spells.length-1)
        {
          System.out.print(", ");
        }
      }
    System.out.println();
  }
}
