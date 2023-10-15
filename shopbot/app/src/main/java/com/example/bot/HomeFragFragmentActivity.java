package com.example.bot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class HomeFragFragmentActivity extends Fragment {
	
	private final ArrayList<HashMap<String, Object>> listMap = new ArrayList<>();

	private ListView listview1;

	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.home_frag_fragment, _container, false);
		initialize(_view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(View _view) {
		listview1 = _view.findViewById(R.id.listview1);
	}
	
	private void initializeLogic() {
		_addListViewData();
	}
	
	public void _addListViewData() {
		{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("product_name", "Perfume");
			_item.put("product_count", "3");
				listMap.add(_item);
		}
		
		{
				HashMap<String, Object> _item2 = new HashMap<>();
				_item2.put("product_name", "Chips");
			_item2.put("product_count", "3");
				listMap.add(_item2);
		}
		
		{
				HashMap<String, Object> _item3 = new HashMap<>();
				_item3.put("product_name", "Cookies");
			_item3.put("product_count", "3");
				listMap.add(_item3);
		}
		
		{
				HashMap<String, Object> _item4 = new HashMap<>();
				_item4.put("product_name", "Sauce");
			_item4.put("product_count", "3");
				listMap.add(_item4);
		}
		
		{
				HashMap<String, Object> _item5 = new HashMap<>();
				_item5.put("product_name", "Toothpaste");
			_item5.put("product_count", "3");
				listMap.add(_item5);
		}
		
		{
				HashMap<String, Object> _item6 = new HashMap<>();
				_item6.put("product_name", "Soap");
			_item6.put("product_count", "3");
				listMap.add(_item6);
		}

		listview1.setAdapter(new Listview1Adapter(listMap));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@SuppressLint("InflateParams")
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = requireActivity().getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.cust_product_finder, null);
			}

			_view.findViewById(R.id.cardview1);
			final ImageView product_icon = _view.findViewById(R.id.product_icon);
			final TextView product_name = _view.findViewById(R.id.product_name);
			final TextView product_count = _view.findViewById(R.id.product_count);
			
			product_name.setText(Objects.requireNonNull(_data.get(_position).get("product_name")).toString());
			product_count.setText(Objects.requireNonNull(_data.get(_position).get("product_count")).toString());
			if (_position == 0) {
				product_icon.setImageResource(R.drawable.perfume);
			}
			if (_position == 1) {
				product_icon.setImageResource(R.drawable.chips);
			}
			if (_position == 2) {
				product_icon.setImageResource(R.drawable.cookie);
			}
			if (_position == 3) {
				product_icon.setImageResource(R.drawable.sauces);
			}
			if (_position == 4) {
				product_icon.setImageResource(R.drawable.toothpaste);
			}
			if (_position == 5) {
				product_icon.setImageResource(R.drawable.soap);
			}
			
			return _view;
		}
	}
}
