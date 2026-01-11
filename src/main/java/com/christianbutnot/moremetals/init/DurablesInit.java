package com.christianbutnot.moremetals.init;

import com.christianbutnot.justanotherlibrarymod.common.item.armor.ArmorItem;
import com.christianbutnot.justanotherlibrarymod.common.item.armor.MoreMetalsArmorMaterials;
import com.christianbutnot.justanotherlibrarymod.common.item.defaults.PickaxeItem;
import com.christianbutnot.justanotherlibrarymod.common.item.defaults.SwordItem;
import com.christianbutnot.justanotherlibrarymod.common.item.tools.CustomShearsItem;
import com.christianbutnot.justanotherlibrarymod.common.item.tools.CustomTiers;
import com.christianbutnot.moremetals.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DurablesInit {

	public static final DeferredRegister.Items DURABLES = DeferredRegister.createItems(Main.MODID);

	// tier2 shears
	public static final DeferredItem<Item> ALUMINUM_SHEARS = DURABLES.register("aluminum_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_shears")))));
	public static final DeferredItem<Item> COPPER_SHEARS = DURABLES.register("copper_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_shears")))));
	public static final DeferredItem<Item> TIN_SHEARS = DURABLES.register("tin_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_shears")))));
	// tier3 shears
	public static final DeferredItem<Item> BRONZE_SHEARS = DURABLES.register("bronze_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_shears")))));
	public static final DeferredItem<Item> NICKEL_SHEARS = DURABLES.register("nickel_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_shears")))));
	public static final DeferredItem<Item> SILVER_SHEARS = DURABLES.register("silver_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_shears")))));
	public static final DeferredItem<Item> LEAD_SHEARS = DURABLES.register("lead_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_shears")))));
	public static final DeferredItem<Item> ZINC_SHEARS = DURABLES.register("zinc_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_shears")))));
	public static final DeferredItem<Item> ELECTRUM_SHEARS = DURABLES.register("electrum_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_shears")))));
	// tier4 shears
	public static final DeferredItem<Item> STEEL_SHEARS = DURABLES.register("steel_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(512).rarity(Rarity.RARE).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_shears")))));
	public static final DeferredItem<Item> DIAMOND_SHEARS = DURABLES.register("diamond_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(1024).rarity(Rarity.RARE).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "diamond_shears")))));
	public static final DeferredItem<Item> EMERALD_SHEARS = DURABLES.register("emerald_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(768).rarity(Rarity.RARE).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "emerald_shears")))));
	// tier5 shears
	public static final DeferredItem<Item> NETHERITE_SHEARS = DURABLES.register("netherite_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(2048).rarity(Rarity.EPIC).setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "netherite_shears")))));

	// copper tools
	public static final DeferredItem<Item> COPPER_SWORD = DURABLES.register("copper_sword",
			() -> new SwordItem(CustomTiers.COPPER, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_sword")))));
	public static final DeferredItem<Item> COPPER_PICKAXE = DURABLES.register("copper_pickaxe",
			() -> new PickaxeItem(CustomTiers.COPPER, 1, -2.8f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_pickaxe")))));
	public static final DeferredItem<Item> COPPER_AXE = DURABLES.register("copper_axe",
			() -> new AxeItem(CustomTiers.COPPER, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_axe")))));
	public static final DeferredItem<Item> COPPER_SHOVEL = DURABLES.register("copper_shovel",
			() -> new ShovelItem(CustomTiers.COPPER, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_shovel")))));
	public static final DeferredItem<Item> COPPER_HOE = DURABLES.register("copper_hoe",
			() -> new HoeItem(CustomTiers.COPPER, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_hoe")))));
	// copper armor
	public static final DeferredItem<Item> COPPER_HELMET = DURABLES.register("copper_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_helmet")))));
	public static final DeferredItem<Item> COPPER_CHESTPLATE = DURABLES.register("copper_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_chestplate")))));
	public static final DeferredItem<Item> COPPER_LEGGINGS = DURABLES.register("copper_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_leggings")))));
	public static final DeferredItem<Item> COPPER_BOOTS = DURABLES.register("copper_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "copper_boots")))));

	// tin tools
	public static final DeferredItem<Item> TIN_SWORD = DURABLES.register("tin_sword",
			() -> new SwordItem(CustomTiers.TIN, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_sword")))));
	public static final DeferredItem<Item> TIN_PICKAXE = DURABLES.register("tin_pickaxe",
			() -> new PickaxeItem(CustomTiers.TIN, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_pickaxe")))));
	public static final DeferredItem<Item> TIN_AXE = DURABLES.register("tin_axe",
			() -> new AxeItem(CustomTiers.TIN, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_axe")))));
	public static final DeferredItem<Item> TIN_SHOVEL = DURABLES.register("tin_shovel",
			() -> new ShovelItem(CustomTiers.TIN, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_shovel")))));
	public static final DeferredItem<Item> TIN_HOE = DURABLES.register("tin_hoe",
			() -> new HoeItem(CustomTiers.TIN, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_hoe")))));
	// tin armor
	public static final DeferredItem<Item> TIN_HELMET = DURABLES.register("tin_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_helmet")))));
	public static final DeferredItem<Item> TIN_CHESTPLATEPLATE = DURABLES.register("tin_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_chestplate")))));
	public static final DeferredItem<Item> TIN_LEGGINGS = DURABLES.register("tin_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_leggings")))));
	public static final DeferredItem<Item> TIN_BOOTS = DURABLES.register("tin_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "tin_boots")))));

	// bronze tools
	public static final DeferredItem<Item> BRONZE_SWORD = DURABLES.register("bronze_sword",
			() -> new SwordItem(CustomTiers.BRONZE, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_sword")))));
	public static final DeferredItem<Item> BRONZE_PICKAXE = DURABLES.register("bronze_pickaxe",
			() -> new PickaxeItem(CustomTiers.BRONZE, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_pickaxe")))));
	public static final DeferredItem<Item> BRONZE_AXE = DURABLES.register("bronze_axe",
			() -> new AxeItem(CustomTiers.BRONZE, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_axe")))));
	public static final DeferredItem<Item> BRONZE_SHOVEL = DURABLES.register("bronze_shovel",
			() -> new ShovelItem(CustomTiers.BRONZE, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_shovel")))));
	public static final DeferredItem<Item> BRONZE_HOE = DURABLES.register("bronze_hoe",
			() -> new HoeItem(CustomTiers.BRONZE, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_hoe")))));
	// bronze armor
	public static final DeferredItem<Item> BRONZE_HELMET = DURABLES.register("bronze_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_helmet")))));
	public static final DeferredItem<Item> BRONZE_CHESTPLATEPLATE = DURABLES.register("bronze_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_chestplate")))));
	public static final DeferredItem<Item> BRONZE_LEGGINGS = DURABLES.register("bronze_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(235).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_leggings")))));
	public static final DeferredItem<Item> BRONZE_BOOTS = DURABLES.register("bronze_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(215).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "bronze_boots")))));

	// aluminum tools
	public static final DeferredItem<Item> ALUMINUM_SWORD = DURABLES.register("aluminum_sword",
			() -> new SwordItem(CustomTiers.ALUMINUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_sword")))));
	public static final DeferredItem<Item> ALUMINUM_PICKAXE = DURABLES.register("aluminum_pickaxe",
			() -> new PickaxeItem(CustomTiers.ALUMINUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_pickaxe")))));
	public static final DeferredItem<Item> ALUMINUM_AXE = DURABLES.register("aluminum_axe",
			() -> new AxeItem(CustomTiers.ALUMINUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_axe")))));
	public static final DeferredItem<Item> ALUMINUM_SHOVEL = DURABLES.register("aluminum_shovel",
			() -> new ShovelItem(CustomTiers.ALUMINUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_shovel")))));
	public static final DeferredItem<Item> ALUMINUM_HOE = DURABLES.register("aluminum_hoe",
			() -> new HoeItem(CustomTiers.ALUMINUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_hoe")))));
	// aluminum armor
	public static final DeferredItem<Item> ALUMINUM_HELMET = DURABLES.register("aluminum_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(135).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_helmet")))));
	public static final DeferredItem<Item> ALUMINUM_CHESTPLATEPLATE = DURABLES.register("aluminum_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_chestplate")))));
	public static final DeferredItem<Item> ALUMINUM_LEGGINGS = DURABLES.register("aluminum_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(155).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_leggings")))));
	public static final DeferredItem<Item> ALUMINUM_BOOTS = DURABLES.register("aluminum_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(140).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "aluminum_boots")))));

	// nickel tools
	public static final DeferredItem<Item> NICKEL_SWORD = DURABLES.register("nickel_sword",
			() -> new SwordItem(CustomTiers.NICKEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_sword")))));
	public static final DeferredItem<Item> NICKEL_PICKAXE = DURABLES.register("nickel_pickaxe",
			() -> new PickaxeItem(CustomTiers.NICKEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_pickaxe")))));
	public static final DeferredItem<Item> NICKEL_AXE = DURABLES.register("nickel_axe",
			() -> new AxeItem(CustomTiers.NICKEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_axe")))));
	public static final DeferredItem<Item> NICKEL_SHOVEL = DURABLES.register("nickel_shovel",
			() -> new ShovelItem(CustomTiers.NICKEL, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_shovel")))));
	public static final DeferredItem<Item> NICKEL_HOE = DURABLES.register("nickel_hoe",
			() -> new HoeItem(CustomTiers.NICKEL, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_hoe")))));
	// nickel armor
	public static final DeferredItem<Item> NICKEL_HELMET = DURABLES.register("nickel_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_helmet")))));
	public static final DeferredItem<Item> NICKEL_CHESTPLATEPLATE = DURABLES.register("nickel_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_chestplate")))));
	public static final DeferredItem<Item> NICKEL_LEGGINGS = DURABLES.register("nickel_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_leggings")))));
	public static final DeferredItem<Item> NICKEL_BOOTS = DURABLES.register("nickel_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "nickel_boots")))));

	// silver tools
	public static final DeferredItem<Item> SILVER_SWORD = DURABLES.register("silver_sword",
			() -> new SwordItem(CustomTiers.SILVER, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_sword")))));
	public static final DeferredItem<Item> SILVER_PICKAXE = DURABLES.register("silver_pickaxe",
			() -> new PickaxeItem(CustomTiers.SILVER, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_pickaxe")))));
	public static final DeferredItem<Item> SILVER_AXE = DURABLES.register("silver_axe",
			() -> new AxeItem(CustomTiers.SILVER, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_axe")))));
	public static final DeferredItem<Item> SILVER_SHOVEL = DURABLES.register("silver_shovel",
			() -> new ShovelItem(CustomTiers.SILVER, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_shovel")))));
	public static final DeferredItem<Item> SILVER_HOE = DURABLES.register("silver_hoe",
			() -> new HoeItem(CustomTiers.SILVER, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_hoe")))));
	// silver armor
	public static final DeferredItem<Item> SILVER_HELMET = DURABLES.register("silver_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_helmet")))));
	public static final DeferredItem<Item> SILVER_CHESTPLATEPLATE = DURABLES.register("silver_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_chestplate")))));
	public static final DeferredItem<Item> SILVER_LEGGINGS = DURABLES.register("silver_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_leggings")))));
	public static final DeferredItem<Item> SILVER_BOOTS = DURABLES.register("silver_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "silver_boots")))));

	// lead tools
	public static final DeferredItem<Item> LEAD_SWORD = DURABLES.register("lead_sword",
			() -> new SwordItem(CustomTiers.LEAD, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_sword")))));
	public static final DeferredItem<Item> LEAD_PICKAXE = DURABLES.register("lead_pickaxe",
			() -> new PickaxeItem(CustomTiers.LEAD, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_pickaxe")))));
	public static final DeferredItem<Item> LEAD_AXE = DURABLES.register("lead_axe",
			() -> new AxeItem(CustomTiers.LEAD, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_axe")))));
	public static final DeferredItem<Item> LEAD_SHOVEL = DURABLES.register("lead_shovel",
			() -> new ShovelItem(CustomTiers.LEAD, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_shovel")))));
	public static final DeferredItem<Item> LEAD_HOE = DURABLES.register("lead_hoe",
			() -> new HoeItem(CustomTiers.LEAD, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_hoe")))));
	// lead armor
	public static final DeferredItem<Item> LEAD_HELMET = DURABLES.register("lead_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(175).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_helmet")))));
	public static final DeferredItem<Item> LEAD_CHESTPLATEPLATE = DURABLES.register("lead_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_chestplate")))));
	public static final DeferredItem<Item> LEAD_LEGGINGS = DURABLES.register("lead_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_leggings")))));
	public static final DeferredItem<Item> LEAD_BOOTS = DURABLES.register("lead_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "lead_boots")))));

	// electrum tools
	public static final DeferredItem<Item> ELECTRUM_SWORD = DURABLES.register("electrum_sword",
			() -> new SwordItem(CustomTiers.ELECTRUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_sword")))));
	public static final DeferredItem<Item> ELECTRUM_PICKAXE = DURABLES.register("electrum_pickaxe",
			() -> new PickaxeItem(CustomTiers.ELECTRUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_pickaxe")))));
	public static final DeferredItem<Item> ELECTRUM_AXE = DURABLES.register("electrum_axe",
			() -> new AxeItem(CustomTiers.ELECTRUM, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_axe")))));
	public static final DeferredItem<Item> ELECTRUM_SHOVEL = DURABLES.register("electrum_shovel",
			() -> new ShovelItem(CustomTiers.ELECTRUM, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_shovel")))));
	public static final DeferredItem<Item> ELECTRUM_HOE = DURABLES.register("electrum_hoe",
			() -> new HoeItem(CustomTiers.ELECTRUM, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_hoe")))));
	// electrum armor
	public static final DeferredItem<Item> ELECTRUM_HELMET = DURABLES.register("electrum_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_helmet")))));
	public static final DeferredItem<Item> ELECTRUM_CHESTPLATEPLATE = DURABLES.register("electrum_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_chestplate")))));
	public static final DeferredItem<Item> ELECTRUM_LEGGINGS = DURABLES.register("electrum_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_leggings")))));
	public static final DeferredItem<Item> ELECTRUM_BOOTS = DURABLES.register("electrum_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "electrum_boots")))));

	// zinc tools
	public static final DeferredItem<Item> ZINC_SWORD = DURABLES.register("zinc_sword",
			() -> new SwordItem(CustomTiers.ZINC, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_sword")))));
	public static final DeferredItem<Item> ZINC_PICKAXE = DURABLES.register("zinc_pickaxe",
			() -> new PickaxeItem(CustomTiers.ZINC, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_pickaxe")))));
	public static final DeferredItem<Item> ZINC_AXE = DURABLES.register("zinc_axe",
			() -> new AxeItem(CustomTiers.ZINC, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_axe")))));
	public static final DeferredItem<Item> ZINC_SHOVEL = DURABLES.register("zinc_shovel",
			() -> new ShovelItem(CustomTiers.ZINC, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_shovel")))));
	public static final DeferredItem<Item> ZINC_HOE = DURABLES.register("zinc_hoe",
			() -> new HoeItem(CustomTiers.ZINC, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_hoe")))));
	// zinc armor
	public static final DeferredItem<Item> ZINC_HELMET = DURABLES.register("zinc_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(165).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_helmet")))));
	public static final DeferredItem<Item> ZINC_CHESTPLATEPLATE = DURABLES.register("zinc_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(240).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_chestplate")))));
	public static final DeferredItem<Item> ZINC_LEGGINGS = DURABLES.register("zinc_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(225).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_leggings")))));
	public static final DeferredItem<Item> ZINC_BOOTS = DURABLES.register("zinc_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(195).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "zinc_boots")))));

	// steel tools
	public static final DeferredItem<Item> STEEL_SWORD = DURABLES.register("steel_sword",
			() -> new SwordItem(CustomTiers.STEEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_sword")))));
	public static final DeferredItem<Item> STEEL_PICKAXE = DURABLES.register("steel_pickaxe",
			() -> new PickaxeItem(CustomTiers.STEEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_pickaxe")))));
	public static final DeferredItem<Item> STEEL_AXE = DURABLES.register("steel_axe",
			() -> new AxeItem(CustomTiers.STEEL, 4, -3.1f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_axe")))));
	public static final DeferredItem<Item> STEEL_SHOVEL = DURABLES.register("steel_shovel",
			() -> new ShovelItem(CustomTiers.STEEL, 1, -3f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_shovel")))));
	public static final DeferredItem<Item> STEEL_HOE = DURABLES.register("steel_hoe",
			() -> new HoeItem(CustomTiers.STEEL, -1, -2.4f, new Item.Properties().setId(ResourceKey
					.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_hoe")))));
	// steel armor
	public static final DeferredItem<Item> STEEL_HELMET = DURABLES.register("steel_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(200).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_helmet")))));
	public static final DeferredItem<Item> STEEL_CHESTPLATEPLATE = DURABLES.register("steel_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(300).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_chestplate")))));
	public static final DeferredItem<Item> STEEL_LEGGINGS = DURABLES.register("steel_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(255).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_leggings")))));
	public static final DeferredItem<Item> STEEL_BOOTS = DURABLES.register("steel_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(215).stacksTo(1).setId(ResourceKey
							.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MODID, "steel_boots")))));

	public static void register(IEventBus eventBus) {
		DURABLES.register(eventBus);
	}
}