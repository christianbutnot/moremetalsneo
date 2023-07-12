package com.christianbutnot.moremetals;

import com.christianbutnot.moremetals.init.BlockInit;
import com.christianbutnot.moremetals.init.DurablesInit;
import com.christianbutnot.moremetals.init.ItemInit;
import com.christianbutnot.moremetals.loot.LootTableAdditiveMethod;
import com.christianbutnot.moremetals.utils.OreGenUtil;
import com.christianbutnot.moremetals.utils.OreGenPlacement;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "moremetals";

    public Main()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        DurablesInit.register(modEventBus);
        
        LootTableAdditiveMethod.register(modEventBus);
        
        OreGenUtil.register(modEventBus);
        OreGenPlacement.register(modEventBus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}

