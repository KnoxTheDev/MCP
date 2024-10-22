package net.minecraft.block.properties;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class PropertyInteger extends PropertyHelper<Integer> {
   private final ImmutableSet<Integer> field_177720_a;

   protected PropertyInteger(String p_i45648_1_, int p_i45648_2_, int p_i45648_3_) {
      super(p_i45648_1_, Integer.class);
      if (p_i45648_2_ < 0) {
         throw new IllegalArgumentException("Min value of " + p_i45648_1_ + " must be 0 or greater");
      } else if (p_i45648_3_ <= p_i45648_2_) {
         throw new IllegalArgumentException("Max value of " + p_i45648_1_ + " must be greater than min (" + p_i45648_2_ + ")");
      } else {
         Set<Integer> set = Sets.<Integer>newHashSet();

         for(int i = p_i45648_2_; i <= p_i45648_3_; ++i) {
            set.add(Integer.valueOf(i));
         }

         this.field_177720_a = ImmutableSet.copyOf(set);
      }
   }

   public Collection<Integer> func_177700_c() {
      return this.field_177720_a;
   }

   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         if (!super.equals(p_equals_1_)) {
            return false;
         } else {
            PropertyInteger propertyinteger = (PropertyInteger)p_equals_1_;
            return this.field_177720_a.equals(propertyinteger.field_177720_a);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int i = super.hashCode();
      i = 31 * i + this.field_177720_a.hashCode();
      return i;
   }

   public static PropertyInteger func_177719_a(String p_177719_0_, int p_177719_1_, int p_177719_2_) {
      return new PropertyInteger(p_177719_0_, p_177719_1_, p_177719_2_);
   }

   public String func_177702_a(Integer p_177702_1_) {
      return p_177702_1_.toString();
   }
}
