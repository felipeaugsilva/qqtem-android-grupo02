package unicamp.mc750.qqtem;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ReportAbuse extends Dialog implements OnClickListener {

	Button okButton, cancellButton;
	Context mContext;
	ReportAbuse report = this;
	AlertDialog.Builder builder;
	
    public ReportAbuse(Context context) {
		super(context);

	    setContentView(R.layout.report);
	    setTitle("Reportar Abuso");
	    
	    mContext = context;
	    
	    okButton = (Button) findViewById(R.id.ok_report_button);
	    okButton.setOnClickListener(this);
	    
	    cancellButton = (Button) findViewById(R.id.cancell_report_button);
	    cancellButton.setOnClickListener(this);
	    
	    builder = new AlertDialog.Builder(mContext);
    	builder.setMessage("Sua denúncia foi enviada e será avaliada. Obrigado!")
    	       .setCancelable(false)
    	       .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
    	           public void onClick(DialogInterface dialog, int id) {
    	        	   report.dismiss();
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
