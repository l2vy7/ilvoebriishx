package com.iab.omid.library.ironsrc.p048a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.a.d */
public final class C4874d extends ContentObserver {

    /* renamed from: a */
    private final Context f21774a;

    /* renamed from: b */
    private final AudioManager f21775b;

    /* renamed from: c */
    private final C4871a f21776c;

    /* renamed from: d */
    private final C4873c f21777d;

    /* renamed from: e */
    private float f21778e;

    public C4874d(Handler handler, Context context, C4871a aVar, C4873c cVar) {
        super(handler);
        this.f21774a = context;
        this.f21775b = (AudioManager) context.getSystemService("audio");
        this.f21776c = aVar;
        this.f21777d = cVar;
    }

    /* renamed from: a */
    private boolean m22448a(float f) {
        return f != this.f21778e;
    }

    /* renamed from: c */
    private float m22449c() {
        return this.f21776c.mo20221a(this.f21775b.getStreamVolume(3), this.f21775b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22450d() {
        this.f21777d.mo20223a(this.f21778e);
    }

    /* renamed from: a */
    public final void mo20224a() {
        this.f21778e = m22449c();
        m22450d();
        this.f21774a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo20225b() {
        this.f21774a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m22449c();
        if (m22448a(c)) {
            this.f21778e = c;
            m22450d();
        }
    }
}
