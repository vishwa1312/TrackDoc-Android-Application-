package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class What_is extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_is);
		/*Bundle bundle = getIntent().getExtras();
		String message = bundle.getString("drug");*/
		Intent startingIntent = getIntent();
		String a = startingIntent.getStringExtra("drug");
		TextView txtdesc = (TextView) findViewById(R.id.textView1);
		txtdesc.setText(a);


}
}
