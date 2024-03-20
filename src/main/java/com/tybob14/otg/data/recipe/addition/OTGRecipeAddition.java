package com.tybob14.otg.data.recipe.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.otg.common.data.OTGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MIXER_RECIPES;

public class OTGRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        addOTGRecipes(provider);
    }
    private static void addOTGRecipes(Consumer<FinishedRecipe> provider) {
        MIXER_RECIPES.recipeBuilder("mixer/signalum_dust").duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, OTGMaterials.Signalum, 4)).inputItems(new UnificationEntry(dust, GTMaterials.Copper), 3).inputItems(new UnificationEntry(dust, Silver)).inputFluids(Redstone.getFluid(576)).save(provider);
        MIXER_RECIPES.recipeBuilder("mixer/enderium_dust").duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, OTGMaterials.Enderium, 4)).inputItems(new UnificationEntry(dust, Lead), 3).inputItems(new UnificationEntry(dust, Platinum)).inputFluids(EnderPearl.getFluid(576)).save(provider);
    }
}
