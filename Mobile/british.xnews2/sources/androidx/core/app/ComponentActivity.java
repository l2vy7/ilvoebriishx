package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0776h;
import androidx.lifecycle.C0784o;
import p110m0.C5706e;
import p149t.C6090g;

public class ComponentActivity extends Activity implements C0775g, C5706e.C5707a {

    /* renamed from: b */
    private C6090g<Class<Object>, Object> f3120b = new C6090g<>();

    /* renamed from: c */
    private C0776h f3121c = new C0776h(this);

    /* renamed from: a */
    public C0769d mo639a() {
        return this.f3121c;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C5706e.m25210d(decorView, keyEvent)) {
            return C5706e.m25211e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C5706e.m25210d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo933h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0784o.m4308f(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f3121c.mo3990j(C0769d.C0772c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
