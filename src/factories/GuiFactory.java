package factories;

import buttons.Button;
import checkBoxes.CheckBox;

public interface GuiFactory {
    Button createButton ();
    CheckBox createCheckBox ();
}



