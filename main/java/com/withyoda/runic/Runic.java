package com.withyoda.runic;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Runic.MODID, version = Runic.VERSION)
public class Runic
{
    public static final String MODID = "runicmod";
    public static final String VERSION = "0.1";
    
    public static Block runeBlock;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	runeBlock = new BlockRune();
		GameRegistry.registerBlock(runeBlock, "runeBlock");
    }
}
