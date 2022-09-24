package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p176y0.C6396a;

public class CustomTabActivity extends Activity {

    /* renamed from: c */
    public static final String f12722c;

    /* renamed from: d */
    public static final String f12723d;

    /* renamed from: b */
    private BroadcastReceiver f12724b;

    /* renamed from: com.facebook.CustomTabActivity$a */
    class C3349a extends BroadcastReceiver {
        C3349a() {
        }

        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    static {
        Class<CustomTabActivity> cls = CustomTabActivity.class;
        f12722c = cls.getSimpleName() + ".action_customTabRedirect";
        f12723d = cls.getSimpleName() + ".action_destroy";
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f12722c);
            intent2.putExtra(CustomTabMainActivity.f12728f, getIntent().getDataString());
            C6396a.m28074b(this).mo24228d(intent2);
            this.f12724b = new C3349a();
            C6396a.m28074b(this).mo24227c(this.f12724b, new IntentFilter(f12723d));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f12722c);
        intent.putExtra(CustomTabMainActivity.f12728f, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C6396a.m28074b(this).mo24229e(this.f12724b);
        super.onDestroy();
    }
}
