package com.christianbutnot.moremetals.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
	public static final CreativeModeTab MOREMETALS = new CreativeModeTab("moremetals") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.BRONZE_INGOT.get());
		}
	};
}