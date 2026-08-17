package com.example;

import dev.nozyx.strider.loader.api.Addon;
import dev.nozyx.strider.loader.api.IStriderLoader;

// Main class of your addon.
public class ExampleAddon implements Addon {

    @Override
    public void onInitialize(IStriderLoader loader) {
        // Called once StriderLoader has successfully loaded the addon before the game starts.
        // ( Perfect to prepare transformations with TransformationUtils or using ClassTransformers )
        System.out.println("Hello from addon!");
    }

    @Override
    public void onReady(IStriderLoader loader) {
        // Called once Minecraft reached a state where registries can be used.
        // ( Perfect to register blocks, items, or more... )
        System.out.println("Registries ready!");
    }
}
