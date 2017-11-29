package net.fluxdoctor.growthplus.content.blocks;


import net.fluxdoctor.growthplus.GrowthPlus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GrowthPlusBlockBase extends Block
{

 public GrowthPlusBlockBase(Material material)
 {
  super(material);
  this.setCreativeTab(GrowthPlus.tabGrowthPlus);
 }

}
