package com.rikka.nikaaddon;

import com.rikka.nikaaddon.init.ModAbilities;
import net.minecraftforge.fml.common.Mod;

@Mod("nikaaddon")
public class NikaAddon {
    public NikaAddon() {
        ModAbilities.init();
    }
}