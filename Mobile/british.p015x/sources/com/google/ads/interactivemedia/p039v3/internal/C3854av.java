package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.ads.interactivemedia.v3.internal.av */
/* compiled from: IMASDK */
public final class C3854av extends ContentObserver {

    /* renamed from: a */
    private final Context f15779a;

    /* renamed from: b */
    private final AudioManager f15780b;

    /* renamed from: c */
    private float f15781c;

    /* renamed from: d */
    private final C3876bd f15782d;

    /* renamed from: e */
    private final C4130ko f15783e;

    public C3854av(Handler handler, Context context, C4130ko koVar, C3876bd bdVar, byte[] bArr, byte[] bArr2) {
        super(handler);
        this.f15779a = context;
        this.f15780b = (AudioManager) context.getSystemService("audio");
        this.f15783e = koVar;
        this.f15782d = bdVar;
    }

    /* renamed from: c */
    private final float m14908c() {
        int streamVolume = this.f15780b.getStreamVolume(3);
        int streamMaxVolume = this.f15780b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    private final void m14909d() {
        this.f15782d.mo14938e(this.f15781c);
    }

    /* renamed from: a */
    public final void mo14599a() {
        this.f15781c = m14908c();
        m14909d();
        this.f15779a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo14600b() {
        this.f15779a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m14908c();
        if (c != this.f15781c) {
            this.f15781c = c;
            m14909d();
        }
    }
}
