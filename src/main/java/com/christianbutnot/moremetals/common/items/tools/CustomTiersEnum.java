package com.christianbutnot.moremetals.common.items.tools;

import java.util.function.Supplier;

import com.christianbutnot.moremetals.init.ItemInit;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum CustomTiersEnum implements Tier {
	
	ALUMINUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 199, 6.0F, 2.0F, 8, () -> Ingredient.of(ItemInit.ALUMINUM_INGOT)),
	TIN(BlockTags.INCORRECT_FOR_IRON_TOOL, 221, 6.0F, 2.0F, 16, () -> Ingredient.of(ItemInit.TIN_INGOT)),
	SILVER(BlockTags.INCORRECT_FOR_IRON_TOOL, 245, 6.0F, 2.0F, 25, () -> Ingredient.of(ItemInit.SILVER_INGOT)),
	BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 6.0F, 2.0F, 16, () -> Ingredient.of(ItemInit.BRONZE_INGOT)),
	COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 190, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.COPPER_INGOT)),
	NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 6.0F, 2.0F, 20, () -> Ingredient.of(ItemInit.NICKEL_INGOT)),
	LEAD(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 12, () -> Ingredient.of(ItemInit.LEAD_INGOT)),
	ELECTRUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, () -> Ingredient.of(ItemInit.ELECTRUM_INGOT)),
	ZINC(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, () -> Ingredient.of(ItemInit.ZINC_INGOT)),
	STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 6.0F, 2.0F, 12, () -> Ingredient.of(ItemInit.STEEL_INGOT));
	
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