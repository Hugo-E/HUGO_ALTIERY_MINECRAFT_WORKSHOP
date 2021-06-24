package fr.minecraftXPhub.firstPlugin;
import org.bukkit.plugin.java.JavaPlugin ;

public class Main extends JavaPlugin {
	@Override
	public void onEnable () 
	{
		System.out.println( " Le plugin a bien demmare ! " );
	}
	@Override
	public void onDisable() 
	{
		System.out.println( " Le plugin c ' est bien etain ! " );
	}
}