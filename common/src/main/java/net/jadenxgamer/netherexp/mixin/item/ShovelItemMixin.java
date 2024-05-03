package net.jadenxgamer.netherexp.mixin.item;

import net.jadenxgamer.netherexp.registry.block.JNEBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShovelItem.class)
public abstract class ShovelItemMixin {

    @Inject(
            method = "useOn",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void netherexp$useOn(UseOnContext useOnContext, CallbackInfoReturnable<InteractionResult> cir) {
        Level level = useOnContext.getLevel();
        BlockState state = level.getBlockState(useOnContext.getClickedPos());
        BlockState aboveState = level.getBlockState(useOnContext.getClickedPos().above());
        Player player = useOnContext.getPlayer();
        if (state.is(Blocks.CRIMSON_NYLIUM) && aboveState.isAir()) {
            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0f, 1.0f);
            level.setBlock(useOnContext.getClickedPos(), JNEBlocks.CRIMSON_NYLIUM_PATH.get().defaultBlockState(), 2);
            if (!player.isCreative()) {
                useOnContext.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(useOnContext.getHand()));
            }
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
        else if (state.is(Blocks.WARPED_NYLIUM) && aboveState.isAir()) {
            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0f, 1.0f);
            level.setBlock(useOnContext.getClickedPos(), JNEBlocks.WARPED_NYLIUM_PATH.get().defaultBlockState(), 2);
            if (!player.isCreative()) {
                useOnContext.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(useOnContext.getHand()));
            }
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
        else if (state.is(Blocks.SOUL_SOIL) && aboveState.isAir()) {
            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0f, 1.0f);
            level.setBlock(useOnContext.getClickedPos(), JNEBlocks.SOUL_PATH.get().defaultBlockState(), 2);
            if (!player.isCreative()) {
                useOnContext.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(useOnContext.getHand()));
            }
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
