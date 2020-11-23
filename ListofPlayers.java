package Game;

import java.util.ArrayList;
import java.util.List;

   public class ListofPlayers {
   private List<Abominodo> PlayerList = new ArrayList<Abominodo>(); 

   public void Gamestatus(Abominodo game){
      PlayerList.add(game);		
   }

   public void gamestatus(){
   
      for (Abominodo gamestatus : PlayerList) {
         gamestatus.execute();
      }
      PlayerList.clear();
   }
}