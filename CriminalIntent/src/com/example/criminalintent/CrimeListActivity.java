package com.example.criminalintent;

import android.support.v4.app.Fragment;

public abstract class CrimeListActivity extends SingleFragmentActivity1 {

	@Override
	protected Fragment createFragment() {
		return new CrimeListFragment();
	}

}
