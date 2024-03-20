package com.tybob14.otg;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.lowdragmc.lowdraglib.Platform;
import com.tybob14.otg.api.registries.OTGRegistries;
import com.tybob14.otg.common.data.OTGCreativeModeTabs;
import com.tybob14.otg.common.data.OTGMaterials;
import com.tybob14.otg.common.data.materials.AE2Materials;
import com.tybob14.otg.common.data.materials.BotaniaMaterials;
import com.tybob14.otg.common.data.materials.EnderIOMaterials;
import com.tybob14.otg.common.data.materials.IndustrialForegoingMaterials;
import com.tybob14.otg.data.OTGDatagen;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(OutlandishlyGregtech.MOD_ID)
public class OutlandishlyGregtech {

    public static final String MOD_ID = "otg", NAME = "Outlandishly Gregtech";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    public static MaterialRegistry MATERIAL_REGISTRY;

    public OutlandishlyGregtech(){
        OutlandishlyGregtech.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        bus.register(this);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        if (Platform.isModLoaded("ae2")) AE2Materials.modifyMaterials();
        if (Platform.isModLoaded("botania")) BotaniaMaterials.modifyMaterials();
        if (Platform.isModLoaded("industrialforegoing")) IndustrialForegoingMaterials.modifyMaterials();
        if (Platform.isModLoaded("enderio")) EnderIOMaterials.modifyMaterials();
    }


    public static void init() {
        OTGCreativeModeTabs.init();
        OTGDatagen.init();
        OTGRegistries.REGISTRATE.registerRegistrate();
    }



    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(OutlandishlyGregtech.MOD_ID);
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        OTGMaterials.init();
        if (Platform.isModLoaded("ae2")) AE2Materials.init();
        if (Platform.isModLoaded("botania")) BotaniaMaterials.init();
        if (Platform.isModLoaded("industrialforegoing")) IndustrialForegoingMaterials.init();
        if (Platform.isModLoaded("enderio")) EnderIOMaterials.init();
    }

    @SubscribeEvent
    public void modifyMaterials(PostMaterialEvent event) {
        OTGMaterials.modifyMaterials();

    }
}
