package com.christianbutnot.moremetals.common.items.armor;

import java.util.function.Supplier;

import com.christianbutnot.moremetals.init.ItemInit;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum CustomArmorMaterials implements ArmorMaterial {
	
	COPPER("copper", 1, new int[]{2, 5, 3, 1}, 14, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
			() -> Ingredient.of(Items.COPPER_INGOT)),
	TIN("tin", 2, new int[]{2, 5, 3, 2}, 16, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.1F,
			() -> Ingredient.of(ItemInit.TIN_INGOT.get())),
	ALUMINUM("aluminum", 1, new int[]{2, 5, 3, 2}, 8, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5F, 0.0F,
			() -> Ingredient.of(ItemInit.ALUMINUM_INGOT.get())),
	NICKEL("nickel", 3, new int[]{2, 6, 5, 2}, 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5F, 0.1F,
			() -> Ingredient.of(ItemInit.NICKEL_INGOT.get())),
	SILVER("silver", 3, new int[]{2, 6, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5F, 0.1F,
			() -> Ingredient.of(ItemInit.SILVER_INGOT.get()));

	private static int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private Ingredient repairIngredient;
	
	CustomArmorMaterials(String name, int durabilityMultiplier, int[] armorVal, int enchantability,
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
		
	}

	
	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}