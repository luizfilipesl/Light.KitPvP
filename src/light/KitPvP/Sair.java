package light.KitPvP;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Sair implements Listener {
		
		@EventHandler
		private void pSair(PlayerQuitEvent e) {
			Player p = e.getPlayer();
			
			e.setQuitMessage("§7[§4c-§7] " + p.getDisplayName());
		}
}
