package com.aerelldev.mcku.init;

import com.aerelldev.mcku.commands.EmoteKemerdekaanCommand;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class CommandInit {
    public static void registerCommand() {
        CommandRegistrationCallback.EVENT.register(EmoteKemerdekaanCommand::register);
    }
}
