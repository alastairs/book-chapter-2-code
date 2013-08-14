package org.mikadomethod.app;

import org.mikadomethod.app.db.FileDB;
import org.mikadomethod.app.ui.App;
import org.mikadomethod.app.ui.ApplicationException;

public class Launcher {

	public static void main(String[] argv) {
			try {
				App.setStorageFile(argv[0]);
				App app = new App();
				app.launch(new FileDB(App.getStorageFile()));
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
