public class MarioKartPlayer
{
    private String playerName;
    private String character;
    private int speed;
    
    
    
    //make the constructor
    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public String getCharacter(){
        return character;
    }
    
    public void setCharacter(String character){
        this.character = character;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public void performPeachBomb()
    {
        System.out.println(playerName + " Does the Peach Bomb Boost! She deals 2 times damage now.");
    }
    
    public void performSpeedBoost()
    {
        System.out.println(playerName + " Uses the speed boost! " + playerName + " Speed is now two times faster.");
    }
    
    //end of class
}
