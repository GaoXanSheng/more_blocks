package yunmouren.top.more_blocks.Block.Fast;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import yunmouren.top.more_blocks.CreateTabs.CreateTabLoader;
import yunmouren.top.more_blocks.Proxy.IHasModel;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;

import static yunmouren.top.more_blocks.More_Blocks.proxy;

public class FastBlock extends Block implements IHasModel {
    public FastBlock(String name){
        super(Material.ROCK);
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreateTabLoader.CreativeTabs);
        this.setBlockUnbreakable();
        this.setResistance(4000);
        BlockItems.blocks.add(this);
        BlockItems.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModel() {
        proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
