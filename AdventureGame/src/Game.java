
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    
    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! 2 ur Adveture");
        System.out.print("Let's start with ur name? Type your name : ");
        String playerName = scan.nextLine();
        player = new Player(playerName); // player classının playerName fonksiyonunu gönderiyor buradan.
        player.selectCha(); //player classındaki selectCha isimli fonksiyonu çağırıyor.
        start();
    }
    public void start(){
        while (true) {            //yasamaya devam ettikce calısacak.
            System.out.println();
            System.out.println("========================");
            System.out.println();
            System.out.println("Select place ur next step : ");
            System.out.println("1. Safe Hause --> Your own safe place, no enemy !");
            System.out.println("2. Cave --> You may come across zombies!");
            System.out.println("3. Wooden --> ");
            System.out.println("4. River --> ");
            System.out.println("5. Shop --> You can buy items in here.");
            System.out.print("Where do you wanna go : ");
            int selLoc = scan.nextInt();
            while (selLoc < 0 || selLoc > 5) {            
                System.out.print("Pleace select currently places :");
                selLoc = scan.nextInt();
            }
            switch(selLoc){ //if selLoc is numb. of that 5 of them it will called.
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;                
                default:
                    location = new SafeHouse(player);
            }
            if(!location.getLocation()){//yasaıyorsa true dondurur yani buraya girmez ! dan dolayı false doner.
                System.out.println("Game Over!!!");
                break;
            }
        }
    }
}
