
import java.util.Scanner;


public class Player {
    private int damage,healthy,money,rhealthy;
    private String name,cName;
    Inventory inv;
    Scanner scan = new Scanner(System.in);
    
    public Player(String name){
    
        this.name = name;
        this.inv = new Inventory();
        
    }
    
    public void selectCha(){
        switch(chaMenu()){
            case 1:
                initPlayer("Samurai", 5 , 21 , 115);
                break;
            case 2:
                initPlayer("Archer", 7 , 18 , 20);
                break;
            case 3:
                initPlayer("Knight", 8 , 24 , 5);
                break;
            default:
                setcName("Samurai");
                setDamage(5);
                setHealthy(21);
                setMoney(15);
                //initPlayer("Samurai", 5 , 21 , 15);
                }
        System.out.println("Character : " + getcName() + "\t damage : " +getDamage()+  "\t healthy : " +getHealthy()+ "\t money : " + getMoney());
        
    }
    
    public int chaMenu(){
        System.out.println("Please select character:");
        System.out.println("1-Samurai \t damage : 5 \t healthy : 21 \t money : 15");
        System.out.println("2-Archer \t damage : 8 \t healthy : 24 \t money : 5");
        System.out.println("3-Knight \t damage : 7 \t healthy : 18 \t money : 20");
        System.out.println("Your choice : ");
        int chaID = scan.nextInt();
        
        
            while (chaID < 1 || chaID > 3) {                
                System.out.println("Please select currently numbers : ");
                chaID = scan.nextInt();
            }
        
        return chaID;
    }
    
    public int getTotalDamage(){
        return this.getDamage() + this.getInv().getDamage();
    }

    //Sırsıyla selecCha dan alınan veriler buradan init edilerek set edilir.
    public void initPlayer(String cName, int dmg, int hlthy, int mny)
    {
    
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setRhealthy(hlthy);
        
    }    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getRhealthy() {
        return rhealthy;
    }

    public void setRhealthy(int rhealthy) {
        this.rhealthy = rhealthy;
    }
  
    
     
}
