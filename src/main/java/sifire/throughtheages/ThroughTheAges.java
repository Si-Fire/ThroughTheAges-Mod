package sifire.throughtheages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;

@Mod(modid = ThroughTheAges.MODID, version = ThroughTheAges.VERSION, name = ThroughTheAges.NAME)
public class ThroughTheAges
{
    public static final String MODID = "sifire_throughtheages";
    public static final String VERSION = "1.0.0.1";
    public static final String NAME = "Through The Ages";
    
    @SidedProxy(clientSide = "proxy.ClientProxy", serverSide = "proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static ThroughTheAges instance;
    
    public static CreativeTabCore tabCore;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	tabCore = new CreativeTabCore(CreativeTabs.getNextID(), "tab_core");
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
       
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	proxy.postInit(event);
    }
}
