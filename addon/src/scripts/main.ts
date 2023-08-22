import { world } from "@minecraft/server";

world.beforeEvents.chatSend.subscribe( async (event) => {
    const player = event.sender;
    const message = event.message;

    switch (message) {
        case "#hormat":
            await player.runCommandAsync("playanimation @s animation.humanoid.hormat")
            break;
        case "#stop":
            await player.runCommandAsync("playanimation @s animation.humanoid.stop")
            break;
    }

    event.cancel = true;
});