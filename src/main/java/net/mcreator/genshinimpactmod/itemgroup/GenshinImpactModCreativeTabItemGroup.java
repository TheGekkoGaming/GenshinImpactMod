
package net.mcreator.genshinimpactmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.genshinimpactmod.item.BlankVisionItem;
import net.mcreator.genshinimpactmod.GenshinImpactModModElements;

@GenshinImpactModModElements.ModElement.Tag
public class GenshinImpactModCreativeTabItemGroup extends GenshinImpactModModElements.ModElement {
	public GenshinImpactModCreativeTabItemGroup(GenshinImpactModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgenshin_impact_mod_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlankVisionItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
