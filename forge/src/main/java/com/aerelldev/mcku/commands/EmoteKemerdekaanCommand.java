package com.aerelldev.mcku.commands;

import com.aerelldev.mcku.players.PlayerAnimator;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class EmoteKemerdekaanCommand {
    public EmoteKemerdekaanCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("hormat").executes((command) -> {
            return playEmote(command.getSource(), "hormat");
        }));

        dispatcher.register(Commands.literal("stop").executes((command) -> {
            return playEmote(command.getSource(), "stop");
        }));
    }

    private int playEmote(CommandSourceStack source, String animation) throws CommandSyntaxException {

        try {
            PlayerAnimator.setAnimation(source.getPlayer(), animation);
        }catch (Exception exception){
            source.sendFailure(Component.literal(exception.getMessage()));
        }

        return 1;
    }
}
