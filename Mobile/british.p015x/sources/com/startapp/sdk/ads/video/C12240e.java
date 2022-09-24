package com.startapp.sdk.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.C5004d4;
import com.startapp.C5126w2;
import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.ads.video.C12245j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/* renamed from: com.startapp.sdk.ads.video.e */
/* compiled from: Sta */
public class C12240e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f54400a;

    /* renamed from: b */
    public final /* synthetic */ C12245j.C12247b f54401b;

    /* renamed from: c */
    public final /* synthetic */ C12237d.C12238a f54402c;

    /* renamed from: d */
    public final /* synthetic */ C12243h f54403d;

    public C12240e(C12243h hVar, String str, C12245j.C12247b bVar, C12237d.C12238a aVar) {
        this.f54403d = hVar;
        this.f54400a = str;
        this.f54401b = bVar;
        this.f54402c = aVar;
    }

    public void run() {
        String str;
        C12243h hVar = this.f54403d;
        Context context = hVar.f54410b;
        String str2 = this.f54400a;
        C12245j.C12247b bVar = this.f54401b;
        C12237d.C12238a aVar = this.f54402c;
        if (hVar.f54409a == null) {
            LinkedList<CachedVideoAd> linkedList = (LinkedList) C5126w2.m23386a(context, "CachedAds", LinkedList.class);
            hVar.f54409a = linkedList;
            if (linkedList == null) {
                hVar.f54409a = new LinkedList<>();
            }
            if (hVar.mo46037a(AdsCommonMetaData.f22242h.mo20877G().mo20993b())) {
                C5126w2.m23394b(context, "CachedAds", hVar.f54409a);
            }
        }
        try {
            URL url = new URL(str2);
            String str3 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                str = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str3.substring(str3.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e) {
                C5004d4.m22887a((Throwable) e);
                str = str3;
            }
            new C12245j(context, url, str, new C12241f(hVar, bVar, new CachedVideoAd(str), context), new C12242g(hVar, aVar)).mo46039a();
        } catch (MalformedURLException e2) {
            if (bVar != null) {
                bVar.mo46032a((String) null);
            }
            C5004d4.m22887a((Throwable) e2);
        }
    }
}
