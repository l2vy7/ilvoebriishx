package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6489l;
import p244q4.C10920a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class TextTrackStyle extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new C7185x();

    /* renamed from: b */
    private float f28517b;

    /* renamed from: c */
    private int f28518c;

    /* renamed from: d */
    private int f28519d;

    /* renamed from: e */
    private int f28520e;

    /* renamed from: f */
    private int f28521f;

    /* renamed from: g */
    private int f28522g;

    /* renamed from: h */
    private int f28523h;

    /* renamed from: i */
    private int f28524i;

    /* renamed from: j */
    private String f28525j;

    /* renamed from: k */
    private int f28526k;

    /* renamed from: l */
    private int f28527l;

    /* renamed from: m */
    String f28528m;

    /* renamed from: n */
    private JSONObject f28529n;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, (String) null, -1, -1, (String) null);
    }

    /* renamed from: P0 */
    private static final int m29222P0(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: Q0 */
    private static final String m29223Q0(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    /* renamed from: C0 */
    public void mo29382C0(@RecentlyNonNull JSONObject jSONObject) throws JSONException {
        this.f28517b = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f28518c = m29222P0(jSONObject.optString("foregroundColor"));
        this.f28519d = m29222P0(jSONObject.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f28520e = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f28520e = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f28520e = 2;
            } else if ("RAISED".equals(string)) {
                this.f28520e = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f28520e = 4;
            }
        }
        this.f28521f = m29222P0(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f28522g = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f28522g = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f28522g = 2;
            }
        }
        this.f28523h = m29222P0(jSONObject.optString("windowColor"));
        if (this.f28522g == 2) {
            this.f28524i = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f28525j = C10920a.m49140c(jSONObject, TtmlNode.ATTR_TTS_FONT_FAMILY);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f28526k = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f28526k = 1;
            } else if ("SERIF".equals(string3)) {
                this.f28526k = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f28526k = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f28526k = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.f28526k = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.f28526k = 6;
            }
        }
        if (jSONObject.has(TtmlNode.ATTR_TTS_FONT_STYLE)) {
            String string4 = jSONObject.getString(TtmlNode.ATTR_TTS_FONT_STYLE);
            if ("NORMAL".equals(string4)) {
                this.f28527l = 0;
            } else if ("BOLD".equals(string4)) {
                this.f28527l = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f28527l = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f28527l = 3;
            }
        }
        this.f28529n = jSONObject.optJSONObject("customData");
    }

    /* renamed from: D0 */
    public int mo29383D0() {
        return this.f28519d;
    }

    /* renamed from: E0 */
    public int mo29384E0() {
        return this.f28521f;
    }

    /* renamed from: F0 */
    public int mo29385F0() {
        return this.f28520e;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29386G0() {
        return this.f28525j;
    }

    /* renamed from: H0 */
    public int mo29387H0() {
        return this.f28526k;
    }

    /* renamed from: I0 */
    public float mo29388I0() {
        return this.f28517b;
    }

    /* renamed from: J0 */
    public int mo29389J0() {
        return this.f28527l;
    }

    /* renamed from: K0 */
    public int mo29390K0() {
        return this.f28518c;
    }

    /* renamed from: L0 */
    public int mo29391L0() {
        return this.f28523h;
    }

    /* renamed from: M0 */
    public int mo29392M0() {
        return this.f28524i;
    }

    /* renamed from: N0 */
    public int mo29393N0() {
        return this.f28522g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.RecentlyNonNull
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo29394O0() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "fontScale"
            float r2 = r8.f28517b     // Catch:{ JSONException -> 0x00fb }
            double r2 = (double) r2     // Catch:{ JSONException -> 0x00fb }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00fb }
            int r1 = r8.f28518c     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x001a
            java.lang.String r2 = "foregroundColor"
            java.lang.String r1 = m29223Q0(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x001a:
            int r1 = r8.f28519d     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x0027
            java.lang.String r2 = "backgroundColor"
            java.lang.String r1 = m29223Q0(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x0027:
            int r1 = r8.f28520e     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "NONE"
            r3 = 3
            r4 = 1
            r5 = 2
            java.lang.String r6 = "edgeType"
            if (r1 == 0) goto L_0x0054
            if (r1 == r4) goto L_0x004e
            if (r1 == r5) goto L_0x0048
            if (r1 == r3) goto L_0x0042
            r7 = 4
            if (r1 == r7) goto L_0x003c
            goto L_0x0057
        L_0x003c:
            java.lang.String r1 = "DEPRESSED"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "RAISED"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0048:
            java.lang.String r1 = "DROP_SHADOW"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x004e:
            java.lang.String r1 = "OUTLINE"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0054:
            r0.put(r6, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x0057:
            int r1 = r8.f28521f     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x0064
            java.lang.String r6 = "edgeColor"
            java.lang.String r1 = m29223Q0(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x0064:
            int r1 = r8.f28522g     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r6 = "NORMAL"
            java.lang.String r7 = "windowType"
            if (r1 == 0) goto L_0x007b
            if (r1 == r4) goto L_0x0077
            if (r1 == r5) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            java.lang.String r1 = "ROUNDED_CORNERS"
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x007e
        L_0x0077:
            r0.put(r7, r6)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x007e
        L_0x007b:
            r0.put(r7, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x007e:
            int r1 = r8.f28523h     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = "windowColor"
            java.lang.String r1 = m29223Q0(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x008b:
            int r1 = r8.f28522g     // Catch:{ JSONException -> 0x00fb }
            if (r1 != r5) goto L_0x0096
            java.lang.String r1 = "windowRoundedCornerRadius"
            int r2 = r8.f28524i     // Catch:{ JSONException -> 0x00fb }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x0096:
            java.lang.String r1 = r8.f28525j     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x009f
            java.lang.String r2 = "fontFamily"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x009f:
            int r1 = r8.f28526k     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "fontGenericFamily"
            switch(r1) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00d0
        L_0x00a7:
            java.lang.String r1 = "SMALL_CAPITALS"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00ad:
            java.lang.String r1 = "CURSIVE"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00b3:
            java.lang.String r1 = "CASUAL"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00b9:
            java.lang.String r1 = "MONOSPACED_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00bf:
            java.lang.String r1 = "SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "MONOSPACED_SANS_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "SANS_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x00d0:
            int r1 = r8.f28527l     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "fontStyle"
            if (r1 == 0) goto L_0x00ef
            if (r1 == r4) goto L_0x00e9
            if (r1 == r5) goto L_0x00e3
            if (r1 == r3) goto L_0x00dd
            goto L_0x00f2
        L_0x00dd:
            java.lang.String r1 = "BOLD_ITALIC"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00e3:
            java.lang.String r1 = "ITALIC"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00e9:
            java.lang.String r1 = "BOLD"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00ef:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x00fb }
        L_0x00f2:
            org.json.JSONObject r1 = r8.f28529n     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x00fb
            java.lang.String r2 = "customData"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.TextTrackStyle.mo29394O0():org.json.JSONObject");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.f28529n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.f28529n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C6489l.m28274a(jSONObject, jSONObject2)) && this.f28517b == textTrackStyle.f28517b && this.f28518c == textTrackStyle.f28518c && this.f28519d == textTrackStyle.f28519d && this.f28520e == textTrackStyle.f28520e && this.f28521f == textTrackStyle.f28521f && this.f28522g == textTrackStyle.f28522g && this.f28523h == textTrackStyle.f28523h && this.f28524i == textTrackStyle.f28524i && C10920a.m49143f(this.f28525j, textTrackStyle.f28525j) && this.f28526k == textTrackStyle.f28526k && this.f28527l == textTrackStyle.f28527l;
    }

    public int hashCode() {
        return C7408m.m30029b(Float.valueOf(this.f28517b), Integer.valueOf(this.f28518c), Integer.valueOf(this.f28519d), Integer.valueOf(this.f28520e), Integer.valueOf(this.f28521f), Integer.valueOf(this.f28522g), Integer.valueOf(this.f28523h), Integer.valueOf(this.f28524i), this.f28525j, Integer.valueOf(this.f28526k), Integer.valueOf(this.f28527l), String.valueOf(this.f28529n));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28529n;
        this.f28528m = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49524j(parcel, 2, mo29388I0());
        C11058b.m49527m(parcel, 3, mo29390K0());
        C11058b.m49527m(parcel, 4, mo29383D0());
        C11058b.m49527m(parcel, 5, mo29385F0());
        C11058b.m49527m(parcel, 6, mo29384E0());
        C11058b.m49527m(parcel, 7, mo29393N0());
        C11058b.m49527m(parcel, 8, mo29391L0());
        C11058b.m49527m(parcel, 9, mo29392M0());
        C11058b.m49537w(parcel, 10, mo29386G0(), false);
        C11058b.m49527m(parcel, 11, mo29387H0());
        C11058b.m49527m(parcel, 12, mo29389J0());
        C11058b.m49537w(parcel, 13, this.f28528m, false);
        C11058b.m49516b(parcel, a);
    }

    TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f28517b = f;
        this.f28518c = i;
        this.f28519d = i2;
        this.f28520e = i3;
        this.f28521f = i4;
        this.f28522g = i5;
        this.f28523h = i6;
        this.f28524i = i7;
        this.f28525j = str;
        this.f28526k = i8;
        this.f28527l = i9;
        this.f28528m = str2;
        if (str2 != null) {
            try {
                this.f28529n = new JSONObject(str2);
            } catch (JSONException unused) {
                this.f28529n = null;
                this.f28528m = null;
            }
        } else {
            this.f28529n = null;
        }
    }
}
