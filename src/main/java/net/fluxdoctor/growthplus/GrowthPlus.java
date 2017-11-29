package net.fluxdoctor.growthplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.fluxdoctor.growthplus.proxy.IProxy;
import net.fluxdoctor.growthplus.reference.refStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = refStrings.MOD_ID, name = refStrings.MOD_NAME, version = refStrings.MOD_VERSION)
public class GrowthPlus
{

 @Instance(refStrings.MOD_ID)
 public GrowthPlus instance;

 @SidedProxy(clientSide = "net.fluxdoctor.growthplus.proxy.ClientProxy", serverSide = "net.fluxdoctor.growthplus.proxy.ServerProxy")
 public static IProxy proxy;

 //Logger Init
 public static Logger logger = LogManager.getLogger(refStrings.MOD_NAME);

 //Creative Tab
 public static CreativeTabs tabGrowthPlus = new CreativeTabs(refStrings.CREATIVETAB) {
  @Override
  public Item getTabIconItem() {
   return Items.wheat;
  }
 };

 @EventHandler
 public void preInit(FMLPreInitializationEvent event)
 {
  logger.info(refStrings.LOGGER_PRE_INIT);
  GrowthPlusConfig.init(new File(event.getModConfigurationDirectory(), "/fluxdoctor/growthplus.cfg"));



  proxy.preInit(event);
 }

 @EventHandler
 public void init(FMLInitializationEvent event)
 {
  logger.info(refStrings.LOGGER_INIT);

  proxy.init(event);
 }

 @EventHandler
 public void postInit(FMLPostInitializationEvent event)
 {
  logger.info(refStrings.LOGGER_POST_INIT);

  proxy.postInit(event);
 }


}
