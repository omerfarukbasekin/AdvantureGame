/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ToolStore extends NormalLoc {

    ToolStore(Player player) {
        super(player, "Shop");
    }
    public boolean getLocation(){
    
        System.out.println("Money " + player.getMoney());
        System.out.println("1. Guns");
        System.out.println("2. Armors");
        System.out.println("3. Back");
        System.out.print("Your Selection : ");
        int selTool = scan.nextInt();
        if(selTool > 4 || selTool < 1){
            System.out.println("Please select currently one : ");
            selTool = scan.nextInt();
        }  
        int selItemID;
        switch(selTool){
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            case 3:
                break;
            default:
                break;
            
            
        }
        
        
        return true;
        
    
    }
    public int armorMenu(){
        System.out.println("1. Light \t <Money : 15 - Damege : 1> ");
        System.out.println("2. Medium \t <Money : 25 - Damege : 3> ");
        System.out.println("3. Heavy \t <Money : 40 - Damege : 5> ");
        System.out.println("4. Exit");
        System.out.println("Your selection : ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }
    public void buyArmor(int ItemID){
        int defance = 0 , price = 0;
        String armorName = null;
        switch(ItemID){
            case 1:
                defance = 1;
                armorName = "Light Armor";
                price = 15;
                break;
            case 2:
                defance = 3;
                armorName = "Medium Armor";
                price = 25;
                break;
            case 3:    
                defance = 5;
                armorName = "Heavy Armor";
                price = 40;
                break;
            case 4:    
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Unseccesful");
                break;
        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInv().setArmor(defance);
                player.getInv().setWeaponName(armorName);
                 String space = " ";
                 for(int i = 0; i < armorName.length(); i++)
                    {
                      space = space + " ";
                    }
        System.out.println(armorName + " purched\t Defance : " + player.getInv().getArmor() + 
                "\n "+ space +"         Money before : " + player.getMoney() + " after : "+ (player.getMoney() - price));
        System.out.println();
        player.setMoney(player.getMoney() - price);
        
            }
            else{
                System.out.println("Not enough money");
            }
        }
    }
    
    public int weaponMenu(){
    
        System.out.println("1. Pistol \t <Money : 25 - Damege : 2> ");
        System.out.println("2. Sword \t <Money : 35 - Damege : 3> ");
        System.out.println("3. Rifle \t <Money : 45 - Damege : 7> ");
        System.out.println("4. Exit");
        System.out.println("Your selection : ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    
    }
    
    public void buyWeapon(int ItemID){
    
        int damage = 0,price = 0;
        String weaponName = null;
        switch (ItemID){
        
            case 1:
                damage = 2;
                weaponName = "Pistol";
                price = 25;
                break;
            case 2:
                damage = 3;
                weaponName = "Sword";
                price = 35;
                break;
            case 3:
                damage = 7;
                weaponName = "Rifle";
                price = 45;
                break;
            case 4: 
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Unsuccessful");
                break;
        }
        if (price > 0) {
             if(player.getMoney() >= price ){
                 player.getInv().setDamage(damage);
                 player.getInv().setWeaponName(weaponName);
                 String space = " ";
                 for(int i = 0; i < weaponName.length(); i++)
                    {
                      space = space + " ";
                    }
        System.out.println(weaponName + " purched\t Damage before : " + player.getDamage() + " after : " + player.getTotalDamage()
                +"\n "+ space +"         Money before : " + player.getMoney() + " after : "+ (player.getMoney() - price));
        System.out.println();
        player.setMoney(player.getMoney() - price);
        
                }
        else 
        {
            System.out.println("Not enough money");
        }
        }
        }
        
    
    
    
}
