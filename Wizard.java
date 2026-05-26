public class Wizard
{
  String name;
  int hp;
  String[] spells;

  public Wizard(String name, int hp, String[] spells)
  {
    this.name = name;
    this.hp = hp;
    this.spells = spells;
  }
  public void takeDamage(int damage)
  {
    hp = hp-damage;
  }
  public boolean isAlive()
  {
    if(hp > 0)
    {
      return hp;
    }
  }
  public void printStatus()
  {
    System.out.println(name + "| HP: " +hp);
  }
}
