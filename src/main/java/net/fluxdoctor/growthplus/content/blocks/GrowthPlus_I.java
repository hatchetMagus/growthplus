package net.fluxdoctor.growthplus.content.blocks;


import net.fluxdoctor.growthplus.content.tiles.TileGrowthPlus_I;
import net.fluxdoctor.growthplus.reference.refStrings;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GrowthPlus_I extends GrowthPlusBlockBase implements ITileEntityProvider
{

 private int cooldown;

 public GrowthPlus_I(Material material, String name)
 {
  super(material);
  this.setBlockName(name);
  this.setBlockTextureName(refStrings.prependModId(name));
  this.setHardness(1.0F);
  this.setResistance(1.0F);
  this.setStepSound(soundTypeStone);

 }

 @Override
 public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
  return new TileGrowthPlus_I();
 }
}
