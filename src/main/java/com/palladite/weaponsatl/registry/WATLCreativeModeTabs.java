package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WATLCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsATL.MOD_ID);

    //Creative mode tabs go here

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

}