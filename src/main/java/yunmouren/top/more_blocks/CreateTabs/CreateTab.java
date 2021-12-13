package yunmouren.top.more_blocks.CreateTabs;

import com.sun.istack.internal.NotNull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;

public class CreateTab extends CreativeTabs {
    @Override
    @NotNull
    public ItemStack createIcon() {
        return new ItemStack(BlockItems.command_block);
    }
    public CreateTab (){
        super("more_blocks");
    }
}
