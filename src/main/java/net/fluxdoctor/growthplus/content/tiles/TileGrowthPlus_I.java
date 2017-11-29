package net.fluxdoctor.growthplus.content.tiles;

import net.fluxdoctor.growthplus.GrowthPlus;
import net.fluxdoctor.growthplus.reference.configDefaults;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class TileGrowthPlus_I extends TileEntity {

 public TileGrowthPlus_I()
 {

 }

 @Override
 public void updateEntity()
 {
  World world = getWorld();
  if(world.isRemote)
  {
   return;
  }
  int xx = getX();
  int yy = getY();
  int zz = getZ();
  int TIME = (int) world.getWorldTime() % 24000;
  if(TIME % configDefaults.DEFAULT_GROWTHPLUS_I_COOLDOWN == 0)
  {
   for(int i = 0; i <= 3; i++)
   {
    Block block = world.getBlock(xx, yy+i, zz);
    if(block instanceof IGrowable || block instanceof IPlantable)
    {
     //GrowthPlus.logger.info("Updating Block @ " + TIME + " world time.");
     block.updateTick(world, xx, yy+i, zz, world.rand);
    }
   }
  }

 }

 public World getWorld()
 {
  return this.worldObj;
 }

 public int getX()
 {
  return xCoord;
 }

 public int getY()
 {
  return yCoord;
 }

 public int getZ()
 {
  return zCoord;
 }



}
