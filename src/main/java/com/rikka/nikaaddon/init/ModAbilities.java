package com.rikka.nikaaddon.init;

import com.rikka.nikaaddon.abilities.*;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;

public class ModAbilities {
    public static Ability GEAR5_GIGANT_PUNCH;
    public static Ability GEAR5_RUBBER_WORLD;
    public static Ability GEAR5_LIGHTNING_GRAB;

    public static void init() {
        GEAR5_GIGANT_PUNCH = new Gear5GigantPunchAbility();
        GEAR5_RUBBER_WORLD = new Gear5RubberWorldAbility();
        GEAR5_LIGHTNING_GRAB = new Gear5LightningGrabAbility();
    }
}