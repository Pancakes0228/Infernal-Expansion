package com.nekomaster1000.infernalexp.blocks;

import com.nekomaster1000.infernalexp.tileentities.LuminousTileEntity;
import net.minecraft.block.ContainerBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;


public class LuminousEffectBlock extends ContainerBlock {

    public LuminousEffectBlock(Properties properties) {
        super(properties);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new LuminousTileEntity();
    }
}
