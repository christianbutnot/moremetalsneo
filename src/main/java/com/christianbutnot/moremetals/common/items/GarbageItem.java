package com.christianbutnot.moremetals.common.items;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class GarbageItem extends Item {

	public GarbageItem(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
	    super.appendHoverText(stack, worldIn, tooltip, flagIn);

	    tooltip.add(Component.literal("Common Item").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	}
}
