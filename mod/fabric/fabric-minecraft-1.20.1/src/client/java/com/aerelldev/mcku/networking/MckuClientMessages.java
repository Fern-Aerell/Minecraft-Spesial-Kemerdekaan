package com.aerelldev.mcku.networking;

import com.aerelldev.mcku.Mcku;
import com.aerelldev.mcku.networking.packet.PlayEmoteS2CPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;

public class MckuClientMessages {
    public static final Identifier PLAY_EMOTE_ID = new Identifier(Mcku.MOD_ID, "play_emote");

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(PLAY_EMOTE_ID, PlayEmoteS2CPacket::receive);
    }
}
