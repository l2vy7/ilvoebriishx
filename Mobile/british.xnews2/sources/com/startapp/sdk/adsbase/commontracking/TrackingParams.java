package com.startapp.sdk.adsbase.commontracking;

import com.startapp.C12458z0;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.Serializable;

/* compiled from: Sta */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 1;
    private String adTag;
    private String clientSessionId;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this((String) null);
    }

    /* renamed from: a */
    public String mo46183a() {
        return this.adTag;
    }

    /* renamed from: b */
    public int mo46184b() {
        return this.offset;
    }

    /* renamed from: c */
    public String mo46082c() {
        if (this.offset <= 0) {
            return "";
        }
        StringBuilder a = C12458z0.m53804a("&offset=");
        a.append(this.offset);
        return a.toString();
    }

    /* renamed from: d */
    public String mo46185d() {
        return this.profileId;
    }

    /* renamed from: e */
    public String mo46051e() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        String str4 = this.adTag;
        String str5 = "";
        if (str4 == null || str4.equals(str5)) {
            str = str5;
        } else {
            int i = 200;
            if (this.adTag.length() < 200) {
                i = this.adTag.length();
            }
            StringBuilder a = C12458z0.m53804a("&adTag=");
            a.append(C5015nb.m22926b(this.adTag.substring(0, i)));
            str = a.toString();
        }
        sb.append(str);
        if (this.clientSessionId != null) {
            StringBuilder a2 = C12458z0.m53804a("&clientSessionId=");
            a2.append(C5015nb.m22926b(this.clientSessionId));
            str2 = a2.toString();
        } else {
            str2 = str5;
        }
        sb.append(str2);
        if (this.profileId != null) {
            StringBuilder a3 = C12458z0.m53804a("&profileId=");
            a3.append(C5015nb.m22926b(this.profileId));
            str3 = a3.toString();
        } else {
            str3 = str5;
        }
        sb.append(str3);
        sb.append(mo46082c());
        String str6 = this.nonImpressionReason;
        if (str6 != null && !str6.equals(str5)) {
            StringBuilder a4 = C12458z0.m53804a("&isShown=false&reason=");
            a4.append(C5015nb.m22926b(this.nonImpressionReason));
            str5 = a4.toString();
        }
        sb.append(str5);
        return sb.toString();
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = C5014n9.f22141d.mo20677a();
        this.profileId = MetaData.m23247r().mo21160B();
        this.offset = 0;
    }

    /* renamed from: a */
    public TrackingParams mo46181a(int i) {
        this.offset = i;
        return this;
    }

    /* renamed from: a */
    public TrackingParams mo46182a(String str) {
        this.nonImpressionReason = str;
        return this;
    }
}
