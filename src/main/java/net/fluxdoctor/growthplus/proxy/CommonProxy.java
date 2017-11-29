package net.fluxdoctor.growthplus.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.fluxdoctor.growthplus.GrowthPlusGameObjects;

public class CommonProxy implements IProxy {

 @Override
 public void preInit(FMLPreInitializationEvent event) {

  GrowthPlusGameObjects.init();
 }

 @Override
 public void init(FMLInitializationEvent event) {

 }

 @Override
 public void postInit(FMLPostInitializationEvent event) {

 }
}
