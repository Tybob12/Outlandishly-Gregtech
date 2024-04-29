package com.tybob14.otg.data.recipe.addition;

import com.buuz135.industrial.module.ModuleAgricultureHusbandry;
import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.module.ModuleMisc;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.lowdragmc.lowdraglib.side.fluid.forge.FluidHelperImpl;
import com.tybob14.otg.OutlandishlyGregtech;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ForgeItemTagsProvider;
import net.minecraftforge.fluids.FluidStack;

import java.util.function.Consumer;

import static appeng.core.definitions.AEBlocks.CUT_QUARTZ_BLOCK;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class IndustrialForegoingAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_simple").duration(200).EUt(GTValues.V[LV]).outputItems(new ItemStack(ModuleCore.SIMPLE.get())).inputItems(new ItemStack(ModuleCore.PITY.get())).inputItems(new UnificationEntry(plate, Polyethylene), 4).inputItems(new UnificationEntry(plate, Steel), 2).inputItems(new UnificationEntry(gear, Steel)).save(provider);
        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_advanced").duration(200).EUt(GTValues.V[LV]).outputItems(new ItemStack(ModuleCore.ADVANCED.get())).inputItems(new ItemStack(ModuleCore.SIMPLE.get())).inputItems(new UnificationEntry(plate, Polyethylene), 4).inputItems(new UnificationEntry(plate, Aluminium), 2).inputItems(new UnificationEntry(gear, Gold)).inputItems(new ItemStack(Items.NETHERITE_SCRAP, 2)).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 500))).save(provider);
        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_supreme").duration(200).EUt(GTValues.V[LV]).outputItems(new ItemStack(ModuleCore.SUPREME.get())).inputItems(new ItemStack(ModuleCore.ADVANCED.get())).inputItems(new UnificationEntry(plate, Polyethylene), 2).inputItems(new UnificationEntry(plate, StainlessSteel), 2).inputItems(new UnificationEntry(gear, Diamond)).inputItems(new ItemStack(Items.NETHERITE_INGOT)).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 135))).save(provider);

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder("industrialforegoing/pink_slime_ball").duration(300).EUt(GTValues.V[LV]).outputItems(ModuleCore.PINK_SLIME_ITEM.get()).notConsumable(GTItems.SHAPE_MOLD_BALL).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 300))).save(provider);

        BLAST_RECIPES.recipeBuilder("industrialforegoing/pink_slime_ingot").duration(1000).EUt(GTValues.V[MV]).blastFurnaceTemp(2100).outputItems(ModuleCore.PINK_SLIME_INGOT.get()).inputItems(new UnificationEntry(dust, Invar), 2).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000))).save(provider);

        VanillaRecipeHelper.addShapedRecipe(provider, OutlandishlyGregtech.id("industrialforegoing/pity_machine_frame"), new ItemStack(ModuleCore.PITY.get()), "ABA", "BCB", "ABA",  'A', ItemTags.LOGS, 'B', new UnificationEntry(plate, Stone), 'C', GTBlocks.MACHINE_CASING_ULV);
        VanillaRecipeHelper.addShapedRecipe(provider, OutlandishlyGregtech.id("industrialforegoing/plant_gatherer"), new ItemStack(ModuleAgricultureHusbandry.PLANT_GATHERER.getKey().get()), "ABA", "CDC", "EFE",  'A', new UnificationEntry(plate, Polyethylene), 'B', Items.IRON_HOE, 'C', Items.IRON_AXE, 'D', ModuleCore.PITY.get(), 'E', new UnificationEntry(gear, Gold), 'F', new UnificationEntry(dust, Redstone));

        VanillaRecipeHelper.addShapedRecipe(provider,
                OutlandishlyGregtech.id("industrialforegoing/wither_builder"),
                new ItemStack(ModuleAgricultureHusbandry.WITHER_BUILDER.getKey().get()), // This needs to be updated with the correct item reference
                "ABA",
                "CDC",
                "EEE",
                'A', new UnificationEntry(plate, Polyethylene),
                'B', new UnificationEntry(plate, NetherStar),
                'C', Items.WITHER_SKELETON_SKULL,
                'D', new ItemStack(ModuleCore.SUPREME.get()),
                'E', Items.SOUL_SAND
        );

    }
}
