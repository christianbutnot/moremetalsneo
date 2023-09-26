package com.christianbutnot.moremetals.init;

import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.common.items.CustomShearsItem;
import com.christianbutnot.moremetals.common.items.armor.CustomArmorMaterials;
import com.christianbutnot.moremetals.common.items.tools.CustomTiers;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DurablesInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

	//  multitools
	//public static final RegistryObject<Item> WOOD_MULTI_TOOL = ITEMS.register("wood_multi_tool", () -> new MultiTools(Tiers.WOOD));
	// tier2 shears
	public static final RegistryObject<Item> ALUMINUM_SHEARS = ITEMS.register("aluminum_shears",
			() -> new CustomShearsItem(
					new Item.Properties().defaultDurability(256).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(256).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> TIN_SHEARS = ITEMS.register("tin_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(256).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROSE_GOLD_SHEARS = ITEMS.register("rose_gold_shears",
			() -> new CustomShearsItem(
					new Item.Properties().defaultDurability(256).rarity(Rarity.UNCOMMON)));
	// tier3 shears
	public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(512).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> NICKEL_SHEARS = ITEMS.register("nickel_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(512).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> SILVER_SHEARS = ITEMS.register("silver_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(512).rarity(Rarity.UNCOMMON)));
	// tier4 shears
	public static final RegistryObject<Item> STEEL_SHEARS = ITEMS.register("steel_shears", () -> new CustomShearsItem(
			new Item.Properties().defaultDurability(1024).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
			() -> new CustomShearsItem(
					new Item.Properties().defaultDurability(1024).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> EMERALD_SHEARS = ITEMS.register("emerald_shears",
			() -> new CustomShearsItem(
					new Item.Properties().defaultDurability(1024).rarity(Rarity.RARE)));
	// tier5 shears
	public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
			() -> new CustomShearsItem(
					new Item.Properties().defaultDurability(2048).rarity(Rarity.EPIC)));

	// copper tools
	public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(CustomTiers.COPPER, 2, -2.4f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(CustomTiers.COPPER, 1, -2.8f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(CustomTiers.COPPER, 6, -3.1f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(CustomTiers.COPPER, 1.5f, -3f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(CustomTiers.COPPER, -2, 3f,
                    new Item.Properties().stacksTo(1)));
	// copper armor
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
			() -> new ArmorItem(CustomArmorMaterials.COPPER, Type.HELMET,
					new Item.Properties()));
	public static final RegistryObject<Item> COPPER_CHESTPLATEPLATE = ITEMS.register("copper_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.COPPER, Type.CHESTPLATE,
					new Item.Properties()));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
			() -> new ArmorItem(CustomArmorMaterials.COPPER, Type.LEGGINGS,
					new Item.Properties()));
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
			() -> new ArmorItem(CustomArmorMaterials.COPPER, Type.BOOTS,
					new Item.Properties()));

	// aluminum tools
	public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",
            () -> new SwordItem(CustomTiers.ALUMINUM, 2, -2.4f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(CustomTiers.ALUMINUM, 1, -2.8f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe",
            () -> new AxeItem(CustomTiers.ALUMINUM, 6, -3.1f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",
            () -> new ShovelItem(CustomTiers.ALUMINUM, 1.5f, -3f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",
            () -> new HoeItem(CustomTiers.ALUMINUM, -2, -1,
                    new Item.Properties().stacksTo(1)));
	// aluminum armor
	public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
			() -> new ArmorItem(CustomArmorMaterials.ALUMINUM, Type.HELMET,
					new Item.Properties()));
	public static final RegistryObject<Item> ALUMINUM_CHESTPLATEPLATE = ITEMS.register("aluminum_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.ALUMINUM, Type.CHESTPLATE,
					new Item.Properties()));
	public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",
			() -> new ArmorItem(CustomArmorMaterials.ALUMINUM, Type.LEGGINGS,
					new Item.Properties()));
	public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
			() -> new ArmorItem(CustomArmorMaterials.ALUMINUM, Type.BOOTS,
					new Item.Properties()));

	// tin tools
	public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword",
            () -> new SwordItem(CustomTiers.TIN, 2, -2.4f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            () -> new PickaxeItem(CustomTiers.TIN, 1, -2.8f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe",
            () -> new AxeItem(CustomTiers.TIN, 6, -3.1f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel",
            () -> new ShovelItem(CustomTiers.TIN, 1.5f, -3f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe",
            () -> new HoeItem(CustomTiers.TIN, -2, -1,
                    new Item.Properties().stacksTo(1)));
	// tin armor
	public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",
			() -> new ArmorItem(CustomArmorMaterials.TIN, Type.HELMET,
					new Item.Properties()));
	public static final RegistryObject<Item> TIN_CHESTPLATEPLATE = ITEMS.register("tin_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.TIN, Type.CHESTPLATE,
					new Item.Properties()));
	public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",
			() -> new ArmorItem(CustomArmorMaterials.TIN, Type.LEGGINGS,
					new Item.Properties()));
	public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",
			() -> new ArmorItem(CustomArmorMaterials.TIN, Type.BOOTS,
					new Item.Properties()));

	// silver tools
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(CustomTiers.SILVER, 3, -2.4f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(CustomTiers.SILVER, 1, -2.8f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(CustomTiers.SILVER, 6, -3.1f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(CustomTiers.SILVER, 1.5f, -3f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(CustomTiers.SILVER, -2, -1,
                    new Item.Properties().stacksTo(1)));
	// silver armor
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
			() -> new ArmorItem(CustomArmorMaterials.SILVER, Type.HELMET,
					new Item.Properties()));
	public static final RegistryObject<Item> SILVER_CHESTPLATEPLATE = ITEMS.register("silver_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.SILVER, Type.CHESTPLATE,
					new Item.Properties()));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
			() -> new ArmorItem(CustomArmorMaterials.SILVER, Type.LEGGINGS,
					new Item.Properties()));
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
			() -> new ArmorItem(CustomArmorMaterials.SILVER, Type.BOOTS,
					new Item.Properties()));

	// nickel tools
	public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register("nickel_sword",
            () -> new SwordItem(CustomTiers.NICKEL, 3, -2.4f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe",
            () -> new PickaxeItem(CustomTiers.NICKEL, 1, -2.8f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register("nickel_axe",
            () -> new AxeItem(CustomTiers.NICKEL, 6, -3.1f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register("nickel_shovel",
            () -> new ShovelItem(CustomTiers.NICKEL, 1.5f, -3f,
                    new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register("nickel_hoe",
            () -> new HoeItem(CustomTiers.NICKEL, -2, -1,
                    new Item.Properties().stacksTo(1)));
	// nickel armor
	public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register("nickel_helmet",
			() -> new ArmorItem(CustomArmorMaterials.NICKEL, Type.HELMET,
					new Item.Properties()));
	public static final RegistryObject<Item> NICKEL_CHESTPLATEPLATE = ITEMS.register("nickel_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.NICKEL, Type.CHESTPLATE,
					new Item.Properties()));
	public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings",
			() -> new ArmorItem(CustomArmorMaterials.NICKEL, Type.LEGGINGS,
					new Item.Properties()));
	public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register("nickel_boots",
			() -> new ArmorItem(CustomArmorMaterials.NICKEL, Type.BOOTS,
					new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}