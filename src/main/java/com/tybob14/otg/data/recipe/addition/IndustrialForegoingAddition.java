package com.tybob14.otg.data.recipe.addition;

import com.buuz135.industrial.module.ModuleCore;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.lowdragmc.lowdraglib.side.fluid.forge.FluidHelperImpl;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fluids.FluidStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class IndustrialForegoingAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        addIndustrialForegoingRecipes(provider);
    }
    private static void addIndustrialForegoingRecipes(Consumer<FinishedRecipe> provider) {

        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_simple").duration(200).EUt(GTValues.VA[LV]).outputItems(new ItemStack(ModuleCore.SIMPLE.get())).inputItems(new ItemStack(ModuleCore.PITY.get())).inputItems(new UnificationEntry(plate, Polyethylene), 4).inputItems(new UnificationEntry(plate, Steel), 2).inputItems(new UnificationEntry(gear, Steel)).save(provider);
        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_advanced").duration(200).EUt(GTValues.VA[LV]).outputItems(new ItemStack(ModuleCore.ADVANCED.get())).inputItems(new ItemStack(ModuleCore.SIMPLE.get())).inputItems(new UnificationEntry(plate, Polyethylene), 4).inputItems(new UnificationEntry(plate, Aluminium), 2).inputItems(new UnificationEntry(gear, Gold)).inputItems(new ItemStack(Items.NETHERITE_SCRAP, 2)).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 500))).save(provider);
        ASSEMBLER_RECIPES.recipeBuilder("industrialforegoing/machine_frame_supreme").duration(200).EUt(GTValues.VA[LV]).outputItems(new ItemStack(ModuleCore.SUPREME.get())).inputItems(new ItemStack(ModuleCore.ADVANCED.get())).inputItems(new UnificationEntry(plate, Polyethylene), 2).inputItems(new UnificationEntry(plate, StainlessSteel), 2).inputItems(new UnificationEntry(gear, Diamond)).inputItems(new ItemStack(Items.NETHERITE_INGOT)).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 135))).save(provider);

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder("industrialforegoing/pink_slime_ball").duration(300).EUt(GTValues.VA[LV]).outputItems(ModuleCore.PINK_SLIME_ITEM.get()).notConsumable(GTItems.SHAPE_MOLD_BALL).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 300))).save(provider);

        BLAST_RECIPES.recipeBuilder("industrialforegoing/pink_slime_ingot").duration(1000).EUt(GTValues.VA[MV]).blastFurnaceTemp(2100).outputItems(ModuleCore.PINK_SLIME_INGOT.get()).inputItems(new UnificationEntry(dust, Invar), 2).inputFluids(FluidHelperImpl.toFluidStack(new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000))).save(provider);
    }
}
