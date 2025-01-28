package com.christianbutnot.moremetals.init;

import com.christianbutnot.justanotherlibrarymod.common.item.armor.MoreMetalsArmorMaterials;
import com.christianbutnot.justanotherlibrarymod.common.item.tools.CustomShearsItem;
import com.christianbutnot.moremetals.Main;
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

	// tier2 shears
	public static final DeferredItem<Item> ALUMINUM_SHEARS = DURABLES.register("aluminum_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> COPPER_SHEARS = DURABLES.register("copper_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> TIN_SHEARS = DURABLES.register("tin_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(128).rarity(Rarity.UNCOMMON)));
	// tier3 shears
	public static final DeferredItem<Item> BRONZE_SHEARS = DURABLES.register("bronze_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> NICKEL_SHEARS = DURABLES.register("nickel_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> SILVER_SHEARS = DURABLES.register("silver_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> LEAD_SHEARS = DURABLES.register("lead_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> ZINC_SHEARS = DURABLES.register("zinc_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> ELECTRUM_SHEARS = DURABLES.register("electrum_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(256).rarity(Rarity.UNCOMMON)));
	// tier4 shears
	public static final DeferredItem<Item> STEEL_SHEARS = DURABLES.register("steel_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(512).rarity(Rarity.RARE)));
	public static final DeferredItem<Item> DIAMOND_SHEARS = DURABLES.register("diamond_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(1024).rarity(Rarity.RARE)));
	public static final DeferredItem<Item> EMERALD_SHEARS = DURABLES.register("emerald_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(768).rarity(Rarity.RARE)));
	// tier5 shears
	public static final DeferredItem<Item> NETHERITE_SHEARS = DURABLES.register("netherite_shears",
			() -> new CustomShearsItem(new Item.Properties().durability(2048).rarity(Rarity.EPIC)));

	// copper tools
	public static final DeferredItem<Item> COPPER_SWORD = DURABLES.register("copper_sword",
			() -> new SwordItem(CustomTiersEnum.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.COPPER, 4, -3.1f))));
	public static final DeferredItem<Item> COPPER_PICKAXE = DURABLES.register("copper_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.COPPER, 1, -2.8f))));
	public static final DeferredItem<Item> COPPER_AXE = DURABLES.register("copper_axe",
			() -> new AxeItem(CustomTiersEnum.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.COPPER, 4, -3.1f))));
	public static final DeferredItem<Item> COPPER_SHOVEL = DURABLES.register("copper_shovel",
			() -> new ShovelItem(CustomTiersEnum.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.COPPER, 1, -3f))));
	public static final DeferredItem<Item> COPPER_HOE = DURABLES.register("copper_hoe",
			() -> new HoeItem(CustomTiersEnum.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.COPPER, -1, -2.4f))));
	// copper armor
	public static final DeferredItem<Item> COPPER_HELMET = DURABLES.register("copper_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> COPPER_CHESTPLATE = DURABLES.register("copper_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> COPPER_LEGGINGS = DURABLES.register("copper_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> COPPER_BOOTS = DURABLES.register("copper_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.COPPER, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// tin tools
	public static final DeferredItem<Item> TIN_SWORD = DURABLES.register("tin_sword",
			() -> new SwordItem(CustomTiersEnum.TIN, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.TIN, 4, -3.1f))));
	public static final DeferredItem<Item> TIN_PICKAXE = DURABLES.register("tin_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.TIN, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.TIN, 4, -3.1f))));
	public static final DeferredItem<Item> TIN_AXE = DURABLES.register("tin_axe",
			() -> new AxeItem(CustomTiersEnum.TIN, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.TIN, 4, -3.1f))));
	public static final DeferredItem<Item> TIN_SHOVEL = DURABLES.register("tin_shovel",
			() -> new ShovelItem(CustomTiersEnum.TIN, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.TIN, 1, -3f))));
	public static final DeferredItem<Item> TIN_HOE = DURABLES.register("tin_hoe",
			() -> new HoeItem(CustomTiersEnum.TIN, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.TIN, -1, -2.4f))));
	// tin armor
	public static final DeferredItem<Item> TIN_HELMET = DURABLES.register("tin_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> TIN_CHESTPLATEPLATE = DURABLES.register("tin_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> TIN_LEGGINGS = DURABLES.register("tin_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> TIN_BOOTS = DURABLES.register("tin_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.TIN, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// bronze tools
	public static final DeferredItem<Item> BRONZE_SWORD = DURABLES.register("bronze_sword",
			() -> new SwordItem(CustomTiersEnum.BRONZE, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.BRONZE, 4, -3.1f))));
	public static final DeferredItem<Item> BRONZE_PICKAXE = DURABLES.register("bronze_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.BRONZE, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.BRONZE, 4, -3.1f))));
	public static final DeferredItem<Item> BRONZE_AXE = DURABLES.register("bronze_axe",
			() -> new AxeItem(CustomTiersEnum.BRONZE, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.BRONZE, 4, -3.1f))));
	public static final DeferredItem<Item> BRONZE_SHOVEL = DURABLES.register("bronze_shovel",
			() -> new ShovelItem(CustomTiersEnum.BRONZE, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.BRONZE, 1, -3f))));
	public static final DeferredItem<Item> BRONZE_HOE = DURABLES.register("bronze_hoe",
			() -> new HoeItem(CustomTiersEnum.BRONZE, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.BRONZE, -1, -2.4f))));
	// bronze armor
	public static final DeferredItem<Item> BRONZE_HELMET = DURABLES.register("bronze_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE, Type.HELMET,  new Item.Properties().durability(195).stacksTo(1)));
	public static final DeferredItem<Item> BRONZE_CHESTPLATEPLATE = DURABLES.register("bronze_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> BRONZE_LEGGINGS = DURABLES.register("bronze_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE, Type.LEGGINGS,  new Item.Properties().durability(235).stacksTo(1)));
	public static final DeferredItem<Item> BRONZE_BOOTS = DURABLES.register("bronze_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.BRONZE, Type.BOOTS,  new Item.Properties().durability(215).stacksTo(1)));

	// aluminum tools
	public static final DeferredItem<Item> ALUMINUM_SWORD = DURABLES.register("aluminum_sword",
			() -> new SwordItem(CustomTiersEnum.ALUMINUM, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.ALUMINUM, 4, -3.1f))));
	public static final DeferredItem<Item> ALUMINUM_PICKAXE = DURABLES.register("aluminum_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.ALUMINUM, 4, -3.1f))));
	public static final DeferredItem<Item> ALUMINUM_AXE = DURABLES.register("aluminum_axe",
			() -> new AxeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.ALUMINUM, 4, -3.1f))));
	public static final DeferredItem<Item> ALUMINUM_SHOVEL = DURABLES.register("aluminum_shovel",
			() -> new ShovelItem(CustomTiersEnum.ALUMINUM, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.ALUMINUM, 1, -3f))));
	public static final DeferredItem<Item> ALUMINUM_HOE = DURABLES.register("aluminum_hoe",
			() -> new HoeItem(CustomTiersEnum.ALUMINUM, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.ALUMINUM, -1, -2.4f))));
	// aluminum armor
	public static final DeferredItem<Item> ALUMINUM_HELMET = DURABLES.register("aluminum_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM, Type.HELMET,  new Item.Properties().durability(135).stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_CHESTPLATEPLATE = DURABLES.register("aluminum_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM, Type.CHESTPLATE,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_LEGGINGS = DURABLES.register("aluminum_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM, Type.LEGGINGS,  new Item.Properties().durability(155).stacksTo(1)));
	public static final DeferredItem<Item> ALUMINUM_BOOTS = DURABLES.register("aluminum_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ALUMINUM, Type.BOOTS,  new Item.Properties().durability(140).stacksTo(1)));

	// nickel tools
	public static final DeferredItem<Item> NICKEL_SWORD = DURABLES.register("nickel_sword",
			() -> new SwordItem(CustomTiersEnum.NICKEL, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.NICKEL, 4, -3.1f))));
	public static final DeferredItem<Item> NICKEL_PICKAXE = DURABLES.register("nickel_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.NICKEL, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.NICKEL, 4, -3.1f))));
	public static final DeferredItem<Item> NICKEL_AXE = DURABLES.register("nickel_axe",
			() -> new AxeItem(CustomTiersEnum.NICKEL, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.NICKEL, 4, -3.1f))));
	public static final DeferredItem<Item> NICKEL_SHOVEL = DURABLES.register("nickel_shovel",
			() -> new ShovelItem(CustomTiersEnum.NICKEL, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.NICKEL, 1, -3f))));
	public static final DeferredItem<Item> NICKEL_HOE = DURABLES.register("nickel_hoe",
			() -> new HoeItem(CustomTiersEnum.NICKEL, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.NICKEL, -1, -2.4f))));
	// nickel armor
	public static final DeferredItem<Item> NICKEL_HELMET = DURABLES.register("nickel_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_CHESTPLATEPLATE = DURABLES.register("nickel_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_LEGGINGS = DURABLES.register("nickel_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> NICKEL_BOOTS = DURABLES.register("nickel_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.NICKEL, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// silver tools
	public static final DeferredItem<Item> SILVER_SWORD = DURABLES.register("silver_sword",
			() -> new SwordItem(CustomTiersEnum.SILVER, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.SILVER, 4, -3.1f))));
	public static final DeferredItem<Item> SILVER_PICKAXE = DURABLES.register("silver_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.SILVER, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.SILVER, 4, -3.1f))));
	public static final DeferredItem<Item> SILVER_AXE = DURABLES.register("silver_axe",
			() -> new AxeItem(CustomTiersEnum.SILVER, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.SILVER, 4, -3.1f))));
	public static final DeferredItem<Item> SILVER_SHOVEL = DURABLES.register("silver_shovel",
			() -> new ShovelItem(CustomTiersEnum.SILVER, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.SILVER, 1, -3f))));
	public static final DeferredItem<Item> SILVER_HOE = DURABLES.register("silver_hoe",
			() -> new HoeItem(CustomTiersEnum.SILVER, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.SILVER, -1, -2.4f))));
	// silver armor
	public static final DeferredItem<Item> SILVER_HELMET = DURABLES.register("silver_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> SILVER_CHESTPLATEPLATE = DURABLES.register("silver_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> SILVER_LEGGINGS = DURABLES.register("silver_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> SILVER_BOOTS = DURABLES.register("silver_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.SILVER, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// lead tools
	public static final DeferredItem<Item> LEAD_SWORD = DURABLES.register("lead_sword",
			() -> new SwordItem(CustomTiersEnum.LEAD, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.LEAD, 4, -3.1f))));
	public static final DeferredItem<Item> LEAD_PICKAXE = DURABLES.register("lead_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.LEAD, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.LEAD, 4, -3.1f))));
	public static final DeferredItem<Item> LEAD_AXE = DURABLES.register("lead_axe",
			() -> new AxeItem(CustomTiersEnum.LEAD, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.LEAD, 4, -3.1f))));
	public static final DeferredItem<Item> LEAD_SHOVEL = DURABLES.register("lead_shovel",
			() -> new ShovelItem(CustomTiersEnum.LEAD, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.LEAD, 1, -3f))));
	public static final DeferredItem<Item> LEAD_HOE = DURABLES.register("lead_hoe",
			() -> new HoeItem(CustomTiersEnum.LEAD, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.LEAD, -1, -2.4f))));
	// lead armor
	public static final DeferredItem<Item> LEAD_HELMET = DURABLES.register("lead_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD, Type.HELMET,  new Item.Properties().durability(175).stacksTo(1)));
	public static final DeferredItem<Item> LEAD_CHESTPLATEPLATE = DURABLES.register("lead_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> LEAD_LEGGINGS = DURABLES.register("lead_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD, Type.LEGGINGS,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> LEAD_BOOTS = DURABLES.register("lead_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.LEAD, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// electrum tools
	public static final DeferredItem<Item> ELECTRUM_SWORD = DURABLES.register("electrum_sword",
			() -> new SwordItem(CustomTiersEnum.ELECTRUM, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.ELECTRUM, 4, -3.1f))));
	public static final DeferredItem<Item> ELECTRUM_PICKAXE = DURABLES.register("electrum_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.ELECTRUM, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.ELECTRUM, 4, -3.1f))));
	public static final DeferredItem<Item> ELECTRUM_AXE = DURABLES.register("electrum_axe",
			() -> new AxeItem(CustomTiersEnum.ELECTRUM, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.ELECTRUM, 4, -3.1f))));
	public static final DeferredItem<Item> ELECTRUM_SHOVEL = DURABLES.register("electrum_shovel",
			() -> new ShovelItem(CustomTiersEnum.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.ELECTRUM, 1, -3f))));
	public static final DeferredItem<Item> ELECTRUM_HOE = DURABLES.register("electrum_hoe",
			() -> new HoeItem(CustomTiersEnum.ELECTRUM, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.ELECTRUM, -1, -2.4f))));
	// electrum armor
	public static final DeferredItem<Item> ELECTRUM_HELMET = DURABLES.register("electrum_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> ELECTRUM_CHESTPLATEPLATE = DURABLES.register("electrum_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> ELECTRUM_LEGGINGS = DURABLES.register("electrum_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> ELECTRUM_BOOTS = DURABLES.register("electrum_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ELECTRUM, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// zinc tools
	public static final DeferredItem<Item> ZINC_SWORD = DURABLES.register("zinc_sword",
			() -> new SwordItem(CustomTiersEnum.ZINC, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.ZINC, 4, -3.1f))));
	public static final DeferredItem<Item> ZINC_PICKAXE = DURABLES.register("zinc_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.ZINC, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.ZINC, 4, -3.1f))));
	public static final DeferredItem<Item> ZINC_AXE = DURABLES.register("zinc_axe",
			() -> new AxeItem(CustomTiersEnum.ZINC, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.ZINC, 4, -3.1f))));
	public static final DeferredItem<Item> ZINC_SHOVEL = DURABLES.register("zinc_shovel",
			() -> new ShovelItem(CustomTiersEnum.ZINC, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.ZINC, 1, -3f))));
	public static final DeferredItem<Item> ZINC_HOE = DURABLES.register("zinc_hoe",
			() -> new HoeItem(CustomTiersEnum.ZINC, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.ZINC, -1, -2.4f))));
	// zinc armor
	public static final DeferredItem<Item> ZINC_HELMET = DURABLES.register("zinc_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC, Type.HELMET,  new Item.Properties().durability(165).stacksTo(1)));
	public static final DeferredItem<Item> ZINC_CHESTPLATEPLATE = DURABLES.register("zinc_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC, Type.CHESTPLATE,  new Item.Properties().durability(240).stacksTo(1)));
	public static final DeferredItem<Item> ZINC_LEGGINGS = DURABLES.register("zinc_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC, Type.LEGGINGS,  new Item.Properties().durability(225).stacksTo(1)));
	public static final DeferredItem<Item> ZINC_BOOTS = DURABLES.register("zinc_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.ZINC, Type.BOOTS,  new Item.Properties().durability(195).stacksTo(1)));

	// steel tools
	public static final DeferredItem<Item> STEEL_SWORD = DURABLES.register("steel_sword",
			() -> new SwordItem(CustomTiersEnum.STEEL, new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.STEEL, 4, -3.1f))));
	public static final DeferredItem<Item> STEEL_PICKAXE = DURABLES.register("steel_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.STEEL, 4, -3.1f))));
	public static final DeferredItem<Item> STEEL_AXE = DURABLES.register("steel_axe",
			() -> new AxeItem(CustomTiersEnum.STEEL, new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.STEEL, 4, -3.1f))));
	public static final DeferredItem<Item> STEEL_SHOVEL = DURABLES.register("steel_shovel",
			() -> new ShovelItem(CustomTiersEnum.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.STEEL, 1, -3f))));
	public static final DeferredItem<Item> STEEL_HOE = DURABLES.register("steel_hoe",
			() -> new HoeItem(CustomTiersEnum.STEEL, new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.STEEL, -1, -2.4f))));
	// steel armor
	public static final DeferredItem<Item> STEEL_HELMET = DURABLES.register("steel_helmet",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL, Type.HELMET, new Item.Properties().durability(200).stacksTo(1)));
	public static final DeferredItem<Item> STEEL_CHESTPLATEPLATE = DURABLES.register("steel_chestplate",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL, Type.CHESTPLATE,  new Item.Properties().durability(300).stacksTo(1)));
	public static final DeferredItem<Item> STEEL_LEGGINGS = DURABLES.register("steel_leggings",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL, Type.LEGGINGS,  new Item.Properties().durability(255).stacksTo(1)));
	public static final DeferredItem<Item> STEEL_BOOTS = DURABLES.register("steel_boots",
			() -> new ArmorItem(MoreMetalsArmorMaterials.STEEL, Type.BOOTS,  new Item.Properties().durability(215).stacksTo(1)));

	public static void register(IEventBus eventBus) {
		DURABLES.register(eventBus);
	}
}