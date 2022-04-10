package com.github.alexthe668.domesticationinnovation.server.block;

import com.github.alexthe668.domesticationinnovation.DomesticationMod;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = DomesticationMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DIBlockRegistry {

    public static final DeferredRegister<Block> DEF_REG = DeferredRegister.create(ForgeRegistries.BLOCKS, DomesticationMod.MODID);

    public static final RegistryObject<Block> WHITE_PET_BED = DEF_REG.register("pet_bed_white", () -> new PetBedBlock("white", DyeColor.WHITE));

    public static final RegistryObject<Block> ORANGE_PET_BED = DEF_REG.register("pet_bed_orange", () -> new PetBedBlock("orange", DyeColor.ORANGE));
    public static final RegistryObject<Block> MAGENTA_PET_BED = DEF_REG.register("pet_bed_magenta", () -> new PetBedBlock("magenta", DyeColor.MAGENTA));
    public static final RegistryObject<Block> LIGHT_BLUE_PET_BED = DEF_REG.register("pet_bed_light_blue", () -> new PetBedBlock("light_blue", DyeColor.LIGHT_BLUE));
    public static final RegistryObject<Block> YELLOW_PET_BED = DEF_REG.register("pet_bed_yellow", () -> new PetBedBlock("yellow", DyeColor.YELLOW));
    public static final RegistryObject<Block> LIME_PET_BED = DEF_REG.register("pet_bed_lime", () -> new PetBedBlock("lime", DyeColor.LIME));
    public static final RegistryObject<Block> PINK_PET_BED = DEF_REG.register("pet_bed_pink", () -> new PetBedBlock("pink", DyeColor.PINK));
    public static final RegistryObject<Block> GRAY_PET_BED = DEF_REG.register("pet_bed_gray", () -> new PetBedBlock("gray", DyeColor.GRAY));
    public static final RegistryObject<Block> LIGHT_GRAY_PET_BED = DEF_REG.register("pet_bed_light_gray", () -> new PetBedBlock("light_gray", DyeColor.LIGHT_GRAY));
    public static final RegistryObject<Block> CYAN_PET_BED = DEF_REG.register("pet_bed_cyan", () -> new PetBedBlock("cyan", DyeColor.CYAN));
    public static final RegistryObject<Block> PURPLE_PET_BED = DEF_REG.register("pet_bed_purple", () -> new PetBedBlock("purple", DyeColor.PURPLE));
    public static final RegistryObject<Block> BLUE_PET_BED = DEF_REG.register("pet_bed_blue", () -> new PetBedBlock("blue", DyeColor.BLUE));
    public static final RegistryObject<Block> BROWN_PET_BED = DEF_REG.register("pet_bed_brown", () -> new PetBedBlock("brown", DyeColor.BROWN));
    public static final RegistryObject<Block> GREEN_PET_BED = DEF_REG.register("pet_bed_green", () -> new PetBedBlock("green", DyeColor.GREEN));
    public static final RegistryObject<Block> RED_PET_BED = DEF_REG.register("pet_bed_red", () -> new PetBedBlock("red", DyeColor.RED));
    public static final RegistryObject<Block> BLACK_PET_BED = DEF_REG.register("pet_bed_black", () -> new PetBedBlock("black", DyeColor.BLACK));

    public static final RegistryObject<Block> DRUM = DEF_REG.register("drum", () -> new DrumBlock());

}
