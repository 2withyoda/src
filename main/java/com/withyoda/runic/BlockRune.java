package com.withyoda.runic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRune extends Block {
	
	public BlockRune(){
		
		super(Material.rock);
		setBlockName(Runic.MODID + "_rune");
		setCreativeTab(CreativeTabs.tabRedstone);
		setBlockTextureName(Runic.MODID + ":rune");
		
	}

}
