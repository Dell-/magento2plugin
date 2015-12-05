package com.magento.idea.magento2plugin;

import com.intellij.openapi.project.Project;
import java.util.Collection;

public class SettingsLoaderParameter {
    private Collection<ContainerFile> containerFiles;
    private Project project;

    public SettingsLoaderParameter(Project project, Collection<ContainerFile> containerFiles) {
        this.containerFiles = containerFiles;
        this.project = project;
    }

    public void addContainerFile(ContainerFile containerFile) {
        this.containerFiles.add(containerFile);
    }

    public void addContainerFiles(Collection<ContainerFile> containerFiles) {
        this.containerFiles.addAll(containerFiles);
    }

    public Project getProject() {

        return project;
    }
}
