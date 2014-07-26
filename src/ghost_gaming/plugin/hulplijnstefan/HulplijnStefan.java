package ghost_gaming.plugin.hulplijnstefan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**This plugin is made for MartialCraft (play.martialcraft.net)
 * 
 * Licensed under the Apache License, Version 2.0
 * 
 * @author Matthbo & ghost_gaming
 * YAY!
 */
public class HulplijnStefan extends JavaPlugin {
	
	public static final Object pluginMSG = ChatColor.AQUA + "[Hulplijn Stefan] " + ChatColor.RESET;

	@Override
	public void onEnable() {
		
		getLogger().info("Hulplijn Stefan has been Activated");
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Hulplijn is now Closed! we'll be back Tomorrow");
	}
	
	public void logToFile(String msg){
		try{
			File dataFolder = getDataFolder();
			if(!dataFolder.exists()) dataFolder.mkdir();
		
		File saveTo = new File(getDataFolder(), "HelpList.txt");
		if(!saveTo.exists()) saveTo.createNewFile();
		FileWriter fw = new FileWriter(saveTo, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(msg);
		pw.flush();
		pw.close();
		}catch(IOException e){e.printStackTrace();}
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("stefan")) {
			if(sender instanceof Player){
				Player player = (Player)sender;
				if(args.length > 1){
					
					StringBuilder str = new StringBuilder();
	                for (int i = 0; i < args.length; i++) {
	                        str.append(args[i] + " ");
	                }
	                String bc = str.toString();
	                //player.sendMessage(player.getName()+ ": " + bc);
	                
	                logToFile(player.getName()+ ": " + bc);
	                player.sendMessage(pluginMSG + "Thank you " + player.getName() + ChatColor.DARK_AQUA +", Your question wil be awnserd as soon as possible!");
	                return true;
				}else{
					player.sendMessage(pluginMSG + "" + ChatColor.RED + "Usage /stefan <args>");
					return true;
				}
			}else{
				sender.sendMessage(pluginMSG + "" + ChatColor.RED + "Wat denk je zelf");
				sender.sendMessage("matthbo was here!");
				return true;
			}
		}
		if(cmd.getName().equalsIgnoreCase("helplist")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				
				//hier komt interactie met de player!
				
				return true;
			}else{
				sender.sendMessage(pluginMSG + "" + ChatColor.RED + "Player Command Only!");
				return true;
			}
		}
		return false;
		
		/*if(cmd.getName().equalsIgnoreCase("test") && sender instanceof Player){
			if(args.length > 1){
				
				StringBuilder str = new StringBuilder();
                for (int i = 0; i < args.length; i++) {
                        str.append(args[i] + " ");
                }
                String bc = str.toString();
                player.sendMessage(player.getName()+ ": " + bc);
                
                logToFile(player.getName()+ ": " + bc);
                player.sendMessage(pluginMSG + "Thank you " + player.getName() + ", Your question wil be awnserd as soon as possible!");
                return true;
			}
			return true;
			
		}
		
		return false;*/
	}
}
