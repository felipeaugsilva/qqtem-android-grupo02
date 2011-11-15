package unicamp.mc750.qqtem;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends Activity {

	private static boolean mLogged = false;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
	public static boolean isLogged() {
		return mLogged;
	}
	
	public static void logout() {
		mLogged = false;
	}
}
