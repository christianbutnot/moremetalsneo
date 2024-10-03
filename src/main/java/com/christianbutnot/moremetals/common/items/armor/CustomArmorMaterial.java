package com.christianbutnot.moremetals.common.items.armor;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.christianbutnot.moremetals.Main;
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

	public static final Holder<ArmorMaterial> COPPER, TIN, BRONZE, ALUMINUM, NICKEL, SILVER, LEAD, ZINC, STEEL, ELECTRUM;

    static {
        COPPER = register("copper", createMap(new int[]{2, 5, 3, 1}),
                14, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT));
    }
    
    static {
        TIN = register("tin", createMap(new int[]{2, 5, 3, 2}),
                16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(ItemInit.TIN_INGOT));
    }
    
    static {
        BRONZE = register("bronze", createMap(new int[]{2, 5, 3, 2}),
                16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(ItemInit.BRONZE_INGOT));
    }
    
    static {
        ALUMINUM = register("aluminum", createMap(new int[]{2, 5, 3, 2}),
                8, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.ALUMINUM_INGOT));
    }
    
    static {
        NICKEL = register("nickel", createMap(new int[]{2, 6, 5, 2}),
                20, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.NICKEL_INGOT));
    }
    
    static {
        SILVER = register("silver", createMap(new int[]{2, 6, 5, 2}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.SILVER_INGOT));
    }
    static {
        LEAD = register("lead", createMap(new int[]{3, 6, 5, 2}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.LEAD_INGOT));
    }
    static {
        ZINC = register("zinc", createMap(new int[]{2, 6, 5, 2}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.ZINC_INGOT));
    }
    static {
        ELECTRUM = register("electrum", createMap(new int[]{2, 7, 5, 2}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.ELECTRUM_INGOT));
    }
    static {
        STEEL = register("steel", createMap(new int[]{3, 7, 5, 3}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(ItemInit.STEEL_INGOT));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
    	ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Main.MODID, name);
    	List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));
    	
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location, new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
    }
}
