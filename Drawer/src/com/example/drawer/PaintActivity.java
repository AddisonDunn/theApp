package com.example.drawer;

import android.app.Activity;
import android.os.Bundle;

public class PaintActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		BrushView view= new BrushView(this);
		setContentView(view);
		addContentView(view.btnEraseAll, view.params);
	}
	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}
}
