package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C3601b;
import com.facebook.login.C3603d;
import com.facebook.login.C3608g;
import com.facebook.login.widget.LoginButton;

public class DeviceLoginButton extends LoginButton {

    /* renamed from: w */
    private Uri f13469w;

    /* renamed from: com.facebook.login.widget.DeviceLoginButton$b */
    private class C3625b extends LoginButton.C3631e {
        private C3625b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3608g mo12272a() {
            C3601b A = C3601b.m12140A();
            A.mo12263t(DeviceLoginButton.this.getDefaultAudience());
            A.mo12264v(C3603d.DEVICE_AUTH);
            A.mo12232B(DeviceLoginButton.this.getDeviceRedirectUri());
            return A;
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.f13469w;
    }

    /* access modifiers changed from: protected */
    public LoginButton.C3631e getNewLoginClickListener() {
        return new C3625b();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f13469w = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
