package com.nischay.sondersync;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by devfloater12-xl on 2013-10-22.
 */
public class startFragment extends Fragment implements View.OnClickListener {

	private ViewPager mVP;
	private ListView lv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_start, container, false);
		viewPagerItemFragment vpif = new viewPagerItemFragment();

		Button locationButton = (Button) view
				.findViewById(R.id.location_button);
		locationButton.setOnClickListener(this);

		mVP = (ViewPager) view.findViewById(R.id.view_pager);
		MenuPagerAdapter mpa = new MenuPagerAdapter(getActivity());
		mVP.setAdapter(mpa);
		
		lv = (ListView) view.findViewById(R.id.listview);
		
		
		

		return view;
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(getActivity(), "Location Button Clicked",
				Toast.LENGTH_SHORT).show();
	}

}
