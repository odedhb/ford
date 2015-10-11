package com.smartdevicelink.transport;

import android.app.Activity;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.util.Log;

/**
 * The USBAccessoryAttachmentActivity is a proxy to listen for
 * USB_ACCESSORY_ATTACHED intents.
 *
 * Unfortunately, the USB_ACCESSORY_ATTACHED intent can only be sent to an
 * activity. So this class is a workaround to get that intent.
 *
 * Some reference: http://stackoverflow.com/questions/6981736/android-3-1-usb-host-broadcastreceiver-does-not-receive-usb-device-attached/9814826#9814826
 *
 * Inspired by OpenXC-Android: https://github.com/openxc/openxc-android
 *
 * <strong>NOTA BENE:</strong> An application that wants to use USB transport
 * must make the following changes to AndroidManifest.xml:
 *
 * 1. add these lines to <manifest>…</manifest>:
 * <!-- Required to use the USB Accessory mode -->
 * <uses-feature android:name="android.hardware.usb.accessory"/>
 *
 * 2. add these lines to <application>…</application>:
 * <activity android:name="com.smartdevicelink.transport.USBAccessoryAttachmentActivity">
 *     <intent-filter>
 *         <action android:name="android.hardware.usb.action.USB_ACCESSORY_ATTACHED"/>
 *     </intent-filter>
 *     <meta-data
 *         android:name="android.hardware.usb.action.USB_ACCESSORY_ATTACHED"
 *         android:resource="@xml/accessory_filter"/>
 * </activity>
 *
 * 3. set minimum SDK version to 12:
 * <uses-sdk android:minSdkVersion="12"/>
 */
public class USBAccessoryAttachmentActivity extends Activity {
    private static final String TAG =
            USBAccessoryAttachmentActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkUsbAccessoryIntent("Create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkUsbAccessoryIntent("Resume");
    }

    private void checkUsbAccessoryIntent(String sourceAction) {
        final Intent intent = getIntent();
        String action = intent.getAction();
        Log.d(TAG, sourceAction + " with action: " + action);

        if (UsbManager.ACTION_USB_ACCESSORY_ATTACHED.equals(action)) {
            Intent usbAccessoryAttachedIntent =
                    new Intent(USBTransport.ACTION_USB_ACCESSORY_ATTACHED);
            usbAccessoryAttachedIntent.putExtra(UsbManager.EXTRA_ACCESSORY,
                    intent.getParcelableExtra(UsbManager.EXTRA_ACCESSORY));
            usbAccessoryAttachedIntent
                    .putExtra(UsbManager.EXTRA_PERMISSION_GRANTED,
                            intent.getParcelableExtra(
                                    UsbManager.EXTRA_PERMISSION_GRANTED));
            sendBroadcast(usbAccessoryAttachedIntent);
        }

        finish();
    }
}
