package com.lixu.baozha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends Activity implements OnClickListener {
	private ImageView iv;
	private ImageView iv1;
	private ImageView iv2;
	private ImageView iv3;
	private ExplosionField mExplosionField;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mExplosionField = ExplosionField.attach2Window(this);

		iv = (ImageView) findViewById(R.id.aixin);
		iv1 = (ImageView) findViewById(R.id.aixin1);
		iv2 = (ImageView) findViewById(R.id.aixin2);
		iv3 = (ImageView) findViewById(R.id.aixin3);

		iv.setOnClickListener(this);
		iv1.setOnClickListener(this);
		iv2.setOnClickListener(this);
		iv3.setOnClickListener(this);

		Button btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.aixin:
			mExplosionField.explode(v);

			Toast.makeText(getApplicationContext(), "心碎了！！", 0).show();

			break;
		case R.id.aixin1:
			mExplosionField.explode(v);

			Toast.makeText(getApplicationContext(), "心碎了！！", 0).show();

			break;
		case R.id.aixin2:
			mExplosionField.explode(v);

			Toast.makeText(getApplicationContext(), "心碎了！！", 0).show();

			break;
		case R.id.aixin3:
			mExplosionField.explode(v);

			Toast.makeText(getApplicationContext(), "心碎了！！", 0).show();

			break;

		case R.id.btn:

			mExplosionField.explode(iv);
			mExplosionField.explode(iv1);
			mExplosionField.explode(iv2);
			mExplosionField.explode(iv3);

			Toast.makeText(getApplicationContext(), "天女散花！", 0).show();

			break;

		default:
			break;
		}

	}
}
