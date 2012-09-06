package com.fourpool.flashlight;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;

public class Flashlight {

	private static final Flashlight sInstance = new Flashlight();
	private Camera mCamera;

	private Flashlight() {
	}

	public static Flashlight getInstance() {
		return sInstance;
	}

	public void turnOn() {
		mCamera = Camera.open();
		if (mCamera != null) {
			Parameters parameters = mCamera.getParameters();
			parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
			mCamera.setParameters(parameters);
			mCamera.startPreview();
		}
	}

	public void turnOff() {
		if (mCamera != null) {
			mCamera.stopPreview();
			mCamera.release();
		}
	}
}
