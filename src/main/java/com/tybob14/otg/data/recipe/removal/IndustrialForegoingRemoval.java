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
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber"));
        registry.accept(new ResourceLocation("industrialforegoing:latex_processing_unit"));
        registry.accept(new ResourceLocation("industrialforegoing:plant_gatherer"));
        registry.accept(new ResourceLocation("industrialforegoing:diamond_gear"));
        registry.accept(new ResourceLocation("industrialforegoing:gold_gear"));
        registry.accept(new ResourceLocation("industrialforegoing:iron_gear"));
        registry.accept(new ResourceLocation("industrialforegoing:dryrubber"));
        registry.accept(new ResourceLocation("industrialforegoing:plastic"));


        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/biofuel_generator"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_furnace"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_slimey"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_culinary"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_potion"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_disenchantment"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_ender"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_explosive"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_frosty"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_halitosis"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_magma"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_pink"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_netherstar"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_death"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_rocket"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_crimed"));
        registry.accept(new ResourceLocation("industrialforegoing:dissolution_chamber/mycelial_meatalurgic"));
    }
}
