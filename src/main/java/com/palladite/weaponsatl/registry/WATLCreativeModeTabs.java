package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = WeaponsATL.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class WATLCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsATL.MOD_ID);

    //Creative mode tabs go here

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }


    @SubscribeEvent
    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(WATLItems.GLOWSTONE_HAMMER);
            event.accept(WATLItems.NETHERITE_HAMMER);
            event.accept(WATLItems.DIAMOND_HAMMER);
            event.accept(WATLItems.GOLD_HAMMER);
            event.accept(WATLItems.IRON_HAMMER);
            event.accept(WATLItems.COPPER_HAMMER);
            event.accept(WATLItems.QUARTZ_HAMMER);
            event.accept(WATLItems.REDSTONE_HAMMER);
            event.accept(WATLItems.LAPIS_HAMMER);
            event.accept(WATLItems.EMERALD_HAMMER);
            event.accept(WATLItems.STONE_HAMMER);

            event.accept(WATLItems.GLOWSTONE_DAGGER);
            event.accept(WATLItems.NETHERITE_DAGGER);
            event.accept(WATLItems.DIAMOND_DAGGER);
            event.accept(WATLItems.GOLD_DAGGER);
            event.accept(WATLItems.IRON_DAGGER);
            event.accept(WATLItems.COPPER_DAGGER);
            event.accept(WATLItems.QUARTZ_DAGGER);
            event.accept(WATLItems.REDSTONE_DAGGER);
            event.accept(WATLItems.LAPIS_DAGGER);
            event.accept(WATLItems.EMERALD_DAGGER);
            event.accept(WATLItems.STONE_DAGGER);

            event.accept(WATLItems.GLOWSTONE_SCYTHE);
            event.accept(WATLItems.NETHERITE_SCYTHE);
            event.accept(WATLItems.DIAMOND_SCYTHE);
            event.accept(WATLItems.GOLD_SCYTHE);
            event.accept(WATLItems.IRON_SCYTHE);
            event.accept(WATLItems.COPPER_SCYTHE);
            event.accept(WATLItems.QUARTZ_SCYTHE);
            event.accept(WATLItems.REDSTONE_SCYTHE);
            event.accept(WATLItems.LAPIS_SCYTHE);
            event.accept(WATLItems.EMERALD_SCYTHE);
            event.accept(WATLItems.STONE_SCYTHE);
        }
    }
}