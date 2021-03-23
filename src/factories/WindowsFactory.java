package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkBoxes.CheckBox;
import checkBoxes.WindowsCheckBox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

