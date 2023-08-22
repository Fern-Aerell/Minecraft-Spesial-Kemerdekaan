package com.aerelldev.mcku.commands;

import com.aerelldev.mcku.networking.MckuServerMessages;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class EmoteKemerdekaanCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(CommandManager.literal("hormat").executes(EmoteKemerdekaanCommand::hormat));
        dispatcher.register(CommandManager.literal("stop").executes(EmoteKemerdekaanCommand::stop));
    }

    private static void playEmote(ServerPlayerEntity player, String emoteId) {
        ServerPlayNetworking.send(player, MckuServerMessages.PLAY_EMOTE_ID, PacketByteBufs.create().writeString(emoteId));
    }

    private static int hormat(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        playEmote(context.getSource().getPlayer(), "hormat");
        return 1;
    }

    private static int stop(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        playEmote(context.getSource().getPlayer(), "stop");
        return 1;
    }

}
