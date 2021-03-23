package app;

import buttons.Button;
import checkBoxes.CheckBox;
import factories.GuiFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;


public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application (GuiFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void print (){
        button.print();
        checkBox.print();
    }
}

class Configuration {
    private static Application configureApp (){
        Application application = null;
        GuiFactory factory;

        String osNameName = System.getProperty("os.name").toLowerCase();
        if (osNameName.contains("mac")){
            factory = new MacOSFactory();
            application = new Application(factory);

        } else if (osNameName.contains("windows")){
            factory = new WindowsFactory();
            application = new Application(factory);
        } else { System.out.println("Error, OS System not allowed."); }
        return application;
    }


public static void main(String[] args) {
    Application application = configureApp();
    application.print();
}}