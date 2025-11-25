package com.regenerationforrged.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.level.chunk.ChunkMap;

@Mixin(net.minecraft.world.level.chunk.ChunkAccess.class)
public astract class MixinChunkAccess {

  @Redirect(method = "applyCarvers", at = @At("TAIL"))
  private void rgf$carveRiver(CallBackInfo ci) {
    
  }
}
