package unicamp.mc750.qqtem;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Comment extends Dialog implements OnClickListener {

	Button okButton, cancellButton;
	Context mContext;
	Comment comment = this;
	AlertDialog.Builder builder;
	
    public Comment(Context context) {
		super(context);

	    setContentView(R.layout.comment);
	    setTitle("Inserir Comentário");
	    
	    mContext = context;
	    
	    okButton = (Button) findViewById(R.id.ok_comment_button);
	    okButton.setOnClickListener(this);
	    
	    cancellButton = (Button) findViewById(R.id.cancell_comment_button);
	    cancellButton.setOnClickListener(this);

	    builder = new AlertDialog.Builder(mContext);
    	builder.setMessage("Seu comentário foi enviado!")
    	       .setCancelable(false)
    	       .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
    	           public void onClick(DialogInterface dialog, int id) {
    	        	   comment.dismiss();
    	           }
    	       });
	}
	
	@Override
    public void onClick(View v) {
		
	    if (v == okButton) {
	    	builder.create().show();
	    } else {
	    	dismiss();
	    }
	 }
}
