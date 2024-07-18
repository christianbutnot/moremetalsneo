package com.christianbutnot.moremetals.common.items.cookables;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;

public class ImmortalCoalItem extends Item {

	private final int burnTicks;

	public ImmortalCoalItem(Properties properties, int burnTimeInTicks) {
		super(properties);
		this.burnTicks = burnTimeInTicks;
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
	    return this.burnTicks;
	}
	@Override
	public void appendHoverText(ItemStack stack, TooltipContext worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
	    super.appendHoverText(stack, worldIn, tooltip, flagIn);

	    tooltip.add(Component.literal("Resource Item").withStyle(ChatFormatting.LIGHT_PURPLE).withStyle(ChatFormatting.ITALIC));
	    tooltip.add(Component.literal("Cooks 288 Items").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	}

}
