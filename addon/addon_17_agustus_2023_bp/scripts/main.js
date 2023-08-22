"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};

import { world } from "@minecraft/server";

world.beforeEvents.chatSend.subscribe((event) => __awaiter(void 0, void 0, void 0, function* () {
    const player = event.sender;
    const message = event.message;
    switch (message) {
        case "#hormat":
            yield player.runCommandAsync("playanimation @s animation.humanoid.hormat");
            break;
        case "#stop":
            yield player.runCommandAsync("playanimation @s animation.humanoid.stop");
            break;
    }
    event.cancel = true;
}));
