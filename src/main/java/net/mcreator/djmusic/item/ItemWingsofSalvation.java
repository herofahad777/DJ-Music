
package net.mcreator.djmusic.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.djmusic.creativetab.TabMusicdisc;
import net.mcreator.djmusic.ElementsDjMusicMod;

@ElementsDjMusicMod.ModElement.Tag
public class ItemWingsofSalvation extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:wingsof_salvation")
	public static final Item block = null;
	public ItemWingsofSalvation(ElementsDjMusicMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:wingsof_salvation", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("wingsof_salvation", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:wings_of_salvation")));
			setUnlocalizedName("wingsof_salvation");
			setRegistryName("wingsof_salvation");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
