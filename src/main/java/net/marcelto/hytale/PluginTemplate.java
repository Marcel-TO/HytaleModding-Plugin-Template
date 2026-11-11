package net.marcelto.hytale;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;

public class PluginTemplate extends JavaPlugin {

  public static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

  public PluginTemplate(@Nonnull JavaPluginInit init) {
    super(init);
    LOGGER.atInfo().log("Initializing Plugin Template...");
  }

  @Override
  protected void setup() {
    LOGGER.atInfo().log("Setting up Plugin Template...");
  }

  @Override
  protected void shutdown() {
    LOGGER.atInfo().log("Shutting down Plugin Template...");
  }
}
