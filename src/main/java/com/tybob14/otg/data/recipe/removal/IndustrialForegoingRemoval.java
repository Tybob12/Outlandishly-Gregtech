package com.tybob14.otg.data.recipe.removal;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class IndustrialForegoingRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        removeIndustrialForegoingRecipes(registry);
    }
    private static void removeIndustrialForegoingRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("industrialforegoing:machine_frame_pity"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/simple_machine_frame"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/advanced_machine_frame"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/supreme_machine_frame"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/pink_slime_ball"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/pink_slime_ingot"));
    }
}
