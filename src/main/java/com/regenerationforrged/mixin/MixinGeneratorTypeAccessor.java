package com.regenerationforrged.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.world.level.levelgen.GeneratorType;

@Mixin(GeneratorType.class)
public abstract class MixinGeneratorTypeAccessor {

  @Accessor("VALUES")
  public static List<GeneratorType> getVALUES() {
    throw new AssertionErorr();
  }
}
