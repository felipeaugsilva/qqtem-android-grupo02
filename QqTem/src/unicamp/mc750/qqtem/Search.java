package unicamp.mc750.qqtem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Search extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Busca...");
        setContentView(textview);
    }
}