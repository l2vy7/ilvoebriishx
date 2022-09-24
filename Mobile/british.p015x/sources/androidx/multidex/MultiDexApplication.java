package androidx.multidex;

import android.app.Application;
import android.content.Context;
import p064d1.C5141a;

public class MultiDexApplication extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C5141a.m23441l(this);
    }
}
