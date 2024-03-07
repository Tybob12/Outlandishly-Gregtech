package com.tybob14.otg.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tybob14.otg.OutlandishlyGregtech;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import static com.tybob14.otg.api.registries.OTGRegistries.REGISTRATE;

public class OTGCreativeModeTabs {

    public static RegistryEntry<CreativeModeTab> OTG = REGISTRATE.defaultCreativeTab(OutlandishlyGregtech.MOD_ID,
                    builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(OutlandishlyGregtech.MOD_ID, REGISTRATE))
                            .icon(GTItems.ADVANCED_CIRCUIT_BOARD::asStack)
                            .title(Component.literal("Outlandishly Gregtech"))
                            .build())
            .register();

    public static void init(){

    }
}
