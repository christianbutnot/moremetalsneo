package com.christianbutnot.moremetals.common.items.armor;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.christianbutnot.moremetals.init.ItemInit;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class CustomArmorMaterial {

	public static final Holder<ArmorMaterial> COPPER, TIN, ALUMINUM, NICKEL, SILVER;

    static {
        COPPER = register("moremetals:copper", createMap(new int[]{2, 5, 3, 1}),
                14, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT));
    }
    
    static {
        TIN = register("moremetals:tin", createMap(new int[]{2, 5, 3, 2}),
                16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0.1f, () -> Ingredient.of(ItemInit.TIN_INGOT));
    }
    
    static {
        ALUMINUM = register("moremetals:aluminum", createMap(new int[]{2, 5, 3, 2}),
                8, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.TIN_INGOT));
    }
    
    static {
        NICKEL = register("moremetals:nickel", createMap(new int[]{2, 6, 5, 2}),
                20, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0.1f, () -> Ingredient.of(ItemInit.TIN_INGOT));
    }
    
    static {
        SILVER = register("moremetals:silver", createMap(new int[]{2, 6, 5, 2}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0.1f, () -> Ingredient.of(ItemInit.TIN_INGOT));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String string, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, new ResourceLocation(string), new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(new ResourceLocation(string))), f, g));
    }
}
