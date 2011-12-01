package unicamp.mc750.qqtem;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Comment extends Dialog implements OnClickListener {

	Button okButton, cancellButton;
	
    public Comment(Context context) {
		super(context);

	    setContentView(R.layout.comment);
	    setTitle("Inserir Comentário");
	    
	    okButton = (Button) findViewById(R.id.ok_comment_button);
	    okButton.setOnClickListener(this);
	    
	    cancellButton = (Button) findViewById(R.id.cancell_comment_button);
	    cancellButton.setOnClickListener(this);

	}
	
	@Override
    public void onClick(View v) {  
	    /*if (v == signupButton) {
	    	Intent i = new Intent(getOwnerActivity().getApplicationContext(), Signup.class);
	    	getOwnerActivity().startActivityForResult(i, ACTIVITY_CREATE);
	    } else {*/
	    	dismiss();
	    //}
	 }
}
