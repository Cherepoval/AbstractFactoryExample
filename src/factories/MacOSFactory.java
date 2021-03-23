package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkBoxes.CheckBox;
import checkBoxes.MacOSCheckBox;

public class MacOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
