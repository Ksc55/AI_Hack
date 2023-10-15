package com.example.bot;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class YourCartActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.your_cart);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		findViewById(R.id.linear4);
	}
	
	private void initializeLogic() {
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}
}
