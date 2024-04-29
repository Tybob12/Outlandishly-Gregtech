package com.tybob14.otg.data.recipe.addition;

import com.enderio.base.common.init.EIOItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.tybob14.otg.OutlandishlyGregtech;
import com.tybob14.otg.common.data.materials.EnderIOMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

import java.util.function.Consumer;

public class EnderIORecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {

        ALLOY_SMELTER_RECIPES.recipeBuilder(OutlandishlyGregtech.id("enderio/copper_alloy_ingot")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.ingot, EnderIOMaterials.CopperAlloy)).inputItems(new UnificationEntry(ingot, Copper)).inputItems(new UnificationEntry(dust, Silicon)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder("enderio/pulsating_alloy_ingot").duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.ingot, EnderIOMaterials.PulsatingAlloy)).inputItems(new UnificationEntry(ingot, Iron)).inputItems(new UnificationEntry(dust, EnderPearl)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder("enderio/soularium_ingot").duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.ingot, EnderIOMaterials.Soularium)).inputItems(new UnificationEntry(ingot, Gold)).inputItems(new ItemStack(Blocks.SOUL_SAND, 2)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder("enderio/redstone_alloy_ingot").duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.ingot, EnderIOMaterials.RedstoneAlloy)).inputItems(new UnificationEntry(ingot, Iron)).inputItems(new UnificationEntry(dust, Redstone), 2).save(provider);

        BLAST_RECIPES.recipeBuilder("enderio/energetic_alloy_ingot").duration(1000).EUt(GTValues.V[MV]).blastFurnaceTemp(1800).outputItems(ChemicalHelper.get(TagPrefix.ingot, EnderIOMaterials.EnergeticAlloy)).inputItems(new UnificationEntry(ingot, Gold)).inputItems(new UnificationEntry(dust, Redstone)).inputItems(new UnificationEntry(dust, Glowstone)).save(provider);

        MIXER_RECIPES.recipeBuilder("enderio/conductive_alloy_dust").duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.dust, EnderIOMaterials.ConductiveAlloy)).inputItems(new UnificationEntry(dust, EnderIOMaterials.CopperAlloy)).inputItems(new UnificationEntry(dust, Iron)).inputItems(new UnificationEntry(dust, Redstone)).save(provider);
        MIXER_RECIPES.recipeBuilder("enderio/vibrant_alloy_dust").duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, EnderIOMaterials.VibrantAlloy)).inputItems(new UnificationEntry(dust, EnderIOMaterials.EnergeticAlloy)).inputItems(new UnificationEntry(dust, EnderPearl)).save(provider);
        MIXER_RECIPES.recipeBuilder("enderio/dark_steel_dust").duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, EnderIOMaterials.DarKSteel)).inputItems(new UnificationEntry(dust, Obsidian), 4).inputItems(new UnificationEntry(dust, Carbon), 2).inputItems(new UnificationEntry(dust, Steel)).save(provider);
        MIXER_RECIPES.recipeBuilder("enderio/end_steel_dust").duration(200).EUt(GTValues.V[HV]).outputItems(ChemicalHelper.get(TagPrefix.dust, EnderIOMaterials.EndSteel)).inputItems(new UnificationEntry(dust, EnderIOMaterials.DarKSteel)).inputItems(new UnificationEntry(dust, Endstone), 4).inputItems(new UnificationEntry(dust, Obsidian), 4).save(provider);

        MACERATOR_RECIPES.recipeBuilder("enderio/grains_of_prescience").duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.PRESCIENT_POWDER).inputItems(EIOItems.PRESCIENT_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder("enderio/grains_of_vibrancy").duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.VIBRANT_POWDER).inputItems(EIOItems.VIBRANT_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder("enderio/grains_of_piezallity").duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.PULSATING_POWDER).inputItems(EIOItems.PULSATING_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder("enderio/grains_of_ender").duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.ENDER_CRYSTAL_POWDER).inputItems(EIOItems.ENDER_CRYSTAL).save(provider);

    }
}
