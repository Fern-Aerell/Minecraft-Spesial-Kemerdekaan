package com.aerelldev.mcku.inits;

import com.aerelldev.mcku.Mcku;
import com.aerelldev.mcku.armors.ArmorMaterialMcku;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcku.MODID);

    public static final RegistryObject<Item> LAGU_17_AGUSTUS_DISC = registerRecordItem("lagu_17_agustus_disc", SoundInit.LAGU_17_AGUSTUS, 2540);
    public static final RegistryObject<Item> LAGU_INDONESIA_RAYA_DISC = registerRecordItem("lagu_indonesia_raya_disc", SoundInit.LAGU_INDONESIA_RAYA, 2140);
    public static final RegistryObject<Item> LAGU_MAJU_TAK_GENTAR_DISC = registerRecordItem("lagu_maju_tak_gentar_disc", SoundInit.LAGU_MAJU_TAK_GENTAR, 2060);

    public static final RegistryObject<Item> RED_LEATHER = registerItemBasic("red_leather");
    public static final RegistryObject<Item> WHITE_LEATHER = registerItemBasic("white_leather");

    public static final RegistryObject<Item> BENDERA_INDONESIA = ITEMS.register("bendera_indonesia",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> BANDANA_INDONESIA = ITEMS.register("bandana_indonesia",
            () -> new ArmorItem(ArmorMaterialMcku.BANDANA_INDONESIA, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));

    private static final RegistryObject<Item> registerItemBasic(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    private static final RegistryObject<Item> registerRecordItem(String name, RegistryObject<SoundEvent> sound, int lengthInTicks) {
        return ITEMS.register(name, () -> new RecordItem(5, sound, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), lengthInTicks));
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
