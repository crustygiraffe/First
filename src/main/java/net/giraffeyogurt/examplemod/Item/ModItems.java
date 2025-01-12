package net.giraffeyogurt.examplemod.Item;

import net.giraffeyogurt.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register( "alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register( "raw_alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIBIDI_NUGGET = ITEMS.register( "skibidi_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KHUBAIB = ITEMS.register( "khubaib", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAADI = ITEMS.register( "haadi", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
