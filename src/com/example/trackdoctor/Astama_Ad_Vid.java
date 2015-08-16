package com.example.trackdoctor;



import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Astama_Ad_Vid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.astama_adult_vid);
	       VideoView vd = (VideoView) findViewById(R.id.videoView1);

	       Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.astama_adult);

	        MediaController mc = new MediaController(this);
	        vd.setMediaController(mc);

	        vd.setVideoURI(uri);
	        vd.start();		

		
	}

}
