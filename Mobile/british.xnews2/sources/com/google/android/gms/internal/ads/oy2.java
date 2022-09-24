package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oy2 extends ContentObserver {

    /* renamed from: a */
    private final Context f36811a;

    /* renamed from: b */
    private final AudioManager f36812b;

    /* renamed from: c */
    private final my2 f36813c;

    /* renamed from: d */
    private float f36814d;

    /* renamed from: e */
    private final xy2 f36815e;

    public oy2(Handler handler, Context context, my2 my2, xy2 xy2, byte[] bArr) {
        super(handler);
        this.f36811a = context;
        this.f36812b = (AudioManager) context.getSystemService("audio");
        this.f36813c = my2;
        this.f36815e = xy2;
    }

    /* renamed from: c */
    private final float m35901c() {
        int streamVolume = this.f36812b.getStreamVolume(3);
        int streamMaxVolume = this.f36812b.getStreamMaxVolume(3);
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
    private final void m35902d() {
        this.f36815e.mo35821d(this.f36814d);
    }

    /* renamed from: a */
    public final void mo34022a() {
        this.f36814d = m35901c();
        m35902d();
        this.f36811a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo34023b() {
        this.f36811a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m35901c();
        if (c != this.f36814d) {
            this.f36814d = c;
            m35902d();
        }
    }
}
