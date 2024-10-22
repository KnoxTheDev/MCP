package net.minecraft.util;

import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;

public class ChatComponentScore extends ChatComponentStyle {
   private final String field_179999_b;
   private final String field_180000_c;
   private String field_179998_d = "";

   public ChatComponentScore(String p_i45997_1_, String p_i45997_2_) {
      this.field_179999_b = p_i45997_1_;
      this.field_180000_c = p_i45997_2_;
   }

   public String func_179995_g() {
      return this.field_179999_b;
   }

   public String func_179994_h() {
      return this.field_180000_c;
   }

   public void func_179997_b(String p_179997_1_) {
      this.field_179998_d = p_179997_1_;
   }

   public String func_150261_e() {
      MinecraftServer minecraftserver = MinecraftServer.func_71276_C();
      if (minecraftserver != null && minecraftserver.func_175578_N() && StringUtils.func_151246_b(this.field_179998_d)) {
         Scoreboard scoreboard = minecraftserver.func_71218_a(0).func_96441_U();
         ScoreObjective scoreobjective = scoreboard.func_96518_b(this.field_180000_c);
         if (scoreboard.func_178819_b(this.field_179999_b, scoreobjective)) {
            Score score = scoreboard.func_96529_a(this.field_179999_b, scoreobjective);
            this.func_179997_b(String.format("%d", score.func_96652_c()));
         } else {
            this.field_179998_d = "";
         }
      }

      return this.field_179998_d;
   }

   public ChatComponentScore func_150259_f() {
      ChatComponentScore chatcomponentscore = new ChatComponentScore(this.field_179999_b, this.field_180000_c);
      chatcomponentscore.func_179997_b(this.field_179998_d);
      chatcomponentscore.func_150255_a(this.func_150256_b().func_150232_l());

      for(IChatComponent ichatcomponent : this.func_150253_a()) {
         chatcomponentscore.func_150257_a(ichatcomponent.func_150259_f());
      }

      return chatcomponentscore;
   }

   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof ChatComponentScore)) {
         return false;
      } else {
         ChatComponentScore chatcomponentscore = (ChatComponentScore)p_equals_1_;
         return this.field_179999_b.equals(chatcomponentscore.field_179999_b) && this.field_180000_c.equals(chatcomponentscore.field_180000_c) && super.equals(p_equals_1_);
      }
   }

   public String toString() {
      return "ScoreComponent{name='" + this.field_179999_b + '\'' + "objective='" + this.field_180000_c + '\'' + ", siblings=" + this.field_150264_a + ", style=" + this.func_150256_b() + '}';
   }
}
