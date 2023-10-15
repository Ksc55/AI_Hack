package com.example.bot;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.s.R;

public class MainActivity extends AppCompatActivity {

	private final Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}

	private void initialize() {
		findViewById(R.id.linear1);
		findViewById(R.id.linear2);
		findViewById(R.id.linear3);
		findViewById(R.id.linear7);
		findViewById(R.id.linear4);
		findViewById(R.id.linear5);
		findViewById(R.id.linear6);
		findViewById(R.id.imageview1);
		findViewById(R.id.imageview2);
		findViewById(R.id.vscroll1);
		findViewById(R.id.linear8);
		findViewById(R.id.cardview1);
		findViewById(R.id.cardview2);
		findViewById(R.id.cardview3);
		findViewById(R.id.cardview4);
		findViewById(R.id.cardview5);
		findViewById(R.id.cardview6);
		findViewById(R.id.linear9);
		findViewById(R.id.linear10);
		findViewById(R.id.linear11);
		findViewById(R.id.circleimageview1);
		findViewById(R.id.textview1);
		findViewById(R.id.linear12);
		findViewById(R.id.linear13);
		findViewById(R.id.linear14);
		findViewById(R.id.circleimageview2);
		findViewById(R.id.textview2);
		findViewById(R.id.linear15);
		findViewById(R.id.linear18);
		findViewById(R.id.textview5);
		findViewById(R.id.linear25);
		findViewById(R.id.linear26);
		findViewById(R.id.textview6);
	}
	
	private void initializeLogic() {
		intent.setClass(getApplicationContext(), ProductFinderActivityActivity.class);
		startActivity(intent);
		finish();
	}

}
