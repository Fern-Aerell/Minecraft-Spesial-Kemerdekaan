package com.aerelldev.mcku.init;

import com.aerelldev.mcku.armors.ArmorMaterialMcku;
import com.aerelldev.mcku.Mcku;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ItemInit {

    public static final Item LAGU_17_AGUSTUS_DISC = registerMusicDiscItem("lagu_17_agustus_disc", SoundInit.LAGU_17_AGUSTUS, 127);
    public static final Item LAGU_INDONESIA_RAYA_DISC = registerMusicDiscItem("lagu_indonesia_raya_disc", SoundInit.LAGU_INDONESIA_RAYA, 107);
    public static final Item LAGU_MAJU_TAK_GENTAR_DISC = registerMusicDiscItem("lagu_maju_tak_gentar_disc", SoundInit.LAGU_MAJU_TAK_GENTAR, 103);

    public static final Item RED_LEATHER = registerItemBasic("red_leather");
    public static final Item WHITE_LEATHER = registerItemBasic("white_leather");

    public static final Item BANDANA_INDONESIA = registerItem("bandana_indonesia",
            new ArmorItem(ArmorMaterialMcku.BANDANA_INDONESIA, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1)));

    public static final Item BENDERA_INDONESIA = registerItem("bendera_indonesia",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1)));

    private static final Item registerMusicDiscItem(String name, SoundEvent sound, int lengthInSecond) {
        return registerItem(name, new MusicDiscItem(5, sound, new FabricItemSettings().rarity(Rarity.RARE).maxCount(1), lengthInSecond));
    }

    private static final Item registerItemBasic(String name) {
        return registerItem(name, new Item(new FabricItemSettings()));
    }

    private static Item registerItem(String name, Item item) {
        Identifier id = new Identifier(Mcku.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {}
}
