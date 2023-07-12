package com.christianbutnot.moremetals.common.items.tools;

import java.util.List;

import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.init.ItemInit;
import com.christianbutnot.moremetals.utils.CustomTags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class CustomTiers {
    public static Tier ALUMINUM;
    public static Tier TIN;
    public static Tier SILVER;
    public static Tier COPPER;
    public static Tier NICKEL;

    static {
        ALUMINUM = TierSortingRegistry.registerTier(
                new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                        CustomTags.Blocks.NEEDS_ALUMINUM_TOOL, () -> Ingredient.of(ItemInit.ALUMINUM_INGOT.get())),
                new ResourceLocation(Main.MODID, "aluminum_ingot"), List.of(Tiers.IRON), List.of());
    }
    
    static {
        SILVER = TierSortingRegistry.registerTier(
                new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                        CustomTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
                new ResourceLocation(Main.MODID, "silver_ingot"), List.of(Tiers.IRON), List.of());
    }
    
    static {
        COPPER = TierSortingRegistry.registerTier(
                new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                        CustomTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
                new ResourceLocation(Main.MODID, "copper_ingot"), List.of(Tiers.IRON), List.of());
    }
    
    static {
        TIN = TierSortingRegistry.registerTier(
                new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                        CustomTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ItemInit.TIN_INGOT.get())),
                new ResourceLocation(Main.MODID, "tin_ingot"), List.of(Tiers.IRON), List.of());
    }
    
    static {
        NICKEL = TierSortingRegistry.registerTier(
                new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                        CustomTags.Blocks.NEEDS_NICKEL_TOOL, () -> Ingredient.of(ItemInit.NICKEL_INGOT.get())),
                new ResourceLocation(Main.MODID, "nickel_ingot"), List.of(Tiers.IRON), List.of());
    }
}