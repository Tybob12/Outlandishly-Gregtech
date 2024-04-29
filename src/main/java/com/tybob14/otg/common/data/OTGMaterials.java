package com.tybob14.otg.common.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.otg.OutlandishlyGregtech;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.tybob14.otg.api.registries.OTGRegistries.REGISTRATE;


@SuppressWarnings("unused")
public class OTGMaterials {

    public static void init(){

    }

    public static void modifyMaterials(){
        GTMaterials.EnderPearl.setProperty(PropertyKey.FLUID, new FluidProperty());
        GTMaterials.Gold.addFlags(MaterialFlags.GENERATE_GEAR);
    }

    static {REGISTRATE.creativeModeTab(() -> OTGCreativeModeTabs.OTG);}

    public static final Material Signalum = new Material.Builder(OutlandishlyGregtech.id("signalum"))
            .color(0xEF3706).secondaryColor(0xA40E01)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[HV], 4, 0)
            .blastTemp(1800, BlastProperty.GasTier.LOW, GTValues.VA[MV], 2000)
            .components(GTMaterials.Copper, 3, GTMaterials.Silver, 1, GTMaterials.Redstone, 4)
            .buildAndRegister();

    public static final Material Enderium = new Material.Builder(OutlandishlyGregtech.id("enderium"))
            .color(0x2CA9AE).secondaryColor(0x0B3056)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[IV], 4, 0)
            .blastTemp(2200, BlastProperty.GasTier.LOW, GTValues.VA[HV], 2000)
            .components(GTMaterials.Lead, 3, GTMaterials.Platinum, 1, GTMaterials.EnderPearl, 4)
            .buildAndRegister();
}
