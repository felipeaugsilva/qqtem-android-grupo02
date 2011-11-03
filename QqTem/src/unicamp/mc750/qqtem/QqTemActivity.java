package unicamp.mc750.qqtem;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class QqTemActivity extends TabActivity {
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Resources res = getResources();  // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  			 // Resusable TabSpec for each tab
        Intent intent; 					 // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Map.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("map").setIndicator(res.getString(R.string.tabname_map),
                          res.getDrawable(R.drawable.ic_tab_map))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, List.class);
        spec = tabHost.newTabSpec("list").setIndicator(res.getString(R.string.tabname_list),
                          res.getDrawable(R.drawable.ic_tab_list))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Search.class);
        spec = tabHost.newTabSpec("search").setIndicator(res.getString(R.string.tabname_search),
                          res.getDrawable(R.drawable.ic_tab_search))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
}