package com.magento.idea.magento2plugin;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.editor.EditorFactory;
import org.jetbrains.annotations.NotNull;

public class Magento2ApplicationComponent implements ApplicationComponent {
    private final EditorFactory editorFactory;

    public Magento2ApplicationComponent(@NotNull EditorFactory editorFactory) {
        this.editorFactory = editorFactory;
    }

    @Override
    public void initComponent() {
        System.out.println("initComponent");
    }

    @Override
    public void disposeComponent() {
        System.out.println("disposeComponent");
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "Magento2ApplicationComponent";
    }
}
