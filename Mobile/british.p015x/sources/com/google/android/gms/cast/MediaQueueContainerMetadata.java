package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p247r4.C10964b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new C7176o();

    /* renamed from: b */
    private int f28440b;

    /* renamed from: c */
    private String f28441c;

    /* renamed from: d */
    private List<MediaMetadata> f28442d;

    /* renamed from: e */
    private List<WebImage> f28443e;

    /* renamed from: f */
    private double f28444f;

    /* renamed from: com.google.android.gms.cast.MediaQueueContainerMetadata$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7084a {

        /* renamed from: a */
        private final MediaQueueContainerMetadata f28445a = new MediaQueueContainerMetadata((C7175n) null);

        @RecentlyNonNull
        /* renamed from: a */
        public MediaQueueContainerMetadata mo29299a() {
            return new MediaQueueContainerMetadata(this.f28445a, (C7175n) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final C7084a mo29300b(@RecentlyNonNull JSONObject jSONObject) {
            MediaQueueContainerMetadata.m29143I0(this.f28445a, jSONObject);
            return this;
        }
    }

    private MediaQueueContainerMetadata() {
        m29144J0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m29143I0(com.google.android.gms.cast.MediaQueueContainerMetadata r5, org.json.JSONObject r6) {
        /*
            r5.m29144J0()
            java.lang.String r0 = "containerType"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            int r1 = r0.hashCode()
            r2 = 6924225(0x69a7c1, float:9.702906E-39)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0026
            r2 = 828666841(0x316473d9, float:3.3244218E-9)
            if (r1 == r2) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r1 = "GENERIC_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            goto L_0x0031
        L_0x0026:
            java.lang.String r1 = "AUDIOBOOK_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            if (r0 == 0) goto L_0x0039
            if (r0 == r4) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r5.f28440b = r4
            goto L_0x003b
        L_0x0039:
            r5.f28440b = r3
        L_0x003b:
            java.lang.String r0 = "title"
            java.lang.String r0 = p244q4.C10920a.m49140c(r6, r0)
            r5.f28441c = r0
            java.lang.String r0 = "sections"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f28442d = r1
        L_0x0052:
            int r2 = r0.length()
            if (r3 >= r2) goto L_0x006c
            org.json.JSONObject r2 = r0.optJSONObject(r3)
            if (r2 == 0) goto L_0x0069
            com.google.android.gms.cast.MediaMetadata r4 = new com.google.android.gms.cast.MediaMetadata
            r4.<init>()
            r4.mo29285M0(r2)
            r1.add(r4)
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x006c:
            java.lang.String r0 = "containerImages"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f28443e = r1
            p247r4.C10964b.m49299a(r1, r0)
        L_0x007e:
            double r0 = r5.f28444f
            java.lang.String r2 = "containerDuration"
            double r0 = r6.optDouble(r2, r0)
            r5.f28444f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaQueueContainerMetadata.m29143I0(com.google.android.gms.cast.MediaQueueContainerMetadata, org.json.JSONObject):void");
    }

    /* renamed from: J0 */
    private final void m29144J0() {
        this.f28440b = 0;
        this.f28441c = null;
        this.f28442d = null;
        this.f28443e = null;
        this.f28444f = 0.0d;
    }

    /* renamed from: C0 */
    public double mo29290C0() {
        return this.f28444f;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public List<WebImage> mo29291D0() {
        List<WebImage> list = this.f28443e;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: E0 */
    public int mo29292E0() {
        return this.f28440b;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public List<MediaMetadata> mo29293F0() {
        List<MediaMetadata> list = this.f28442d;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29294G0() {
        return this.f28441c;
    }

    @RecentlyNonNull
    /* renamed from: H0 */
    public final JSONObject mo29295H0() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.f28440b;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f28441c)) {
                jSONObject.put("title", this.f28441c);
            }
            List<MediaMetadata> list = this.f28442d;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (MediaMetadata L0 : this.f28442d) {
                    jSONArray.put(L0.mo29284L0());
                }
                jSONObject.put("sections", jSONArray);
            }
            List<WebImage> list2 = this.f28443e;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", C10964b.m49300b(this.f28443e));
            }
            jSONObject.put("containerDuration", this.f28444f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.f28440b == mediaQueueContainerMetadata.f28440b && TextUtils.equals(this.f28441c, mediaQueueContainerMetadata.f28441c) && C7408m.m30028a(this.f28442d, mediaQueueContainerMetadata.f28442d) && C7408m.m30028a(this.f28443e, mediaQueueContainerMetadata.f28443e) && this.f28444f == mediaQueueContainerMetadata.f28444f;
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28440b), this.f28441c, this.f28442d, this.f28443e, Double.valueOf(this.f28444f));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, mo29292E0());
        C11058b.m49537w(parcel, 3, mo29294G0(), false);
        C11058b.m49510A(parcel, 4, mo29293F0(), false);
        C11058b.m49510A(parcel, 5, mo29291D0(), false);
        C11058b.m49522h(parcel, 6, mo29290C0());
        C11058b.m49516b(parcel, a);
    }

    MediaQueueContainerMetadata(int i, String str, List<MediaMetadata> list, List<WebImage> list2, double d) {
        this.f28440b = i;
        this.f28441c = str;
        this.f28442d = list;
        this.f28443e = list2;
        this.f28444f = d;
    }

    /* synthetic */ MediaQueueContainerMetadata(C7175n nVar) {
        m29144J0();
    }

    /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata, C7175n nVar) {
        this.f28440b = mediaQueueContainerMetadata.f28440b;
        this.f28441c = mediaQueueContainerMetadata.f28441c;
        this.f28442d = mediaQueueContainerMetadata.f28442d;
        this.f28443e = mediaQueueContainerMetadata.f28443e;
        this.f28444f = mediaQueueContainerMetadata.f28444f;
    }
}
