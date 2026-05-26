public class House
{
  String name;
  String[] spells;

  public House(String name, String[] spells)
  {
    this.name = name;
    this.spells = spells;
  }
  public void printInfo()
  {
    System.out.println("House: " +name);
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
