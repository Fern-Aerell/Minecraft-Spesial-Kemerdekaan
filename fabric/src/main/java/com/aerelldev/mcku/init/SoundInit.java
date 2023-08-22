package com.aerelldev.mcku.init;

import com.aerelldev.mcku.Mcku;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundInit {

    public static SoundEvent LAGU_17_AGUSTUS = registerSoundEvent("lagu_17_agustus");
    public static SoundEvent LAGU_INDONESIA_RAYA = registerSoundEvent("lagu_indonesia_raya");
    public static SoundEvent LAGU_MAJU_TAK_GENTAR = registerSoundEvent("lagu_maju_tak_gentar");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Mcku.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

}
