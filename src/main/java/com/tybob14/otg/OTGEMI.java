package com.tybob14.otg;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.buuz135.industrial.block.generator.mycelial.FurnaceGeneratorType;
import com.buuz135.industrial.block.generator.mycelial.IMycelialGeneratorType;
import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.module.ModuleGenerator;
import com.enderio.base.common.init.EIOItems;
import com.lowdragmc.lowdraglib.Platform;
import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;

@EmiEntrypoint
public class OTGEMI implements EmiPlugin {
    @Override
    public void register(EmiRegistry registry) {

        if (Platform.isModLoaded("ae2")) {
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CHARGER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CHIPPED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CRANK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CREATIVE_ENERGY_CELL));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.DAMAGED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.FLAWED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.FLAWLESS_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.GROWTH_ACCELERATOR));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.INSCRIBER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.LARGE_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.MEDIUM_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.MYSTERIOUS_CUBE));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.NOT_SO_MYSTERIOUS_CUBE));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_BLOCK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_CLUSTER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_SLAB));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_STAIRS));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_WALL));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SKY_STONE_CHEST));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SKY_STONE_TANK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SMALL_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SMOOTH_SKY_STONE_CHEST));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.VIBRATION_CHAMBER));
            registry.removeEmiStacks(EmiStack.of(AEItems.CALCULATION_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_KNIFE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_WRENCH));
            registry.removeEmiStacks(EmiStack.of(AEItems.CHARGED_STAFF));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENDER_DUST));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENGINEERING_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENTROPY_MANIPULATOR));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUID_CELL_CREATIVE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.ITEM_CELL_CREATIVE));
            registry.removeEmiStacks(EmiStack.of(AEItems.LOGIC_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.METEORITE_COMPASS));
            registry.removeEmiStacks(EmiStack.of(AEItems.NAME_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_KNIFE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_WRENCH));
            registry.removeEmiStacks(EmiStack.of(AEItems.SILICON));
            registry.removeEmiStacks(EmiStack.of(AEItems.SILICON_PRESS));

            if (Platform.isDevEnv()){
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_CARD));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_ERASER));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_METEORITE_PLACER));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_REPLICATOR_CARD));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_ITEM_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_CHUNK_LOADER));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_CUBE_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_ENERGY_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_PHANTOM_NODE));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DENSE_ENERGY_CELL));
            }
        }

        if (Platform.isModLoaded("enderio")) {
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_COAL));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_IRON));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_GOLD));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_COPPER));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_TIN));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_ENDER_PEARL));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_OBSIDIAN));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_COBALT));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_LAPIS_LAZULI));
            registry.removeEmiStacks(EmiStack.of(EIOItems.POWDERED_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(EIOItems.SOUL_POWDER));
            registry.removeEmiStacks(EmiStack.of(EIOItems.CONFUSION_POWDER));
            registry.removeEmiStacks(EmiStack.of(EIOItems.WITHERING_POWDER));
            registry.removeEmiStacks(EmiStack.of(EIOItems.FLOUR));
            registry.removeEmiStacks(EmiStack.of(EIOItems.SILICON));
            registry.removeEmiStacks(EmiStack.of(EIOItems.GEAR_WOOD));
            registry.removeEmiStacks(EmiStack.of(EIOItems.GEAR_STONE));
            registry.removeEmiStacks(EmiStack.of(EIOItems.GEAR_IRON));
        }

        if (Platform.isModLoaded("industrialforegoing")) {
            registry.removeEmiStacks(EmiStack.of(ModuleGenerator.PITIFUL_GENERATOR.getKey().get()));
            registry.removeEmiStacks(EmiStack.of(ModuleGenerator.BIOFUEL_GENERATOR.getKey().get()));
            registry.removeEmiStacks(EmiStack.of(ModuleGenerator.MYCELIAL_REACTOR.getKey().get()));
            for (int i = 1; i < IMycelialGeneratorType.TYPES.size(); i++){
                registry.removeEmiStacks(EmiStack.of(ModuleGenerator.MYCELIAL_GENERATORS.get(i).getKey().get()));
            }
            registry.removeEmiStacks(EmiStack.of(ModuleCore.DISSOLUTION_CHAMBER.getKey().get()));
            registry.removeEmiStacks(EmiStack.of(ModuleCore.LATEX_PROCESSING.getKey().get()));
            registry.removeEmiStacks(EmiStack.of(ModuleCore.DIAMOND_GEAR.get()));
            registry.removeEmiStacks(EmiStack.of(ModuleCore.GOLD_GEAR.get()));
            registry.removeEmiStacks(EmiStack.of(ModuleCore.IRON_GEAR.get()));

            registry.removeEmiStacks(EmiStack.of(ModuleCore.TINY_DRY_RUBBER.get()));
            registry.removeEmiStacks(EmiStack.of(ModuleCore.DRY_RUBBER.get()));
            //registry.removeEmiStacks(EmiStack.of(ModuleCore.PLASTIC.get()));

        }

    }
}
