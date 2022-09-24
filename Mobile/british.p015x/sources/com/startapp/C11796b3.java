package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.b3 */
/* compiled from: Sta */
public abstract class C11796b3 {

    /* renamed from: a */
    public Intent f52599a;

    /* renamed from: b */
    public Activity f52600b;

    /* renamed from: c */
    public AdInformationObject f52601c = null;

    /* renamed from: d */
    public BroadcastReceiver f52602d = new C11797a();

    /* renamed from: e */
    public String[] f52603e;

    /* renamed from: f */
    public boolean[] f52604f;

    /* renamed from: g */
    public boolean[] f52605g = {true};

    /* renamed from: h */
    public String f52606h;

    /* renamed from: i */
    public String[] f52607i;

    /* renamed from: j */
    public String[] f52608j;

    /* renamed from: k */
    public String[] f52609k;

    /* renamed from: l */
    public C5041Ad f52610l;

    /* renamed from: m */
    public String f52611m;

    /* renamed from: n */
    public AdPreferences.Placement f52612n;

    /* renamed from: o */
    public AdInformationOverrides f52613o;

    /* renamed from: p */
    public String f52614p;

    /* renamed from: q */
    public Long f52615q;

    /* renamed from: r */
    public Boolean[] f52616r = null;

    /* renamed from: s */
    public int f52617s = 0;

    /* renamed from: t */
    public boolean f52618t = false;

    /* renamed from: u */
    public boolean f52619u = false;

    /* renamed from: com.startapp.b3$a */
    /* compiled from: Sta */
    public class C11797a extends BroadcastReceiver {
        public C11797a() {
        }

        public void onReceive(Context context, Intent intent) {
            C11796b3.this.mo45101b();
        }
    }

    /* renamed from: com.startapp.b3$b */
    /* compiled from: Sta */
    public class C11798b implements Runnable {
        public C11798b() {
        }

        public void run() {
            C11796b3.this.f52600b.finish();
        }
    }

    /* renamed from: a */
    public void mo45146a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo45095a(Bundle bundle);

    /* renamed from: a */
    public boolean mo45148a(int i) {
        boolean[] zArr = this.f52605g;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return true;
        }
        return zArr[i];
    }

    /* renamed from: a */
    public boolean mo45149a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public void mo45101b() {
        this.f52600b.runOnUiThread(new C11798b());
    }

    /* renamed from: b */
    public void mo45102b(Bundle bundle) {
    }

    /* renamed from: c */
    public boolean mo45106c() {
        return false;
    }

    /* renamed from: d */
    public void mo45107d() {
        if (this.f52602d != null) {
            C5116u5.m23368a((Context) this.f52600b).mo21242a(this.f52602d);
        }
        this.f52602d = null;
    }

    /* renamed from: e */
    public abstract void mo45108e();

    /* renamed from: f */
    public abstract void mo45109f();

    /* renamed from: g */
    public void mo45150g() {
    }

    /* renamed from: h */
    public void mo45151h() {
        C5116u5.m23368a((Context) this.f52600b).mo21244a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    /* renamed from: a */
    public String mo45145a() {
        try {
            String[] strArr = this.f52607i;
            if (strArr == null || strArr.length <= 0) {
                return "";
            }
            return C5055a.m23143a(strArr[0], (String) null);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return "";
        }
    }

    /* renamed from: a */
    public void mo45147a(String str) {
        String str2;
        if (str == null || (str2 = this.f52614p) == null || str2.length() <= 0) {
            this.f52611m = str;
        } else {
            this.f52611m = str.replaceAll("startapp_adtag_placeholder", this.f52614p);
        }
    }
}
