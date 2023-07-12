package com.christianbutnot.moremetals.utils;

import java.util.List;

import com.christianbutnot.moremetals.Main;
import com.christianbutnot.moremetals.init.BlockInit;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class OreGenUtil {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Main.MODID);
    
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALUMINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.ALUMINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.ALUMINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NICKEL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.NICKEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.NICKEL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.SILVER_ORE.get().defaultBlockState())));
    
    
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALUMINUM_ORE = CONFIGURED_FEATURES.register("aluminum_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINUM_ORES.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NICKEL_ORE = CONFIGURED_FEATURES.register("nickel_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_NICKEL_ORES.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 8)));
    
    
    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}