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
		
		public static final TagKey<Block> MINEABLE_BY_MULTI_TOOL = BlockTags.create(new ResourceLocation(Main.MODID, "mineable/multi_tool"));
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(Main.MODID, name));
			
		}
		
		public static final TagKey<Block> ALUMINUM = forgeTag("ores");
		public static final TagKey<Block> NICKEL = forgeTag("ores");
		public static final TagKey<Block> SILVER = forgeTag("ores");
		public static final TagKey<Block> TIN = forgeTag("ores");
		
		private static TagKey<Block> forgeTag(String name) {
			return BlockTags.create(new ResourceLocation("forge", name));
		}
	}
}