package net.votmdevs.voicesofthemines.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.votmdevs.voicesofthemines.VoicesOfTheMines;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VoicesOfTheMines.MOD_ID);

    public static final DeferredItem<Item> DRIVE = ITEMS.register("drive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIVE0 = ITEMS.register("drive0",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIVE1 = ITEMS.register("drive1",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIVE2 = ITEMS.register("drive2",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIVE3 = ITEMS.register("drive3",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
