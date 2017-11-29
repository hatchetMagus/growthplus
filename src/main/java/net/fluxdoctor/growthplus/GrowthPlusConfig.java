package net.fluxdoctor.growthplus;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.fluxdoctor.growthplus.reference.configDefaults;
import net.fluxdoctor.growthplus.reference.refStrings;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class GrowthPlusConfig
{

 public static Configuration config;

 public static void init(File configFile)
 {

  config = new Configuration(configFile);
  try
  {
   config.load();
   sync();
  }
  catch(Exception e)
  {


  }
  finally
  {
   config.save();

  }
 }

 public static void sync()
 {
  //Config File Controlled Fields
  configDefaults.DEFAULT_GROWTHPLUS_I_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_I, configDefaults.DEFAULT_GROWTHPLUS_I_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_II_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_II, configDefaults.DEFAULT_GROWTHPLUS_II_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_III_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_III, configDefaults.DEFAULT_GROWTHPLUS_III_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_IV_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_IV, configDefaults.DEFAULT_GROWTHPLUS_IV_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_V_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_V, configDefaults.DEFAULT_GROWTHPLUS_V_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_VI_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_VI, configDefaults.DEFAULT_GROWTHPLUS_VI_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_VII_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_VII, configDefaults.DEFAULT_GROWTHPLUS_VII_COOLDOWN).getInt();
  configDefaults.DEFAULT_GROWTHPLUS_CREATIVE_COOLDOWN = config.get(refStrings.CONFIG_GROUP_COOLDOWN, refStrings.CONFIG_PROP_GROWTH_CREATIVE, configDefaults.DEFAULT_GROWTHPLUS_CREATIVE_COOLDOWN).getInt();






  //ClientSide Only Config Options
  Side side = FMLCommonHandler.instance().getSide();
  if(side == Side.CLIENT)
  {

  }

  //save config
  config.save();
 }

 public static void set(String category, String prop, String newVal)
 {
  config.load();
  if(config.getCategoryNames().contains(category))
  {
   if(config.getCategory(category).containsKey(prop))
   {
    config.getCategory(category).get(prop).set(newVal);
   }
  }
  config.save();
 }

}
