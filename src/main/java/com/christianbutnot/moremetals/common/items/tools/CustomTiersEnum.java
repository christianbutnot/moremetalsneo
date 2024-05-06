package com.christianbutnot.moremetals.common.items.tools;

import java.util.function.Supplier;

import com.christianbutnot.moremetals.init.ItemInit;
import com.christianbutnot.moremetals.utils.CustomTags;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum CustomTiersEnum implements Tier {
	
	ALUMINUM(CustomTags.Blocks.NEEDS_ALUMINUM_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(ItemInit.ALUMINUM_INGOT)),
	TIN(CustomTags.Blocks.NEEDS_TIN_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(ItemInit.TIN_INGOT)),
	SILVER(CustomTags.Blocks.NEEDS_SILVER_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(ItemInit.SILVER_INGOT)),
	COPPER(CustomTags.Blocks.NEEDS_COPPER_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.COPPER_INGOT)),
	NICKEL(CustomTags.Blocks.NEEDS_NICKEL_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(ItemInit.NICKEL_INGOT));
	
    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    CustomTiersEnum(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}