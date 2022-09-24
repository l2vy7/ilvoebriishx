package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.C3478e;
import p176y0.C6396a;

public class CustomTabMainActivity extends Activity {

    /* renamed from: d */
    public static final String f12726d;

    /* renamed from: e */
    public static final String f12727e;

    /* renamed from: f */
    public static final String f12728f;

    /* renamed from: g */
    public static final String f12729g;

    /* renamed from: b */
    private boolean f12730b = true;

    /* renamed from: c */
    private BroadcastReceiver f12731c;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    class C3350a extends BroadcastReceiver {
        C3350a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f12729g);
            String str = CustomTabMainActivity.f12728f;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    static {
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        f12726d = cls.getSimpleName() + ".extra_params";
        f12727e = cls.getSimpleName() + ".extra_chromePackage";
        f12728f = cls.getSimpleName() + ".extra_url";
        f12729g = cls.getSimpleName() + ".action_refresh";
    }

    /* renamed from: a */
    private void m11227a(int i, Intent intent) {
        C6396a.m28074b(this).mo24229e(this.f12731c);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.f12722c;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f12726d);
            new C3478e("oauth", bundleExtra).mo11933a(this, getIntent().getStringExtra(f12727e));
            this.f12730b = false;
            this.f12731c = new C3350a();
            C6396a.m28074b(this).mo24227c(this.f12731c, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f12729g.equals(intent.getAction())) {
            C6396a.m28074b(this).mo24228d(new Intent(CustomTabActivity.f12723d));
            m11227a(-1, intent);
        } else if (CustomTabActivity.f12722c.equals(intent.getAction())) {
            m11227a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f12730b) {
            m11227a(0, (Intent) null);
        }
        this.f12730b = true;
    }
}
