package app.coopzr.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

// The APKM file type must match the file type published on APKMirror.
// 5.27.5.0 is the Waze version these patches were developed against.
val COMPATIBILITY_WAZE = Compatibility(
    name = "Waze",
    packageName = "com.waze",
    apkFileType = ApkFileType.APKM,
    appIconColor = 0x33CCFF,
    targets = listOf(AppTarget(version = "5.27.5.0"))
)
