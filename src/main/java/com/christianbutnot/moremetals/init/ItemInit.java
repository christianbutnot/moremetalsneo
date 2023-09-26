package com.christianbutnot.moremetals.init;

import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.common.items.ResourceItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    
    //INGOTS
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			() -> new ResourceItem(new Item.Properties()));
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
			() -> new ResourceItem(new Item.Properties()));


	//NUGGETS
		//public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
		//		() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
				() -> new ResourceItem(new Item.Properties()));

	//DUSTS
		//public static final RegistryObject<Item> ROSE_GOLD_DUST = ITEMS.register("rose_gold_dust",
		//		() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
				() -> new ResourceItem(new Item.Properties()));
		public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
				() -> new ResourceItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}