package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGenSwamp extends BiomeGenBase {
   protected BiomeGenSwamp(int p_i1988_1_) {
      super(p_i1988_1_);
      this.field_76760_I.field_76832_z = 2;
      this.field_76760_I.field_76802_A = 1;
      this.field_76760_I.field_76804_C = 1;
      this.field_76760_I.field_76798_D = 8;
      this.field_76760_I.field_76799_E = 10;
      this.field_76760_I.field_76806_I = 1;
      this.field_76760_I.field_76833_y = 4;
      this.field_76760_I.field_76805_H = 0;
      this.field_76760_I.field_76801_G = 0;
      this.field_76760_I.field_76803_B = 5;
      this.field_76759_H = 14745518;
      this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(EntitySlime.class, 1, 1, 1));
   }

   public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
      return this.field_76763_Q;
   }

   public int func_180627_b(BlockPos p_180627_1_) {
      double d0 = field_180281_af.func_151601_a((double)p_180627_1_.func_177958_n() * 0.0225D, (double)p_180627_1_.func_177952_p() * 0.0225D);
      return d0 < -0.1D ? 5011004 : 6975545;
   }

   public int func_180625_c(BlockPos p_180625_1_) {
      return 6975545;
   }

   public BlockFlower.EnumFlowerType func_180623_a(Random p_180623_1_, BlockPos p_180623_2_) {
      return BlockFlower.EnumFlowerType.BLUE_ORCHID;
   }

   public void func_180622_a(World p_180622_1_, Random p_180622_2_, ChunkPrimer p_180622_3_, int p_180622_4_, int p_180622_5_, double p_180622_6_) {
      double d0 = field_180281_af.func_151601_a((double)p_180622_4_ * 0.25D, (double)p_180622_5_ * 0.25D);
      if (d0 > 0.0D) {
         int i = p_180622_4_ & 15;
         int j = p_180622_5_ & 15;

         for(int k = 255; k >= 0; --k) {
            if (p_180622_3_.func_177856_a(j, k, i).func_177230_c().func_149688_o() != Material.field_151579_a) {
               if (k == 62 && p_180622_3_.func_177856_a(j, k, i).func_177230_c() != Blocks.field_150355_j) {
                  p_180622_3_.func_177855_a(j, k, i, Blocks.field_150355_j.func_176223_P());
                  if (d0 < 0.12D) {
                     p_180622_3_.func_177855_a(j, k + 1, i, Blocks.field_150392_bi.func_176223_P());
                  }
               }
               break;
            }
         }
      }

      this.func_180628_b(p_180622_1_, p_180622_2_, p_180622_3_, p_180622_4_, p_180622_5_, p_180622_6_);
   }
}
