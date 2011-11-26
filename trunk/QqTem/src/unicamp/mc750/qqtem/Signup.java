package unicamp.mc750.qqtem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        
        Button submit = (Button) findViewById(R.id.submit_signup_button);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
            }
        });
        
        Button cancell = (Button) findViewById(R.id.cancell_signup_button);
        cancell.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
            }
        });
    }
}
