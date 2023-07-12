package com.christianbutnot.moremetals.utils;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.world.level.material.Material;

public class ToolTypeUtils {

	public static final Set<Material> PICKAXE_MATERIALS = Sets.newHashSet(Material.STONE, Material.METAL, Material.HEAVY_METAL, Material.ICE, Material.ICE_SOLID, Material.SHULKER_SHELL);
	
	public static final Set<Material> AXE_MATERIALS = Sets.newHashSet(Material.WOOD, Material.VEGETABLE, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.NETHER_WOOD, Material.PLANT);
	
	public static final Set<Material> SHOVEL_MATERIALS = Sets.newHashSet(Material.DIRT, Material.SAND, Material.CLAY, Material.SNOW, Material.TOP_SNOW);
	
}

