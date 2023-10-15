package com.example.bot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.s.R;

import java.util.Timer;
import java.util.TimerTask;

@SuppressLint("CustomSplashScreen")
public class SplashscreenActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	private Intent intent = new Intent();
	private TimerTask timer;
	public SplashscreenActivity() {
	}

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splashscreen);
		initialize();
		initializeLogic();
	}

	private void initialize() {
		findViewById(R.id.linear1);
		findViewById(R.id.imageview1);
	}

	private void initializeLogic() {



		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						intent.setClass(getApplicationContext(), LoginActivity.class);
						startActivity(intent);
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
						finish();
					}
				});
			}
		};
		_timer.schedule(timer, (int)(3000));
	}

}











