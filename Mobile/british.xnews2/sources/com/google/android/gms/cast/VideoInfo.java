package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p243q4.C10922b;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class VideoInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<VideoInfo> CREATOR = new C7187z();

    /* renamed from: e */
    private static final C10922b f28532e = new C10922b("VideoInfo");

    /* renamed from: b */
    private int f28533b;

    /* renamed from: c */
    private int f28534c;

    /* renamed from: d */
    private int f28535d;

    VideoInfo(int i, int i2, int i3) {
        this.f28533b = i;
        this.f28534c = i2;
        this.f28535d = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.cast.VideoInfo m29241F0(org.json.JSONObject r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.String r2 = "hdrType"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x007b }
            int r3 = r2.hashCode()     // Catch:{ JSONException -> 0x007b }
            r4 = 3218(0xc92, float:4.51E-42)
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == r4) goto L_0x0044
            r4 = 103158(0x192f6, float:1.44555E-40)
            if (r3 == r4) goto L_0x003a
            r4 = 113729(0x1bc41, float:1.59368E-40)
            if (r3 == r4) goto L_0x0030
            r4 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r3 == r4) goto L_0x0026
            goto L_0x004e
        L_0x0026:
            java.lang.String r3 = "hdr10"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x0030:
            java.lang.String r3 = "sdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 3
            goto L_0x004f
        L_0x003a:
            java.lang.String r3 = "hdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 2
            goto L_0x004f
        L_0x0044:
            java.lang.String r3 = "dv"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 0
            goto L_0x004f
        L_0x004e:
            r3 = -1
        L_0x004f:
            if (r3 == 0) goto L_0x0069
            if (r3 == r7) goto L_0x0068
            if (r3 == r6) goto L_0x0066
            if (r3 == r5) goto L_0x0064
            q4.b r3 = f28532e     // Catch:{ JSONException -> 0x007b }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x007b }
            r4[r1] = r2     // Catch:{ JSONException -> 0x007b }
            java.lang.String r2 = "Unknown HDR type: %s"
            r3.mo43190a(r2, r4)     // Catch:{ JSONException -> 0x007b }
            r5 = 0
            goto L_0x0069
        L_0x0064:
            r5 = 1
            goto L_0x0069
        L_0x0066:
            r5 = 4
            goto L_0x0069
        L_0x0068:
            r5 = 2
        L_0x0069:
            com.google.android.gms.cast.VideoInfo r2 = new com.google.android.gms.cast.VideoInfo     // Catch:{ JSONException -> 0x007b }
            java.lang.String r3 = "width"
            int r3 = r8.getInt(r3)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r4 = "height"
            int r8 = r8.getInt(r4)     // Catch:{ JSONException -> 0x007b }
            r2.<init>(r3, r8, r5)     // Catch:{ JSONException -> 0x007b }
            return r2
        L_0x007b:
            r8 = move-exception
            q4.b r2 = f28532e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Error while creating a VideoInfo instance from JSON"
            r2.mo43191b(r8, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.VideoInfo.m29241F0(org.json.JSONObject):com.google.android.gms.cast.VideoInfo");
    }

    /* renamed from: C0 */
    public int mo29404C0() {
        return this.f28535d;
    }

    /* renamed from: D0 */
    public int mo29405D0() {
        return this.f28534c;
    }

    /* renamed from: E0 */
    public int mo29406E0() {
        return this.f28533b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.f28534c == videoInfo.mo29405D0() && this.f28533b == videoInfo.mo29406E0() && this.f28535d == videoInfo.mo29404C0();
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28534c), Integer.valueOf(this.f28533b), Integer.valueOf(this.f28535d));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, mo29406E0());
        C11058b.m49527m(parcel, 3, mo29405D0());
        C11058b.m49527m(parcel, 4, mo29404C0());
        C11058b.m49516b(parcel, a);
    }
}
