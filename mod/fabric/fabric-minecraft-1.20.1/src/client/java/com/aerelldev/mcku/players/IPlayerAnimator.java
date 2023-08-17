package com.aerelldev.mcku.players;

import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;

public interface IPlayerAnimator {
    ModifierLayer<IAnimation> mcku_getModAnimation();

    void playEmote(String animation);
}
