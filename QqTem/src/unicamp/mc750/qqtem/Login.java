package unicamp.mc750.qqtem;

import android.app.Activity;
import android.os.Bundle;

public abstract class Login extends Activity {

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
