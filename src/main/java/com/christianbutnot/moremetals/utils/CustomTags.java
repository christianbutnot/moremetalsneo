package com.christianbutnot.moremetals.utils;

import com.christianbutnot.moremetals.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CustomTags {

	public static final TagKey<Block> ALUMINUMORE = modBlockTag("aluminum");
	public static final TagKey<Block> NICKELORE = modBlockTag("nickel");
	public static final TagKey<Block> SILVERORE = modBlockTag("silver");
	public static final TagKey<Block> TINORE = modBlockTag("tin");
	public static final TagKey<Block> LEADORE = modBlockTag("lead");
	public static final TagKey<Block> ZINCORE = modBlockTag("zinc");

	public static final TagKey<Item> ALUMINUMORE2 = modOreItemTag("aluminum");
	public static final TagKey<Item> NICKELORE2 = modOreItemTag("nickel");
	public static final TagKey<Item> SILVERORE2 = modOreItemTag("silver");
	public static final TagKey<Item> TINORE2 = modOreItemTag("tin");
	public static final TagKey<Item> LEADORE2 = modOreItemTag("lead");
	public static final TagKey<Item> ZINCORE2 = modOreItemTag("zinc");
	
	public static final TagKey<Item> ALUMINUMINGOT = modIngotTag("aluminum");
	public static final TagKey<Item> NICKELINGOT = modIngotTag("nickel");
	public static final TagKey<Item> SILVERINGOT = modIngotTag("silver");
	public static final TagKey<Item> TININGOT = modIngotTag("tin");
	public static final TagKey<Item> LEADINGOT = modIngotTag("lead");
	public static final TagKey<Item> ZINCINGOT = modIngotTag("zinc");
	public static final TagKey<Item> BRONZEINGOT = modIngotTag("bronze");
	public static final TagKey<Item> ELECTRUMINGOT = modIngotTag("electrum");
	public static final TagKey<Item> STEELINGOT = modIngotTag("steel");

	public static final TagKey<Item> ALUMINUMDUST = modDustTag("aluminum");
	public static final TagKey<Item> NICKELDUST = modDustTag("nickel");
	public static final TagKey<Item> SILVERDUST = modDustTag("silver");
	public static final TagKey<Item> TINDUST = modDustTag("tin");
	public static final TagKey<Item> LEADDUST = modDustTag("lead");
	public static final TagKey<Item> ZINCDUST = modDustTag("zinc");
	public static final TagKey<Item> BRONZEDUST = modDustTag("bronze");
	public static final TagKey<Item> ELECTRUMDUST = modDustTag("electrum");
	public static final TagKey<Item> STEELDUST = modDustTag("steel");

	public static final TagKey<Item> ALUMINUMNUGGET = modNuggetTag("aluminum");
	public static final TagKey<Item> NICKELNUGGET = modNuggetTag("nickel");
	public static final TagKey<Item> SILVERNUGGET = modNuggetTag("silver");
	public static final TagKey<Item> TINNUGGET = modNuggetTag("tin");
	public static final TagKey<Item> LEADNUGGET = modNuggetTag("lead");
	public static final TagKey<Item> ZINCNUGGET = modNuggetTag("zinc");
	public static final TagKey<Item> BRONZENUGGET = modNuggetTag("bronze");
	public static final TagKey<Item> ELECTRUMNUGGET = modNuggetTag("electrum");
	public static final TagKey<Item> STEELNUGGET = modNuggetTag("steel");

	public static final TagKey<Item> HAMMERS = modItemTag("hammers");
	
	public static TagKey<Block> blockTag(ResourceLocation tagLocaction) {
		return TagKey.create(Registries.BLOCK, tagLocaction);
	}

	public static TagKey<Item> itemTag(ResourceLocation tagLocaction) {
		return TagKey.create(Registries.ITEM, tagLocaction);
	}

	public static TagKey<Block> modBlockTag(String tagName) {
		return CustomTags.blockTag(ResourceLocation.fromNamespaceAndPath(Main.MODID, tagName));
	}

	public static TagKey<Block> modOreTag(String tagName) {
		return CustomTags.blockTag(ResourceLocation.fromNamespaceAndPath("c/block/ores/", tagName));
	}

	public static TagKey<Item> modOreItemTag(String tagName) {
		return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath("c/item/ores/", tagName));
	}
	
	public static TagKey<Item> modIngotTag(String tagLocaction) {
		return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath("c/item/ingots/", tagLocaction));
	}
	
	public static TagKey<Item> modItemTag(String tagLocaction) {
		return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath("c/item/ingots/", tagLocaction));
	}

	public static TagKey<Item> modNuggetTag(String tagLocaction) {
		return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath("c/item/nuggets/", tagLocaction));
	}

	public static TagKey<Item> modDustTag(String tagLocaction) {
		return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath("c/item/dusts/", tagLocaction));
	}
}