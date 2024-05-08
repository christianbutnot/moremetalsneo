package com.christianbutnot.moremetals.utils;

import com.christianbutnot.moremetals.Main;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CustomTags {
	public static class Blocks {
		public static final TagKey<Block> NEEDS_ALUMINUM_TOOL = tag("needs_aluminum_tool");
		public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("copper_tool");
		public static final TagKey<Block> NEEDS_TIN_TOOL = tag("needs_tin_tool");
		public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");
		public static final TagKey<Block> NEEDS_NICKEL_TOOL = tag("needs_nickel_tool");
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(Main.MODID, name));
			
		}
		
		public static final TagKey<Block> ALUMINUM = neoforgeTag("ores");
		public static final TagKey<Block> NICKEL = neoforgeTag("ores");
		public static final TagKey<Block> SILVER = neoforgeTag("ores");
		public static final TagKey<Block> TIN = neoforgeTag("ores");
		public static final TagKey<Block> LEAD = neoforgeTag("ores");
		public static final TagKey<Block> ZINC = neoforgeTag("ores");
		
		private static TagKey<Block> neoforgeTag(String name) {
			return BlockTags.create(new ResourceLocation("c", name));
		}
	}
}