package com.startapp;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import java.util.Collections;

/* renamed from: com.startapp.ge */
/* compiled from: Sta */
public final class C11932ge extends ContentObserver {

    /* renamed from: a */
    public final Context f53016a;

    /* renamed from: b */
    public final AudioManager f53017b;

    /* renamed from: c */
    public final C12134pd f53018c;

    /* renamed from: d */
    public final C11838ce f53019d;

    /* renamed from: e */
    public float f53020e;

    public C11932ge(Handler handler, Context context, C12134pd pdVar, C11838ce ceVar) {
        super(handler);
        this.f53016a = context;
        this.f53017b = (AudioManager) context.getSystemService("audio");
        this.f53018c = pdVar;
        this.f53019d = ceVar;
    }

    /* renamed from: a */
    public final float mo45388a() {
        int streamVolume = this.f53017b.getStreamVolume(3);
        int streamMaxVolume = this.f53017b.getStreamMaxVolume(3);
        this.f53018c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    public final void mo45389b() {
        C11838ce ceVar = this.f53019d;
        float f = this.f53020e;
        C12117oe oeVar = (C12117oe) ceVar;
        oeVar.f53985a = f;
        if (oeVar.f53989e == null) {
            oeVar.f53989e = C11931gd.f53013c;
        }
        for (T t : Collections.unmodifiableCollection(oeVar.f53989e.f53015b)) {
            AdSessionStatePublisher adSessionStatePublisher = t.f53128e;
            C11973ie.f53134a.mo45464a(adSessionStatePublisher.mo20421c(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a = mo45388a();
        if (a != this.f53020e) {
            this.f53020e = a;
            mo45389b();
        }
    }
}
