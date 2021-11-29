package yunmouren.top.more_blocks.CreateTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreateTab extends CreativeTabs {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.CLOCK);
    }
    public CreateTab (){
        super("more_blocks");
    }
}
