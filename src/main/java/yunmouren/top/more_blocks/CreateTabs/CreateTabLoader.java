package yunmouren.top.more_blocks.CreateTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreateTabLoader {
        public static CreativeTabs CreativeTabs;

    public CreateTabLoader(FMLPreInitializationEvent event) {
        CreativeTabs = new CreateTab();
    }

}
