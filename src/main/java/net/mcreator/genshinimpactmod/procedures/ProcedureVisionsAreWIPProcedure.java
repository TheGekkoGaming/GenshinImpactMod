package net.mcreator.genshinimpactmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.genshinimpactmod.GenshinImpactModModElements;
import net.mcreator.genshinimpactmod.GenshinImpactModMod;

import java.util.Map;
import java.util.HashMap;

@GenshinImpactModModElements.ModElement.Tag
public class ProcedureVisionsAreWIPProcedure extends GenshinImpactModModElements.ModElement {
	public ProcedureVisionsAreWIPProcedure(GenshinImpactModModElements instance) {
		super(instance, 22);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		GenshinImpactModMod.LOGGER.info("Visions are not yet Implemented as intended. Please have patience. We are working on it!");
	}

	@SubscribeEvent
	public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		PlayerEntity entity = event.getPlayer();
		if (event.getHand() != entity.getActiveHand()) {
			return;
		}
		double i = event.getPos().getX();
		double j = event.getPos().getY();
		double k = event.getPos().getZ();
		IWorld world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
