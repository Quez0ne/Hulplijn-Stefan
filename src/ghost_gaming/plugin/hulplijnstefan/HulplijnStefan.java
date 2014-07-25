package ghost_gaming.plugin.hulplijnstefan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HulplijnStefan extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Hulplijn Stefan has been Activated");
	}
	
	@Override
	public void onDisable() {
	
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		
		return false;
	}

}
