package com.nekomaster1000.infernalexp.tileentities;

import com.nekomaster1000.infernalexp.init.ModTileEntityTypes;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class LuminousTileEntity extends TileEntity implements ITickableTileEntity{
    public int ticks;

    public LuminousTileEntity() {
        super(ModTileEntityTypes.LUMINOUS_TILE_ENTITY.get());
    }

    @Override
    public void tick() {
        ticks += 1;

        if (ticks > 2) {
            this.getWorld().setBlockState(this.getPos(), Blocks.AIR.getDefaultState());
        }
    }
}
