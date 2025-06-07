package io.github.Ethan1319.noLimitItemstack

import org.bukkit.plugin.java.JavaPlugin

class Nolimit : JavaPlugin() {

    override fun onEnable() {
        class CustomModItem : Item(
            Properties().stacksTo(10000)
        )

    }
}

class Properties {
    fun stacksTo(i: Int) {
    }
}


