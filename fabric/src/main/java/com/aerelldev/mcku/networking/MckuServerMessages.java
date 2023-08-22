package com.aerelldev.mcku.networking;

import com.aerelldev.mcku.Mcku;
import com.aerelldev.mcku.networking.packet.PlayEmoteC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class MckuServerMessages {
    public static final Identifier PLAY_EMOTE_ID = new Identifier(Mcku.MOD_ID, "play_emote");
    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(PLAY_EMOTE_ID, PlayEmoteC2SPacket::receive);
    }

}
