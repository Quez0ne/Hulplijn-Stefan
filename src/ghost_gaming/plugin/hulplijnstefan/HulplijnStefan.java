package ghost_gaming.plugin.hulplijnstefan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HulplijnStefan extends JavaPlugin {
	
	public static final String pluginMSG = "[HulplijnStefan] ";

	@Override
	public void onEnable() {
		getLogger().info("Hulplijn Stefan has been Activated");
	}
	
	@Override
	public void onDisable() {
	
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if (cmd.getName().equalsIgnoreCase("stefan")) {
			if(sender instanceof Player){
				Player player = (Player)sender;
				
				player.sendMessage(pluginMSG + "Your question wil be awnserd as soon as possible!");
				
				return true;
			}else{
				sender.sendMessage(pluginMSG + "Player Command Only!");
				return true;
			}
			
		}
		
		return false;
	}

}
