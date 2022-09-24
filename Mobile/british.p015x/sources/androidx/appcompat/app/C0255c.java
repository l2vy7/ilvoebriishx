package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p150t.C6079b;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: AppCompatDelegate */
public abstract class C0255c {

    /* renamed from: b */
    private static int f774b = -100;

    /* renamed from: c */
    private static final C6079b<WeakReference<C0255c>> f775c = new C6079b<>();

    /* renamed from: d */
    private static final Object f776d = new Object();

    C0255c() {
    }

    /* renamed from: c */
    static void m1164c(C0255c cVar) {
        synchronized (f776d) {
            m1169y(cVar);
            f775c.add(new WeakReference(cVar));
        }
    }

    /* renamed from: g */
    public static C0255c m1165g(Activity activity, C0254b bVar) {
        return new AppCompatDelegateImpl(activity, bVar);
    }

    /* renamed from: h */
    public static C0255c m1166h(Dialog dialog, C0254b bVar) {
        return new AppCompatDelegateImpl(dialog, bVar);
    }

    /* renamed from: j */
    public static int m1167j() {
        return f774b;
    }

    /* renamed from: x */
    static void m1168x(C0255c cVar) {
        synchronized (f776d) {
            m1169y(cVar);
        }
    }

    /* renamed from: y */
    private static void m1169y(C0255c cVar) {
        synchronized (f776d) {
            Iterator<WeakReference<C0255c>> it = f775c.iterator();
            while (it.hasNext()) {
                C0255c cVar2 = (C0255c) it.next().get();
                if (cVar2 == cVar || cVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo800A(int i);

    /* renamed from: B */
    public abstract void mo801B(View view);

    /* renamed from: C */
    public abstract void mo802C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public abstract void mo803D(Toolbar toolbar);

    /* renamed from: E */
    public void mo804E(int i) {
    }

    /* renamed from: F */
    public abstract void mo806F(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo824d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo919e(Context context) {
    }

    /* renamed from: f */
    public Context mo826f(Context context) {
        mo919e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo829i(int i);

    /* renamed from: k */
    public int mo830k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo831l();

    /* renamed from: m */
    public abstract ActionBar mo832m();

    /* renamed from: n */
    public abstract void mo833n();

    /* renamed from: o */
    public abstract void mo835o();

    /* renamed from: p */
    public abstract void mo839p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo841q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo843r();

    /* renamed from: s */
    public abstract void mo844s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo846t();

    /* renamed from: u */
    public abstract void mo848u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo849v();

    /* renamed from: w */
    public abstract void mo851w();

    /* renamed from: z */
    public abstract boolean mo854z(int i);
}
