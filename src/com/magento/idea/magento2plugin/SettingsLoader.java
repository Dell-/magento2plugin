package com.magento.idea.magento2plugin;

import java.util.List;

public class SettingsLoader {
    public void attachContainerFile(SettingsLoaderParameter parameter) {

        List<ContainerFile> settingsContainerFiles = Settings.getInstance(parameter.getProject()).containerFiles;
        if(settingsContainerFiles == null) {
            return;
        }

        parameter.addContainerFiles(settingsContainerFiles);
    }
}
