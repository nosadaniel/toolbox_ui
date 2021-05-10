package geiger_toolbox_ui;
import totalcross.ui.MainWindow;
import totalcross.ui.Container;
import totalcross.ui.Label;

import com.totalcross.knowcode.parse.XmlContainerFactory;

import totalcross.sys.Settings;

public class toolbox_ui extends MainWindow {
    
    public toolbox_ui() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        
        Container cont = XmlContainerFactory.create("res/layout/activity_main.xml");
        MainWindow.getMainWindow().swap(cont);
        
    }
}
