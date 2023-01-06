
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
public class ItemJuliusDreisigandZeusXCronaInvisible extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:julius_dreisigand_zeus_x_crona_invisible")
	public static final Item block = null;
	public ItemJuliusDreisigandZeusXCronaInvisible(ElementsDjMusicMod instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("dj_music:julius_dreisigand_zeus_x_crona_invisible", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("julius_dreisigand_zeus_x_crona_invisible",
					ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:julius_dreisig_and_zeus_x_crona_invisible")));
			setUnlocalizedName("julius_dreisigand_zeus_x_crona_invisible");
			setRegistryName("julius_dreisigand_zeus_x_crona_invisible");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
