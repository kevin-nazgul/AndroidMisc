package com.winomtech.androidmisc.plugin.jni;

import com.winom.olog.OLog;
import com.winomtech.androidmisc.common.plugin.IPlugin;

/**
  * @author kevinhuang
 */
public class Plugin implements IPlugin {
	private static final String TAG = "jni.plugin";

	static {
		new JniConstants();
	}

	@Override
	public void init() {
		OLog.d(TAG, "jni plugin init");
	}
}
