package com.aerelldev.mcku.players;

import com.aerelldev.mcku.Mcku;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public class PlayerAnimator {

    public static void setAnimation(Player player, String animation) throws Exception {
        var source = Minecraft.getInstance().level.getPlayerByUUID(player.getUUID());

        var anim = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) source).get(new ResourceLocation(Mcku.MODID, "animation"));

        if(anim != null) {
            anim.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation(Mcku.MODID, animation))));
        }else{
            throw new Exception("Player Animator Error...");
        }

    }

    public static IAnimation registerPlayerAnimation(AbstractClientPlayer player) {
        return new ModifierLayer<>();
    }

}
