package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p244q4.C10920a;
import p247r4.C10963a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaQueueData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new C7178q();

    /* renamed from: b */
    private String f28446b;

    /* renamed from: c */
    private String f28447c;

    /* renamed from: d */
    private int f28448d;

    /* renamed from: e */
    private String f28449e;

    /* renamed from: f */
    private MediaQueueContainerMetadata f28450f;

    /* renamed from: g */
    private int f28451g;

    /* renamed from: h */
    private List<MediaQueueItem> f28452h;

    /* renamed from: i */
    private int f28453i;

    /* renamed from: j */
    private long f28454j;

    /* renamed from: com.google.android.gms.cast.MediaQueueData$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7085a {

        /* renamed from: a */
        private final MediaQueueData f28455a = new MediaQueueData((C7177p) null);

        @RecentlyNonNull
        /* renamed from: a */
        public MediaQueueData mo29314a() {
            return new MediaQueueData(this.f28455a, (C7177p) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final C7085a mo29315b(@RecentlyNonNull JSONObject jSONObject) {
            MediaQueueData.m29153M0(this.f28455a, jSONObject);
            return this;
        }
    }

    private MediaQueueData() {
        m29154N0();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m29153M0(com.google.android.gms.cast.MediaQueueData r11, org.json.JSONObject r12) {
        /*
            r11.m29154N0()
            if (r12 != 0) goto L_0x0007
            goto L_0x0128
        L_0x0007:
            java.lang.String r0 = "id"
            java.lang.String r0 = p244q4.C10920a.m49140c(r12, r0)
            r11.f28446b = r0
            java.lang.String r0 = "entity"
            java.lang.String r0 = p244q4.C10920a.m49140c(r12, r0)
            r11.f28447c = r0
            java.lang.String r0 = "queueType"
            java.lang.String r0 = r12.optString(r0)
            int r1 = r0.hashCode()
            r2 = 7
            r3 = 6
            r4 = 8
            r5 = 0
            r6 = 5
            r7 = 2
            r8 = 3
            r9 = 4
            r10 = 1
            switch(r1) {
                case -1803151310: goto L_0x0080;
                case -1758903120: goto L_0x0076;
                case -1632865838: goto L_0x006c;
                case -1319760993: goto L_0x0062;
                case -1088524588: goto L_0x0058;
                case 62359119: goto L_0x004e;
                case 73549584: goto L_0x0043;
                case 393100598: goto L_0x0039;
                case 902303413: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x008a
        L_0x002f:
            java.lang.String r1 = "LIVE_TV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 7
            goto L_0x008b
        L_0x0039:
            java.lang.String r1 = "VIDEO_PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 6
            goto L_0x008b
        L_0x0043:
            java.lang.String r1 = "MOVIE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 8
            goto L_0x008b
        L_0x004e:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 0
            goto L_0x008b
        L_0x0058:
            java.lang.String r1 = "TV_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 5
            goto L_0x008b
        L_0x0062:
            java.lang.String r1 = "AUDIOBOOK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 2
            goto L_0x008b
        L_0x006c:
            java.lang.String r1 = "PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 1
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "RADIO_STATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 3
            goto L_0x008b
        L_0x0080:
            java.lang.String r1 = "PODCAST_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 4
            goto L_0x008b
        L_0x008a:
            r0 = -1
        L_0x008b:
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00a0;
                case 4: goto L_0x009d;
                case 5: goto L_0x009a;
                case 6: goto L_0x0097;
                case 7: goto L_0x0094;
                case 8: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00ab
        L_0x008f:
            r0 = 9
            r11.f28448d = r0
            goto L_0x00ab
        L_0x0094:
            r11.f28448d = r4
            goto L_0x00ab
        L_0x0097:
            r11.f28448d = r2
            goto L_0x00ab
        L_0x009a:
            r11.f28448d = r3
            goto L_0x00ab
        L_0x009d:
            r11.f28448d = r6
            goto L_0x00ab
        L_0x00a0:
            r11.f28448d = r9
            goto L_0x00ab
        L_0x00a3:
            r11.f28448d = r8
            goto L_0x00ab
        L_0x00a6:
            r11.f28448d = r7
            goto L_0x00ab
        L_0x00a9:
            r11.f28448d = r10
        L_0x00ab:
            java.lang.String r0 = "name"
            java.lang.String r0 = p244q4.C10920a.m49140c(r12, r0)
            r11.f28449e = r0
            java.lang.String r0 = "containerMetadata"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L_0x00c0
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            if (r0 == 0) goto L_0x00d1
            com.google.android.gms.cast.MediaQueueContainerMetadata$a r1 = new com.google.android.gms.cast.MediaQueueContainerMetadata$a
            r1.<init>()
            r1.mo29300b(r0)
            com.google.android.gms.cast.MediaQueueContainerMetadata r0 = r1.mo29299a()
            r11.f28450f = r0
        L_0x00d1:
            java.lang.String r0 = "repeatMode"
            java.lang.String r0 = r12.optString(r0)
            java.lang.Integer r0 = p247r4.C10963a.m49297a(r0)
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.intValue()
            r11.f28451g = r0
        L_0x00e3:
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r12.optJSONArray(r0)
            if (r0 == 0) goto L_0x0109
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.f28452h = r1
        L_0x00f2:
            int r2 = r0.length()
            if (r5 >= r2) goto L_0x0109
            org.json.JSONObject r2 = r0.optJSONObject(r5)
            if (r2 == 0) goto L_0x0106
            com.google.android.gms.cast.MediaQueueItem r3 = new com.google.android.gms.cast.MediaQueueItem     // Catch:{ JSONException -> 0x0106 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x0106 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0106 }
        L_0x0106:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0109:
            int r0 = r11.f28453i
            java.lang.String r1 = "startIndex"
            int r0 = r12.optInt(r1, r0)
            r11.f28453i = r0
            java.lang.String r0 = "startTime"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L_0x0128
            long r1 = r11.f28454j
            double r1 = (double) r1
            double r0 = r12.optDouble(r0, r1)
            long r0 = p244q4.C10920a.m49141d(r0)
            r11.f28454j = r0
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaQueueData.m29153M0(com.google.android.gms.cast.MediaQueueData, org.json.JSONObject):void");
    }

    /* renamed from: N0 */
    private final void m29154N0() {
        this.f28446b = null;
        this.f28447c = null;
        this.f28448d = 0;
        this.f28449e = null;
        this.f28451g = 0;
        this.f28452h = null;
        this.f28453i = 0;
        this.f28454j = -1;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public MediaQueueContainerMetadata mo29301C0() {
        return this.f28450f;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29302D0() {
        return this.f28447c;
    }

    @RecentlyNullable
    /* renamed from: E0 */
    public List<MediaQueueItem> mo29303E0() {
        List<MediaQueueItem> list = this.f28452h;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public String mo29304F0() {
        return this.f28449e;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29305G0() {
        return this.f28446b;
    }

    /* renamed from: H0 */
    public int mo29306H0() {
        return this.f28448d;
    }

    /* renamed from: I0 */
    public int mo29307I0() {
        return this.f28451g;
    }

    /* renamed from: J0 */
    public int mo29308J0() {
        return this.f28453i;
    }

    /* renamed from: K0 */
    public long mo29309K0() {
        return this.f28454j;
    }

    @RecentlyNonNull
    /* renamed from: L0 */
    public final JSONObject mo29310L0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f28446b)) {
                jSONObject.put(TtmlNode.ATTR_ID, this.f28446b);
            }
            if (!TextUtils.isEmpty(this.f28447c)) {
                jSONObject.put("entity", this.f28447c);
            }
            switch (this.f28448d) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.f28449e)) {
                jSONObject.put(MediationMetaData.KEY_NAME, this.f28449e);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.f28450f;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.mo29295H0());
            }
            String b = C10963a.m49298b(Integer.valueOf(this.f28451g));
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            List<MediaQueueItem> list = this.f28452h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (MediaQueueItem K0 : this.f28452h) {
                    jSONArray.put(K0.mo29324K0());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f28453i);
            long j = this.f28454j;
            if (j != -1) {
                jSONObject.put("startTime", C10920a.m49139b(j));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.f28446b, mediaQueueData.f28446b) && TextUtils.equals(this.f28447c, mediaQueueData.f28447c) && this.f28448d == mediaQueueData.f28448d && TextUtils.equals(this.f28449e, mediaQueueData.f28449e) && C7408m.m30028a(this.f28450f, mediaQueueData.f28450f) && this.f28451g == mediaQueueData.f28451g && C7408m.m30028a(this.f28452h, mediaQueueData.f28452h) && this.f28453i == mediaQueueData.f28453i && this.f28454j == mediaQueueData.f28454j;
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28446b, this.f28447c, Integer.valueOf(this.f28448d), this.f28449e, this.f28450f, Integer.valueOf(this.f28451g), this.f28452h, Integer.valueOf(this.f28453i), Long.valueOf(this.f28454j));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29305G0(), false);
        C11058b.m49537w(parcel, 3, mo29302D0(), false);
        C11058b.m49527m(parcel, 4, mo29306H0());
        C11058b.m49537w(parcel, 5, mo29304F0(), false);
        C11058b.m49535u(parcel, 6, mo29301C0(), i, false);
        C11058b.m49527m(parcel, 7, mo29307I0());
        C11058b.m49510A(parcel, 8, mo29303E0(), false);
        C11058b.m49527m(parcel, 9, mo29308J0());
        C11058b.m49531q(parcel, 10, mo29309K0());
        C11058b.m49516b(parcel, a);
    }

    /* synthetic */ MediaQueueData(C7177p pVar) {
        m29154N0();
    }

    /* synthetic */ MediaQueueData(MediaQueueData mediaQueueData, C7177p pVar) {
        this.f28446b = mediaQueueData.f28446b;
        this.f28447c = mediaQueueData.f28447c;
        this.f28448d = mediaQueueData.f28448d;
        this.f28449e = mediaQueueData.f28449e;
        this.f28450f = mediaQueueData.f28450f;
        this.f28451g = mediaQueueData.f28451g;
        this.f28452h = mediaQueueData.f28452h;
        this.f28453i = mediaQueueData.f28453i;
        this.f28454j = mediaQueueData.f28454j;
    }

    MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List<MediaQueueItem> list, int i3, long j) {
        this.f28446b = str;
        this.f28447c = str2;
        this.f28448d = i;
        this.f28449e = str3;
        this.f28450f = mediaQueueContainerMetadata;
        this.f28451g = i2;
        this.f28452h = list;
        this.f28453i = i3;
        this.f28454j = j;
    }
}
