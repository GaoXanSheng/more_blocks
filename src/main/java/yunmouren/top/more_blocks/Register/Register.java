package yunmouren.top.more_blocks.Register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;


public class Register {

    public void Block(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockItems.blocks.toArray(new Block[0])
        );
    }

    public void ItemBlock(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                BlockItems.items.toArray(new Item[0])
        );
    }

    public void CustomModel(Block BlockName) {

    }
}
