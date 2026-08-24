package com.example;

import dev.nozyx.strider.loader.api.Addon;
import dev.nozyx.strider.loader.api.IStriderLoader;
import org.apache.logging.log4j.Logger;

// Main class of your addon.
public class ExampleAddon implements Addon {

    private Logger logger;

    @Override
    public void onInitialize(IStriderLoader loader) {
        // Called once StriderLoader has successfully loaded the addon before the game starts.
        // ( Perfect to prepare transformations with TransformationUtils or using ClassTransformers )

        logger = loader.getLogger(
                // Change this to be the same as your addon ID.
                "strider-example-addon"
        );

        logger.info("Hello from addon!");
    }

    @Override
    public void onReady(IStriderLoader loader) {
        // Called once Minecraft reached a state where registries can be used.
        // ( Perfect to register blocks, items, or more... )
        logger.info("Registries ready!");
    }
}
