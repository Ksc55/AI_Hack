package com.example.bot;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.s.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/** @noinspection ALL*/
public class ProductFinderActivityActivity extends AppCompatActivity {

	private BottomNavigationView bottomnavigation11;

	private final Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.product_finder_activity);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		FloatingActionButton _fab = findViewById(R.id._fab);

		findViewById(R.id.linear1);
		findViewById(R.id.linear11);
		bottomnavigation11 = findViewById(R.id.bottomnavigation1);
		findViewById(R.id.linear4);

		bottomnavigation11.setOnNavigationItemSelectedListener(item -> {
			Fragment selectedFragment = null;
			if (item.getItemId() == R.id.navigation_item_1) {
				selectedFragment = new NotifyFragFragmentActivity();
			} else if (item.getItemId() == R.id.navigation_item_2) {
				selectedFragment = new HomeFragFragmentActivity();
			} else if (item.getItemId() == R.id.navigation_item_3) {
				selectedFragment = new InternetFragFragmentActivity();
			}
			// Handle other navigation items here

			if (selectedFragment != null) {
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.linear11, selectedFragment)
						.commit();
			}
			return true;
		});
		
		_fab.setOnClickListener(_view -> {
			intent.setClass(getApplicationContext(), YourCartActivity.class);
			startActivity(intent);
		});
	}


	private void initializeLogic() {
		bottomnavigation11.setSelectedItemId(R.id.navigation_item_2);
		_showInitiaFragment();
	}
	
	public void _showInitiaFragment() {
		Fragment initialFragment = new HomeFragFragmentActivity(); // Replace with your desired initial fragment
		getSupportFragmentManager().beginTransaction()
		    .replace(R.id.linear11, initialFragment)
		    .commit();
	}
	
}
