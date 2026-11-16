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

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.

     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END
     comment blocks entirely. -->

| Patch       | Description                                                   |
|-------------|---------------------------------------------------------------|
| Placeholder | Does nothing. Disabled by default. Used to verify the bundle loads. |

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
