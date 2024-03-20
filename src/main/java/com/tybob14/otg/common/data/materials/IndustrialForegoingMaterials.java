package com.tybob14.otg.common.data.materials;

import com.buuz135.industrial.module.ModuleCore;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.tybob14.otg.OutlandishlyGregtech;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;

public class IndustrialForegoingMaterials {
    public static void init(){
        ingot.setIgnored(Pinkslime);
        dust.setIgnored(Pinkslime);
        dustTiny.setIgnored(Pinkslime);
        dustSmall.setIgnored(Pinkslime);
        nugget.setIgnored(Pinkslime);
        block.setIgnored(Pinkslime);
    }

    public static void modifyMaterials(){
        ingot.setIgnored(Pinkslime, ModuleCore.PINK_SLIME_INGOT.get());
        dust.setIgnored(Pinkslime, ModuleCore.PINK_SLIME_ITEM.get());
    }


    public static final Material Pinkslime = new Material.Builder(OutlandishlyGregtech.id("pinkslime"))
            .color(0xC388BA)
            .ingot()
            .flags(MaterialFlags.NO_SMASHING, MaterialFlags.NO_SMELTING, MaterialFlags.NO_WORKING, MaterialFlags.NO_UNIFICATION )
            .buildAndRegister();
}

