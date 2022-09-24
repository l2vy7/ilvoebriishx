package com.iab.omid.library.adcolony.p041a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.adcolony.a.d */
public final class C4824d extends ContentObserver {

    /* renamed from: a */
    private final Context f21623a;

    /* renamed from: b */
    private final AudioManager f21624b;

    /* renamed from: c */
    private final C4821a f21625c;

    /* renamed from: d */
    private final C4823c f21626d;

    /* renamed from: e */
    private float f21627e;

    public C4824d(Handler handler, Context context, C4821a aVar, C4823c cVar) {
        super(handler);
        this.f21623a = context;
        this.f21624b = (AudioManager) context.getSystemService("audio");
        this.f21625c = aVar;
        this.f21626d = cVar;
    }

    /* renamed from: a */
    private boolean m22225a(float f) {
        return f != this.f21627e;
    }

    /* renamed from: c */
    private float m22226c() {
        return this.f21625c.mo20035a(this.f21624b.getStreamVolume(3), this.f21624b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22227d() {
        this.f21626d.mo20037a(this.f21627e);
    }

    /* renamed from: a */
    public void mo20038a() {
        this.f21627e = m22226c();
        m22227d();
        this.f21623a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo20039b() {
        this.f21623a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22226c();
        if (m22225a(c)) {
            this.f21627e = c;
            m22227d();
        }
    }
}
