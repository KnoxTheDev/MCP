package net.minecraft.client.audio;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ITickable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class MusicTicker implements ITickable {
   private final Random field_147679_a = new Random();
   private final Minecraft field_147677_b;
   private ISound field_147678_c;
   private int field_147676_d = 100;

   public MusicTicker(Minecraft p_i45112_1_) {
      this.field_147677_b = p_i45112_1_;
   }

   public void func_73660_a() {
      MusicTicker.MusicType musicticker$musictype = this.field_147677_b.func_147109_W();
      if (this.field_147678_c != null) {
         if (!musicticker$musictype.func_148635_a().equals(this.field_147678_c.func_147650_b())) {
            this.field_147677_b.func_147118_V().func_147683_b(this.field_147678_c);
            this.field_147676_d = MathHelper.func_76136_a(this.field_147679_a, 0, musicticker$musictype.func_148634_b() / 2);
         }

         if (!this.field_147677_b.func_147118_V().func_147692_c(this.field_147678_c)) {
            this.field_147678_c = null;
            this.field_147676_d = Math.min(MathHelper.func_76136_a(this.field_147679_a, musicticker$musictype.func_148634_b(), musicticker$musictype.func_148633_c()), this.field_147676_d);
         }
      }

      if (this.field_147678_c == null && this.field_147676_d-- <= 0) {
         this.func_181558_a(musicticker$musictype);
      }

   }

   public void func_181558_a(MusicTicker.MusicType p_181558_1_) {
      this.field_147678_c = PositionedSoundRecord.func_147673_a(p_181558_1_.func_148635_a());
      this.field_147677_b.func_147118_V().func_147682_a(this.field_147678_c);
      this.field_147676_d = Integer.MAX_VALUE;
   }

   public void func_181557_a() {
      if (this.field_147678_c != null) {
         this.field_147677_b.func_147118_V().func_147683_b(this.field_147678_c);
         this.field_147678_c = null;
         this.field_147676_d = 0;
      }

   }

   public static enum MusicType {
      MENU(new ResourceLocation("minecraft:music.menu"), 20, 600),
      GAME(new ResourceLocation("minecraft:music.game"), 12000, 24000),
      CREATIVE(new ResourceLocation("minecraft:music.game.creative"), 1200, 3600),
      CREDITS(new ResourceLocation("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE),
      NETHER(new ResourceLocation("minecraft:music.game.nether"), 1200, 3600),
      END_BOSS(new ResourceLocation("minecraft:music.game.end.dragon"), 0, 0),
      END(new ResourceLocation("minecraft:music.game.end"), 6000, 24000);

      private final ResourceLocation field_148645_h;
      private final int field_148646_i;
      private final int field_148643_j;

      private MusicType(ResourceLocation p_i45111_3_, int p_i45111_4_, int p_i45111_5_) {
         this.field_148645_h = p_i45111_3_;
         this.field_148646_i = p_i45111_4_;
         this.field_148643_j = p_i45111_5_;
      }

      public ResourceLocation func_148635_a() {
         return this.field_148645_h;
      }

      public int func_148634_b() {
         return this.field_148646_i;
      }

      public int func_148633_c() {
         return this.field_148643_j;
      }
   }
}
