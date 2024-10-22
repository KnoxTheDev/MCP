package net.minecraft.block;

import java.util.List;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockSand extends BlockFalling {
   public static final PropertyEnum<BlockSand.EnumType> field_176504_a = PropertyEnum.<BlockSand.EnumType>func_177709_a("variant", BlockSand.EnumType.class);

   public BlockSand() {
      this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(field_176504_a, BlockSand.EnumType.SAND));
   }

   public int func_180651_a(IBlockState p_180651_1_) {
      return ((BlockSand.EnumType)p_180651_1_.func_177229_b(field_176504_a)).func_176688_a();
   }

   public void func_149666_a(Item p_149666_1_, CreativeTabs p_149666_2_, List<ItemStack> p_149666_3_) {
      for(BlockSand.EnumType blocksand$enumtype : BlockSand.EnumType.values()) {
         p_149666_3_.add(new ItemStack(p_149666_1_, 1, blocksand$enumtype.func_176688_a()));
      }

   }

   public MapColor func_180659_g(IBlockState p_180659_1_) {
      return ((BlockSand.EnumType)p_180659_1_.func_177229_b(field_176504_a)).func_176687_c();
   }

   public IBlockState func_176203_a(int p_176203_1_) {
      return this.func_176223_P().func_177226_a(field_176504_a, BlockSand.EnumType.func_176686_a(p_176203_1_));
   }

   public int func_176201_c(IBlockState p_176201_1_) {
      return ((BlockSand.EnumType)p_176201_1_.func_177229_b(field_176504_a)).func_176688_a();
   }

   protected BlockState func_180661_e() {
      return new BlockState(this, new IProperty[]{field_176504_a});
   }

   public static enum EnumType implements IStringSerializable {
      SAND(0, "sand", "default", MapColor.field_151658_d),
      RED_SAND(1, "red_sand", "red", MapColor.field_151676_q);

      private static final BlockSand.EnumType[] field_176695_c = new BlockSand.EnumType[values().length];
      private final int field_176692_d;
      private final String field_176693_e;
      private final MapColor field_176690_f;
      private final String field_176691_g;

      private EnumType(int p_i45687_3_, String p_i45687_4_, String p_i45687_5_, MapColor p_i45687_6_) {
         this.field_176692_d = p_i45687_3_;
         this.field_176693_e = p_i45687_4_;
         this.field_176690_f = p_i45687_6_;
         this.field_176691_g = p_i45687_5_;
      }

      public int func_176688_a() {
         return this.field_176692_d;
      }

      public String toString() {
         return this.field_176693_e;
      }

      public MapColor func_176687_c() {
         return this.field_176690_f;
      }

      public static BlockSand.EnumType func_176686_a(int p_176686_0_) {
         if (p_176686_0_ < 0 || p_176686_0_ >= field_176695_c.length) {
            p_176686_0_ = 0;
         }

         return field_176695_c[p_176686_0_];
      }

      public String func_176610_l() {
         return this.field_176693_e;
      }

      public String func_176685_d() {
         return this.field_176691_g;
      }

      static {
         for(BlockSand.EnumType blocksand$enumtype : values()) {
            field_176695_c[blocksand$enumtype.func_176688_a()] = blocksand$enumtype;
         }

      }
   }
}
