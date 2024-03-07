package com.tybob14.otg.data.recipe.removal;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class BotaniaRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        removeBotaniaRecipes(registry);
    }
    private static void removeBotaniaRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("botania:mana_infusion/manasteel"));
        registry.accept(new ResourceLocation("botania:terra_plate/terrasteel_ingot"));
    }
}
