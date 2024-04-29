package com.tybob14.otg.data.recipe;

import com.lowdragmc.lowdraglib.Platform;
import com.tybob14.otg.data.recipe.addition.*;
import com.tybob14.otg.data.recipe.removal.AE2RecipeRemoval;
import com.tybob14.otg.data.recipe.removal.BotaniaRecipeRemoval;
import com.tybob14.otg.data.recipe.removal.EnderIORecipeRemoval;
import com.tybob14.otg.data.recipe.removal.IndustrialForegoingRemoval;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class OTGRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {
        OTGRecipeAddition.init(provider);
        if (Platform.isModLoaded("ae2")) AE2RecipeAddition.init(provider);
        if (Platform.isModLoaded("botania")) BotaniaRecipeAddition.init(provider);
        if (Platform.isModLoaded("industrialforegoing")) IndustrialForegoingAddition.init(provider);
        if (Platform.isModLoaded("enderio")) EnderIORecipeAddition.init(provider);


    }
    public static void removedInit(Consumer<ResourceLocation> provider) {
        if (Platform.isModLoaded("ae2")) AE2RecipeRemoval.init(provider);
        if (Platform.isModLoaded("botania")) BotaniaRecipeRemoval.init(provider);
        if (Platform.isModLoaded("industrialforegoing")) IndustrialForegoingRemoval.init(provider);
        if (Platform.isModLoaded("enderio")) EnderIORecipeRemoval.init(provider);

    }
}

