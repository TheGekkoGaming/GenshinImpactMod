
package net.mcreator.genshinimpactmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.FluidState;
import net.minecraft.block.material.PushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.genshinimpactmod.itemgroup.GenshinImpactModCreativeTabItemGroup;
import net.mcreator.genshinimpactmod.GenshinImpactModModElements;

import java.util.List;
import java.util.Collections;

@GenshinImpactModModElements.ModElement.Tag
public class CedarWoodLeavesBlock extends GenshinImpactModModElements.ModElement {
	@ObjectHolder("genshin_impact_mod:cedar_wood_leaves")
	public static final Block block = null;
	public CedarWoodLeavesBlock(GenshinImpactModModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(GenshinImpactModCreativeTabItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.6f, 4f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.HOE).setRequiresTool().notSolid());
			setRegistryName("cedar_wood_leaves");
		}

		@Override
		public boolean shouldDisplayFluidOverlay(BlockState state, IBlockDisplayReader world, BlockPos pos, FluidState fluidstate) {
			return true;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 20;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 10;
		}

		@Override
		public PushReaction getPushReaction(BlockState state) {
			return PushReaction.PUSH_ONLY;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CedarWoodLeavesBlock.block, (int) (1)));
		}
	}
}
