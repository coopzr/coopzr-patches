# coopzr patches

Patches for use with [Morphe](https://morphe.software), the Android app patcher. Currently targets Waze.

## ❓ About

coopzr patches is a patch bundle that you load into Morphe Manager. It is early stage: the bundle only contains a
no-op placeholder patch used to verify that the bundle loads. Real patches will be added later.

This project is independent and is not affiliated with or authored by the Morphe project.

### How to use these patches

Click the button below, or manually add this repo url to Morphe Manager: https://github.com/coopzr/coopzr-patches

<a href="https://morphe.software/add-source?github=coopzr/coopzr-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

Then in Morphe Manager:

1. Select Waze from the app list and choose the Waze APKM file (see [Supported apps](#-supported-apps)).
2. Select the patches you want. The bundle currently only has the Placeholder patch, which is disabled by default.
3. Patch the app and install the result.

The `main` branch produces stable releases. The `dev` branch produces pre-releases, which you can use by enabling
`pre-release` in the Morphe Manager patch sources.

## 📦 Supported apps

| App  | Package name | Developed against | Format                   |
|------|--------------|-------------------|--------------------------|
| Waze | `com.waze`   | 5.27.5.0          | APKM bundle (APKMirror)  |

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.1](https://github.com/coopzr/coopzr-patches/releases/tag/v1.0.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 Waze&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `com.waze`

**🎯 Supported versions:**

| 5.27.5.0 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Placeholder](#placeholder) | Does nothing. Verifies the patch bundle loads in Morphe Manager. |  |

</details>

<!-- PATCHES_END -->

### 🛠️ Building locally

Requires a GitHub token with `read:packages` access, exposed as the `GITHUB_ACTOR` and `GITHUB_TOKEN`
environment variables (used to fetch Morphe dependencies from GitHub Packages).

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Copy the .mpp file to your phone (e.g. `adb push`) and load it in Morphe Manager as a local patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

coopzr patches are licensed under the [GNU General Public License v3.0](LICENSE). See the [NOTICE](NOTICE) for
details on the use of the Morphe name.
