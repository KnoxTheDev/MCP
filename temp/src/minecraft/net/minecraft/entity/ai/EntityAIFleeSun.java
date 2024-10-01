package net.minecraft.entity.ai;

import java.util.Random;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityAIFleeSun extends EntityAIBase {
   private EntityCreature field_75372_a;
   private double field_75370_b;
   private double field_75371_c;
   private double field_75368_d;
   private double field_75369_e;
   private World field_75367_f;

   public EntityAIFleeSun(EntityCreature p_i1623_1_, double p_i1623_2_) {
      this.field_75372_a = p_i1623_1_;
      this.field_75369_e = p_i1623_2_;
      this.field_75367_f = p_i1623_1_.field_70170_p;
      this.func_75248_a(1);
   }

   public boolean func_75250_a() {
      if (!this.field_75367_f.func_72935_r()) {
         return false;
      } else if (!this.field_75372_a.func_70027_ad()) {
         return false;
      } else if (!this.field_75367_f.func_175678_i(new BlockPos(this.field_75372_a.field_70165_t, this.field_75372_a.func_174813_aQ().field_72338_b, this.field_75372_a.field_70161_v))) {
         return false;
      } else {
         Vec3 vec3 = this.func_75366_f();
         if (vec3 == null) {
            return false;
         } else {
            this.field_75370_b = vec3.field_72450_a;
            this.field_75371_c = vec3.field_72448_b;
            this.field_75368_d = vec3.field_72449_c;
            return true;
         }
      }
   }

   public boolean func_75253_b() {
      return !this.field_75372_a.func_70661_as().func_75500_f();
   }

   public void func_75249_e() {
      this.field_75372_a.func_70661_as().func_75492_a(this.field_75370_b, this.field_75371_c, this.field_75368_d, this.field_75369_e);
   }

   private Vec3 func_75366_f() {
      Random random = this.field_75372_a.func_70681_au();
      BlockPos blockpos = new BlockPos(this.field_75372_a.field_70165_t, this.field_75372_a.func_174813_aQ().field_72338_b, this.field_75372_a.field_70161_v);

      for(int i = 0; i < 10; ++i) {
         BlockPos blockpos1 = blockpos.func_177982_a(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
         if (!this.field_75367_f.func_175678_i(blockpos1) && this.field_75372_a.func_180484_a(blockpos1) < 0.0F) {
            return new Vec3((double)blockpos1.func_177958_n(), (double)blockpos1.func_177956_o(), (double)blockpos1.func_177952_p());
         }
      }

      return null;
   }
}
