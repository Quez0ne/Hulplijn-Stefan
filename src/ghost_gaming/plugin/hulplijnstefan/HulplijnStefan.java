package ghost_gaming.plugin.hulplijnstefan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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
	
		if (cmd.getName().equalsIgnoreCase("stefan") && sender instanceof Player) {
			
			Player player = (Player)sender;
			
			player.sendMessage("Your question wil be awnserd as soon as possible");
			
			return true;
		}
		
		return false;
	}

}
