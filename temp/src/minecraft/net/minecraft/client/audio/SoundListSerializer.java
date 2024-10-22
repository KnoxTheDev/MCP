package net.minecraft.client.audio;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.util.JsonUtils;
import org.apache.commons.lang3.Validate;

public class SoundListSerializer implements JsonDeserializer<SoundList> {
   public SoundList deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException {
      JsonObject jsonobject = JsonUtils.func_151210_l(p_deserialize_1_, "entry");
      SoundList soundlist = new SoundList();
      soundlist.func_148572_a(JsonUtils.func_151209_a(jsonobject, "replace", false));
      SoundCategory soundcategory = SoundCategory.func_147154_a(JsonUtils.func_151219_a(jsonobject, "category", SoundCategory.MASTER.func_147155_a()));
      soundlist.func_148571_a(soundcategory);
      Validate.notNull(soundcategory, "Invalid category");
      if (jsonobject.has("sounds")) {
         JsonArray jsonarray = JsonUtils.func_151214_t(jsonobject, "sounds");

         for(int i = 0; i < jsonarray.size(); ++i) {
            JsonElement jsonelement = jsonarray.get(i);
            SoundList.SoundEntry soundlist$soundentry = new SoundList.SoundEntry();
            if (JsonUtils.func_151211_a(jsonelement)) {
               soundlist$soundentry.func_148561_a(JsonUtils.func_151206_a(jsonelement, "sound"));
            } else {
               JsonObject jsonobject1 = JsonUtils.func_151210_l(jsonelement, "sound");
               soundlist$soundentry.func_148561_a(JsonUtils.func_151200_h(jsonobject1, "name"));
               if (jsonobject1.has("type")) {
                  SoundList.SoundEntry.Type soundlist$soundentry$type = SoundList.SoundEntry.Type.func_148580_a(JsonUtils.func_151200_h(jsonobject1, "type"));
                  Validate.notNull(soundlist$soundentry$type, "Invalid type");
                  soundlist$soundentry.func_148562_a(soundlist$soundentry$type);
               }

               if (jsonobject1.has("volume")) {
                  float f = JsonUtils.func_151217_k(jsonobject1, "volume");
                  Validate.isTrue(f > 0.0F, "Invalid volume");
                  soundlist$soundentry.func_148553_a(f);
               }

               if (jsonobject1.has("pitch")) {
                  float f1 = JsonUtils.func_151217_k(jsonobject1, "pitch");
                  Validate.isTrue(f1 > 0.0F, "Invalid pitch");
                  soundlist$soundentry.func_148559_b(f1);
               }

               if (jsonobject1.has("weight")) {
                  int j = JsonUtils.func_151203_m(jsonobject1, "weight");
                  Validate.isTrue(j > 0, "Invalid weight");
                  soundlist$soundentry.func_148554_a(j);
               }

               if (jsonobject1.has("stream")) {
                  soundlist$soundentry.func_148557_a(JsonUtils.func_151212_i(jsonobject1, "stream"));
               }
            }

            soundlist.func_148570_a().add(soundlist$soundentry);
         }
      }

      return soundlist;
   }
}
