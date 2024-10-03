package com.christianbutnot.moremetals;

import com.christianbutnot.moremetals.init.BlockInit;
import com.christianbutnot.moremetals.init.CreativeTabs;
import com.christianbutnot.moremetals.init.DurablesInit;
import com.christianbutnot.moremetals.init.ItemInit;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "moremetals";

    public Main(IEventBus eventBus, ModContainer container) {
        
    	ItemInit.register(eventBus);
        BlockInit.register(eventBus);
        DurablesInit.register(eventBus);
        
        CreativeTabs.register(eventBus);
        
    }
}
