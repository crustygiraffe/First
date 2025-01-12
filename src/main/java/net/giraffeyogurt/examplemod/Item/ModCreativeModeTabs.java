package net.giraffeyogurt.examplemod.Item;

import net.giraffeyogurt.examplemod.ExampleMod;
import net.giraffeyogurt.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.examplemod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.examplemod.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> SKIBIDI_TAB = CREATIVE_MODE_TABS.register("skibidi_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SKIBIDI_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.examplemod.skibidi"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SKIBIDI_NUGGET.get());
                        output.accept(ModBlocks.SKIBIDI_BLOCK.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> OTHER_TAB = CREATIVE_MODE_TABS.register("other_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KHUBAIB.get()))
                    .withTabsBefore(SKIBIDI_TAB.getId())
                    .title(Component.translatable("creativetab.examplemod.other"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HAADI.get());
                        output.accept(ModItems.KHUBAIB.get());


                    }).build());




    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
