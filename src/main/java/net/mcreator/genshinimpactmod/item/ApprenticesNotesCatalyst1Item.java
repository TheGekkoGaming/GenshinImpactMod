
package net.mcreator.genshinimpactmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.genshinimpactmod.itemgroup.GenshinImpactModCreativeTabItemGroup;
import net.mcreator.genshinimpactmod.GenshinImpactModModElements;

import java.util.List;

@GenshinImpactModModElements.ModElement.Tag
public class ApprenticesNotesCatalyst1Item extends GenshinImpactModModElements.ModElement {
	@ObjectHolder("genshin_impact_mod:apprentices_notes_catalyst_1")
	public static final Item block = null;
	public ApprenticesNotesCatalyst1Item(GenshinImpactModModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GenshinImpactModCreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("apprentices_notes_catalyst_1");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Notes left behind by a top student."));
			list.add(new StringTextComponent("Many useful spells are listed, and the"));
			list.add(new StringTextComponent("handwriting is beautiful"));
		}
	}
}
