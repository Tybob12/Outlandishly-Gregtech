package com.tybob14.otg.data;

import com.tterrag.registrate.providers.ProviderType;
import com.tybob14.otg.api.registries.OTGRegistries;
import com.tybob14.otg.data.lang.LangHandler;
import com.tybob14.otg.data.tags.ItemTagLoader;

public class OTGDatagen {
    public static void init(){
        OTGRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ItemTagLoader::init);
        OTGRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
