package unicamp.mc750.qqtem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class List extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Lista...");
        setContentView(textview);
    }
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, R.integer.MENU_ADD_ID, 0, R.string.menu_add);
        menu.add(0, R.integer.MENU_LOGIN_ID, 0, R.string.menu_login);
        return true;
    }
}
