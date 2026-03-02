package com.skyreed.noxaerofairplay.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xaero.common.minimap.MinimapProcessor;

@Pseudo
@Mixin(value = MinimapProcessor.class, remap = false)
public class MixinMinimapProcessor {
    @Inject(method = "getNoMinimapMessageReceived", at = @At("HEAD"), cancellable = true)
    private void cancelNoMinimapMessage(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
    @Inject(method = "getForcedFairPlay", at = @At("HEAD"), cancellable = true)
    private void cancelFairPlayMessage(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
    @Inject(method = "isConsideringNetherFairPlayMessage", at = @At("HEAD"), cancellable = true)
    private void cancelNetherFairPlayMessage(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}