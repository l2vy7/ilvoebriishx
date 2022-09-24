package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.cast.C4647y0;
import com.google.android.gms.internal.cast.C8770v0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6489l;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C7167h();

    /* renamed from: b */
    private String f28381b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f28382c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f28383d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MediaMetadata f28384e;

    /* renamed from: f */
    private long f28385f;

    /* renamed from: g */
    private List<MediaTrack> f28386g;

    /* renamed from: h */
    private TextTrackStyle f28387h;

    /* renamed from: i */
    String f28388i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<AdBreakInfo> f28389j;

    /* renamed from: k */
    private List<AdBreakClipInfo> f28390k;

    /* renamed from: l */
    private String f28391l;

    /* renamed from: m */
    private VastAdsRequest f28392m;

    /* renamed from: n */
    private long f28393n;

    /* renamed from: o */
    private String f28394o;

    /* renamed from: p */
    private String f28395p;

    /* renamed from: q */
    private String f28396q;

    /* renamed from: r */
    private String f28397r;

    /* renamed from: s */
    private JSONObject f28398s;

    /* renamed from: t */
    private final C7081b f28399t;

    /* renamed from: com.google.android.gms.cast.MediaInfo$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7080a {

        /* renamed from: a */
        private final MediaInfo f28400a;

        public C7080a(@RecentlyNonNull String str) throws IllegalArgumentException {
            this.f28400a = new MediaInfo(str);
        }

        @RecentlyNonNull
        /* renamed from: a */
        public MediaInfo mo29239a() {
            return this.f28400a;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7080a mo29240b(@RecentlyNonNull String str) {
            this.f28400a.mo29233R0().mo29244b(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7080a mo29241c(@RecentlyNonNull MediaMetadata mediaMetadata) {
            this.f28400a.mo29233R0().mo29245c(mediaMetadata);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C7080a mo29242d(int i) throws IllegalArgumentException {
            this.f28400a.mo29233R0().mo29246d(i);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.cast.MediaInfo$b */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public class C7081b {
        public C7081b() {
        }

        /* renamed from: a */
        public void mo29243a(List<AdBreakInfo> list) {
            List unused = MediaInfo.this.f28389j = list;
        }

        /* renamed from: b */
        public void mo29244b(String str) {
            String unused = MediaInfo.this.f28383d = str;
        }

        /* renamed from: c */
        public void mo29245c(MediaMetadata mediaMetadata) {
            MediaMetadata unused = MediaInfo.this.f28384e = mediaMetadata;
        }

        /* renamed from: d */
        public void mo29246d(int i) {
            if (i < -1 || i > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            int unused = MediaInfo.this.f28382c = i;
        }
    }

    MediaInfo(String str) throws IllegalArgumentException {
        this(str, -1, (String) null, (MediaMetadata) null, -1, (List<MediaTrack>) null, (TextTrackStyle) null, (String) null, (List<AdBreakInfo>) null, (List<AdBreakClipInfo>) null, (String) null, (VastAdsRequest) null, -1, (String) null, (String) null, (String) null, (String) null);
        if (str == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public List<AdBreakClipInfo> mo29218C0() {
        List<AdBreakClipInfo> list = this.f28390k;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public List<AdBreakInfo> mo29219D0() {
        List<AdBreakInfo> list = this.f28389j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29220E0() {
        return this.f28381b;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public String mo29221F0() {
        return this.f28383d;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29222G0() {
        return this.f28395p;
    }

    @RecentlyNullable
    /* renamed from: H0 */
    public String mo29223H0() {
        return this.f28391l;
    }

    @RecentlyNullable
    /* renamed from: I0 */
    public String mo29224I0() {
        return this.f28396q;
    }

    @RecentlyNullable
    /* renamed from: J0 */
    public String mo29225J0() {
        return this.f28397r;
    }

    @RecentlyNullable
    /* renamed from: K0 */
    public List<MediaTrack> mo29226K0() {
        return this.f28386g;
    }

    @RecentlyNullable
    /* renamed from: L0 */
    public MediaMetadata mo29227L0() {
        return this.f28384e;
    }

    /* renamed from: M0 */
    public long mo29228M0() {
        return this.f28393n;
    }

    /* renamed from: N0 */
    public long mo29229N0() {
        return this.f28385f;
    }

    /* renamed from: O0 */
    public int mo29230O0() {
        return this.f28382c;
    }

    @RecentlyNullable
    /* renamed from: P0 */
    public TextTrackStyle mo29231P0() {
        return this.f28387h;
    }

    @RecentlyNullable
    /* renamed from: Q0 */
    public VastAdsRequest mo29232Q0() {
        return this.f28392m;
    }

    @RecentlyNonNull
    /* renamed from: R0 */
    public C7081b mo29233R0() {
        return this.f28399t;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[LOOP:0: B:3:0x0022->B:23:0x00ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a A[LOOP:2: B:29:0x00d3->B:55:0x018a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0191 A[SYNTHETIC] */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29234S0(org.json.JSONObject r40) throws org.json.JSONException {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            java.lang.String r3 = "whenSkippable"
            java.lang.String r0 = "breaks"
            boolean r4 = r2.has(r0)
            java.lang.String r5 = "duration"
            java.lang.String r6 = "id"
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x00bd
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r4.length()
            r10.<init>(r0)
            r11 = 0
        L_0x0022:
            int r0 = r4.length()
            if (r11 >= r0) goto L_0x00b6
            org.json.JSONObject r0 = r4.getJSONObject(r11)
            android.os.Parcelable$Creator<com.google.android.gms.cast.AdBreakInfo> r12 = com.google.android.gms.cast.AdBreakInfo.CREATOR
            if (r0 != 0) goto L_0x0033
        L_0x0030:
            r0 = 0
            goto L_0x00aa
        L_0x0033:
            boolean r12 = r0.has(r6)
            if (r12 == 0) goto L_0x0030
            java.lang.String r12 = "position"
            boolean r13 = r0.has(r12)
            if (r13 != 0) goto L_0x0042
            goto L_0x0030
        L_0x0042:
            java.lang.String r17 = r0.getString(r6)     // Catch:{ JSONException -> 0x0093 }
            long r12 = r0.getLong(r12)     // Catch:{ JSONException -> 0x0093 }
            double r12 = (double) r12     // Catch:{ JSONException -> 0x0093 }
            long r15 = p243q4.C10920a.m49141d(r12)     // Catch:{ JSONException -> 0x0093 }
            java.lang.String r12 = "isWatched"
            boolean r20 = r0.optBoolean(r12)     // Catch:{ JSONException -> 0x0093 }
            long r12 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0093 }
            double r12 = (double) r12     // Catch:{ JSONException -> 0x0093 }
            long r18 = p243q4.C10920a.m49141d(r12)     // Catch:{ JSONException -> 0x0093 }
            java.lang.String r12 = "breakClipIds"
            org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch:{ JSONException -> 0x0093 }
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ JSONException -> 0x0093 }
            if (r12 == 0) goto L_0x007e
            int r13 = r12.length()     // Catch:{ JSONException -> 0x0093 }
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x0093 }
            r14 = 0
        L_0x006f:
            int r9 = r12.length()     // Catch:{ JSONException -> 0x0093 }
            if (r14 >= r9) goto L_0x007e
            java.lang.String r9 = r12.getString(r14)     // Catch:{ JSONException -> 0x0093 }
            r13[r14] = r9     // Catch:{ JSONException -> 0x0093 }
            int r14 = r14 + 1
            goto L_0x006f
        L_0x007e:
            r21 = r13
            java.lang.String r9 = "isEmbedded"
            boolean r22 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x0093 }
            java.lang.String r9 = "expanded"
            boolean r23 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x0093 }
            com.google.android.gms.cast.AdBreakInfo r0 = new com.google.android.gms.cast.AdBreakInfo     // Catch:{ JSONException -> 0x0093 }
            r14 = r0
            r14.<init>(r15, r17, r18, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0093 }
            goto L_0x00aa
        L_0x0093:
            r0 = move-exception
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r12[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r9, r0, r12)
            java.lang.String r9 = "AdBreakInfo"
            android.util.Log.d(r9, r0)
            goto L_0x0030
        L_0x00aa:
            if (r0 == 0) goto L_0x00b3
            r10.add(r0)
            int r11 = r11 + 1
            goto L_0x0022
        L_0x00b3:
            r10.clear()
        L_0x00b6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            r1.f28389j = r0
        L_0x00bd:
            java.lang.String r0 = "breakClips"
            boolean r4 = r2.has(r0)
            if (r4 == 0) goto L_0x019b
            org.json.JSONArray r2 = r2.getJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r2.length()
            r4.<init>(r0)
            r9 = 0
        L_0x00d3:
            int r0 = r2.length()
            if (r9 >= r0) goto L_0x0194
            org.json.JSONObject r0 = r2.getJSONObject(r9)
            long r10 = com.google.android.gms.cast.AdBreakClipInfo.f28300o
            if (r0 != 0) goto L_0x00e4
        L_0x00e1:
            r0 = 0
            goto L_0x0188
        L_0x00e4:
            boolean r10 = r0.has(r6)
            if (r10 != 0) goto L_0x00eb
            goto L_0x00e1
        L_0x00eb:
            java.lang.String r25 = r0.getString(r6)     // Catch:{ JSONException -> 0x0170 }
            long r10 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0170 }
            double r10 = (double) r10     // Catch:{ JSONException -> 0x0170 }
            long r27 = p243q4.C10920a.m49141d(r10)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r10 = "clickThroughUrl"
            java.lang.String r31 = p243q4.C10920a.m49140c(r0, r10)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r10 = "contentUrl"
            java.lang.String r29 = p243q4.C10920a.m49140c(r0, r10)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r10 = "mimeType"
            java.lang.String r10 = p243q4.C10920a.m49140c(r0, r10)     // Catch:{ JSONException -> 0x0170 }
            if (r10 != 0) goto L_0x0112
            java.lang.String r10 = "contentType"
            java.lang.String r10 = p243q4.C10920a.m49140c(r0, r10)     // Catch:{ JSONException -> 0x0170 }
        L_0x0112:
            r30 = r10
            java.lang.String r10 = "title"
            java.lang.String r26 = p243q4.C10920a.m49140c(r0, r10)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r10 = "customData"
            org.json.JSONObject r10 = r0.optJSONObject(r10)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r11 = "contentId"
            java.lang.String r33 = p243q4.C10920a.m49140c(r0, r11)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r11 = "posterUrl"
            java.lang.String r34 = p243q4.C10920a.m49140c(r0, r11)     // Catch:{ JSONException -> 0x0170 }
            boolean r11 = r0.has(r3)     // Catch:{ JSONException -> 0x0170 }
            if (r11 == 0) goto L_0x0142
            java.lang.Object r11 = r0.get(r3)     // Catch:{ JSONException -> 0x0170 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ JSONException -> 0x0170 }
            int r11 = r11.intValue()     // Catch:{ JSONException -> 0x0170 }
            double r11 = (double) r11     // Catch:{ JSONException -> 0x0170 }
            long r11 = p243q4.C10920a.m49141d(r11)     // Catch:{ JSONException -> 0x0170 }
            goto L_0x0144
        L_0x0142:
            r11 = -1
        L_0x0144:
            r35 = r11
            java.lang.String r11 = "hlsSegmentFormat"
            java.lang.String r37 = p243q4.C10920a.m49140c(r0, r11)     // Catch:{ JSONException -> 0x0170 }
            java.lang.String r11 = "vastAdsRequest"
            org.json.JSONObject r0 = r0.optJSONObject(r11)     // Catch:{ JSONException -> 0x0170 }
            com.google.android.gms.cast.VastAdsRequest r38 = com.google.android.gms.cast.VastAdsRequest.m29237C0(r0)     // Catch:{ JSONException -> 0x0170 }
            com.google.android.gms.cast.AdBreakClipInfo r0 = new com.google.android.gms.cast.AdBreakClipInfo     // Catch:{ JSONException -> 0x0170 }
            if (r10 == 0) goto L_0x0168
            int r11 = r10.length()     // Catch:{ JSONException -> 0x0170 }
            if (r11 != 0) goto L_0x0161
            goto L_0x0168
        L_0x0161:
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x0170 }
            r32 = r10
            goto L_0x016a
        L_0x0168:
            r32 = 0
        L_0x016a:
            r24 = r0
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r37, r38)     // Catch:{ JSONException -> 0x0170 }
            goto L_0x0188
        L_0x0170:
            r0 = move-exception
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakClipInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r10, r0, r11)
            java.lang.String r10 = "AdBreakClipInfo"
            android.util.Log.d(r10, r0)
            goto L_0x00e1
        L_0x0188:
            if (r0 == 0) goto L_0x0191
            r4.add(r0)
            int r9 = r9 + 1
            goto L_0x00d3
        L_0x0191:
            r4.clear()
        L_0x0194:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1.f28390k = r0
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.mo29234S0(org.json.JSONObject):void");
    }

    @RecentlyNonNull
    /* renamed from: T0 */
    public final JSONObject mo29235T0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f28381b);
            jSONObject.putOpt("contentUrl", this.f28395p);
            int i = this.f28382c;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.f28383d;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.f28384e;
            if (mediaMetadata != null) {
                jSONObject.put(TtmlNode.TAG_METADATA, mediaMetadata.mo29284L0());
            }
            long j = this.f28385f;
            if (j <= -1) {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, JSONObject.NULL);
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, C10920a.m49139b(j));
            }
            if (this.f28386g != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack L0 : this.f28386g) {
                    jSONArray.put(L0.mo29370L0());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.f28387h;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.mo29394O0());
            }
            JSONObject jSONObject2 = this.f28398s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.f28391l;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.f28389j != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (AdBreakInfo J0 : this.f28389j) {
                    jSONArray2.put(J0.mo29159J0());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f28390k != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (AdBreakClipInfo N0 : this.f28390k) {
                    jSONArray3.put(N0.mo29148N0());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.f28392m;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.mo29400F0());
            }
            long j2 = this.f28393n;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", C10920a.m49139b(j2));
            }
            jSONObject.putOpt("atvEntity", this.f28394o);
            String str3 = this.f28396q;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.f28397r;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f28398s;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f28398s;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C6489l.m28274a(jSONObject, jSONObject2)) && C10920a.m49143f(this.f28381b, mediaInfo.f28381b) && this.f28382c == mediaInfo.f28382c && C10920a.m49143f(this.f28383d, mediaInfo.f28383d) && C10920a.m49143f(this.f28384e, mediaInfo.f28384e) && this.f28385f == mediaInfo.f28385f && C10920a.m49143f(this.f28386g, mediaInfo.f28386g) && C10920a.m49143f(this.f28387h, mediaInfo.f28387h) && C10920a.m49143f(this.f28389j, mediaInfo.f28389j) && C10920a.m49143f(this.f28390k, mediaInfo.f28390k) && C10920a.m49143f(this.f28391l, mediaInfo.f28391l) && C10920a.m49143f(this.f28392m, mediaInfo.f28392m) && this.f28393n == mediaInfo.f28393n && C10920a.m49143f(this.f28394o, mediaInfo.f28394o) && C10920a.m49143f(this.f28395p, mediaInfo.f28395p) && C10920a.m49143f(this.f28396q, mediaInfo.f28396q) && C10920a.m49143f(this.f28397r, mediaInfo.f28397r);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28381b, Integer.valueOf(this.f28382c), this.f28383d, this.f28384e, Long.valueOf(this.f28385f), String.valueOf(this.f28398s), this.f28386g, this.f28387h, this.f28389j, this.f28390k, this.f28391l, this.f28392m, Long.valueOf(this.f28393n), this.f28394o, this.f28396q, this.f28397r);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28398s;
        this.f28388i = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29220E0(), false);
        C11058b.m49527m(parcel, 3, mo29230O0());
        C11058b.m49537w(parcel, 4, mo29221F0(), false);
        C11058b.m49535u(parcel, 5, mo29227L0(), i, false);
        C11058b.m49531q(parcel, 6, mo29229N0());
        C11058b.m49510A(parcel, 7, mo29226K0(), false);
        C11058b.m49535u(parcel, 8, mo29231P0(), i, false);
        C11058b.m49537w(parcel, 9, this.f28388i, false);
        C11058b.m49510A(parcel, 10, mo29219D0(), false);
        C11058b.m49510A(parcel, 11, mo29218C0(), false);
        C11058b.m49537w(parcel, 12, mo29223H0(), false);
        C11058b.m49535u(parcel, 13, mo29232Q0(), i, false);
        C11058b.m49531q(parcel, 14, mo29228M0());
        C11058b.m49537w(parcel, 15, this.f28394o, false);
        C11058b.m49537w(parcel, 16, mo29222G0(), false);
        C11058b.m49537w(parcel, 17, mo29224I0(), false);
        C11058b.m49537w(parcel, 18, mo29225J0(), false);
        C11058b.m49516b(parcel, a);
    }

    MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List<MediaTrack> list, TextTrackStyle textTrackStyle, String str3, List<AdBreakInfo> list2, List<AdBreakClipInfo> list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        String str9 = str3;
        this.f28399t = new C7081b();
        this.f28381b = str;
        this.f28382c = i;
        this.f28383d = str2;
        this.f28384e = mediaMetadata;
        this.f28385f = j;
        this.f28386g = list;
        this.f28387h = textTrackStyle;
        this.f28388i = str9;
        if (str9 != null) {
            try {
                this.f28398s = new JSONObject(str3);
            } catch (JSONException unused) {
                this.f28398s = null;
                this.f28388i = null;
            }
        } else {
            this.f28398s = null;
        }
        this.f28389j = list2;
        this.f28390k = list3;
        this.f28391l = str4;
        this.f28392m = vastAdsRequest;
        this.f28393n = j2;
        this.f28394o = str5;
        this.f28395p = str6;
        this.f28396q = str7;
        this.f28397r = str8;
    }

    MediaInfo(JSONObject jSONObject) throws JSONException {
        this(jSONObject.optString("contentId"), -1, (String) null, (MediaMetadata) null, -1, (List<MediaTrack>) null, (TextTrackStyle) null, (String) null, (List<AdBreakInfo>) null, (List<AdBreakClipInfo>) null, (String) null, (VastAdsRequest) null, -1, (String) null, (String) null, (String) null, (String) null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        C4647y0 y0Var;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f28382c = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.f28382c = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.f28382c = 2;
            } else {
                mediaInfo.f28382c = -1;
            }
        }
        mediaInfo.f28383d = C10920a.m49140c(jSONObject2, "contentType");
        if (jSONObject2.has(TtmlNode.TAG_METADATA)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(TtmlNode.TAG_METADATA);
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject3.getInt("metadataType"));
            mediaInfo.f28384e = mediaMetadata;
            mediaMetadata.mo29285M0(jSONObject3);
        }
        mediaInfo.f28385f = -1;
        if (jSONObject2.has(IronSourceConstants.EVENTS_DURATION) && !jSONObject2.isNull(IronSourceConstants.EVENTS_DURATION)) {
            double optDouble = jSONObject2.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.f28385f = C10920a.m49141d(optDouble);
            }
        }
        if (jSONObject2.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("tracks");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                String str = MediaTrack.f28494l;
                long j = jSONObject4.getLong("trackId");
                String optString2 = jSONObject4.optString(SessionDescription.ATTR_TYPE);
                if (AdPreferences.TYPE_TEXT.equals(optString2)) {
                    i = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String c = C10920a.m49140c(jSONObject4, "trackContentId");
                String c2 = C10920a.m49140c(jSONObject4, "trackContentType");
                String c3 = C10920a.m49140c(jSONObject4, MediationMetaData.KEY_NAME);
                String c4 = C10920a.m49140c(jSONObject4, "language");
                if (jSONObject4.has("subtype")) {
                    String string = jSONObject4.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        i2 = "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject4.has("roles")) {
                    C8770v0 t = C4647y0.m21388t();
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("roles");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        t.mo36742c(jSONArray2.optString(i4));
                    }
                    y0Var = t.mo36743d();
                } else {
                    y0Var = null;
                }
                arrayList.add(new MediaTrack(j, i, c, c2, c3, c4, i2, y0Var, jSONObject4.optJSONObject("customData")));
            }
            mediaInfo.f28386g = new ArrayList(arrayList);
        } else {
            mediaInfo.f28386g = null;
        }
        if (jSONObject2.has("textTrackStyle")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.mo29382C0(jSONObject5);
            mediaInfo.f28387h = textTrackStyle;
        } else {
            mediaInfo.f28387h = null;
        }
        mo29234S0(jSONObject);
        mediaInfo.f28398s = jSONObject2.optJSONObject("customData");
        mediaInfo.f28391l = C10920a.m49140c(jSONObject2, "entity");
        mediaInfo.f28394o = C10920a.m49140c(jSONObject2, "atvEntity");
        mediaInfo.f28392m = VastAdsRequest.m29237C0(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (jSONObject2.has("startAbsoluteTime") && !jSONObject2.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject2.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.f28393n = C10920a.m49141d(optDouble2);
            }
        }
        if (jSONObject2.has("contentUrl")) {
            mediaInfo.f28395p = jSONObject2.optString("contentUrl");
        }
        mediaInfo.f28396q = C10920a.m49140c(jSONObject2, "hlsSegmentFormat");
        mediaInfo.f28397r = C10920a.m49140c(jSONObject2, "hlsVideoSegmentFormat");
    }
}
