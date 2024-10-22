package net.minecraft.world.gen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.util.JsonUtils;
import net.minecraft.world.biome.BiomeGenBase;

public class ChunkProviderSettings {
   public final float field_177811_a;
   public final float field_177809_b;
   public final float field_177810_c;
   public final float field_177806_d;
   public final float field_177808_e;
   public final float field_177803_f;
   public final float field_177804_g;
   public final float field_177825_h;
   public final float field_177827_i;
   public final float field_177821_j;
   public final float field_177823_k;
   public final float field_177817_l;
   public final float field_177819_m;
   public final float field_177813_n;
   public final float field_177815_o;
   public final float field_177843_p;
   public final int field_177841_q;
   public final boolean field_177839_r;
   public final boolean field_177837_s;
   public final int field_177835_t;
   public final boolean field_177833_u;
   public final boolean field_177831_v;
   public final boolean field_177829_w;
   public final boolean field_177854_x;
   public final boolean field_177852_y;
   public final boolean field_177850_z;
   public final boolean field_177781_A;
   public final int field_177782_B;
   public final boolean field_177783_C;
   public final int field_177777_D;
   public final boolean field_177778_E;
   public final int field_177779_F;
   public final int field_177780_G;
   public final int field_177788_H;
   public final int field_177789_I;
   public final int field_177790_J;
   public final int field_177791_K;
   public final int field_177784_L;
   public final int field_177785_M;
   public final int field_177786_N;
   public final int field_177787_O;
   public final int field_177797_P;
   public final int field_177796_Q;
   public final int field_177799_R;
   public final int field_177798_S;
   public final int field_177793_T;
   public final int field_177792_U;
   public final int field_177795_V;
   public final int field_177794_W;
   public final int field_177801_X;
   public final int field_177800_Y;
   public final int field_177802_Z;
   public final int field_177846_aa;
   public final int field_177847_ab;
   public final int field_177844_ac;
   public final int field_177845_ad;
   public final int field_177851_ae;
   public final int field_177853_af;
   public final int field_177848_ag;
   public final int field_177849_ah;
   public final int field_177832_ai;
   public final int field_177834_aj;
   public final int field_177828_ak;
   public final int field_177830_al;
   public final int field_177840_am;
   public final int field_177842_an;
   public final int field_177836_ao;
   public final int field_177838_ap;
   public final int field_177818_aq;
   public final int field_177816_ar;
   public final int field_177814_as;
   public final int field_177812_at;
   public final int field_177826_au;
   public final int field_177824_av;
   public final int field_177822_aw;
   public final int field_177820_ax;
   public final int field_177807_ay;
   public final int field_177805_az;

   private ChunkProviderSettings(ChunkProviderSettings.Factory p_i45639_1_) {
      this.field_177811_a = p_i45639_1_.field_177899_b;
      this.field_177809_b = p_i45639_1_.field_177900_c;
      this.field_177810_c = p_i45639_1_.field_177896_d;
      this.field_177806_d = p_i45639_1_.field_177898_e;
      this.field_177808_e = p_i45639_1_.field_177893_f;
      this.field_177803_f = p_i45639_1_.field_177894_g;
      this.field_177804_g = p_i45639_1_.field_177915_h;
      this.field_177825_h = p_i45639_1_.field_177917_i;
      this.field_177827_i = p_i45639_1_.field_177911_j;
      this.field_177821_j = p_i45639_1_.field_177913_k;
      this.field_177823_k = p_i45639_1_.field_177907_l;
      this.field_177817_l = p_i45639_1_.field_177909_m;
      this.field_177819_m = p_i45639_1_.field_177903_n;
      this.field_177813_n = p_i45639_1_.field_177905_o;
      this.field_177815_o = p_i45639_1_.field_177933_p;
      this.field_177843_p = p_i45639_1_.field_177931_q;
      this.field_177841_q = p_i45639_1_.field_177929_r;
      this.field_177839_r = p_i45639_1_.field_177927_s;
      this.field_177837_s = p_i45639_1_.field_177925_t;
      this.field_177835_t = p_i45639_1_.field_177923_u;
      this.field_177833_u = p_i45639_1_.field_177921_v;
      this.field_177831_v = p_i45639_1_.field_177919_w;
      this.field_177829_w = p_i45639_1_.field_177944_x;
      this.field_177854_x = p_i45639_1_.field_177942_y;
      this.field_177852_y = p_i45639_1_.field_177940_z;
      this.field_177850_z = p_i45639_1_.field_177870_A;
      this.field_177781_A = p_i45639_1_.field_177871_B;
      this.field_177782_B = p_i45639_1_.field_177872_C;
      this.field_177783_C = p_i45639_1_.field_177866_D;
      this.field_177777_D = p_i45639_1_.field_177867_E;
      this.field_177778_E = p_i45639_1_.field_177868_F;
      this.field_177779_F = p_i45639_1_.field_177869_G;
      this.field_177780_G = p_i45639_1_.field_177877_H;
      this.field_177788_H = p_i45639_1_.field_177878_I;
      this.field_177789_I = p_i45639_1_.field_177879_J;
      this.field_177790_J = p_i45639_1_.field_177880_K;
      this.field_177791_K = p_i45639_1_.field_177873_L;
      this.field_177784_L = p_i45639_1_.field_177874_M;
      this.field_177785_M = p_i45639_1_.field_177875_N;
      this.field_177786_N = p_i45639_1_.field_177876_O;
      this.field_177787_O = p_i45639_1_.field_177886_P;
      this.field_177797_P = p_i45639_1_.field_177885_Q;
      this.field_177796_Q = p_i45639_1_.field_177888_R;
      this.field_177799_R = p_i45639_1_.field_177887_S;
      this.field_177798_S = p_i45639_1_.field_177882_T;
      this.field_177793_T = p_i45639_1_.field_177881_U;
      this.field_177792_U = p_i45639_1_.field_177884_V;
      this.field_177795_V = p_i45639_1_.field_177883_W;
      this.field_177794_W = p_i45639_1_.field_177891_X;
      this.field_177801_X = p_i45639_1_.field_177890_Y;
      this.field_177800_Y = p_i45639_1_.field_177892_Z;
      this.field_177802_Z = p_i45639_1_.field_177936_aa;
      this.field_177846_aa = p_i45639_1_.field_177937_ab;
      this.field_177847_ab = p_i45639_1_.field_177934_ac;
      this.field_177844_ac = p_i45639_1_.field_177935_ad;
      this.field_177845_ad = p_i45639_1_.field_177941_ae;
      this.field_177851_ae = p_i45639_1_.field_177943_af;
      this.field_177853_af = p_i45639_1_.field_177938_ag;
      this.field_177848_ag = p_i45639_1_.field_177939_ah;
      this.field_177849_ah = p_i45639_1_.field_177922_ai;
      this.field_177832_ai = p_i45639_1_.field_177924_aj;
      this.field_177834_aj = p_i45639_1_.field_177918_ak;
      this.field_177828_ak = p_i45639_1_.field_177920_al;
      this.field_177830_al = p_i45639_1_.field_177930_am;
      this.field_177840_am = p_i45639_1_.field_177932_an;
      this.field_177842_an = p_i45639_1_.field_177926_ao;
      this.field_177836_ao = p_i45639_1_.field_177928_ap;
      this.field_177838_ap = p_i45639_1_.field_177908_aq;
      this.field_177818_aq = p_i45639_1_.field_177906_ar;
      this.field_177816_ar = p_i45639_1_.field_177904_as;
      this.field_177814_as = p_i45639_1_.field_177902_at;
      this.field_177812_at = p_i45639_1_.field_177916_au;
      this.field_177826_au = p_i45639_1_.field_177914_av;
      this.field_177824_av = p_i45639_1_.field_177912_aw;
      this.field_177822_aw = p_i45639_1_.field_177910_ax;
      this.field_177820_ax = p_i45639_1_.field_177897_ay;
      this.field_177807_ay = p_i45639_1_.field_177895_az;
      this.field_177805_az = p_i45639_1_.field_177889_aA;
   }

   public static class Factory {
      static final Gson field_177901_a = (new GsonBuilder()).registerTypeAdapter(ChunkProviderSettings.Factory.class, new ChunkProviderSettings.Serializer()).create();
      public float field_177899_b = 684.412F;
      public float field_177900_c = 684.412F;
      public float field_177896_d = 512.0F;
      public float field_177898_e = 512.0F;
      public float field_177893_f = 200.0F;
      public float field_177894_g = 200.0F;
      public float field_177915_h = 0.5F;
      public float field_177917_i = 80.0F;
      public float field_177911_j = 160.0F;
      public float field_177913_k = 80.0F;
      public float field_177907_l = 8.5F;
      public float field_177909_m = 12.0F;
      public float field_177903_n = 1.0F;
      public float field_177905_o = 0.0F;
      public float field_177933_p = 1.0F;
      public float field_177931_q = 0.0F;
      public int field_177929_r = 63;
      public boolean field_177927_s = true;
      public boolean field_177925_t = true;
      public int field_177923_u = 8;
      public boolean field_177921_v = true;
      public boolean field_177919_w = true;
      public boolean field_177944_x = true;
      public boolean field_177942_y = true;
      public boolean field_177940_z = true;
      public boolean field_177870_A = true;
      public boolean field_177871_B = true;
      public int field_177872_C = 4;
      public boolean field_177866_D = true;
      public int field_177867_E = 80;
      public boolean field_177868_F = false;
      public int field_177869_G = -1;
      public int field_177877_H = 4;
      public int field_177878_I = 4;
      public int field_177879_J = 33;
      public int field_177880_K = 10;
      public int field_177873_L = 0;
      public int field_177874_M = 256;
      public int field_177875_N = 33;
      public int field_177876_O = 8;
      public int field_177886_P = 0;
      public int field_177885_Q = 256;
      public int field_177888_R = 33;
      public int field_177887_S = 10;
      public int field_177882_T = 0;
      public int field_177881_U = 80;
      public int field_177884_V = 33;
      public int field_177883_W = 10;
      public int field_177891_X = 0;
      public int field_177890_Y = 80;
      public int field_177892_Z = 33;
      public int field_177936_aa = 10;
      public int field_177937_ab = 0;
      public int field_177934_ac = 80;
      public int field_177935_ad = 17;
      public int field_177941_ae = 20;
      public int field_177943_af = 0;
      public int field_177938_ag = 128;
      public int field_177939_ah = 9;
      public int field_177922_ai = 20;
      public int field_177924_aj = 0;
      public int field_177918_ak = 64;
      public int field_177920_al = 9;
      public int field_177930_am = 2;
      public int field_177932_an = 0;
      public int field_177926_ao = 32;
      public int field_177928_ap = 8;
      public int field_177908_aq = 8;
      public int field_177906_ar = 0;
      public int field_177904_as = 16;
      public int field_177902_at = 8;
      public int field_177916_au = 1;
      public int field_177914_av = 0;
      public int field_177912_aw = 16;
      public int field_177910_ax = 7;
      public int field_177897_ay = 1;
      public int field_177895_az = 16;
      public int field_177889_aA = 16;

      public static ChunkProviderSettings.Factory func_177865_a(String p_177865_0_) {
         if (p_177865_0_.length() == 0) {
            return new ChunkProviderSettings.Factory();
         } else {
            try {
               return (ChunkProviderSettings.Factory)field_177901_a.fromJson(p_177865_0_, ChunkProviderSettings.Factory.class);
            } catch (Exception var2) {
               return new ChunkProviderSettings.Factory();
            }
         }
      }

      public String toString() {
         return field_177901_a.toJson(this);
      }

      public Factory() {
         this.func_177863_a();
      }

      public void func_177863_a() {
         this.field_177899_b = 684.412F;
         this.field_177900_c = 684.412F;
         this.field_177896_d = 512.0F;
         this.field_177898_e = 512.0F;
         this.field_177893_f = 200.0F;
         this.field_177894_g = 200.0F;
         this.field_177915_h = 0.5F;
         this.field_177917_i = 80.0F;
         this.field_177911_j = 160.0F;
         this.field_177913_k = 80.0F;
         this.field_177907_l = 8.5F;
         this.field_177909_m = 12.0F;
         this.field_177903_n = 1.0F;
         this.field_177905_o = 0.0F;
         this.field_177933_p = 1.0F;
         this.field_177931_q = 0.0F;
         this.field_177929_r = 63;
         this.field_177927_s = true;
         this.field_177925_t = true;
         this.field_177923_u = 8;
         this.field_177921_v = true;
         this.field_177919_w = true;
         this.field_177944_x = true;
         this.field_177942_y = true;
         this.field_177940_z = true;
         this.field_177870_A = true;
         this.field_177871_B = true;
         this.field_177872_C = 4;
         this.field_177866_D = true;
         this.field_177867_E = 80;
         this.field_177868_F = false;
         this.field_177869_G = -1;
         this.field_177877_H = 4;
         this.field_177878_I = 4;
         this.field_177879_J = 33;
         this.field_177880_K = 10;
         this.field_177873_L = 0;
         this.field_177874_M = 256;
         this.field_177875_N = 33;
         this.field_177876_O = 8;
         this.field_177886_P = 0;
         this.field_177885_Q = 256;
         this.field_177888_R = 33;
         this.field_177887_S = 10;
         this.field_177882_T = 0;
         this.field_177881_U = 80;
         this.field_177884_V = 33;
         this.field_177883_W = 10;
         this.field_177891_X = 0;
         this.field_177890_Y = 80;
         this.field_177892_Z = 33;
         this.field_177936_aa = 10;
         this.field_177937_ab = 0;
         this.field_177934_ac = 80;
         this.field_177935_ad = 17;
         this.field_177941_ae = 20;
         this.field_177943_af = 0;
         this.field_177938_ag = 128;
         this.field_177939_ah = 9;
         this.field_177922_ai = 20;
         this.field_177924_aj = 0;
         this.field_177918_ak = 64;
         this.field_177920_al = 9;
         this.field_177930_am = 2;
         this.field_177932_an = 0;
         this.field_177926_ao = 32;
         this.field_177928_ap = 8;
         this.field_177908_aq = 8;
         this.field_177906_ar = 0;
         this.field_177904_as = 16;
         this.field_177902_at = 8;
         this.field_177916_au = 1;
         this.field_177914_av = 0;
         this.field_177912_aw = 16;
         this.field_177910_ax = 7;
         this.field_177897_ay = 1;
         this.field_177895_az = 16;
         this.field_177889_aA = 16;
      }

      public boolean equals(Object p_equals_1_) {
         if (this == p_equals_1_) {
            return true;
         } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
            ChunkProviderSettings.Factory chunkprovidersettings$factory = (ChunkProviderSettings.Factory)p_equals_1_;
            if (this.field_177936_aa != chunkprovidersettings$factory.field_177936_aa) {
               return false;
            } else if (this.field_177934_ac != chunkprovidersettings$factory.field_177934_ac) {
               return false;
            } else if (this.field_177937_ab != chunkprovidersettings$factory.field_177937_ab) {
               return false;
            } else if (this.field_177892_Z != chunkprovidersettings$factory.field_177892_Z) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177907_l, this.field_177907_l) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177905_o, this.field_177905_o) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177903_n, this.field_177903_n) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177931_q, this.field_177931_q) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177933_p, this.field_177933_p) != 0) {
               return false;
            } else if (this.field_177877_H != chunkprovidersettings$factory.field_177877_H) {
               return false;
            } else if (this.field_177941_ae != chunkprovidersettings$factory.field_177941_ae) {
               return false;
            } else if (this.field_177938_ag != chunkprovidersettings$factory.field_177938_ag) {
               return false;
            } else if (this.field_177943_af != chunkprovidersettings$factory.field_177943_af) {
               return false;
            } else if (this.field_177935_ad != chunkprovidersettings$factory.field_177935_ad) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177899_b, this.field_177899_b) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177915_h, this.field_177915_h) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177893_f, this.field_177893_f) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177894_g, this.field_177894_g) != 0) {
               return false;
            } else if (this.field_177916_au != chunkprovidersettings$factory.field_177916_au) {
               return false;
            } else if (this.field_177912_aw != chunkprovidersettings$factory.field_177912_aw) {
               return false;
            } else if (this.field_177914_av != chunkprovidersettings$factory.field_177914_av) {
               return false;
            } else if (this.field_177902_at != chunkprovidersettings$factory.field_177902_at) {
               return false;
            } else if (this.field_177883_W != chunkprovidersettings$factory.field_177883_W) {
               return false;
            } else if (this.field_177890_Y != chunkprovidersettings$factory.field_177890_Y) {
               return false;
            } else if (this.field_177891_X != chunkprovidersettings$factory.field_177891_X) {
               return false;
            } else if (this.field_177884_V != chunkprovidersettings$factory.field_177884_V) {
               return false;
            } else if (this.field_177880_K != chunkprovidersettings$factory.field_177880_K) {
               return false;
            } else if (this.field_177874_M != chunkprovidersettings$factory.field_177874_M) {
               return false;
            } else if (this.field_177873_L != chunkprovidersettings$factory.field_177873_L) {
               return false;
            } else if (this.field_177879_J != chunkprovidersettings$factory.field_177879_J) {
               return false;
            } else if (this.field_177923_u != chunkprovidersettings$factory.field_177923_u) {
               return false;
            } else if (this.field_177869_G != chunkprovidersettings$factory.field_177869_G) {
               return false;
            } else if (this.field_177930_am != chunkprovidersettings$factory.field_177930_am) {
               return false;
            } else if (this.field_177926_ao != chunkprovidersettings$factory.field_177926_ao) {
               return false;
            } else if (this.field_177932_an != chunkprovidersettings$factory.field_177932_an) {
               return false;
            } else if (this.field_177920_al != chunkprovidersettings$factory.field_177920_al) {
               return false;
            } else if (this.field_177887_S != chunkprovidersettings$factory.field_177887_S) {
               return false;
            } else if (this.field_177881_U != chunkprovidersettings$factory.field_177881_U) {
               return false;
            } else if (this.field_177882_T != chunkprovidersettings$factory.field_177882_T) {
               return false;
            } else if (this.field_177888_R != chunkprovidersettings$factory.field_177888_R) {
               return false;
            } else if (this.field_177876_O != chunkprovidersettings$factory.field_177876_O) {
               return false;
            } else if (this.field_177885_Q != chunkprovidersettings$factory.field_177885_Q) {
               return false;
            } else if (this.field_177886_P != chunkprovidersettings$factory.field_177886_P) {
               return false;
            } else if (this.field_177875_N != chunkprovidersettings$factory.field_177875_N) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177900_c, this.field_177900_c) != 0) {
               return false;
            } else if (this.field_177922_ai != chunkprovidersettings$factory.field_177922_ai) {
               return false;
            } else if (this.field_177918_ak != chunkprovidersettings$factory.field_177918_ak) {
               return false;
            } else if (this.field_177924_aj != chunkprovidersettings$factory.field_177924_aj) {
               return false;
            } else if (this.field_177939_ah != chunkprovidersettings$factory.field_177939_ah) {
               return false;
            } else if (this.field_177895_az != chunkprovidersettings$factory.field_177895_az) {
               return false;
            } else if (this.field_177897_ay != chunkprovidersettings$factory.field_177897_ay) {
               return false;
            } else if (this.field_177910_ax != chunkprovidersettings$factory.field_177910_ax) {
               return false;
            } else if (this.field_177889_aA != chunkprovidersettings$factory.field_177889_aA) {
               return false;
            } else if (this.field_177867_E != chunkprovidersettings$factory.field_177867_E) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177898_e, this.field_177898_e) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177917_i, this.field_177917_i) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177911_j, this.field_177911_j) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177913_k, this.field_177913_k) != 0) {
               return false;
            } else if (this.field_177908_aq != chunkprovidersettings$factory.field_177908_aq) {
               return false;
            } else if (this.field_177904_as != chunkprovidersettings$factory.field_177904_as) {
               return false;
            } else if (this.field_177906_ar != chunkprovidersettings$factory.field_177906_ar) {
               return false;
            } else if (this.field_177928_ap != chunkprovidersettings$factory.field_177928_ap) {
               return false;
            } else if (this.field_177878_I != chunkprovidersettings$factory.field_177878_I) {
               return false;
            } else if (this.field_177929_r != chunkprovidersettings$factory.field_177929_r) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177909_m, this.field_177909_m) != 0) {
               return false;
            } else if (Float.compare(chunkprovidersettings$factory.field_177896_d, this.field_177896_d) != 0) {
               return false;
            } else if (this.field_177927_s != chunkprovidersettings$factory.field_177927_s) {
               return false;
            } else if (this.field_177925_t != chunkprovidersettings$factory.field_177925_t) {
               return false;
            } else if (this.field_177866_D != chunkprovidersettings$factory.field_177866_D) {
               return false;
            } else if (this.field_177868_F != chunkprovidersettings$factory.field_177868_F) {
               return false;
            } else if (this.field_177944_x != chunkprovidersettings$factory.field_177944_x) {
               return false;
            } else if (this.field_177870_A != chunkprovidersettings$factory.field_177870_A) {
               return false;
            } else if (this.field_177921_v != chunkprovidersettings$factory.field_177921_v) {
               return false;
            } else if (this.field_177942_y != chunkprovidersettings$factory.field_177942_y) {
               return false;
            } else if (this.field_177940_z != chunkprovidersettings$factory.field_177940_z) {
               return false;
            } else if (this.field_177919_w != chunkprovidersettings$factory.field_177919_w) {
               return false;
            } else if (this.field_177871_B != chunkprovidersettings$factory.field_177871_B) {
               return false;
            } else {
               return this.field_177872_C == chunkprovidersettings$factory.field_177872_C;
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         int i = this.field_177899_b != 0.0F ? Float.floatToIntBits(this.field_177899_b) : 0;
         i = 31 * i + (this.field_177900_c != 0.0F ? Float.floatToIntBits(this.field_177900_c) : 0);
         i = 31 * i + (this.field_177896_d != 0.0F ? Float.floatToIntBits(this.field_177896_d) : 0);
         i = 31 * i + (this.field_177898_e != 0.0F ? Float.floatToIntBits(this.field_177898_e) : 0);
         i = 31 * i + (this.field_177893_f != 0.0F ? Float.floatToIntBits(this.field_177893_f) : 0);
         i = 31 * i + (this.field_177894_g != 0.0F ? Float.floatToIntBits(this.field_177894_g) : 0);
         i = 31 * i + (this.field_177915_h != 0.0F ? Float.floatToIntBits(this.field_177915_h) : 0);
         i = 31 * i + (this.field_177917_i != 0.0F ? Float.floatToIntBits(this.field_177917_i) : 0);
         i = 31 * i + (this.field_177911_j != 0.0F ? Float.floatToIntBits(this.field_177911_j) : 0);
         i = 31 * i + (this.field_177913_k != 0.0F ? Float.floatToIntBits(this.field_177913_k) : 0);
         i = 31 * i + (this.field_177907_l != 0.0F ? Float.floatToIntBits(this.field_177907_l) : 0);
         i = 31 * i + (this.field_177909_m != 0.0F ? Float.floatToIntBits(this.field_177909_m) : 0);
         i = 31 * i + (this.field_177903_n != 0.0F ? Float.floatToIntBits(this.field_177903_n) : 0);
         i = 31 * i + (this.field_177905_o != 0.0F ? Float.floatToIntBits(this.field_177905_o) : 0);
         i = 31 * i + (this.field_177933_p != 0.0F ? Float.floatToIntBits(this.field_177933_p) : 0);
         i = 31 * i + (this.field_177931_q != 0.0F ? Float.floatToIntBits(this.field_177931_q) : 0);
         i = 31 * i + this.field_177929_r;
         i = 31 * i + (this.field_177927_s ? 1 : 0);
         i = 31 * i + (this.field_177925_t ? 1 : 0);
         i = 31 * i + this.field_177923_u;
         i = 31 * i + (this.field_177921_v ? 1 : 0);
         i = 31 * i + (this.field_177919_w ? 1 : 0);
         i = 31 * i + (this.field_177944_x ? 1 : 0);
         i = 31 * i + (this.field_177942_y ? 1 : 0);
         i = 31 * i + (this.field_177940_z ? 1 : 0);
         i = 31 * i + (this.field_177870_A ? 1 : 0);
         i = 31 * i + (this.field_177871_B ? 1 : 0);
         i = 31 * i + this.field_177872_C;
         i = 31 * i + (this.field_177866_D ? 1 : 0);
         i = 31 * i + this.field_177867_E;
         i = 31 * i + (this.field_177868_F ? 1 : 0);
         i = 31 * i + this.field_177869_G;
         i = 31 * i + this.field_177877_H;
         i = 31 * i + this.field_177878_I;
         i = 31 * i + this.field_177879_J;
         i = 31 * i + this.field_177880_K;
         i = 31 * i + this.field_177873_L;
         i = 31 * i + this.field_177874_M;
         i = 31 * i + this.field_177875_N;
         i = 31 * i + this.field_177876_O;
         i = 31 * i + this.field_177886_P;
         i = 31 * i + this.field_177885_Q;
         i = 31 * i + this.field_177888_R;
         i = 31 * i + this.field_177887_S;
         i = 31 * i + this.field_177882_T;
         i = 31 * i + this.field_177881_U;
         i = 31 * i + this.field_177884_V;
         i = 31 * i + this.field_177883_W;
         i = 31 * i + this.field_177891_X;
         i = 31 * i + this.field_177890_Y;
         i = 31 * i + this.field_177892_Z;
         i = 31 * i + this.field_177936_aa;
         i = 31 * i + this.field_177937_ab;
         i = 31 * i + this.field_177934_ac;
         i = 31 * i + this.field_177935_ad;
         i = 31 * i + this.field_177941_ae;
         i = 31 * i + this.field_177943_af;
         i = 31 * i + this.field_177938_ag;
         i = 31 * i + this.field_177939_ah;
         i = 31 * i + this.field_177922_ai;
         i = 31 * i + this.field_177924_aj;
         i = 31 * i + this.field_177918_ak;
         i = 31 * i + this.field_177920_al;
         i = 31 * i + this.field_177930_am;
         i = 31 * i + this.field_177932_an;
         i = 31 * i + this.field_177926_ao;
         i = 31 * i + this.field_177928_ap;
         i = 31 * i + this.field_177908_aq;
         i = 31 * i + this.field_177906_ar;
         i = 31 * i + this.field_177904_as;
         i = 31 * i + this.field_177902_at;
         i = 31 * i + this.field_177916_au;
         i = 31 * i + this.field_177914_av;
         i = 31 * i + this.field_177912_aw;
         i = 31 * i + this.field_177910_ax;
         i = 31 * i + this.field_177897_ay;
         i = 31 * i + this.field_177895_az;
         i = 31 * i + this.field_177889_aA;
         return i;
      }

      public ChunkProviderSettings func_177864_b() {
         return new ChunkProviderSettings(this);
      }
   }

   public static class Serializer implements JsonDeserializer<ChunkProviderSettings.Factory>, JsonSerializer<ChunkProviderSettings.Factory> {
      public ChunkProviderSettings.Factory deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException {
         JsonObject jsonobject = p_deserialize_1_.getAsJsonObject();
         ChunkProviderSettings.Factory chunkprovidersettings$factory = new ChunkProviderSettings.Factory();

         try {
            chunkprovidersettings$factory.field_177899_b = JsonUtils.func_151221_a(jsonobject, "coordinateScale", chunkprovidersettings$factory.field_177899_b);
            chunkprovidersettings$factory.field_177900_c = JsonUtils.func_151221_a(jsonobject, "heightScale", chunkprovidersettings$factory.field_177900_c);
            chunkprovidersettings$factory.field_177898_e = JsonUtils.func_151221_a(jsonobject, "lowerLimitScale", chunkprovidersettings$factory.field_177898_e);
            chunkprovidersettings$factory.field_177896_d = JsonUtils.func_151221_a(jsonobject, "upperLimitScale", chunkprovidersettings$factory.field_177896_d);
            chunkprovidersettings$factory.field_177893_f = JsonUtils.func_151221_a(jsonobject, "depthNoiseScaleX", chunkprovidersettings$factory.field_177893_f);
            chunkprovidersettings$factory.field_177894_g = JsonUtils.func_151221_a(jsonobject, "depthNoiseScaleZ", chunkprovidersettings$factory.field_177894_g);
            chunkprovidersettings$factory.field_177915_h = JsonUtils.func_151221_a(jsonobject, "depthNoiseScaleExponent", chunkprovidersettings$factory.field_177915_h);
            chunkprovidersettings$factory.field_177917_i = JsonUtils.func_151221_a(jsonobject, "mainNoiseScaleX", chunkprovidersettings$factory.field_177917_i);
            chunkprovidersettings$factory.field_177911_j = JsonUtils.func_151221_a(jsonobject, "mainNoiseScaleY", chunkprovidersettings$factory.field_177911_j);
            chunkprovidersettings$factory.field_177913_k = JsonUtils.func_151221_a(jsonobject, "mainNoiseScaleZ", chunkprovidersettings$factory.field_177913_k);
            chunkprovidersettings$factory.field_177907_l = JsonUtils.func_151221_a(jsonobject, "baseSize", chunkprovidersettings$factory.field_177907_l);
            chunkprovidersettings$factory.field_177909_m = JsonUtils.func_151221_a(jsonobject, "stretchY", chunkprovidersettings$factory.field_177909_m);
            chunkprovidersettings$factory.field_177903_n = JsonUtils.func_151221_a(jsonobject, "biomeDepthWeight", chunkprovidersettings$factory.field_177903_n);
            chunkprovidersettings$factory.field_177905_o = JsonUtils.func_151221_a(jsonobject, "biomeDepthOffset", chunkprovidersettings$factory.field_177905_o);
            chunkprovidersettings$factory.field_177933_p = JsonUtils.func_151221_a(jsonobject, "biomeScaleWeight", chunkprovidersettings$factory.field_177933_p);
            chunkprovidersettings$factory.field_177931_q = JsonUtils.func_151221_a(jsonobject, "biomeScaleOffset", chunkprovidersettings$factory.field_177931_q);
            chunkprovidersettings$factory.field_177929_r = JsonUtils.func_151208_a(jsonobject, "seaLevel", chunkprovidersettings$factory.field_177929_r);
            chunkprovidersettings$factory.field_177927_s = JsonUtils.func_151209_a(jsonobject, "useCaves", chunkprovidersettings$factory.field_177927_s);
            chunkprovidersettings$factory.field_177925_t = JsonUtils.func_151209_a(jsonobject, "useDungeons", chunkprovidersettings$factory.field_177925_t);
            chunkprovidersettings$factory.field_177923_u = JsonUtils.func_151208_a(jsonobject, "dungeonChance", chunkprovidersettings$factory.field_177923_u);
            chunkprovidersettings$factory.field_177921_v = JsonUtils.func_151209_a(jsonobject, "useStrongholds", chunkprovidersettings$factory.field_177921_v);
            chunkprovidersettings$factory.field_177919_w = JsonUtils.func_151209_a(jsonobject, "useVillages", chunkprovidersettings$factory.field_177919_w);
            chunkprovidersettings$factory.field_177944_x = JsonUtils.func_151209_a(jsonobject, "useMineShafts", chunkprovidersettings$factory.field_177944_x);
            chunkprovidersettings$factory.field_177942_y = JsonUtils.func_151209_a(jsonobject, "useTemples", chunkprovidersettings$factory.field_177942_y);
            chunkprovidersettings$factory.field_177940_z = JsonUtils.func_151209_a(jsonobject, "useMonuments", chunkprovidersettings$factory.field_177940_z);
            chunkprovidersettings$factory.field_177870_A = JsonUtils.func_151209_a(jsonobject, "useRavines", chunkprovidersettings$factory.field_177870_A);
            chunkprovidersettings$factory.field_177871_B = JsonUtils.func_151209_a(jsonobject, "useWaterLakes", chunkprovidersettings$factory.field_177871_B);
            chunkprovidersettings$factory.field_177872_C = JsonUtils.func_151208_a(jsonobject, "waterLakeChance", chunkprovidersettings$factory.field_177872_C);
            chunkprovidersettings$factory.field_177866_D = JsonUtils.func_151209_a(jsonobject, "useLavaLakes", chunkprovidersettings$factory.field_177866_D);
            chunkprovidersettings$factory.field_177867_E = JsonUtils.func_151208_a(jsonobject, "lavaLakeChance", chunkprovidersettings$factory.field_177867_E);
            chunkprovidersettings$factory.field_177868_F = JsonUtils.func_151209_a(jsonobject, "useLavaOceans", chunkprovidersettings$factory.field_177868_F);
            chunkprovidersettings$factory.field_177869_G = JsonUtils.func_151208_a(jsonobject, "fixedBiome", chunkprovidersettings$factory.field_177869_G);
            if (chunkprovidersettings$factory.field_177869_G < 38 && chunkprovidersettings$factory.field_177869_G >= -1) {
               if (chunkprovidersettings$factory.field_177869_G >= BiomeGenBase.field_76778_j.field_76756_M) {
                  chunkprovidersettings$factory.field_177869_G += 2;
               }
            } else {
               chunkprovidersettings$factory.field_177869_G = -1;
            }

            chunkprovidersettings$factory.field_177877_H = JsonUtils.func_151208_a(jsonobject, "biomeSize", chunkprovidersettings$factory.field_177877_H);
            chunkprovidersettings$factory.field_177878_I = JsonUtils.func_151208_a(jsonobject, "riverSize", chunkprovidersettings$factory.field_177878_I);
            chunkprovidersettings$factory.field_177879_J = JsonUtils.func_151208_a(jsonobject, "dirtSize", chunkprovidersettings$factory.field_177879_J);
            chunkprovidersettings$factory.field_177880_K = JsonUtils.func_151208_a(jsonobject, "dirtCount", chunkprovidersettings$factory.field_177880_K);
            chunkprovidersettings$factory.field_177873_L = JsonUtils.func_151208_a(jsonobject, "dirtMinHeight", chunkprovidersettings$factory.field_177873_L);
            chunkprovidersettings$factory.field_177874_M = JsonUtils.func_151208_a(jsonobject, "dirtMaxHeight", chunkprovidersettings$factory.field_177874_M);
            chunkprovidersettings$factory.field_177875_N = JsonUtils.func_151208_a(jsonobject, "gravelSize", chunkprovidersettings$factory.field_177875_N);
            chunkprovidersettings$factory.field_177876_O = JsonUtils.func_151208_a(jsonobject, "gravelCount", chunkprovidersettings$factory.field_177876_O);
            chunkprovidersettings$factory.field_177886_P = JsonUtils.func_151208_a(jsonobject, "gravelMinHeight", chunkprovidersettings$factory.field_177886_P);
            chunkprovidersettings$factory.field_177885_Q = JsonUtils.func_151208_a(jsonobject, "gravelMaxHeight", chunkprovidersettings$factory.field_177885_Q);
            chunkprovidersettings$factory.field_177888_R = JsonUtils.func_151208_a(jsonobject, "graniteSize", chunkprovidersettings$factory.field_177888_R);
            chunkprovidersettings$factory.field_177887_S = JsonUtils.func_151208_a(jsonobject, "graniteCount", chunkprovidersettings$factory.field_177887_S);
            chunkprovidersettings$factory.field_177882_T = JsonUtils.func_151208_a(jsonobject, "graniteMinHeight", chunkprovidersettings$factory.field_177882_T);
            chunkprovidersettings$factory.field_177881_U = JsonUtils.func_151208_a(jsonobject, "graniteMaxHeight", chunkprovidersettings$factory.field_177881_U);
            chunkprovidersettings$factory.field_177884_V = JsonUtils.func_151208_a(jsonobject, "dioriteSize", chunkprovidersettings$factory.field_177884_V);
            chunkprovidersettings$factory.field_177883_W = JsonUtils.func_151208_a(jsonobject, "dioriteCount", chunkprovidersettings$factory.field_177883_W);
            chunkprovidersettings$factory.field_177891_X = JsonUtils.func_151208_a(jsonobject, "dioriteMinHeight", chunkprovidersettings$factory.field_177891_X);
            chunkprovidersettings$factory.field_177890_Y = JsonUtils.func_151208_a(jsonobject, "dioriteMaxHeight", chunkprovidersettings$factory.field_177890_Y);
            chunkprovidersettings$factory.field_177892_Z = JsonUtils.func_151208_a(jsonobject, "andesiteSize", chunkprovidersettings$factory.field_177892_Z);
            chunkprovidersettings$factory.field_177936_aa = JsonUtils.func_151208_a(jsonobject, "andesiteCount", chunkprovidersettings$factory.field_177936_aa);
            chunkprovidersettings$factory.field_177937_ab = JsonUtils.func_151208_a(jsonobject, "andesiteMinHeight", chunkprovidersettings$factory.field_177937_ab);
            chunkprovidersettings$factory.field_177934_ac = JsonUtils.func_151208_a(jsonobject, "andesiteMaxHeight", chunkprovidersettings$factory.field_177934_ac);
            chunkprovidersettings$factory.field_177935_ad = JsonUtils.func_151208_a(jsonobject, "coalSize", chunkprovidersettings$factory.field_177935_ad);
            chunkprovidersettings$factory.field_177941_ae = JsonUtils.func_151208_a(jsonobject, "coalCount", chunkprovidersettings$factory.field_177941_ae);
            chunkprovidersettings$factory.field_177943_af = JsonUtils.func_151208_a(jsonobject, "coalMinHeight", chunkprovidersettings$factory.field_177943_af);
            chunkprovidersettings$factory.field_177938_ag = JsonUtils.func_151208_a(jsonobject, "coalMaxHeight", chunkprovidersettings$factory.field_177938_ag);
            chunkprovidersettings$factory.field_177939_ah = JsonUtils.func_151208_a(jsonobject, "ironSize", chunkprovidersettings$factory.field_177939_ah);
            chunkprovidersettings$factory.field_177922_ai = JsonUtils.func_151208_a(jsonobject, "ironCount", chunkprovidersettings$factory.field_177922_ai);
            chunkprovidersettings$factory.field_177924_aj = JsonUtils.func_151208_a(jsonobject, "ironMinHeight", chunkprovidersettings$factory.field_177924_aj);
            chunkprovidersettings$factory.field_177918_ak = JsonUtils.func_151208_a(jsonobject, "ironMaxHeight", chunkprovidersettings$factory.field_177918_ak);
            chunkprovidersettings$factory.field_177920_al = JsonUtils.func_151208_a(jsonobject, "goldSize", chunkprovidersettings$factory.field_177920_al);
            chunkprovidersettings$factory.field_177930_am = JsonUtils.func_151208_a(jsonobject, "goldCount", chunkprovidersettings$factory.field_177930_am);
            chunkprovidersettings$factory.field_177932_an = JsonUtils.func_151208_a(jsonobject, "goldMinHeight", chunkprovidersettings$factory.field_177932_an);
            chunkprovidersettings$factory.field_177926_ao = JsonUtils.func_151208_a(jsonobject, "goldMaxHeight", chunkprovidersettings$factory.field_177926_ao);
            chunkprovidersettings$factory.field_177928_ap = JsonUtils.func_151208_a(jsonobject, "redstoneSize", chunkprovidersettings$factory.field_177928_ap);
            chunkprovidersettings$factory.field_177908_aq = JsonUtils.func_151208_a(jsonobject, "redstoneCount", chunkprovidersettings$factory.field_177908_aq);
            chunkprovidersettings$factory.field_177906_ar = JsonUtils.func_151208_a(jsonobject, "redstoneMinHeight", chunkprovidersettings$factory.field_177906_ar);
            chunkprovidersettings$factory.field_177904_as = JsonUtils.func_151208_a(jsonobject, "redstoneMaxHeight", chunkprovidersettings$factory.field_177904_as);
            chunkprovidersettings$factory.field_177902_at = JsonUtils.func_151208_a(jsonobject, "diamondSize", chunkprovidersettings$factory.field_177902_at);
            chunkprovidersettings$factory.field_177916_au = JsonUtils.func_151208_a(jsonobject, "diamondCount", chunkprovidersettings$factory.field_177916_au);
            chunkprovidersettings$factory.field_177914_av = JsonUtils.func_151208_a(jsonobject, "diamondMinHeight", chunkprovidersettings$factory.field_177914_av);
            chunkprovidersettings$factory.field_177912_aw = JsonUtils.func_151208_a(jsonobject, "diamondMaxHeight", chunkprovidersettings$factory.field_177912_aw);
            chunkprovidersettings$factory.field_177910_ax = JsonUtils.func_151208_a(jsonobject, "lapisSize", chunkprovidersettings$factory.field_177910_ax);
            chunkprovidersettings$factory.field_177897_ay = JsonUtils.func_151208_a(jsonobject, "lapisCount", chunkprovidersettings$factory.field_177897_ay);
            chunkprovidersettings$factory.field_177895_az = JsonUtils.func_151208_a(jsonobject, "lapisCenterHeight", chunkprovidersettings$factory.field_177895_az);
            chunkprovidersettings$factory.field_177889_aA = JsonUtils.func_151208_a(jsonobject, "lapisSpread", chunkprovidersettings$factory.field_177889_aA);
         } catch (Exception var7) {
            ;
         }

         return chunkprovidersettings$factory;
      }

      public JsonElement serialize(ChunkProviderSettings.Factory p_serialize_1_, Type p_serialize_2_, JsonSerializationContext p_serialize_3_) {
         JsonObject jsonobject = new JsonObject();
         jsonobject.addProperty("coordinateScale", Float.valueOf(p_serialize_1_.field_177899_b));
         jsonobject.addProperty("heightScale", Float.valueOf(p_serialize_1_.field_177900_c));
         jsonobject.addProperty("lowerLimitScale", Float.valueOf(p_serialize_1_.field_177898_e));
         jsonobject.addProperty("upperLimitScale", Float.valueOf(p_serialize_1_.field_177896_d));
         jsonobject.addProperty("depthNoiseScaleX", Float.valueOf(p_serialize_1_.field_177893_f));
         jsonobject.addProperty("depthNoiseScaleZ", Float.valueOf(p_serialize_1_.field_177894_g));
         jsonobject.addProperty("depthNoiseScaleExponent", Float.valueOf(p_serialize_1_.field_177915_h));
         jsonobject.addProperty("mainNoiseScaleX", Float.valueOf(p_serialize_1_.field_177917_i));
         jsonobject.addProperty("mainNoiseScaleY", Float.valueOf(p_serialize_1_.field_177911_j));
         jsonobject.addProperty("mainNoiseScaleZ", Float.valueOf(p_serialize_1_.field_177913_k));
         jsonobject.addProperty("baseSize", Float.valueOf(p_serialize_1_.field_177907_l));
         jsonobject.addProperty("stretchY", Float.valueOf(p_serialize_1_.field_177909_m));
         jsonobject.addProperty("biomeDepthWeight", Float.valueOf(p_serialize_1_.field_177903_n));
         jsonobject.addProperty("biomeDepthOffset", Float.valueOf(p_serialize_1_.field_177905_o));
         jsonobject.addProperty("biomeScaleWeight", Float.valueOf(p_serialize_1_.field_177933_p));
         jsonobject.addProperty("biomeScaleOffset", Float.valueOf(p_serialize_1_.field_177931_q));
         jsonobject.addProperty("seaLevel", Integer.valueOf(p_serialize_1_.field_177929_r));
         jsonobject.addProperty("useCaves", Boolean.valueOf(p_serialize_1_.field_177927_s));
         jsonobject.addProperty("useDungeons", Boolean.valueOf(p_serialize_1_.field_177925_t));
         jsonobject.addProperty("dungeonChance", Integer.valueOf(p_serialize_1_.field_177923_u));
         jsonobject.addProperty("useStrongholds", Boolean.valueOf(p_serialize_1_.field_177921_v));
         jsonobject.addProperty("useVillages", Boolean.valueOf(p_serialize_1_.field_177919_w));
         jsonobject.addProperty("useMineShafts", Boolean.valueOf(p_serialize_1_.field_177944_x));
         jsonobject.addProperty("useTemples", Boolean.valueOf(p_serialize_1_.field_177942_y));
         jsonobject.addProperty("useMonuments", Boolean.valueOf(p_serialize_1_.field_177940_z));
         jsonobject.addProperty("useRavines", Boolean.valueOf(p_serialize_1_.field_177870_A));
         jsonobject.addProperty("useWaterLakes", Boolean.valueOf(p_serialize_1_.field_177871_B));
         jsonobject.addProperty("waterLakeChance", Integer.valueOf(p_serialize_1_.field_177872_C));
         jsonobject.addProperty("useLavaLakes", Boolean.valueOf(p_serialize_1_.field_177866_D));
         jsonobject.addProperty("lavaLakeChance", Integer.valueOf(p_serialize_1_.field_177867_E));
         jsonobject.addProperty("useLavaOceans", Boolean.valueOf(p_serialize_1_.field_177868_F));
         jsonobject.addProperty("fixedBiome", Integer.valueOf(p_serialize_1_.field_177869_G));
         jsonobject.addProperty("biomeSize", Integer.valueOf(p_serialize_1_.field_177877_H));
         jsonobject.addProperty("riverSize", Integer.valueOf(p_serialize_1_.field_177878_I));
         jsonobject.addProperty("dirtSize", Integer.valueOf(p_serialize_1_.field_177879_J));
         jsonobject.addProperty("dirtCount", Integer.valueOf(p_serialize_1_.field_177880_K));
         jsonobject.addProperty("dirtMinHeight", Integer.valueOf(p_serialize_1_.field_177873_L));
         jsonobject.addProperty("dirtMaxHeight", Integer.valueOf(p_serialize_1_.field_177874_M));
         jsonobject.addProperty("gravelSize", Integer.valueOf(p_serialize_1_.field_177875_N));
         jsonobject.addProperty("gravelCount", Integer.valueOf(p_serialize_1_.field_177876_O));
         jsonobject.addProperty("gravelMinHeight", Integer.valueOf(p_serialize_1_.field_177886_P));
         jsonobject.addProperty("gravelMaxHeight", Integer.valueOf(p_serialize_1_.field_177885_Q));
         jsonobject.addProperty("graniteSize", Integer.valueOf(p_serialize_1_.field_177888_R));
         jsonobject.addProperty("graniteCount", Integer.valueOf(p_serialize_1_.field_177887_S));
         jsonobject.addProperty("graniteMinHeight", Integer.valueOf(p_serialize_1_.field_177882_T));
         jsonobject.addProperty("graniteMaxHeight", Integer.valueOf(p_serialize_1_.field_177881_U));
         jsonobject.addProperty("dioriteSize", Integer.valueOf(p_serialize_1_.field_177884_V));
         jsonobject.addProperty("dioriteCount", Integer.valueOf(p_serialize_1_.field_177883_W));
         jsonobject.addProperty("dioriteMinHeight", Integer.valueOf(p_serialize_1_.field_177891_X));
         jsonobject.addProperty("dioriteMaxHeight", Integer.valueOf(p_serialize_1_.field_177890_Y));
         jsonobject.addProperty("andesiteSize", Integer.valueOf(p_serialize_1_.field_177892_Z));
         jsonobject.addProperty("andesiteCount", Integer.valueOf(p_serialize_1_.field_177936_aa));
         jsonobject.addProperty("andesiteMinHeight", Integer.valueOf(p_serialize_1_.field_177937_ab));
         jsonobject.addProperty("andesiteMaxHeight", Integer.valueOf(p_serialize_1_.field_177934_ac));
         jsonobject.addProperty("coalSize", Integer.valueOf(p_serialize_1_.field_177935_ad));
         jsonobject.addProperty("coalCount", Integer.valueOf(p_serialize_1_.field_177941_ae));
         jsonobject.addProperty("coalMinHeight", Integer.valueOf(p_serialize_1_.field_177943_af));
         jsonobject.addProperty("coalMaxHeight", Integer.valueOf(p_serialize_1_.field_177938_ag));
         jsonobject.addProperty("ironSize", Integer.valueOf(p_serialize_1_.field_177939_ah));
         jsonobject.addProperty("ironCount", Integer.valueOf(p_serialize_1_.field_177922_ai));
         jsonobject.addProperty("ironMinHeight", Integer.valueOf(p_serialize_1_.field_177924_aj));
         jsonobject.addProperty("ironMaxHeight", Integer.valueOf(p_serialize_1_.field_177918_ak));
         jsonobject.addProperty("goldSize", Integer.valueOf(p_serialize_1_.field_177920_al));
         jsonobject.addProperty("goldCount", Integer.valueOf(p_serialize_1_.field_177930_am));
         jsonobject.addProperty("goldMinHeight", Integer.valueOf(p_serialize_1_.field_177932_an));
         jsonobject.addProperty("goldMaxHeight", Integer.valueOf(p_serialize_1_.field_177926_ao));
         jsonobject.addProperty("redstoneSize", Integer.valueOf(p_serialize_1_.field_177928_ap));
         jsonobject.addProperty("redstoneCount", Integer.valueOf(p_serialize_1_.field_177908_aq));
         jsonobject.addProperty("redstoneMinHeight", Integer.valueOf(p_serialize_1_.field_177906_ar));
         jsonobject.addProperty("redstoneMaxHeight", Integer.valueOf(p_serialize_1_.field_177904_as));
         jsonobject.addProperty("diamondSize", Integer.valueOf(p_serialize_1_.field_177902_at));
         jsonobject.addProperty("diamondCount", Integer.valueOf(p_serialize_1_.field_177916_au));
         jsonobject.addProperty("diamondMinHeight", Integer.valueOf(p_serialize_1_.field_177914_av));
         jsonobject.addProperty("diamondMaxHeight", Integer.valueOf(p_serialize_1_.field_177912_aw));
         jsonobject.addProperty("lapisSize", Integer.valueOf(p_serialize_1_.field_177910_ax));
         jsonobject.addProperty("lapisCount", Integer.valueOf(p_serialize_1_.field_177897_ay));
         jsonobject.addProperty("lapisCenterHeight", Integer.valueOf(p_serialize_1_.field_177895_az));
         jsonobject.addProperty("lapisSpread", Integer.valueOf(p_serialize_1_.field_177889_aA));
         return jsonobject;
      }
   }
}
