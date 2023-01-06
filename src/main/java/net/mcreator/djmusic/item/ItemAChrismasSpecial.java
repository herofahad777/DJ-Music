
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
public class ItemAChrismasSpecial extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:a_chrismas_special")
	public static final Item block = null;
	public ItemAChrismasSpecial(ElementsDjMusicMod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:a_chrismas_special", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("a_chrismas_special", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:a_christmas_special")));
			setUnlocalizedName("a_chrismas_special");
			setRegistryName("a_chrismas_special");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
