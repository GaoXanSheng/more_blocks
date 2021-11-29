package yunmouren.top.more_blocks.Item.Fast;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import static yunmouren.top.more_blocks.More_Blocks.MOD_ID;

public class FastItem extends ItemBlock {

    public FastItem(Block block, String name) {
        super(block);
        this.setRegistryName(MOD_ID, name);
    }
}
