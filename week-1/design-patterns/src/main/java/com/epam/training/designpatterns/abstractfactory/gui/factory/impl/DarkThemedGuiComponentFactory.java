package com.epam.training.designpatterns.abstractfactory.gui.factory.impl;

import com.epam.training.designpatterns.abstractfactory.gui.Button;
import com.epam.training.designpatterns.abstractfactory.gui.Label;
import com.epam.training.designpatterns.abstractfactory.gui.factory.GuiComponentFactory;
import com.epam.training.designpatterns.abstractfactory.gui.impl.DarkThemedButton;
import com.epam.training.designpatterns.abstractfactory.gui.impl.DarkThemedLabel;

public class DarkThemedGuiComponentFactory implements GuiComponentFactory {

    @Override
    public Button createButton(String text) {
        return new DarkThemedButton(text);
    }

    @Override
    public Label createLabel(String text) {
        return new DarkThemedLabel(text);
    }
}
