package sifire.throughtheages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabCore extends CreativeTabs{

	public CreativeTabCore(int index, String label) {
		super(index, label);
		
	}
	
	@Override
	public Item getTabIconItem() {
		return Items.RECORD_11;
	}

	
}
