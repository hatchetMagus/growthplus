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


 //LOGGER STRINGS
 public static final String LOGGER_PRE_INIT = "Entered PRE INIT phase... Please Wait... Wrecking your game...";
 public static final String LOGGER_INIT = "Entered INIT phase... Please Wait... Deleting your world";
 public static final String LOGGER_POST_INIT = "Entered POST INIT phase... Please Wait... Derping all the code...";

}
