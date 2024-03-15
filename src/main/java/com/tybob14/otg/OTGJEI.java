package com.tybob14.otg;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.*;

@JeiPlugin
public class OTGJEI implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return OutlandishlyGregtech.id("jei_plugin");
    }

    @Override
    public void onRuntimeAvailable(@NotNull IJeiRuntime runtime) {
        final String[] HIDDEN_ITEMS = {
                "ae2:calculation_processor_press",
                "ae2:certus_quartz_axe",
                "ae2:certus_quartz_cutting_knife",
                "ae2:certus_quartz_cutting_knife",
                "ae2:certus_quartz_hoe",
                "ae2:certus_quartz_pickaxe",
                "ae2:certus_quartz_shovel",
                "ae2:certus_quartz_sword",
                "ae2:certus_quartz_wrench",
                "ae2:charged_certus_quartz_crystal",
                "ae2:charged_staff",
                "ae2:charger",
                "ae2:chipped_budding_quartz",
                "ae2:crank",
                "ae2:creative_energy_cell",
                "ae2:creative_fluid_cell",
                "ae2:creative_item_cell",
                "ae2:damaged_budding_quartz",
                "ae2:ender_dust",
                "ae2:engineering_processor_press",
                "ae2:entropy_manipulator",
                "ae2:flawed_budding_quartz",
                "ae2:flawless_budding_quartz",
                "ae2:fluix_axe",
                "ae2:fluix_hoe",
                "ae2:fluix_pickaxe",
                "ae2:fluix_shovel",
                "ae2:fluix_sword",
                "ae2:growth_accelerator",
                "ae2:guide",
                "ae2:inscriber",
                "ae2:large_quartz_bud",
                "ae2:logic_processor_press",
                "ae2:medium_quartz_bud",
                "ae2:meteorite_compass",
                "ae2:mysterious_cube",
                "ae2:name_press",
                "ae2:nether_quartz_axe",
                "ae2:nether_quartz_cutting_knife",
                "ae2:nether_quartz_cutting_knife",
                "ae2:nether_quartz_hoe",
                "ae2:nether_quartz_pickaxe",
                "ae2:nether_quartz_shovel",
                "ae2:nether_quartz_sword",
                "ae2:nether_quartz_wrench",
                "ae2:not_so_mysterious_cube",
                "ae2:quartz_block",
                "ae2:quartz_cluster",
                "ae2:quartz_slab",
                "ae2:quartz_stairs",
                "ae2:quartz_wall",
                "ae2:silicon",
                "ae2:silicon_press",
                "ae2:sky_stone_chest",
                "ae2:sky_stone_tank",
                "ae2:small_quartz_bud",
                "ae2:smooth_sky_stone_chest",
                "ae2:vibration_chamber"
        };

        List<ItemStack> itemsToHide = new ArrayList<>();
        for (var item : ForgeRegistries.ITEMS) {
            final String key = (ForgeRegistries.ITEMS.getKey(item.asItem()).toString());
            for (final var check : HIDDEN_ITEMS) {
                if (key.equals(check)) {
                    itemsToHide.add(item.getDefaultInstance());
                }
            }
        }
        runtime.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, itemsToHide);
    }
}
