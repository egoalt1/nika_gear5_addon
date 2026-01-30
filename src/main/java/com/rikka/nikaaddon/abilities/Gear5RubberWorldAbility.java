package com.rikka.nikaaddon.abilities;

import net.minecraft.world.entity.LivingEntity;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;

public class Gear5RubberWorldAbility extends Ability {
    public Gear5RubberWorldAbility() {
        super("Gear 5: Rubber World", AbilityCategory.DEVIL_FRUIT);
        setCooldown(15);
        needsTransformation("gear_fifth");
    }

    @Override
    public void onUse(LivingEntity player) {
        // Toon physics hook placeholder
    }
}