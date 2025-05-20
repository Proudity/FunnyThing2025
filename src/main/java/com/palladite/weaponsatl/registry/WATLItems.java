package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WATLItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponsATL.MOD_ID);

    //Items go here

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}