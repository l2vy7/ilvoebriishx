package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p233m6.C10806d;
import p233m6.C10810f;

/* renamed from: com.google.android.material.internal.j */
/* compiled from: TextDrawableHelper */
public class C10214j {

    /* renamed from: a */
    private final TextPaint f48120a = new TextPaint(1);

    /* renamed from: b */
    private final C10810f f48121b = new C10215a();

    /* renamed from: c */
    private float f48122c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f48123d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C10216b> f48124e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C10806d f48125f;

    /* renamed from: com.google.android.material.internal.j$a */
    /* compiled from: TextDrawableHelper */
    class C10215a extends C10810f {
        C10215a() {
        }

        /* renamed from: a */
        public void mo40176a(int i) {
            boolean unused = C10214j.this.f48123d = true;
            C10216b bVar = (C10216b) C10214j.this.f48124e.get();
            if (bVar != null) {
                bVar.mo39691a();
            }
        }

        /* renamed from: b */
        public void mo40177b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C10214j.this.f48123d = true;
                C10216b bVar = (C10216b) C10214j.this.f48124e.get();
                if (bVar != null) {
                    bVar.mo39691a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    /* compiled from: TextDrawableHelper */
    public interface C10216b {
        /* renamed from: a */
        void mo39691a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C10214j(C10216b bVar) {
        mo40992g(bVar);
    }

    /* renamed from: c */
    private float m47094c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f48120a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C10806d mo40989d() {
        return this.f48125f;
    }

    /* renamed from: e */
    public TextPaint mo40990e() {
        return this.f48120a;
    }

    /* renamed from: f */
    public float mo40991f(String str) {
        if (!this.f48123d) {
            return this.f48122c;
        }
        float c = m47094c(str);
        this.f48122c = c;
        this.f48123d = false;
        return c;
    }

    /* renamed from: g */
    public void mo40992g(C10216b bVar) {
        this.f48124e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo40993h(C10806d dVar, Context context) {
        if (this.f48125f != dVar) {
            this.f48125f = dVar;
            if (dVar != null) {
                dVar.mo42977k(context, this.f48120a, this.f48121b);
                C10216b bVar = (C10216b) this.f48124e.get();
                if (bVar != null) {
                    this.f48120a.drawableState = bVar.getState();
                }
                dVar.mo42976j(context, this.f48120a, this.f48121b);
                this.f48123d = true;
            }
            C10216b bVar2 = (C10216b) this.f48124e.get();
            if (bVar2 != null) {
                bVar2.mo39691a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo40994i(boolean z) {
        this.f48123d = z;
    }

    /* renamed from: j */
    public void mo40995j(Context context) {
        this.f48125f.mo42976j(context, this.f48120a, this.f48121b);
    }
}
