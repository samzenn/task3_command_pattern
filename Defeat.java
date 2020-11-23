package Game;

public class Defeat implements Abominodo {
	   private Players players;

	   public Defeat(Players players){
	      this.players = players;
	   }

	   public void execute() {
	      players.fail();
	   }
	}
