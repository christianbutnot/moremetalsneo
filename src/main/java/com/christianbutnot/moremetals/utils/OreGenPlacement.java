package com.christianbutnot.moremetals.utils;

import java.util.List;

import com.christianbutnot.moremetals.Main;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class OreGenPlacement {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Main.MODID);


    public static final RegistryObject<PlacedFeature> ALUMINUM_ORE_PLACED = PLACED_FEATURES.register("aluminum_ore_placed",
            () -> new PlacedFeature(OreGenUtil.ALUMINUM_ORE.getHolder().get(),
            		commonOrePlacement(4, // VeinsPerChunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(232)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED = PLACED_FEATURES.register("tin_ore_placed",
            () -> new PlacedFeature(OreGenUtil.TIN_ORE.getHolder().get(),
            		commonOrePlacement(4, // VeinsPerChunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(232)))));
    public static final RegistryObject<PlacedFeature> NICKEL_ORE_PLACED = PLACED_FEATURES.register("nickel_ore_placed",
            () -> new PlacedFeature(OreGenUtil.NICKEL_ORE.getHolder().get(),
            		commonOrePlacement(4, // VeinsPerChunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(25)))));
    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(OreGenUtil.SILVER_ORE.getHolder().get(),
            		commonOrePlacement(4, // VeinsPerChunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(25)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}