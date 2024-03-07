package com.tybob14.otg.data;

import com.tterrag.registrate.providers.ProviderType;
import com.tybob14.otg.api.registries.OTGRegistries;
import com.tybob14.otg.data.lang.LangHandler;

public class OTGDatagen {
    public static void init(){
        OTGRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
