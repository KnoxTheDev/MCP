package net.minecraft.realms;

import net.minecraft.client.renderer.Tessellator;

public class Tezzelator {
   public static Tessellator t = Tessellator.func_178181_a();
   public static final Tezzelator instance = new Tezzelator();

   public void end() {
      t.func_78381_a();
   }

   public Tezzelator vertex(double p_vertex_1_, double p_vertex_3_, double p_vertex_5_) {
      t.func_178180_c().func_181662_b(p_vertex_1_, p_vertex_3_, p_vertex_5_);
      return this;
   }

   public void color(float p_color_1_, float p_color_2_, float p_color_3_, float p_color_4_) {
      t.func_178180_c().func_181666_a(p_color_1_, p_color_2_, p_color_3_, p_color_4_);
   }

   public void tex2(short p_tex2_1_, short p_tex2_2_) {
      t.func_178180_c().func_181671_a(p_tex2_1_, p_tex2_2_);
   }

   public void normal(float p_normal_1_, float p_normal_2_, float p_normal_3_) {
      t.func_178180_c().func_181663_c(p_normal_1_, p_normal_2_, p_normal_3_);
   }

   public void begin(int p_begin_1_, RealmsVertexFormat p_begin_2_) {
      t.func_178180_c().func_181668_a(p_begin_1_, p_begin_2_.getVertexFormat());
   }

   public void endVertex() {
      t.func_178180_c().func_181675_d();
   }

   public void offset(double p_offset_1_, double p_offset_3_, double p_offset_5_) {
      t.func_178180_c().func_178969_c(p_offset_1_, p_offset_3_, p_offset_5_);
   }

   public RealmsBufferBuilder color(int p_color_1_, int p_color_2_, int p_color_3_, int p_color_4_) {
      return new RealmsBufferBuilder(t.func_178180_c().func_181669_b(p_color_1_, p_color_2_, p_color_3_, p_color_4_));
   }

   public Tezzelator tex(double p_tex_1_, double p_tex_3_) {
      t.func_178180_c().func_181673_a(p_tex_1_, p_tex_3_);
      return this;
   }
}
