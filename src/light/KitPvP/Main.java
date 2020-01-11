package light.KitPvP;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
		
		public void onEnable() {
			Bukkit.getConsoleSender().sendMessage("§6Kit PvP --- Iniciado!");
		}
		
		public void onDisable() {
			Bukkit.getConsoleSender().sendMessage("§Kit PvP --- Encerrado!");
		}
}
