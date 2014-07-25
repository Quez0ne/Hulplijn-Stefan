package ghost_gaming.plugin.hulplijnstefan;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HulplijnStefan extends JavaPlugin {
	
	public static final Object pluginMSG = ChatColor.AQUA + "[Hulplijn Stefan] " + ChatColor.RESET;

	@Override
	public void onEnable() {
		getLogger().info("Hulplijn Stefan has been Activated");
	}
	
	@Override
	public void onDisable() {
	
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("stefan")) {
			if(sender instanceof Player){
				player.sendMessage(pluginMSG + "Your question wil be awnserd as soon as possible!");
				
				return true;
			}else{
				sender.sendMessage(pluginMSG + "" + ChatColor.RED + "Player Command Only!");
				return true;
			}
		
		}else if(cmd.getName().equalsIgnoreCase("test") && sender instanceof Player){
			if(args.length > 1){
				
				StringBuilder str = new StringBuilder();
                for (int i = 0; i < args.length; i++) {
                        str.append(args[i] + " ");
                }
                String bc = str.toString();
                player.sendMessage(bc);
				
			}
			
			return true;
		}
		
		return false;
	}

}
