package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@EventBusSubscriber(modid = WeaponsATL.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class WATLCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsATL.MOD_ID);

    //Creative mode tabs go here
    public static final Supplier<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
            "example_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(WATLItems.GLOWSTONE_SCYTHE.get()))
                    .title(Component.translatable("creativetab.weaponsatl.example_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(WATLItems.GLOWSTONE_SCYTHE);
                        output.accept(WATLItems.GLOWSTONE_HAMMER);
                        output.accept(WATLItems.NETHERITE_HAMMER);
                        output.accept(WATLItems.DIAMOND_HAMMER);
                        output.accept(WATLItems.GOLD_HAMMER);
                        output.accept(WATLItems.IRON_HAMMER);
                        output.accept(WATLItems.COPPER_HAMMER);
                        output.accept(WATLItems.QUARTZ_HAMMER);
                        output.accept(WATLItems.REDSTONE_HAMMER);
                        output.accept(WATLItems.LAPIS_HAMMER);
                        output.accept(WATLItems.EMERALD_HAMMER);
                        output.accept(WATLItems.STONE_HAMMER);
                        output.accept(WATLItems.GLOWSTONE_DAGGER);
                        output.accept(WATLItems.NETHERITE_DAGGER);
                        output.accept(WATLItems.DIAMOND_DAGGER);
                        output.accept(WATLItems.GOLD_DAGGER);
                        output.accept(WATLItems.IRON_DAGGER);
                        output.accept(WATLItems.COPPER_DAGGER);
                        output.accept(WATLItems.QUARTZ_DAGGER);
                        output.accept(WATLItems.REDSTONE_DAGGER);
                        output.accept(WATLItems.LAPIS_DAGGER);
                        output.accept(WATLItems.EMERALD_DAGGER);
                        output.accept(WATLItems.STONE_DAGGER);
                        output.accept(WATLItems.NETHERITE_SCYTHE);
                        output.accept(WATLItems.DIAMOND_SCYTHE);
                        output.accept(WATLItems.GOLD_SCYTHE);
                        output.accept(WATLItems.IRON_SCYTHE);
                        output.accept(WATLItems.COPPER_SCYTHE);
                        output.accept(WATLItems.QUARTZ_SCYTHE);
                        output.accept(WATLItems.REDSTONE_SCYTHE);
                        output.accept(WATLItems.LAPIS_SCYTHE);
                        output.accept(WATLItems.EMERALD_SCYTHE);
                        output.accept(WATLItems.STONE_SCYTHE);
                    })
                    .build()
    );


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
            event.accept(WATLItems.WIND_CHARGE_CANNON);

            event.accept(WATLBlocks.EXAMPLE_BLOCK);
        }
    }
}