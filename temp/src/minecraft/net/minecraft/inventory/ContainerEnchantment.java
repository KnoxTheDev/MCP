package net.minecraft.inventory;

import java.util.List;
import java.util.Random;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ContainerEnchantment extends Container {
   public IInventory field_75168_e;
   private World field_75172_h;
   private BlockPos field_178150_j;
   private Random field_75169_l;
   public int field_178149_f;
   public int[] field_75167_g;
   public int[] field_178151_h;

   public ContainerEnchantment(InventoryPlayer p_i45797_1_, World p_i45797_2_) {
      this(p_i45797_1_, p_i45797_2_, BlockPos.field_177992_a);
   }

   public ContainerEnchantment(InventoryPlayer p_i45798_1_, World p_i45798_2_, BlockPos p_i45798_3_) {
      this.field_75168_e = new InventoryBasic("Enchant", true, 2) {
         public int func_70297_j_() {
            return 64;
         }

         public void func_70296_d() {
            super.func_70296_d();
            ContainerEnchantment.this.func_75130_a(this);
         }
      };
      this.field_75169_l = new Random();
      this.field_75167_g = new int[3];
      this.field_178151_h = new int[]{-1, -1, -1};
      this.field_75172_h = p_i45798_2_;
      this.field_178150_j = p_i45798_3_;
      this.field_178149_f = p_i45798_1_.field_70458_d.func_175138_ci();
      this.func_75146_a(new Slot(this.field_75168_e, 0, 15, 47) {
         public boolean func_75214_a(ItemStack p_75214_1_) {
            return true;
         }

         public int func_75219_a() {
            return 1;
         }
      });
      this.func_75146_a(new Slot(this.field_75168_e, 1, 35, 47) {
         public boolean func_75214_a(ItemStack p_75214_1_) {
            return p_75214_1_.func_77973_b() == Items.field_151100_aR && EnumDyeColor.func_176766_a(p_75214_1_.func_77960_j()) == EnumDyeColor.BLUE;
         }
      });

      for(int i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(p_i45798_1_, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(int k = 0; k < 9; ++k) {
         this.func_75146_a(new Slot(p_i45798_1_, k, 8 + k * 18, 142));
      }

   }

   public void func_75132_a(ICrafting p_75132_1_) {
      super.func_75132_a(p_75132_1_);
      p_75132_1_.func_71112_a(this, 0, this.field_75167_g[0]);
      p_75132_1_.func_71112_a(this, 1, this.field_75167_g[1]);
      p_75132_1_.func_71112_a(this, 2, this.field_75167_g[2]);
      p_75132_1_.func_71112_a(this, 3, this.field_178149_f & -16);
      p_75132_1_.func_71112_a(this, 4, this.field_178151_h[0]);
      p_75132_1_.func_71112_a(this, 5, this.field_178151_h[1]);
      p_75132_1_.func_71112_a(this, 6, this.field_178151_h[2]);
   }

   public void func_75142_b() {
      super.func_75142_b();

      for(int i = 0; i < this.field_75149_d.size(); ++i) {
         ICrafting icrafting = this.field_75149_d.get(i);
         icrafting.func_71112_a(this, 0, this.field_75167_g[0]);
         icrafting.func_71112_a(this, 1, this.field_75167_g[1]);
         icrafting.func_71112_a(this, 2, this.field_75167_g[2]);
         icrafting.func_71112_a(this, 3, this.field_178149_f & -16);
         icrafting.func_71112_a(this, 4, this.field_178151_h[0]);
         icrafting.func_71112_a(this, 5, this.field_178151_h[1]);
         icrafting.func_71112_a(this, 6, this.field_178151_h[2]);
      }

   }

   public void func_75137_b(int p_75137_1_, int p_75137_2_) {
      if (p_75137_1_ >= 0 && p_75137_1_ <= 2) {
         this.field_75167_g[p_75137_1_] = p_75137_2_;
      } else if (p_75137_1_ == 3) {
         this.field_178149_f = p_75137_2_;
      } else if (p_75137_1_ >= 4 && p_75137_1_ <= 6) {
         this.field_178151_h[p_75137_1_ - 4] = p_75137_2_;
      } else {
         super.func_75137_b(p_75137_1_, p_75137_2_);
      }

   }

   public void func_75130_a(IInventory p_75130_1_) {
      if (p_75130_1_ == this.field_75168_e) {
         ItemStack itemstack = p_75130_1_.func_70301_a(0);
         if (itemstack != null && itemstack.func_77956_u()) {
            if (!this.field_75172_h.field_72995_K) {
               int l = 0;

               for(int j = -1; j <= 1; ++j) {
                  for(int k = -1; k <= 1; ++k) {
                     if ((j != 0 || k != 0) && this.field_75172_h.func_175623_d(this.field_178150_j.func_177982_a(k, 0, j)) && this.field_75172_h.func_175623_d(this.field_178150_j.func_177982_a(k, 1, j))) {
                        if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k * 2, 0, j * 2)).func_177230_c() == Blocks.field_150342_X) {
                           ++l;
                        }

                        if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k * 2, 1, j * 2)).func_177230_c() == Blocks.field_150342_X) {
                           ++l;
                        }

                        if (k != 0 && j != 0) {
                           if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k * 2, 0, j)).func_177230_c() == Blocks.field_150342_X) {
                              ++l;
                           }

                           if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k * 2, 1, j)).func_177230_c() == Blocks.field_150342_X) {
                              ++l;
                           }

                           if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k, 0, j * 2)).func_177230_c() == Blocks.field_150342_X) {
                              ++l;
                           }

                           if (this.field_75172_h.func_180495_p(this.field_178150_j.func_177982_a(k, 1, j * 2)).func_177230_c() == Blocks.field_150342_X) {
                              ++l;
                           }
                        }
                     }
                  }
               }

               this.field_75169_l.setSeed((long)this.field_178149_f);

               for(int i1 = 0; i1 < 3; ++i1) {
                  this.field_75167_g[i1] = EnchantmentHelper.func_77514_a(this.field_75169_l, i1, l, itemstack);
                  this.field_178151_h[i1] = -1;
                  if (this.field_75167_g[i1] < i1 + 1) {
                     this.field_75167_g[i1] = 0;
                  }
               }

               for(int j1 = 0; j1 < 3; ++j1) {
                  if (this.field_75167_g[j1] > 0) {
                     List<EnchantmentData> list = this.func_178148_a(itemstack, j1, this.field_75167_g[j1]);
                     if (list != null && !list.isEmpty()) {
                        EnchantmentData enchantmentdata = list.get(this.field_75169_l.nextInt(list.size()));
                        this.field_178151_h[j1] = enchantmentdata.field_76302_b.field_77352_x | enchantmentdata.field_76303_c << 8;
                     }
                  }
               }

               this.func_75142_b();
            }
         } else {
            for(int i = 0; i < 3; ++i) {
               this.field_75167_g[i] = 0;
               this.field_178151_h[i] = -1;
            }
         }
      }

   }

   public boolean func_75140_a(EntityPlayer p_75140_1_, int p_75140_2_) {
      ItemStack itemstack = this.field_75168_e.func_70301_a(0);
      ItemStack itemstack1 = this.field_75168_e.func_70301_a(1);
      int i = p_75140_2_ + 1;
      if ((itemstack1 == null || itemstack1.field_77994_a < i) && !p_75140_1_.field_71075_bZ.field_75098_d) {
         return false;
      } else if (this.field_75167_g[p_75140_2_] > 0 && itemstack != null && (p_75140_1_.field_71068_ca >= i && p_75140_1_.field_71068_ca >= this.field_75167_g[p_75140_2_] || p_75140_1_.field_71075_bZ.field_75098_d)) {
         if (!this.field_75172_h.field_72995_K) {
            List<EnchantmentData> list = this.func_178148_a(itemstack, p_75140_2_, this.field_75167_g[p_75140_2_]);
            boolean flag = itemstack.func_77973_b() == Items.field_151122_aG;
            if (list != null) {
               p_75140_1_.func_71013_b(i);
               if (flag) {
                  itemstack.func_150996_a(Items.field_151134_bR);
               }

               for(int j = 0; j < list.size(); ++j) {
                  EnchantmentData enchantmentdata = list.get(j);
                  if (flag) {
                     Items.field_151134_bR.func_92115_a(itemstack, enchantmentdata);
                  } else {
                     itemstack.func_77966_a(enchantmentdata.field_76302_b, enchantmentdata.field_76303_c);
                  }
               }

               if (!p_75140_1_.field_71075_bZ.field_75098_d) {
                  itemstack1.field_77994_a -= i;
                  if (itemstack1.field_77994_a <= 0) {
                     this.field_75168_e.func_70299_a(1, (ItemStack)null);
                  }
               }

               p_75140_1_.func_71029_a(StatList.field_181739_W);
               this.field_75168_e.func_70296_d();
               this.field_178149_f = p_75140_1_.func_175138_ci();
               this.func_75130_a(this.field_75168_e);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private List<EnchantmentData> func_178148_a(ItemStack p_178148_1_, int p_178148_2_, int p_178148_3_) {
      this.field_75169_l.setSeed((long)(this.field_178149_f + p_178148_2_));
      List<EnchantmentData> list = EnchantmentHelper.func_77513_b(this.field_75169_l, p_178148_1_, p_178148_3_);
      if (p_178148_1_.func_77973_b() == Items.field_151122_aG && list != null && list.size() > 1) {
         list.remove(this.field_75169_l.nextInt(list.size()));
      }

      return list;
   }

   public int func_178147_e() {
      ItemStack itemstack = this.field_75168_e.func_70301_a(1);
      return itemstack == null ? 0 : itemstack.field_77994_a;
   }

   public void func_75134_a(EntityPlayer p_75134_1_) {
      super.func_75134_a(p_75134_1_);
      if (!this.field_75172_h.field_72995_K) {
         for(int i = 0; i < this.field_75168_e.func_70302_i_(); ++i) {
            ItemStack itemstack = this.field_75168_e.func_70304_b(i);
            if (itemstack != null) {
               p_75134_1_.func_71019_a(itemstack, false);
            }
         }

      }
   }

   public boolean func_75145_c(EntityPlayer p_75145_1_) {
      if (this.field_75172_h.func_180495_p(this.field_178150_j).func_177230_c() != Blocks.field_150381_bn) {
         return false;
      } else {
         return p_75145_1_.func_70092_e((double)this.field_178150_j.func_177958_n() + 0.5D, (double)this.field_178150_j.func_177956_o() + 0.5D, (double)this.field_178150_j.func_177952_p() + 0.5D) <= 64.0D;
      }
   }

   public ItemStack func_82846_b(EntityPlayer p_82846_1_, int p_82846_2_) {
      ItemStack itemstack = null;
      Slot slot = this.field_75151_b.get(p_82846_2_);
      if (slot != null && slot.func_75216_d()) {
         ItemStack itemstack1 = slot.func_75211_c();
         itemstack = itemstack1.func_77946_l();
         if (p_82846_2_ == 0) {
            if (!this.func_75135_a(itemstack1, 2, 38, true)) {
               return null;
            }
         } else if (p_82846_2_ == 1) {
            if (!this.func_75135_a(itemstack1, 2, 38, true)) {
               return null;
            }
         } else if (itemstack1.func_77973_b() == Items.field_151100_aR && EnumDyeColor.func_176766_a(itemstack1.func_77960_j()) == EnumDyeColor.BLUE) {
            if (!this.func_75135_a(itemstack1, 1, 2, true)) {
               return null;
            }
         } else {
            if (((Slot)this.field_75151_b.get(0)).func_75216_d() || !((Slot)this.field_75151_b.get(0)).func_75214_a(itemstack1)) {
               return null;
            }

            if (itemstack1.func_77942_o() && itemstack1.field_77994_a == 1) {
               ((Slot)this.field_75151_b.get(0)).func_75215_d(itemstack1.func_77946_l());
               itemstack1.field_77994_a = 0;
            } else if (itemstack1.field_77994_a >= 1) {
               ((Slot)this.field_75151_b.get(0)).func_75215_d(new ItemStack(itemstack1.func_77973_b(), 1, itemstack1.func_77960_j()));
               --itemstack1.field_77994_a;
            }
         }

         if (itemstack1.field_77994_a == 0) {
            slot.func_75215_d((ItemStack)null);
         } else {
            slot.func_75218_e();
         }

         if (itemstack1.field_77994_a == itemstack.field_77994_a) {
            return null;
         }

         slot.func_82870_a(p_82846_1_, itemstack1);
      }

      return itemstack;
   }
}
