package com.nischay.sondersync;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

/**
 * Created by devfloater12-xl on 2013-11-11.
 */
public class MenuPagerAdapter extends PagerAdapter {

	private Activity activity;

	public MenuPagerAdapter(Activity activity) {
		// TODO Auto-generated constructor stub
		this.activity = activity;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object instantiateItem(View container, int position) {

		// viewPagerItemFragment fragment = new viewPagerItemFragment();
		TextView view = new TextView(activity);
		view.setText("Pls");
		((ViewPager) container).addView(view, 0);
		// return super.instantiateItem(container, position);
		return view;
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		// TODO Auto-generated method stub
		((ViewPager) container).removeView((TextView) object);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub

		return view == ((TextView) object);
	}

}
