/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.visual

import net.ccbluex.liquidbounce.features.module.Category
import net.ccbluex.liquidbounce.features.module.Module

object CustomModel : Module("CustomModel", Category.VISUAL) {
    val mode by choices("Mode", arrayOf("Imposter", "Rabbit", "Freddy", "Female", "None"), "Imposter")

    val rotatePlayer by  boolean("RotatePlayer", false)

    override val tag: String
        get() = mode
}