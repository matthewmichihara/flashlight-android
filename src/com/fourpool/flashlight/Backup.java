

/*package com.fourpool.flashlight;

import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class FlashlightActivity extends Activity implements Callback {
	private static final String TAG = FlashlightActivity.class.getSimpleName();

	private Camera mCamera;
	private CompoundButton mLightSwitch;
	private SurfaceView mSurfaceView;
	private SurfaceHolder mSurfaceHolder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mCamera = Camera.open();
		mLightSwitch = (ToggleButton) findViewById(R.id.light_switch);

		if (mCamera == null) {
			Log.d(TAG, "mCamera is null.");
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setMessage(R.string.not_supported);
			builder.setPositiveButton(R.string.exit,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							finish();
						}
					});
			builder.show();
			return;
		}

		mSurfaceView = (SurfaceView) findViewById(R.id.surface_view);
		mSurfaceHolder = mSurfaceView.getHolder();
		mSurfaceHolder.addCallback(this);

		Parameters parameters = mCamera.getParameters();
		parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
		mCamera.setParameters(parameters);

		mLightSwitch
				.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {

						if (isChecked) {
							mCamera.startPreview();
						} else {
							mCamera.stopPreview();
						}
					}
				});

		mLightSwitch.setChecked(true);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		if (mCamera != null) {
			mCamera.release();
		}
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
	}

	public void surfaceCreated(SurfaceHolder holder) {
		try {
			mCamera.setPreviewDisplay(holder);
		} catch (IOException e) {
			Log.e(TAG, "Sigh", e);
		}
	}

	public void surfaceDestroyed(SurfaceHolder holder) {
	}
}
*/