import java.util.Scanner;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws Exception
  {
    Scanner fileReader = new Scanner(new File("houses.txt));
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
    Scanner keyboard = new Scanner(System.in);
    int[] scores = {0,0,0,0};
    System.out.println("Welcome to Hogwarts! Answer the quiz and find your house.")
    System.out.println("Question 1: What do you value? 1-Bravery 2-Ambition 3-Intelligence 4-Loyalty");
    scores[keyboard.nextInt()-1]++;
    System.out.println("Question 2: Pick a school subject: 1-DADA 2-Potions 3-Charms 4-Herbology");
    scores[keyboard.nextInt()-1]++;
    
        
