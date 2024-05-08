package com.christianbutnot.moremetals.init;

import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.common.items.CustomShearsItem;
import com.christianbutnot.moremetals.common.items.armor.CustomArmorMaterial;
import com.christianbutnot.moremetals.common.items.tools.CustomTiersEnum;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DurablesInit {

	public static final DeferredRegister.Items DURABLES = DeferredRegister.createItems(Main.MODID);

	// multitools
	// public static final DeferredItem<Item> WOOD_MULTI_TOOL =
	// DURABLES.register("wood_multi_tool", () -> new MultiTools(Tiers.WOOD));
	// tier2 shears
	public static final DeferredItem<Item> ALUMINUM_SHEARS = DURABLES.register("aluminum_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> COPPER_SHEARS = DURABLES.register("copper_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> TIN_SHEARS = DURABLES.register("tin_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(256).rarity(Rarity.UNCOMMON)));
	// tier3 shears
	public static final DeferredItem<Item> BRONZE_SHEARS = DURABLES.register("bronze_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(512).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> NICKEL_SHEARS = DURABLES.register("nickel_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(512).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> SILVER_SHEARS = DURABLES.register("silver_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(512).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> LEAD_SHEARS = DURABLES.register("lead_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(512).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> ZINC_SHEARS = DURABLES.register("zinc_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(512).rarity(Rarity.UNCOMMON)));
	// tier4 shears
	public static final DeferredItem<Item> STEEL_SHEARS = DURABLES.register("steel_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(1024).rarity(Rarity.RARE)));
	public static final DeferredItem<Item> DIAMOND_SHEARS = DURABLES.register("diamond_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(1024).rarity(Rarity.RARE)));
	public static final DeferredItem<Item> EMERALD_SHEARS = DURABLES.register("emerald_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(1024).rarity(Rarity.RARE)));
	// tier5 shears
	public static final DeferredItem<Item> NETHERITE_SHEARS = DURABLES.register("netherite_shears",
			() -> new CustomShearsItem(new Item.Properties().stacksTo(1).durability(2048).rarity(Rarity.EPIC)));

	// copper tools
	public static final DeferredItem<Item> COPPER_SWORD = DURABLES.register("copper_sword",
			() -> new SwordItem(CustomTiersEnum.COPPER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_PICKAXE = DURABLES.register("copper_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.COPPER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_AXE = DURABLES.register("copper_axe",
			() -> new AxeItem(CustomTiersEnum.COPPER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_SHOVEL = DURABLES.register("copper_shovel",
			() -> new ShovelItem(CustomTiersEnum.COPPER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_HOE = DURABLES.register("copper_hoe",
			() -> new HoeItem(CustomTiersEnum.COPPER, new Item.Properties().stacksTo(1)));
	// copper armor
	public static final DeferredItem<Item> COPPER_HELMET = DURABLES.register("copper_helmet",
			() -> new ArmorItem(CustomArmorMaterial.COPPER, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_CHESTPLATE = DURABLES.register("copper_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.COPPER, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_LEGGINGS = DURABLES.register("copper_leggings",
			() -> new ArmorItem(CustomArmorMaterial.COPPER, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> COPPER_BOOTS = DURABLES.register("copper_boots",
			() -> new ArmorItem(CustomArmorMaterial.COPPER, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// aluminum tools
	public static final DeferredItem<Item> ALUMINUM_SWORD = DURABLES.register("aluminum_sword",
			() -> new SwordItem(CustomTiersEnum.ALUMINUM, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_PICKAXE = DURABLES.register("aluminum_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_AXE = DURABLES.register("aluminum_axe",
			() -> new AxeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_SHOVEL = DURABLES.register("aluminum_shovel",
			() -> new ShovelItem(CustomTiersEnum.ALUMINUM, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_HOE = DURABLES.register("aluminum_hoe",
			() -> new HoeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().stacksTo(1)));
	// aluminum armor
	public static final DeferredItem<Item> ALUMINUM_HELMET = DURABLES.register("aluminum_helmet",
			() -> new ArmorItem(CustomArmorMaterial.ALUMINUM, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_CHESTPLATEPLATE = DURABLES.register("aluminum_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.ALUMINUM, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_LEGGINGS = DURABLES.register("aluminum_leggings",
			() -> new ArmorItem(CustomArmorMaterial.ALUMINUM, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_BOOTS = DURABLES.register("aluminum_boots",
			() -> new ArmorItem(CustomArmorMaterial.ALUMINUM, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// tin tools
	public static final DeferredItem<Item> TIN_SWORD = DURABLES.register("tin_sword",
			() -> new SwordItem(CustomTiersEnum.TIN, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_PICKAXE = DURABLES.register("tin_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.TIN, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_AXE = DURABLES.register("tin_axe",
			() -> new AxeItem(CustomTiersEnum.TIN, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_SHOVEL = DURABLES.register("tin_shovel",
			() -> new ShovelItem(CustomTiersEnum.TIN, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_HOE = DURABLES.register("tin_hoe",
			() -> new HoeItem(CustomTiersEnum.TIN, new Item.Properties().stacksTo(1)));
	// tin armor
	public static final DeferredItem<Item> TIN_HELMET = DURABLES.register("tin_helmet",
			() -> new ArmorItem(CustomArmorMaterial.TIN, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_CHESTPLATEPLATE = DURABLES.register("tin_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.TIN, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_LEGGINGS = DURABLES.register("tin_leggings",
			() -> new ArmorItem(CustomArmorMaterial.TIN, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TIN_BOOTS = DURABLES.register("tin_boots",
			() -> new ArmorItem(CustomArmorMaterial.TIN, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// silver tools
	public static final DeferredItem<Item> SILVER_SWORD = DURABLES.register("silver_sword",
			() -> new SwordItem(CustomTiersEnum.SILVER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_PICKAXE = DURABLES.register("silver_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.SILVER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_AXE = DURABLES.register("silver_axe",
			() -> new AxeItem(CustomTiersEnum.SILVER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_SHOVEL = DURABLES.register("silver_shovel",
			() -> new ShovelItem(CustomTiersEnum.SILVER, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_HOE = DURABLES.register("silver_hoe",
			() -> new HoeItem(CustomTiersEnum.SILVER, new Item.Properties().stacksTo(1)));
	// silver armor
	public static final DeferredItem<Item> SILVER_HELMET = DURABLES.register("silver_helmet",
			() -> new ArmorItem(CustomArmorMaterial.SILVER, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_CHESTPLATEPLATE = DURABLES.register("silver_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.SILVER, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_LEGGINGS = DURABLES.register("silver_leggings",
			() -> new ArmorItem(CustomArmorMaterial.SILVER, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SILVER_BOOTS = DURABLES.register("silver_boots",
			() -> new ArmorItem(CustomArmorMaterial.SILVER, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// nickel tools
	public static final DeferredItem<Item> NICKEL_SWORD = DURABLES.register("nickel_sword",
			() -> new SwordItem(CustomTiersEnum.NICKEL, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_PICKAXE = DURABLES.register("nickel_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.NICKEL, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_AXE = DURABLES.register("nickel_axe",
			() -> new AxeItem(CustomTiersEnum.NICKEL, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_SHOVEL = DURABLES.register("nickel_shovel",
			() -> new ShovelItem(CustomTiersEnum.NICKEL, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_HOE = DURABLES.register("nickel_hoe",
			() -> new HoeItem(CustomTiersEnum.NICKEL, new Item.Properties().stacksTo(1)));
	// nickel armor
	public static final DeferredItem<Item> NICKEL_HELMET = DURABLES.register("nickel_helmet",
			() -> new ArmorItem(CustomArmorMaterial.NICKEL, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_CHESTPLATEPLATE = DURABLES.register("nickel_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.NICKEL, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_LEGGINGS = DURABLES.register("nickel_leggings",
			() -> new ArmorItem(CustomArmorMaterial.NICKEL, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_BOOTS = DURABLES.register("nickel_boots",
			() -> new ArmorItem(CustomArmorMaterial.NICKEL, Type.BOOTS, new Item.Properties().stacksTo(1)));

	public static void register(IEventBus eventBus) {
		DURABLES.register(eventBus);
	}
}