package com.nekomaster1000.infernalexp.init;

import com.nekomaster1000.infernalexp.InfernalExpansion;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static class Blocks {

        public static final ITag.INamedTag<Block> BASE_STONE_CANYON = tag("base_stone_canyon");
        public static final ITag.INamedTag<Block> BASE_STONE_SHORES = tag("base_stone_shores");

        private static ITag.INamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(InfernalExpansion.MOD_ID, name));
        }
    }
}