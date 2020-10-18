package musicblox.modifactions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Modifactions.MODID, name = Modifactions.NAME,useMetadata = true,  version = Modifactions.VERSION)
public class Modifactions {

	public static final String MODID = "modifactions";
	public static final String NAME = "Modifactions";
	public static final String VERSION = "0.1";
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
	
    }
	
}
