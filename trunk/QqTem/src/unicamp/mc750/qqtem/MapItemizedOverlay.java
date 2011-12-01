package unicamp.mc750.qqtem;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

//public class MapItemizedOverlay extends BalloonItemizedOverlay<OverlayItem> {
public class MapItemizedOverlay extends ItemizedOverlay {

	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	Context mContext;
	
	public MapItemizedOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));
	}
	
	public MapItemizedOverlay(Drawable defaultMarker, Context context) {
		super(boundCenter(defaultMarker));
		mContext = context;
	}
	
	/*public MapItemizedOverlay(Drawable defaultMarker, MapView mapView) {
		super(boundCenter(defaultMarker), mapView);
		mContext = mapView.getContext();
	}*/
	
	@Override
	protected boolean onTap(int index) {
	  OverlayItem item = mOverlays.get(index);
	  /*AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
	  dialog.setTitle(item.getTitle());
	  dialog.setMessage(item.getSnippet());
	  dialog.show();*/
	  Intent i = new Intent(mContext, Details.class);
	  mContext.startActivity(i);
	  return true;
	}
	
	/*@Override
	protected boolean onBalloonTap(int index, OverlayItem item) {
		Toast.makeText(mContext, "onBalloonTap for overlay index " + index,
				Toast.LENGTH_LONG).show();
		return true;
	}*/
	
	public void addOverlay(OverlayItem overlay) {
	    mOverlays.add(overlay);
	    populate();
	}

	@Override
	protected OverlayItem createItem(int i) {
		return mOverlays.get(i);
	}

	@Override
	public int size() {
		return mOverlays.size();
	}
}
