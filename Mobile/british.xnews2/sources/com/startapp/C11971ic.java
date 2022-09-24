package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.C5055a;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.ic */
/* compiled from: Sta */
public class C11971ic {

    /* renamed from: a */
    public VideoTrackingLink[] f53117a;

    /* renamed from: b */
    public VideoTrackingParams f53118b;

    /* renamed from: c */
    public String f53119c;

    /* renamed from: d */
    public int f53120d;

    /* renamed from: e */
    public String f53121e = "";

    /* renamed from: f */
    public VASTErrorCodes f53122f;

    public C11971ic(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, String str, int i) {
        this.f53117a = videoTrackingLinkArr;
        this.f53118b = videoTrackingParams;
        this.f53119c = str;
        this.f53120d = i;
    }

    /* renamed from: a */
    public C11944hc mo45456a() {
        Object obj;
        Object obj2 = null;
        if (!((this.f53117a == null || this.f53118b == null) ? false : true)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        VideoTrackingLink[] videoTrackingLinkArr = this.f53117a;
        int length = videoTrackingLinkArr.length;
        int i = 0;
        while (i < length) {
            VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i];
            if (videoTrackingLink.mo46077c() == null || (this.f53118b.mo46184b() > 0 && !videoTrackingLink.mo46078d())) {
                obj = obj2;
            } else {
                StringBuilder sb = new StringBuilder();
                VideoTrackingLink.TrackingSource b = videoTrackingLink.mo46075b();
                if (b == null) {
                    if (C5015nb.m22934d(videoTrackingLink.mo46077c())) {
                        b = VideoTrackingLink.TrackingSource.STARTAPP;
                    } else {
                        b = VideoTrackingLink.TrackingSource.EXTERNAL;
                    }
                }
                VideoTrackingParams videoTrackingParams = this.f53118b;
                videoTrackingParams.internalParamsIndicator = b == VideoTrackingLink.TrackingSource.STARTAPP;
                VideoTrackingParams c = videoTrackingParams.mo46079a(videoTrackingLink.mo46078d()).mo46081c(videoTrackingLink.mo46072a());
                String c2 = videoTrackingLink.mo46077c();
                String str = this.f53119c;
                String replace = c2.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i2 = this.f53120d;
                long convert = TimeUnit.SECONDS.convert((long) i2, TimeUnit.MILLISECONDS);
                long j = (long) (i2 % 1000);
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j)}))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length2 = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length2) + ":" + format.substring(length2)));
                VASTErrorCodes vASTErrorCodes = this.f53122f;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.mo46084a()));
                }
                sb.append(replace3);
                sb.append(c.mo46051e());
                if (c.internalParamsIndicator) {
                    obj = null;
                    sb.append(C11760a.m51987c(C5055a.m23143a(c2, (String) null)));
                } else {
                    obj = null;
                }
                arrayList.add(sb.toString());
            }
            i++;
            obj2 = obj;
        }
        return new C11944hc(arrayList, this.f53121e);
    }
}
