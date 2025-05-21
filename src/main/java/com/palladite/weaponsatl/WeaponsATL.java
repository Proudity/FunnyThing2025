package com.palladite.weaponsatl;

import com.palladite.weaponsatl.enchantment.ModEnchantmentEffects;
import com.palladite.weaponsatl.registry.WATLBlocks;
import com.palladite.weaponsatl.registry.WATLCreativeModeTabs;
import com.palladite.weaponsatl.registry.WATLItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(WeaponsATL.MOD_ID)
public class WeaponsATL {
    public static final String MOD_ID = "weaponsatl";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WeaponsATL(IEventBus modEventBus, ModContainer modContainer) {
        WATLBlocks.register(modEventBus);
        WATLItems.register(modEventBus);
        WATLCreativeModeTabs.register(modEventBus);

        ModEnchantmentEffects.register(modEventBus);
    }

}