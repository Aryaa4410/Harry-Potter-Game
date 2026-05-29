public class Wizard
{
  String wizardName;
  int hp;
  String[] spells;

  public Wizard(String wizardName, int hp, String[] spells)
  {
    this.wizardName = wizardName;
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
      return true;
    }
    else{
      return false;
    }
  }
  public void printStatus()
  {
    System.out.println(name + "| HP: " +hp);
  }
}
