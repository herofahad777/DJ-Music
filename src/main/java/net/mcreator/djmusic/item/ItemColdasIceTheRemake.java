
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
public class ItemColdasIceTheRemake extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:coldas_ice_the_remake")
	public static final Item block = null;
	public ItemColdasIceTheRemake(ElementsDjMusicMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:coldas_ice_the_remake", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("coldas_ice_the_remake", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:cold_as_ice_the_remake")));
			setUnlocalizedName("coldas_ice_the_remake");
			setRegistryName("coldas_ice_the_remake");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
