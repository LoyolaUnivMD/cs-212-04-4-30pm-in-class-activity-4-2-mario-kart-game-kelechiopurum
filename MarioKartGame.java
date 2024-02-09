public class MarioKartGame{
    public static void main(String[] args){
        MarioKartPlayer bowser = new MarioKartPlayer("Player One", "Bowser", 100 );
        
        //special boost for Bowser
	    System.out.println("Player Name is: " + bowser.getPlayerName());
	    System.out.println("Character is: " + bowser.getCharacter());
	    System.out.println("speed is " + bowser.getSpeed());
	    bowser.performSpeedBoost();
	    System.out.println(); //For Space
        
        MarioKartPlayer peach = new MarioKartPlayer("Player Two", "Princess Peach", 1000 );
        
        //special boost for Princess Peach
	    System.out.println("Player Name is: " + peach.getPlayerName());
	    System.out.println("Character is: " + peach.getCharacter());
	    System.out.println("speed is " + peach.getSpeed());
	    peach.performPeachBomb();
	    System.out.println(); //For Space
    
    
        }    
    }
