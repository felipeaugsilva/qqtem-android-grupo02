package unicamp.mc750.qqtem;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class List extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		this, R.array.filters_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        Button locationButton = (Button) findViewById(R.id.find_location);
    }
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, R.integer.MENU_ADD_ID, 0, R.string.menu_add);
        menu.add(0, R.integer.MENU_LOGIN_ID, 0, R.string.menu_login);
        return true;
    }
	
	@Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
            case R.integer.MENU_LOGIN_ID:
            	showDialog(R.integer.DIALOG_LOGIN_ID);
            	return true;
            case R.integer.MENU_ADD_ID:
            	showDialog(R.integer.DIALOG_ADD_ID);
            	return true;
        }

        return super.onMenuItemSelected(featureId, item);
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
        
        case R.integer.DIALOG_LOGIN_ID:
        	Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.login);
            dialog.setTitle("Login");
            return dialog;
            
        case R.integer.DIALOG_ADD_ID:
        	return null;
        
        default:
        	return null;
        }
    }
}
