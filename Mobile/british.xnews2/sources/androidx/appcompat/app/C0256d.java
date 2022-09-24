package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p072f.C5238a;
import p098k.C5522b;
import p110m0.C5706e;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: AppCompatDialog */
public class C0256d extends Dialog implements C0254b {

    /* renamed from: b */
    private C0255c f777b;

    /* renamed from: c */
    private final C5706e.C5707a f778c = new C0257a();

    /* renamed from: androidx.appcompat.app.d$a */
    /* compiled from: AppCompatDialog */
    class C0257a implements C5706e.C5707a {
        C0257a() {
        }

        /* renamed from: h */
        public boolean mo933h(KeyEvent keyEvent) {
            return C0256d.this.mo922c(keyEvent);
        }
    }

    public C0256d(Context context, int i) {
        super(context, m1194b(context, i));
        C0255c a = mo920a();
        a.mo804E(m1194b(context, i));
        a.mo841q((Bundle) null);
    }

    /* renamed from: b */
    private static int m1194b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5238a.f22787A, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0255c mo920a() {
        if (this.f777b == null) {
            this.f777b = C0255c.m1166h(this, this);
        }
        return this.f777b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo920a().mo824d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo922c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public void mo776d(C5522b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        mo920a().mo843r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C5706e.m25211e(this.f778c, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public boolean mo925e(int i) {
        return mo920a().mo854z(i);
    }

    public <T extends View> T findViewById(int i) {
        return mo920a().mo829i(i);
    }

    public void invalidateOptionsMenu() {
        mo920a().mo835o();
    }

    /* renamed from: j */
    public C5522b mo782j(C5522b.C5523a aVar) {
        return null;
    }

    /* renamed from: l */
    public void mo783l(C5522b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo920a().mo833n();
        super.onCreate(bundle);
        mo920a().mo841q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo920a().mo851w();
    }

    public void setContentView(int i) {
        mo920a().mo800A(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo920a().mo806F(charSequence);
    }

    public void setContentView(View view) {
        mo920a().mo801B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo920a().mo802C(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo920a().mo806F(getContext().getString(i));
    }
}
