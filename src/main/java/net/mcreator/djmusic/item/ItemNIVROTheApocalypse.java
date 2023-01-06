
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
public class ItemNIVROTheApocalypse extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:nivro_the_apocalypse")
	public static final Item block = null;
	public ItemNIVROTheApocalypse(ElementsDjMusicMod instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:nivro_the_apocalypse", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("nivro_the_apocalypse", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:nivro_the_apocalypse")));
			setUnlocalizedName("nivro_the_apocalypse");
			setRegistryName("nivro_the_apocalypse");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
