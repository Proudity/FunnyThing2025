package com.palladite.weaponsatl.enchantment;

import com.mojang.serialization.MapCodec;
import com.palladite.weaponsatl.WeaponsATL;
import com.palladite.weaponsatl.enchantment.custom.FatalityEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEnchantmentEffects {
    public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, WeaponsATL.MOD_ID);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> FATALITY =
            ENTITY_ENCHANTMENT_EFFECTS.register("fatality", () -> FatalityEffect.CODEC);

    public static void register(IEventBus eventBus) {
        ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
    }
}


