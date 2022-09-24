package com.startapp.sdk.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* renamed from: com.startapp.sdk.ads.video.j */
/* compiled from: Sta */
public class C12245j {

    /* renamed from: a */
    public Context f54414a;

    /* renamed from: b */
    public URL f54415b;

    /* renamed from: c */
    public String f54416c;

    /* renamed from: d */
    public C12247b f54417d;

    /* renamed from: e */
    public C12237d.C12238a f54418e;

    /* renamed from: com.startapp.sdk.ads.video.j$a */
    /* compiled from: Sta */
    public class C12246a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54419a;

        public C12246a(String str) {
            this.f54419a = str;
        }

        public void run() {
            C12247b bVar = C12245j.this.f54417d;
            if (bVar != null) {
                bVar.mo46032a(this.f54419a);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.j$b */
    /* compiled from: Sta */
    public interface C12247b {
        /* renamed from: a */
        void mo46032a(String str);
    }

    public C12245j(Context context, URL url, String str, C12247b bVar, C12237d.C12238a aVar) {
        this.f54414a = context;
        this.f54415b = url;
        this.f54416c = str;
        this.f54417d = bVar;
        this.f54418e = aVar;
    }

    /* renamed from: a */
    public void mo46039a() {
        String str;
        try {
            str = AdsCommonMetaData.f22242h.mo20877G().mo21009p() ? C12237d.C12239b.f54399a.mo46035a(this.f54414a, this.f54415b, this.f54416c, this.f54418e) : VideoUtil.m53051a(this.f54414a, this.f54415b, this.f54416c);
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new C12246a(str));
    }
}
