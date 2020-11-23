package Game;

public class Win implements Abominodo {
	   private Players players;

	   public Win(Players players){
	      this.players = players;
	   }

	   public void execute() {
	      players.win();
	   }
	}