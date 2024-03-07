package com.tybob14.otg.data.tags;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

public class ForgeTags {
    public ForgeTags() {
    }

    public static class ModTags {

        /**
         * Forge
         */
        public static final TagKey<Block> FORGE_WOODEN_CHESTS = BlockTags.create(new ResourceLocation("forge", "chests/wooden"));

        /**
         * Applied Energistics 2
         */

        public static final TagKey<Item> APPLIEDENERGISTICS2_SMART_DENCE = TagUtil.createModItemTag("ae2/smart_dense_cable");
        //public static final TagKey<Item> APPLIEDENERGISTICS2_GLASS_CABLE = TagUtil.createModItemTag("ae2/glass_cable");
    }
}
