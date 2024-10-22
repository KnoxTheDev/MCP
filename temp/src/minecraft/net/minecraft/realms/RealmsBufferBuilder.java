package net.minecraft.realms;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class RealmsBufferBuilder {
   private WorldRenderer b;

   public RealmsBufferBuilder(WorldRenderer p_i46442_1_) {
      this.b = p_i46442_1_;
   }

   public RealmsBufferBuilder from(WorldRenderer p_from_1_) {
      this.b = p_from_1_;
      return this;
   }

   public void sortQuads(float p_sortQuads_1_, float p_sortQuads_2_, float p_sortQuads_3_) {
      this.b.func_181674_a(p_sortQuads_1_, p_sortQuads_2_, p_sortQuads_3_);
   }

   public void fixupQuadColor(int p_fixupQuadColor_1_) {
      this.b.func_178968_d(p_fixupQuadColor_1_);
   }

   public ByteBuffer getBuffer() {
      return this.b.func_178966_f();
   }

   public void postNormal(float p_postNormal_1_, float p_postNormal_2_, float p_postNormal_3_) {
      this.b.func_178975_e(p_postNormal_1_, p_postNormal_2_, p_postNormal_3_);
   }

   public int getDrawMode() {
      return this.b.func_178979_i();
   }

   public void offset(double p_offset_1_, double p_offset_3_, double p_offset_5_) {
      this.b.func_178969_c(p_offset_1_, p_offset_3_, p_offset_5_);
   }

   public void restoreState(WorldRenderer.State p_restoreState_1_) {
      this.b.func_178993_a(p_restoreState_1_);
   }

   public void endVertex() {
      this.b.func_181675_d();
   }

   public RealmsBufferBuilder normal(float p_normal_1_, float p_normal_2_, float p_normal_3_) {
      return this.from(this.b.func_181663_c(p_normal_1_, p_normal_2_, p_normal_3_));
   }

   public void end() {
      this.b.func_178977_d();
   }

   public void begin(int p_begin_1_, VertexFormat p_begin_2_) {
      this.b.func_181668_a(p_begin_1_, p_begin_2_);
   }

   public RealmsBufferBuilder color(int p_color_1_, int p_color_2_, int p_color_3_, int p_color_4_) {
      return this.from(this.b.func_181669_b(p_color_1_, p_color_2_, p_color_3_, p_color_4_));
   }

   public void faceTex2(int p_faceTex2_1_, int p_faceTex2_2_, int p_faceTex2_3_, int p_faceTex2_4_) {
      this.b.func_178962_a(p_faceTex2_1_, p_faceTex2_2_, p_faceTex2_3_, p_faceTex2_4_);
   }

   public void postProcessFacePosition(double p_postProcessFacePosition_1_, double p_postProcessFacePosition_3_, double p_postProcessFacePosition_5_) {
      this.b.func_178987_a(p_postProcessFacePosition_1_, p_postProcessFacePosition_3_, p_postProcessFacePosition_5_);
   }

   public void fixupVertexColor(float p_fixupVertexColor_1_, float p_fixupVertexColor_2_, float p_fixupVertexColor_3_, int p_fixupVertexColor_4_) {
      this.b.func_178994_b(p_fixupVertexColor_1_, p_fixupVertexColor_2_, p_fixupVertexColor_3_, p_fixupVertexColor_4_);
   }

   public RealmsBufferBuilder color(float p_color_1_, float p_color_2_, float p_color_3_, float p_color_4_) {
      return this.from(this.b.func_181666_a(p_color_1_, p_color_2_, p_color_3_, p_color_4_));
   }

   public RealmsVertexFormat getVertexFormat() {
      return new RealmsVertexFormat(this.b.func_178973_g());
   }

   public void faceTint(float p_faceTint_1_, float p_faceTint_2_, float p_faceTint_3_, int p_faceTint_4_) {
      this.b.func_178978_a(p_faceTint_1_, p_faceTint_2_, p_faceTint_3_, p_faceTint_4_);
   }

   public RealmsBufferBuilder tex2(int p_tex2_1_, int p_tex2_2_) {
      return this.from(this.b.func_181671_a(p_tex2_1_, p_tex2_2_));
   }

   public void putBulkData(int[] p_putBulkData_1_) {
      this.b.func_178981_a(p_putBulkData_1_);
   }

   public RealmsBufferBuilder tex(double p_tex_1_, double p_tex_3_) {
      return this.from(this.b.func_181673_a(p_tex_1_, p_tex_3_));
   }

   public int getVertexCount() {
      return this.b.func_178989_h();
   }

   public void clear() {
      this.b.func_178965_a();
   }

   public RealmsBufferBuilder vertex(double p_vertex_1_, double p_vertex_3_, double p_vertex_5_) {
      return this.from(this.b.func_181662_b(p_vertex_1_, p_vertex_3_, p_vertex_5_));
   }

   public void fixupQuadColor(float p_fixupQuadColor_1_, float p_fixupQuadColor_2_, float p_fixupQuadColor_3_) {
      this.b.func_178990_f(p_fixupQuadColor_1_, p_fixupQuadColor_2_, p_fixupQuadColor_3_);
   }

   public void noColor() {
      this.b.func_78914_f();
   }
}
