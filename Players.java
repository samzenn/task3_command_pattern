package Game;

public class Players {
	 private String name = "Abominodo";
	   private int won = 10;
	   private int fail = 40;

	   
	   public void win(){
	      System.out.println("Game [ Name: "+name+", no of : " + won +" ] players win the game");
	   }
	   public void fail(){
	      System.out.println("Game [ Name: "+name+", no of: " + fail +" ] players defeat the game");
	   }
}
