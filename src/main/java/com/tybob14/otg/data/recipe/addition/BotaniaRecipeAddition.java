package com.tybob14.otg.data.recipe.addition;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.otg.OutlandishlyGregtech;
import com.tybob14.otg.common.data.materials.BotaniaMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.Nullable;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;
import vazkii.botania.common.helper.ItemNBTHelper;
import vazkii.botania.common.item.BotaniaItems;

import java.util.function.Consumer;

public class BotaniaRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        addBotaniaRecipes(provider);
    }


    private static void addBotaniaRecipes(Consumer<FinishedRecipe> provider) {

        provider.accept(new FinishedRecipe() {
            @Override
            public void serializeRecipeData(JsonObject json) {
                json.add("input", ItemNBTHelper.serializeStack(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Steel)));
                json.add("output", ItemNBTHelper.serializeStack(new ItemStack(BotaniaItems.manaSteel)));
                json.addProperty("mana", 3000);
            }

            @Override
            public ResourceLocation getId() {
                return OutlandishlyGregtech.id("botania/mana_infusion/manasteel");
            }

            @Override
            public RecipeSerializer<?> getType() {
                return  BotaniaRecipeTypes.MANA_INFUSION_SERIALIZER;
            }

            @Nullable
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }

            @Nullable
            @Override
            public ResourceLocation getAdvancementId() {
                return null;
            }
        });

        provider.accept(new FinishedRecipe() {
            @Override
            public void serializeRecipeData(JsonObject json) {
                JsonArray ingredients = new JsonArray();
                ingredients.add(Ingredient.of(BotaniaItems.manaDiamond).toJson());
                ingredients.add(Ingredient.of(BotaniaItems.manaPearl).toJson());
                ingredients.add(Ingredient.of(ChemicalHelper.get(TagPrefix.dust, BotaniaMaterials.Manasteel)).toJson());
                json.add("ingredients", ingredients);
                json.add("result", ItemNBTHelper.serializeStack(ChemicalHelper.get(TagPrefix.dust, BotaniaMaterials.Terrasteel)));
                json.addProperty("mana", 20000);
            }

            @Override
            public ResourceLocation getId() {
                return OutlandishlyGregtech.id("botania/terra_plate/terrasteel_dust");
            }

            @Override
            public RecipeSerializer<?> getType() {
                return  BotaniaRecipeTypes.TERRA_PLATE_SERIALIZER;
            }

            @Nullable
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }

            @Nullable
            @Override
            public ResourceLocation getAdvancementId() {
                return null;
            }
        });

    }

}
