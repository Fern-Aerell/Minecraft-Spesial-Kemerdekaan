package com.aerelldev.mcku.events;

import com.aerelldev.mcku.Mcku;
import com.aerelldev.mcku.commands.EmoteKemerdekaanCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = Mcku.MODID)
public class MckuEvents {
    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event) {
        new EmoteKemerdekaanCommand(event.getDispatcher());
        ConfigCommand.register(event.getDispatcher());
    }
}
