package net.fluxdoctor.growthplus.reference;

public class refStrings
{

 public static final String MOD_ID = "growthplus";
 public static final String MOD_NAME = "GrowthPlus";
 public static final String MOD_VERSION = "0.0.1a";

 public static String prependModId(String id)
 {
  return MOD_ID + ":" + id;
 }
 //misc
 public static final String CREATIVETAB = "tab" + MOD_NAME;

 //LOGGER STRINGS
 public static final String LOGGER_PRE_INIT = "Entered PRE INIT phase... Please Wait... Wrecking your game...";
 public static final String LOGGER_INIT = "Entered INIT phase... Please Wait... Deleting your world";
 public static final String LOGGER_POST_INIT = "Entered POST INIT phase... Please Wait... Derping all the code...";

 public static final String LOGGER_INIT_BLOCKS = "Initializing Mod Blocks... Please Wait... Oops... Hope this doesn't crash!";
 public static final String LOGGER_REGISTER_BLOCKS = "Initializing GameRegistry:Blocks... Please Wait... This one doesn't have papers...";
 public static final String LOGGER_REGISTER_TILE = "Initializing GameRegistry:Tiles... Please Wait... Yes... I made lots of logger stuff...";

 public static final String LOGGER_TILE_ERROR_BAD_LOOP = "ERROR:: SHOULD NOT BE IN THIS LOOP";

 //Config Strings
 public static final String CONFIG_GROUP_COOLDOWN = "GrowthPlus Cooldown Settings - Set In Game Tics (20 = 1 second)";
 public static final String CONFIG_PROP_GROWTH_I = "GrowthPlus I Cooldown";
 public static final String CONFIG_PROP_GROWTH_II = "GrowthPlus II Cooldown";
 public static final String CONFIG_PROP_GROWTH_III = "GrowthPlus III Cooldown";
 public static final String CONFIG_PROP_GROWTH_IV = "GrowthPlus IV Cooldown";
 public static final String CONFIG_PROP_GROWTH_V = "GrowthPlus V Cooldown";
 public static final String CONFIG_PROP_GROWTH_VI = "GrowthPlus VI Cooldown";
 public static final String CONFIG_PROP_GROWTH_VII = "GrowthPlus VII Cooldown";
 public static final String CONFIG_PROP_GROWTH_CREATIVE = "Creative GrowthPlus Cooldown";
}
