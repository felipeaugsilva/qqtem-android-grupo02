package unicamp.mc750.qqtem;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details extends Activity {
	
	Context mContext;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    
        mContext = this;
        
	    Button commentButton = (Button) findViewById(R.id.comment_button);
	    commentButton.setOnClickListener(new View.OnClickListener() {
	
	        public void onClick(View view) {
	        	Comment comment = new Comment(mContext);
	        	comment.show();
	        }
	
	    });
	    
	    Button reportPlaceButton = (Button) findViewById(R.id.report_place_button);
	    reportPlaceButton.setOnClickListener(new View.OnClickListener() {
	
	        public void onClick(View view) {
	        	ReportAbuse report = new ReportAbuse(mContext);
	        	report.show();
	        }
	
	    });
    }
}
