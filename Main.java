import java.util.Scanner;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws Exception
  {
    //read the file
    Scanner fileReader = new Scanner(new File("houses.txt"));
    House[] houses = new House[4];
    int index = 0;
    while(fileReader.hasNextLine())
    {
      String line = fileReader.nextLine();
      String[] parts = line.split(",");
      String[] spells = {parts[1], parts[2], parts[3]};
      houses[index] = new House(parts[0], spells);
      index++;
    }
    //sorting quiz
    Scanner userInput = new Scanner(System.in);
    int[] scores = {0,0,0,0};
    System.out.println("Welcome to Hogwarts! Answer the quiz and find your house.");
    System.out.println("Question 1: What do you value? 1-Bravery 2-Ambition 3-Intelligence 4-Loyalty");
    scores[userInput.nextInt()-1]++;
    System.out.println("Question 2: Pick a school subject: 1-DADA 2-Potions 3-Charms 4-Herbology");
    scores[userInput.nextInt()-1]++;

    //find winning house
    int best = 0;
    int bestIndex = 0;
    for (int i = 0; i < 4; i++) 
    {
      if (scores[i] > best) 
      {
        best = scores[i];
        bestIndex = i;
      }
    }
    House myHouse = houses[bestIndex];
    System.out.println("You are in: " + myHouse.houseName);

    //set up duel
    System.out.println("Enter your name: ");
    userInput.nextLine();
    String name = userInput.nextLine();
    
    House enemyHouse = houses[(bestIndex + 1) % 4];
    Wizard player = new Wizard(name, 100, myHouse.spells);
    Wizard enemy = new Wizard("Dark Wizard", 100, enemyHouse.spells);

    //duel loop
    System.out.println("DUEL START: " + player.wizardName + " vs " + enemy.wizardName);

    while (player.isAlive() && enemy.isAlive()) 
    {
      System.out.println(player.wizardName + " HP: " + player.hp + " | " + enemy.wizardName + " HP: " + enemy.hp);
      System.out.println("Pick spell: 1-" + player.spells[0] + " 2-" + player.spells[1] + " 3-" + player.spells[2]);
      int choice = userInput.nextInt();
      int myDamage = (int)(Math.random() * 20) + 10;
      enemy.hp = enemy.hp - myDamage;
      System.out.println("You cast " + player.spells[choice - 1] + " for " + myDamage + " damage!");
      if (enemy.isAlive()) 
      {
        int enemyDamage = (int)(Math.random() * 20) + 10;
        player.hp = player.hp - enemyDamage;
        System.out.println("Enemy cast " + enemy.spells[(int)(Math.random() * 3)] + " for " + enemyDamage + " damage!");
      }
    }

    //who won
    if (player.isAlive()) 
    {
      System.out.println("YOU WIN!!");
    }
    else 
    {
      System.out.println("YOU LOSE!!");
    }
  }
}






