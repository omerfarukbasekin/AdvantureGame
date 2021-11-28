
public class SafeHouse extends NormalLoc {
    
    SafeHouse(Player player) {
        super(player," Safe House");
    }
    
    public boolean getLocation() {
      
        player.setHealthy(player.getRhealthy());
        System.out.println("healing regenerate");
        System.out.println("Here is Safe House");
        
        return true;
    
    }
    
    
    
}
