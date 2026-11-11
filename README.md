# HytaleModding-Plugin-Template
This repository represents a template for a Hytale plugin

## 📋 Requirements

- **Hytale** (Server Version: Any - specified as `*` in manifest)
- **Java** 17 or higher
- **Gradle** 8.x or higher

## 🔧 Development Setup

### Prerequisites
1. Install Java Development Kit (JDK) 17+
2. Set up your local Hytale installation path in `gradle.properties`:
   ```properties
   hytale.home_path=<YOUR_HYTALE_PATH> # Example: C:/Games/Hytale
   ```
3. Add the other environment variables to `gradle.properties` to enable/disable compilation of sources and docs:
   ```properties
   env.java.compileSources=false
   env.java.compileDocs=false
   ```
4. Create a `.env` file in the project root and follow the template `.env.example` to set the path to your Hytale mods folder:
   ```env
   HYTALE_MODS_PATH=<YOUR_HYTALE_MODS_PATH> # Example: C:/Games/Hytale/mods
   ```

### Building the Mod

Clone the repository and build using Gradle:

```bash
# Clone the repository
git clone <repository-url>
cd <repository-directory>

# Build Manifest
./gradlew updatePluginManifest

# Build the project
./gradlew build

# Run the development server
./gradlew runServer -Dhotswap=true
```