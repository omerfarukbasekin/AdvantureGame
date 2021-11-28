
public abstract class BattleLoc extends Location{
   protected Obstacle obstacle;
  
    BattleLoc(Player player,String name,Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }
    public boolean getLocation(){
        int obsCount = obstacle.count();
        System.out.println("Now you in " + this.getName());
        System.out.println("Becarefull!! There are/is " 
         + obsCount +" "+ obstacle.getName() + "s here right now.");
        System.out.println("<F>ight or <R>un");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if(selCase.equals("F")){
            if(combat(obsCount)){
                System.out.println("All enemies destroyed in " +this.getName()+ " area.");
                return true;
            }
            else{
                System.out.println("Wasted!! You Died");
                return false;
            }
        }
        return true;
    }
    public boolean combat(int obsCount){
            playerStats();       
        for(int i = 0 ; i < obsCount; i++){

            enemyStats();
                  
        }
        return true;
    }
    public void playerStats(){
        System.out.println("Player Values : \n---------------");
        System.out.println("healthy : "+player.getHealthy());
        System.out.println("damage : "+player.getTotalDamage());
        System.out.println("money : "+player.getMoney());
        if(player.getInv().getDamage() > 0){
            System.out.println("weapon : "+ player.getInv().getWeaponName());
        }
        if(player.getInv().getArmor() > 0){
            System.out.println("armor : "+player.getInv().getArmorName());
        }
        
    }
    public void enemyStats(){
        System.out.println("\n"+ obstacle.getName()+"'s values\n ----------------");
        System.out.println("health : " + obstacle.getHealth());
        System.out.println("damage : "+ obstacle.getDamage());
        System.out.println("award : " + obstacle.getAward());
    }
    
}
