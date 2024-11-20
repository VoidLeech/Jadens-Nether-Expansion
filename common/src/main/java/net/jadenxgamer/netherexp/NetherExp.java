package net.jadenxgamer.netherexp;

import dev.architectury.platform.Platform;
import net.jadenxgamer.netherexp.compat.CompatUtil;
import net.jadenxgamer.netherexp.registry.advancements.JNECriteriaTriggers;
import net.jadenxgamer.netherexp.registry.block.JNEBlockEntityType;
import net.jadenxgamer.netherexp.registry.block.JNEBlocks;
import net.jadenxgamer.netherexp.registry.effect.JNEMobEffects;
import net.jadenxgamer.netherexp.registry.enchantment.JNEEnchantments;
import net.jadenxgamer.netherexp.registry.entity.JNEEntityType;
import net.jadenxgamer.netherexp.registry.fluid.JNEFluids;
import net.jadenxgamer.netherexp.registry.item.JNECreativeModeTabs;
import net.jadenxgamer.netherexp.registry.item.JNEItems;
import net.jadenxgamer.netherexp.registry.item.brewing.JNEPotions;
import net.jadenxgamer.netherexp.registry.misc_registry.JNEPaintings;
import net.jadenxgamer.netherexp.registry.misc_registry.JNESoundEvents;
import net.jadenxgamer.netherexp.registry.particle.JNEParticleTypes;
import net.jadenxgamer.netherexp.registry.worldgen.feature.JNEFeature;
import net.jadenxgamer.netherexp.registry.worldgen.structure.JNEStructureType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherExp {
    public static final String MOD_ID = "netherexp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        JNECriteriaTriggers.init();
        JNECreativeModeTabs.init();
        JNESoundEvents.init();
        JNEParticleTypes.init();
        JNEEnchantments.init();
        JNEMobEffects.init();

        JNEEntityType.init();
        JNEStructureType.init();
        JNEFluids.init();
        JNEPaintings.init();
        JNEBlocks.init();
        JNEFeature.init();
        JNEBlockEntityType.init();
        JNEItems.init();
        JNEPotions.init();
    }
}
