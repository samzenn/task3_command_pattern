package Game;

public class RunAbominodo {
   public static void main(String[] args) {
      Players players = new Players();

      Win winningplayers = new Win(players);
      Defeat defeatplayers = new Defeat(players);

      ListofPlayers pl = new ListofPlayers();
      pl.Gamestatus(winningplayers);
      pl.Gamestatus(defeatplayers);

      pl.gamestatus();
   }

}