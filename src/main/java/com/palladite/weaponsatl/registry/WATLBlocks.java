package com.palladite.weaponsatl.registry;

import com.palladite.weaponsatl.WeaponsATL;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WATLBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WeaponsATL.MOD_ID);

    //Blocks go here

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static DeferredBlock<Block> registerWithItem(String blockID, Supplier<? extends Block> sup) {
        DeferredBlock<Block> block = registerWithNoItem(blockID, sup);
        WATLItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    private static DeferredBlock<Block> registerWithNoItem(String blockID, Supplier<? extends Block> sup) {
        return BLOCKS.register(blockID, sup);
    }

}