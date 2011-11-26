package unicamp.mc750.qqtem;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Dialog implements OnClickListener {

	Button signupButton, okButton, cancellButton;
	private static final int ACTIVITY_CREATE=0;
	
    public Login(Context context) {
		super(context);

	    setContentView(R.layout.login);
	    setTitle("Login");
	    setOwnerActivity((Activity) context);
	    
	    signupButton = (Button) findViewById(R.id.signup_button);
	    signupButton.setOnClickListener(this);
	    
	    okButton = (Button) findViewById(R.id.submit_login_button);
	    okButton.setOnClickListener(this);
	    
	    cancellButton = (Button) findViewById(R.id.cancell_login_button);
	    cancellButton.setOnClickListener(this);

	}
	
	@Override
    public void onClick(View v) {  
	    if (v == signupButton) {
	    	Intent i = new Intent(getOwnerActivity().getApplicationContext(), Signup.class);
	    	getOwnerActivity().startActivityForResult(i, ACTIVITY_CREATE);
	    } else {
	    	dismiss();
	    }
	 }
}
