package com.christianbutnot.moremetals.init;

import com.christianbutnot.justanotherlibrarymod.common.item.ItemTypes.ResourceItem;
import com.christianbutnot.justanotherlibrarymod.common.item.crafting.HammerItem;
import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.common.items.cookables.EngulfedCoalItem;
import com.christianbutnot.moremetals.common.items.cookables.EnigmaticCoalItem;
import com.christianbutnot.moremetals.common.items.cookables.ImmortalCoalItem;
import com.christianbutnot.moremetals.common.items.cookables.SulfurItem;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

	// RAW MATERIALS
	public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc",
			() -> new ResourceItem(new Item.Properties()));
	// INGOTS
	public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			() -> new ResourceItem(new Item.Properties()));
	

	// NUGGETS
	public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
			() -> new ResourceItem(new Item.Properties()));

	// DUSTS
	public static final DeferredItem<Item> COAL_DUST = ITEMS.register("coal_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> SILVER_DUST = ITEMS.register("silver_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> LEAD_DUST = ITEMS.register("lead_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ZINC_DUST = ITEMS.register("zinc_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("steel_dust",
			() -> new ResourceItem(new Item.Properties()));
	// MISC DUSTS
	public static final DeferredItem<Item> SULFUR_POWDER = ITEMS.register("sulfur_powder",
			() -> new SulfurItem(new Item.Properties(), 1200));

	// FUELS
	public static final DeferredItem<Item> ENGULFED_COAL = ITEMS.register("engulfed_coal",
			() -> new EngulfedCoalItem(new Item.Properties(), 2400));
	public static final DeferredItem<Item> ENIGMATIC_COAL = ITEMS.register("enigmatic_coal",
			() -> new EnigmaticCoalItem(new Item.Properties(), 14400));
	public static final DeferredItem<Item> IMMORTAL_COAL = ITEMS.register("immortal_coal",
			() -> new ImmortalCoalItem(new Item.Properties(), 57600));

	// more metals hammers
	public static final DeferredItem<Item> ALUMINUM_HAMMER = ITEMS.register("aluminum_hammer",
			() -> new HammerItem(new Item.Properties().durability(32)));
	public static final DeferredItem<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
			() -> new HammerItem(new Item.Properties().durability(48)));
	public static final DeferredItem<Item> TIN_HAMMER = ITEMS.register("tin_hammer",
			() -> new HammerItem(new Item.Properties().durability(48)));
	public static final DeferredItem<Item> BRONZE_HAMMER = ITEMS.register("bronze_hammer",
			() -> new HammerItem(new Item.Properties().durability(64)));
	public static final DeferredItem<Item> NICKEL_HAMMER = ITEMS.register("nickel_hammer",
			() -> new HammerItem(new Item.Properties().durability(96)));
	public static final DeferredItem<Item> SILVER_HAMMER = ITEMS.register("silver_hammer",
			() -> new HammerItem(new Item.Properties().durability(96)));
	public static final DeferredItem<Item> LEAD_HAMMER = ITEMS.register("lead_hammer",
			() -> new HammerItem(new Item.Properties().durability(128)));
	public static final DeferredItem<Item> ZINC_HAMMER = ITEMS.register("zinc_hammer",
			() -> new HammerItem(new Item.Properties().durability(128)));
	public static final DeferredItem<Item> ELECTRUM_HAMMER = ITEMS.register("electrum_hammer",
			() -> new HammerItem(new Item.Properties().durability(128)));
	public static final DeferredItem<Item> STEEL_HAMMER = ITEMS.register("steel_hammer",
			() -> new HammerItem(new Item.Properties().durability(256)));

	// vanilla hammers
	public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
			() -> new HammerItem(new Item.Properties().durability(256)));
	public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
			() -> new HammerItem(new Item.Properties().durability(512)));
	public static final DeferredItem<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
			() -> new HammerItem(new Item.Properties().durability(512)));
	public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
			() -> new HammerItem(new Item.Properties().durability(1024)));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}