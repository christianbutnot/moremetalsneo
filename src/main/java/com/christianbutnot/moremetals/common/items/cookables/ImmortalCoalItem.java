package com.christianbutnot.moremetals.common.items.cookables;

import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;

public class ImmortalCoalItem extends Item {



	public ImmortalCoalItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
		return 2400;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, TooltipDisplay tooltipDisplay, Consumer<Component> components,
			TooltipFlag flag) {

		components.accept(Component.literal("Resource Item").withStyle(ChatFormatting.LIGHT_PURPLE).withStyle(ChatFormatting.ITALIC));
		components.accept(Component.literal("Cooks 288 Items").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	
	super.appendHoverText(stack, level, tooltipDisplay, components, flag);
	}

}