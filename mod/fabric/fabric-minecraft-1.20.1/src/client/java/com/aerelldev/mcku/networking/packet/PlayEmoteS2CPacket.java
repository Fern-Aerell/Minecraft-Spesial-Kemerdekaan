package com.aerelldev.mcku.networking.packet;

import com.aerelldev.mcku.players.IPlayerAnimator;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class PlayEmoteS2CPacket {
    public static void receive(net.minecraft.client.MinecraftClient minecraftClient, ClientPlayNetworkHandler clientPlayNetworkHandler, PacketByteBuf packetByteBuf, PacketSender packetSender) {
        // Everything here happens ONLY on the Client!
        String emoteId = packetByteBuf.readString();

        var player = minecraftClient.player;

        if(player instanceof IPlayerAnimator) {
            ((IPlayerAnimator) player).playEmote(emoteId);
        }

    }
}
