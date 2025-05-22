package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import com.palladite.weaponsatl.items.WindChargeCannon;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WATLItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponsATL.MOD_ID);

    //Hammers
    public static final DeferredItem<Item> GLOWSTONE_HAMMER = ITEMS.register("glowstone_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_HAMMER = ITEMS.register("quartz_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Item(new Item.Properties()));
    //Daggers
    public static final DeferredItem<Item> GLOWSTONE_DAGGER = ITEMS.register("glowstone_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_DAGGER = ITEMS.register("gold_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_DAGGER = ITEMS.register("quartz_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_DAGGER = ITEMS.register("redstone_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_DAGGER = ITEMS.register("lapis_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
            () -> new Item(new Item.Properties()));
    //Scythes
    public static final DeferredItem<Item> GLOWSTONE_SCYTHE = ITEMS.register("glowstone_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SCYTHE = ITEMS.register("gold_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_SCYTHE = ITEMS.register("quartz_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_SCYTHE = ITEMS.register("redstone_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_SCYTHE = ITEMS.register("lapis_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_SCYTHE = ITEMS.register("emerald_scythe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_SCYTHE = ITEMS.register("stone_scythe",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WIND_CHARGE_CANNON = ITEMS.register("wind_charge_cannon",
            () -> new WindChargeCannon(new Item.Properties()));
    //This is how you add an example item.

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}