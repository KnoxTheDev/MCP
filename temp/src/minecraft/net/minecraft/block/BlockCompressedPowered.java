package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class BlockCompressedPowered extends Block {
   public BlockCompressedPowered(Material p_i46386_1_, MapColor p_i46386_2_) {
      super(p_i46386_1_, p_i46386_2_);
   }

   public boolean func_149744_f() {
      return true;
   }

   public int func_180656_a(IBlockAccess p_180656_1_, BlockPos p_180656_2_, IBlockState p_180656_3_, EnumFacing p_180656_4_) {
      return 15;
   }
}
