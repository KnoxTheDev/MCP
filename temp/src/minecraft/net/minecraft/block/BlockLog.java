package net.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;

public abstract class BlockLog extends BlockRotatedPillar {
   public static final PropertyEnum<BlockLog.EnumAxis> field_176299_a = PropertyEnum.<BlockLog.EnumAxis>func_177709_a("axis", BlockLog.EnumAxis.class);

   public BlockLog() {
      super(Material.field_151575_d);
      this.func_149647_a(CreativeTabs.field_78030_b);
      this.func_149711_c(2.0F);
      this.func_149672_a(field_149766_f);
   }

   public void func_180663_b(World p_180663_1_, BlockPos p_180663_2_, IBlockState p_180663_3_) {
      int i = 4;
      int j = i + 1;
      if (p_180663_1_.func_175707_a(p_180663_2_.func_177982_a(-j, -j, -j), p_180663_2_.func_177982_a(j, j, j))) {
         for(BlockPos blockpos : BlockPos.func_177980_a(p_180663_2_.func_177982_a(-i, -i, -i), p_180663_2_.func_177982_a(i, i, i))) {
            IBlockState iblockstate = p_180663_1_.func_180495_p(blockpos);
            if (iblockstate.func_177230_c().func_149688_o() == Material.field_151584_j && !((Boolean)iblockstate.func_177229_b(BlockLeaves.field_176236_b)).booleanValue()) {
               p_180663_1_.func_180501_a(blockpos, iblockstate.func_177226_a(BlockLeaves.field_176236_b, Boolean.valueOf(true)), 4);
            }
         }

      }
   }

   public IBlockState func_180642_a(World p_180642_1_, BlockPos p_180642_2_, EnumFacing p_180642_3_, float p_180642_4_, float p_180642_5_, float p_180642_6_, int p_180642_7_, EntityLivingBase p_180642_8_) {
      return super.func_180642_a(p_180642_1_, p_180642_2_, p_180642_3_, p_180642_4_, p_180642_5_, p_180642_6_, p_180642_7_, p_180642_8_).func_177226_a(field_176299_a, BlockLog.EnumAxis.func_176870_a(p_180642_3_.func_176740_k()));
   }

   public static enum EnumAxis implements IStringSerializable {
      X("x"),
      Y("y"),
      Z("z"),
      NONE("none");

      private final String field_176874_e;

      private EnumAxis(String p_i45708_3_) {
         this.field_176874_e = p_i45708_3_;
      }

      public String toString() {
         return this.field_176874_e;
      }

      public static BlockLog.EnumAxis func_176870_a(EnumFacing.Axis p_176870_0_) {
         switch(p_176870_0_) {
         case X:
            return X;
         case Y:
            return Y;
         case Z:
            return Z;
         default:
            return NONE;
         }
      }

      public String func_176610_l() {
         return this.field_176874_e;
      }
   }
}
