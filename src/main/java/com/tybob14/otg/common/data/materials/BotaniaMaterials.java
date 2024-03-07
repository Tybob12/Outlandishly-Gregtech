package com.tybob14.otg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTElements;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.otg.OutlandishlyGregtech;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;

public class BotaniaMaterials {


    public static void init(){
        ingot.setIgnored(Manasteel);
        block.setIgnored(Manasteel);
        nugget.setIgnored(Manasteel);
        ingot.setIgnored(Terrasteel);
        block.setIgnored(Terrasteel);
        nugget.setIgnored(Terrasteel);
        ingot.setIgnored(Elementium);
        block.setIgnored(Elementium);
        nugget.setIgnored(Elementium);
    }

    public static void modifyMaterials(){
        ingot.setIgnored(Manasteel, BotaniaItems.manaSteel);
        block.setIgnored(Manasteel, BotaniaBlocks.manasteelBlock);
        nugget.setIgnored(Manasteel, BotaniaItems.manasteelNugget);
        ingot.setIgnored(Terrasteel, BotaniaItems.terrasteel);
        block.setIgnored(Terrasteel, BotaniaBlocks.terrasteelBlock);
        nugget.setIgnored(Terrasteel, BotaniaItems.terrasteelNugget);
        ingot.setIgnored(Elementium, BotaniaItems.elementium);
        block.setIgnored(Elementium, BotaniaBlocks.elementiumBlock);
        nugget.setIgnored(Elementium, BotaniaItems.elementiumNugget);
    }


    public static final Material Magic = new Material.Builder(OutlandishlyGregtech.id("magic"))
            .element(GTElements.Ma)
            .buildAndRegister();
    public static final Material Manasteel = new Material.Builder(OutlandishlyGregtech.id("manasteel"))
            .color(0x3D78DB)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[LV], 4, 0)
            .components(GTMaterials.StainlessSteel, 1, Magic, 1)
            .buildAndRegister();

    public static final Material Terrasteel = new Material.Builder(OutlandishlyGregtech.id("terrasteel"))
            .color(0x31E52B)
            .iconSet(SHINY)
            .ingot()
            .blastTemp(4500, BlastProperty.GasTier.MID, GTValues.VA[EV], 2000)
            .cableProperties(GTValues.V[LuV], 4, 0)
            .components(Manasteel, 1, GTMaterials.Diamond, 1, GTMaterials.EnderPearl, 1)
            .buildAndRegister();

    public static final Material Elementium = new Material.Builder(OutlandishlyGregtech.id("elementium"))
            .color(0xF15CAE)
            .iconSet(SHINY)
            .ingot()
            .components(Manasteel, 2, Magic, 1)
            .buildAndRegister();


}
