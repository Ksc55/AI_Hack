package com.example.bot;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.signin);
		initialize();
		initializeLogic();
	}

	private void initialize() {
		findViewById(R.id.vscroll1);
		findViewById(R.id.linear1);
		findViewById(R.id.textview1);
		findViewById(R.id.edittext1);
		findViewById(R.id.edittext2);
		findViewById(R.id.edittext3);
		findViewById(R.id.imageview2);
	}
	
	private void initializeLogic() {
	}
	
}
