package net.minecraft.event;

import com.google.common.collect.Maps;
import java.util.Map;

public class ClickEvent {
   private final ClickEvent.Action field_150671_a;
   private final String field_150670_b;

   public ClickEvent(ClickEvent.Action p_i45156_1_, String p_i45156_2_) {
      this.field_150671_a = p_i45156_1_;
      this.field_150670_b = p_i45156_2_;
   }

   public ClickEvent.Action func_150669_a() {
      return this.field_150671_a;
   }

   public String func_150668_b() {
      return this.field_150670_b;
   }

   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         ClickEvent clickevent = (ClickEvent)p_equals_1_;
         if (this.field_150671_a != clickevent.field_150671_a) {
            return false;
         } else {
            if (this.field_150670_b != null) {
               if (!this.field_150670_b.equals(clickevent.field_150670_b)) {
                  return false;
               }
            } else if (clickevent.field_150670_b != null) {
               return false;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public String toString() {
      return "ClickEvent{action=" + this.field_150671_a + ", value='" + this.field_150670_b + '\'' + '}';
   }

   public int hashCode() {
      int i = this.field_150671_a.hashCode();
      i = 31 * i + (this.field_150670_b != null ? this.field_150670_b.hashCode() : 0);
      return i;
   }

   public static enum Action {
      OPEN_URL("open_url", true),
      OPEN_FILE("open_file", false),
      RUN_COMMAND("run_command", true),
      TWITCH_USER_INFO("twitch_user_info", false),
      SUGGEST_COMMAND("suggest_command", true),
      CHANGE_PAGE("change_page", true);

      private static final Map<String, ClickEvent.Action> field_150679_e = Maps.<String, ClickEvent.Action>newHashMap();
      private final boolean field_150676_f;
      private final String field_150677_g;

      private Action(String p_i45155_3_, boolean p_i45155_4_) {
         this.field_150677_g = p_i45155_3_;
         this.field_150676_f = p_i45155_4_;
      }

      public boolean func_150674_a() {
         return this.field_150676_f;
      }

      public String func_150673_b() {
         return this.field_150677_g;
      }

      public static ClickEvent.Action func_150672_a(String p_150672_0_) {
         return field_150679_e.get(p_150672_0_);
      }

      static {
         for(ClickEvent.Action clickevent$action : values()) {
            field_150679_e.put(clickevent$action.func_150673_b(), clickevent$action);
         }

      }
   }
}
