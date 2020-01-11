package light.KitPvP;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Entrar implements Listener {
	
	@EventHandler
	private void pEntrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		e.setJoinMessage("§7[§a+§7] " + p.getDisplayName());
	}

}
