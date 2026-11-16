package app.coopzr.patches.waze.placeholder

import app.coopzr.patches.shared.COMPATIBILITY_WAZE
import app.morphe.patcher.patch.patch

@Suppress("unused")
val placeholderPatch = patch(
    name = "Placeholder",
    description = "Does nothing. Verifies the patch bundle loads in Morphe Manager.",
    default = false
) {
    compatibleWith(COMPATIBILITY_WAZE)

    execute { }
}
