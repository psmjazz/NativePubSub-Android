package com.minisdk.pubsub.module;

public class AndroidModuleLoader {
    public static void load(String className){
        ModuleLoader.getInstance().load(className);
    }
}
