package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesWeapons {
   private String[][] field_77585_a = new String[][]{{"X", "X", "#"}};
   private Object[][] field_77584_b = new Object[][]{{Blocks.field_150344_f, Blocks.field_150347_e, Items.field_151042_j, Items.field_151045_i, Items.field_151043_k}, {Items.field_151041_m, Items.field_151052_q, Items.field_151040_l, Items.field_151048_u, Items.field_151010_B}};

   public void func_77583_a(CraftingManager p_77583_1_) {
      for(int i = 0; i < this.field_77584_b[0].length; ++i) {
         Object object = this.field_77584_b[0][i];

         for(int j = 0; j < this.field_77584_b.length - 1; ++j) {
            Item item = (Item)this.field_77584_b[j + 1][i];
            p_77583_1_.func_92103_a(new ItemStack(item), this.field_77585_a[j], '#', Items.field_151055_y, 'X', object);
         }
      }

      p_77583_1_.func_92103_a(new ItemStack(Items.field_151031_f, 1), " #X", "# X", " #X", 'X', Items.field_151007_F, '#', Items.field_151055_y);
      p_77583_1_.func_92103_a(new ItemStack(Items.field_151032_g, 4), "X", "#", "Y", 'Y', Items.field_151008_G, 'X', Items.field_151145_ak, '#', Items.field_151055_y);
   }
}
