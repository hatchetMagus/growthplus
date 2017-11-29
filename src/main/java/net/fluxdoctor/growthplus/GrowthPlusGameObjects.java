package net.fluxdoctor.growthplus;

import cpw.mods.fml.common.registry.GameRegistry;
import net.fluxdoctor.growthplus.content.blocks.GrowthPlus_I;
import net.fluxdoctor.growthplus.content.tiles.TileGrowthPlus_I;
import net.fluxdoctor.growthplus.reference.refStrings;
import net.minecraft.block.material.Material;

public class GrowthPlusGameObjects
{

 public static GrowthPlus_I growthplus_I;


 public static void init()
 {
  //blocks
  GrowthPlus.logger.info(refStrings.LOGGER_INIT_BLOCKS);

  growthplus_I = new GrowthPlus_I(Material.rock, "growthplus_I");

  //registry - blocks
  GrowthPlus.logger.info(refStrings.LOGGER_REGISTER_BLOCKS);

  GameRegistry.registerBlock(growthplus_I, "growthplus_I");

  //registry - tile
  GrowthPlus.logger.info(refStrings.LOGGER_REGISTER_TILE);

  GameRegistry.registerTileEntity(TileGrowthPlus_I.class, "growthtile_I");




 }


}
