package com.christianbutnot.moremetals;

import org.slf4j.Logger;

import com.christianbutnot.moremetals.init.BlockInit;
import com.christianbutnot.moremetals.init.CreativeTabs;
import com.christianbutnot.moremetals.init.DurablesInit;
import com.christianbutnot.moremetals.init.ItemInit;
import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "moremetals";

    public Main(IEventBus eventBus, ModContainer container) {
        
    	ItemInit.register(eventBus);
        BlockInit.register(eventBus);
        DurablesInit.register(eventBus);
        
        CreativeTabs.register(eventBus);
        
    }
    
    private static final Logger LOGGER = LogUtils.getLogger();
	   
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("[JustAnotherLibrary] MoreMetals reporting for duty.");
        }
    }
}
