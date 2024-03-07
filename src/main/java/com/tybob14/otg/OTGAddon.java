package com.tybob14.otg;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.tybob14.otg.api.registries.OTGRegistries;
import com.tybob14.otg.data.recipe.OTGRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

@GTAddon
public class OTGAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return OTGRegistries.REGISTRATE;
    }

    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return OutlandishlyGregtech.MOD_ID;
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> provider) {
        OTGRecipes.removedInit(provider);
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        OTGRecipes.newInit(provider);
    }
}