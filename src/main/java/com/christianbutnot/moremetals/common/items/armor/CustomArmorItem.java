package com.christianbutnot.moremetals.common.items.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class CustomArmorItem extends ArmorItem {

	public CustomArmorItem(Holder<ArmorMaterial> material, Type type, int durabilityMultiplier, Properties properties) {
        super(material, type, properties.durability(new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * durabilityMultiplier));

	}
}