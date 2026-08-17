<p>
  <a href="./LICENSE">
    <img src="https://img.shields.io/badge/license-CC0%201.0-blue.svg" alt="GitHub license">
  </a>
</p>

**strider-example-addon** is a simple addon template for [StriderLoader](https://github.com/nozyx12/striderloader).

## Customization

You can customize this addon to your liking.

To configure your addon, take a look at:

- [`build.gradle`](./build.gradle) — configure the addon version, Minecraft version, StriderLoader version, Java
  version, dependencies, and other build settings.
- [`settings.gradle`](./settings.gradle) — configure the project name and other Gradle project settings.
- [`src/main/resources/strideraddon.json`](./src/main/resources/strideraddon.json) — configure your addon's metadata.

The following values in `strideraddon.json` are automatically filled in by Gradle when the addon is built:

- `${id}` — the addon's ID, automatically retrieved from `rootProject.name` in `settings.gradle`.
- `${version}` — the addon's version.
- `${loader_version_range}` — the StriderLoader version range, automatically retrieved from
  `project.ext.loader_version`,
  making the addon compatible with the selected StriderLoader major version.
- `${mc_version}` — the targeted Minecraft version.
- `${java_version}` — the Java version used to compile the addon.

You don't need to manually update these values in `strideraddon.json`. Simply configure them in `build.gradle` and
`settings.gradle`, and Gradle will replace the placeholders automatically during the build.

## License

**Creative Commons Zero v1.0 Universal (CC0 1.0)** — see the [LICENSE file](./LICENSE).
