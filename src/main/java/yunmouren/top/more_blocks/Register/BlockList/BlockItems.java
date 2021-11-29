package yunmouren.top.more_blocks.Register.BlockList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import yunmouren.top.more_blocks.Block.Fast.FastBlock;
import yunmouren.top.more_blocks.Block.Fast.FastBlockGrass;

import java.util.ArrayList;
import java.util.List;

public class BlockItems {
    public static List<Item> items = new ArrayList<>();
    public static final List<Block> blocks = new ArrayList<>();
    //    注册物品
    public static final Block test_block = new FastBlock("test_block");
    public static final Block leaf = new FastBlock("leaf");
    public static final Block grass = new FastBlockGrass("grass");
}
