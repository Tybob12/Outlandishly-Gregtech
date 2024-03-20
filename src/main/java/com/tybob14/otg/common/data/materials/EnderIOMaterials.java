package com.tybob14.otg.common.data.materials;

import com.enderio.base.common.init.EIOBlocks;
import com.enderio.base.common.init.EIOItems;
import com.enderio.machines.EIOMachines;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.otg.OutlandishlyGregtech;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.nugget;

public class EnderIOMaterials {

    public static void init(){
        ingot.setIgnored(CopperAlloy);
        block.setIgnored(CopperAlloy);
        nugget.setIgnored(CopperAlloy);
        ingot.setIgnored(EnergeticAlloy);
        block.setIgnored(EnergeticAlloy);
        nugget.setIgnored(EnergeticAlloy);
        ingot.setIgnored(VibrantAlloy);
        block.setIgnored(VibrantAlloy);
        nugget.setIgnored(VibrantAlloy);
        ingot.setIgnored(RedstoneAlloy);
        block.setIgnored(RedstoneAlloy);
        nugget.setIgnored(RedstoneAlloy);
        ingot.setIgnored(ConductiveAlloy);
        block.setIgnored(ConductiveAlloy);
        nugget.setIgnored(ConductiveAlloy);
        ingot.setIgnored(PulsatingAlloy);
        block.setIgnored(PulsatingAlloy);
        nugget.setIgnored(PulsatingAlloy);
        ingot.setIgnored(DarKSteel);
        block.setIgnored(DarKSteel);
        nugget.setIgnored(DarKSteel);
        ingot.setIgnored(Soularium);
        block.setIgnored(Soularium);
        nugget.setIgnored(Soularium);
        ingot.setIgnored(EndSteel);
        block.setIgnored(EndSteel);
        nugget.setIgnored(EndSteel);
    }

    public static void modifyMaterials(){
        ingot.setIgnored(CopperAlloy, EIOItems.COPPER_ALLOY_INGOT);
        block.setIgnored(CopperAlloy, EIOBlocks.COPPER_ALLOY_BLOCK);
        nugget.setIgnored(CopperAlloy, EIOItems.COPPER_ALLOY_NUGGET);
        ingot.setIgnored(EnergeticAlloy, EIOItems.ENERGETIC_ALLOY_INGOT);
        block.setIgnored(EnergeticAlloy, EIOBlocks.ENERGETIC_ALLOY_BLOCK);
        nugget.setIgnored(EnergeticAlloy, EIOItems.ENERGETIC_ALLOY_NUGGET);
        ingot.setIgnored(VibrantAlloy, EIOItems.VIBRANT_ALLOY_INGOT);
        block.setIgnored(VibrantAlloy, EIOBlocks.VIBRANT_ALLOY_BLOCK);
        nugget.setIgnored(VibrantAlloy, EIOItems.VIBRANT_ALLOY_NUGGET);
        ingot.setIgnored(RedstoneAlloy, EIOItems.REDSTONE_ALLOY_INGOT);
        block.setIgnored(RedstoneAlloy, EIOBlocks.REDSTONE_ALLOY_BLOCK);
        nugget.setIgnored(RedstoneAlloy, EIOItems.REDSTONE_ALLOY_NUGGET);
        ingot.setIgnored(ConductiveAlloy, EIOItems.CONDUCTIVE_ALLOY_INGOT);
        block.setIgnored(ConductiveAlloy, EIOBlocks.CONDUCTIVE_ALLOY_BLOCK);
        nugget.setIgnored(ConductiveAlloy, EIOItems.CONDUCTIVE_ALLOY_NUGGET);
        ingot.setIgnored(PulsatingAlloy, EIOItems.PULSATING_ALLOY_INGOT);
        block.setIgnored(PulsatingAlloy, EIOBlocks.PULSATING_ALLOY_BLOCK);
        nugget.setIgnored(PulsatingAlloy, EIOItems.PULSATING_ALLOY_NUGGET);
        ingot.setIgnored(DarKSteel, EIOItems.DARK_STEEL_INGOT);
        block.setIgnored(DarKSteel, EIOBlocks.DARK_STEEL_BLOCK);
        nugget.setIgnored(DarKSteel, EIOItems.DARK_STEEL_NUGGET);
        ingot.setIgnored(Soularium, EIOItems.SOULARIUM_INGOT);
        block.setIgnored(Soularium, EIOBlocks.SOULARIUM_BLOCK);
        nugget.setIgnored(Soularium, EIOItems.SOULARIUM_NUGGET);
        ingot.setIgnored(EndSteel, EIOItems.END_STEEL_INGOT);
        block.setIgnored(EndSteel, EIOBlocks.END_STEEL_BLOCK);
        nugget.setIgnored(EndSteel, EIOItems.END_STEEL_NUGGET);
    }


    public static final Material CopperAlloy = new Material.Builder(OutlandishlyGregtech.id("copper_alloy"))
            .color(0xB97D06).secondaryColor(0x7B5504)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Copper, 1, GTMaterials.Silicon, 1)
            .buildAndRegister();

    public static final Material EnergeticAlloy = new Material.Builder(OutlandishlyGregtech.id("energetic_alloy"))
            .color(0xE9A300).secondaryColor(0xEFBE4E)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[MV], 4, 0)
            .components(GTMaterials.Redstone, 1, GTMaterials.Gold, 1, GTMaterials.Glowstone, 1)
            .buildAndRegister();

    public static final Material VibrantAlloy = new Material.Builder(OutlandishlyGregtech.id("vibrant_alloy"))
            .color(0xE9FF76).secondaryColor(0x9AA644)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[EV], 4, 0)
            .blastTemp(2200, BlastProperty.GasTier.LOW, GTValues.VA[HV], 2000)
            .components(EnergeticAlloy, 1, GTMaterials.EnderPearl, 1)
            .buildAndRegister();

    public static final Material RedstoneAlloy = new Material.Builder(OutlandishlyGregtech.id("redstone_alloy"))
            .color(0xF95D5D).secondaryColor(0x631919)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Redstone, 1, GTMaterials.Silicon, 1)
            .buildAndRegister();

    public static final Material ConductiveAlloy = new Material.Builder(OutlandishlyGregtech.id("conductive_alloy"))
            .color(0xC79390).secondaryColor(0xA98579)
            .iconSet(SHINY)
            .ingot()
            .components(CopperAlloy, 1, GTMaterials.Iron, 1, GTMaterials.Redstone, 1)
            .buildAndRegister();

    public static final Material PulsatingAlloy = new Material.Builder(OutlandishlyGregtech.id("pulsating_alloy"))
            .color(0x9CEFAE).secondaryColor(0x407F4F)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Iron, 1, GTMaterials.EnderPearl, 1)
            .buildAndRegister();

    public static final Material DarKSteel = new Material.Builder(OutlandishlyGregtech.id("dark_steel"))
            .color(0x777676).secondaryColor(0x2A2B2A)
            .iconSet(SHINY)
            .ingot()
            .blastTemp(3600, BlastProperty.GasTier.MID, GTValues.VA[EV], 3600)
            .components(GTMaterials.Iron, 1, GTMaterials.Obsidian, 1, GTMaterials.Coal, 1)
            .buildAndRegister();

    public static final Material Soularium = new Material.Builder(OutlandishlyGregtech.id("soularium"))
            .color(0x624D22).secondaryColor(0x39260F)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Gold, 1, GTMaterials.Netherrack, 1)
            .buildAndRegister();

    public static final Material EndSteel = new Material.Builder(OutlandishlyGregtech.id("end_steel"))
            .color(0xC0B868).secondaryColor(0x9C9758)
            .iconSet(SHINY)
            .ingot()
            .blastTemp(4500, BlastProperty.GasTier.MID, GTValues.VA[EV], 5000)
            .components(GTMaterials.Endstone, 1, GTMaterials.Obsidian, 1, DarKSteel, 1)
            .buildAndRegister();

    public static final Material StellarAlloy = new Material.Builder(OutlandishlyGregtech.id("stellar_alloy"))
            .color(0xBAD4FF)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[ZPM], 4, 0)
            .blastTemp(4500, BlastProperty.GasTier.MID, GTValues.VA[EV], 5000)
            .components(GTMaterials.Endstone, 1, GTMaterials.Obsidian, 1, DarKSteel, 1)
            .buildAndRegister();
}
