package com.christianbutnot.moremetals.common.items;

import javax.annotation.Nullable;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class SulfurItem extends ResourceItem {

	private final int burnTicks;

	public SulfurItem(Properties properties, int burnTimeInTicks) {
		super(properties);
		this.burnTicks = burnTimeInTicks;
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
	    return this.burnTicks;
	}

}
