package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzapg implements Parcelable {
    public static final Parcelable.Creator<zzapg> CREATOR = new C8047pe();

    /* renamed from: A */
    public final int f42863A;

    /* renamed from: B */
    private int f42864B;

    /* renamed from: b */
    public final String f42865b;

    /* renamed from: c */
    public final int f42866c;

    /* renamed from: d */
    public final String f42867d;

    /* renamed from: e */
    public final zzatr f42868e;

    /* renamed from: f */
    public final String f42869f;

    /* renamed from: g */
    public final String f42870g;

    /* renamed from: h */
    public final int f42871h;

    /* renamed from: i */
    public final List<byte[]> f42872i;

    /* renamed from: j */
    public final zzarf f42873j;

    /* renamed from: k */
    public final int f42874k;

    /* renamed from: l */
    public final int f42875l;

    /* renamed from: m */
    public final float f42876m;

    /* renamed from: n */
    public final int f42877n;

    /* renamed from: o */
    public final float f42878o;

    /* renamed from: p */
    public final int f42879p;

    /* renamed from: q */
    public final byte[] f42880q;

    /* renamed from: r */
    public final zzaxe f42881r;

    /* renamed from: s */
    public final int f42882s;

    /* renamed from: t */
    public final int f42883t;

    /* renamed from: u */
    public final int f42884u;

    /* renamed from: v */
    public final int f42885v;

    /* renamed from: w */
    public final int f42886w;

    /* renamed from: x */
    public final long f42887x;

    /* renamed from: y */
    public final int f42888y;

    /* renamed from: z */
    public final String f42889z;

    zzapg(Parcel parcel) {
        this.f42865b = parcel.readString();
        this.f42869f = parcel.readString();
        this.f42870g = parcel.readString();
        this.f42867d = parcel.readString();
        this.f42866c = parcel.readInt();
        this.f42871h = parcel.readInt();
        this.f42874k = parcel.readInt();
        this.f42875l = parcel.readInt();
        this.f42876m = parcel.readFloat();
        this.f42877n = parcel.readInt();
        this.f42878o = parcel.readFloat();
        this.f42880q = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f42879p = parcel.readInt();
        this.f42881r = (zzaxe) parcel.readParcelable(zzaxe.class.getClassLoader());
        this.f42882s = parcel.readInt();
        this.f42883t = parcel.readInt();
        this.f42884u = parcel.readInt();
        this.f42885v = parcel.readInt();
        this.f42886w = parcel.readInt();
        this.f42888y = parcel.readInt();
        this.f42889z = parcel.readString();
        this.f42863A = parcel.readInt();
        this.f42887x = parcel.readLong();
        int readInt = parcel.readInt();
        this.f42872i = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f42872i.add(parcel.createByteArray());
        }
        this.f42873j = (zzarf) parcel.readParcelable(zzarf.class.getClassLoader());
        this.f42868e = (zzatr) parcel.readParcelable(zzatr.class.getClassLoader());
    }

    /* renamed from: h */
    public static zzapg m40612h(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzarf zzarf, int i5, String str4) {
        return m40613i(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List<byte[]>) null, zzarf, 0, str4, (zzatr) null);
    }

    /* renamed from: i */
    public static zzapg m40613i(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, zzarf zzarf, int i8, String str4, zzatr zzatr) {
        return new zzapg(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    /* renamed from: j */
    public static zzapg m40614j(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzarf zzarf) {
        return new zzapg(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    /* renamed from: k */
    public static zzapg m40615k(String str, String str2, String str3, int i, zzarf zzarf) {
        return new zzapg(str, (String) null, MimeTypes.APPLICATION_CAMERA_MOTION, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, zzarf, (zzatr) null);
    }

    /* renamed from: l */
    public static zzapg m40616l(String str, String str2, String str3, int i, int i2, String str4, int i3, zzarf zzarf, long j, List<byte[]> list) {
        return new zzapg(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzarf, (zzatr) null);
    }

    /* renamed from: m */
    public static zzapg m40617m(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzaxe zzaxe, zzarf zzarf) {
        return new zzapg(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzaxe, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    @TargetApi(16)
    /* renamed from: n */
    private static void m40618n(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public final int mo36184a() {
        int i;
        int i2 = this.f42874k;
        if (i2 == -1 || (i = this.f42875l) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat mo36185b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f42870g);
        String str = this.f42889z;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m40618n(mediaFormat, "max-input-size", this.f42871h);
        m40618n(mediaFormat, "width", this.f42874k);
        m40618n(mediaFormat, "height", this.f42875l);
        float f = this.f42876m;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m40618n(mediaFormat, "rotation-degrees", this.f42877n);
        m40618n(mediaFormat, "channel-count", this.f42882s);
        m40618n(mediaFormat, "sample-rate", this.f42883t);
        m40618n(mediaFormat, "encoder-delay", this.f42885v);
        m40618n(mediaFormat, "encoder-padding", this.f42886w);
        for (int i = 0; i < this.f42872i.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f42872i.get(i)));
        }
        zzaxe zzaxe = this.f42881r;
        if (zzaxe != null) {
            m40618n(mediaFormat, "color-transfer", zzaxe.f42911d);
            m40618n(mediaFormat, "color-standard", zzaxe.f42909b);
            m40618n(mediaFormat, "color-range", zzaxe.f42910c);
            byte[] bArr = zzaxe.f42912e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final zzapg mo36186d(zzarf zzarf) {
        String str = this.f42865b;
        return new zzapg(str, this.f42869f, this.f42870g, this.f42867d, this.f42866c, this.f42871h, this.f42874k, this.f42875l, this.f42876m, this.f42877n, this.f42878o, this.f42880q, this.f42879p, this.f42881r, this.f42882s, this.f42883t, this.f42884u, this.f42885v, this.f42886w, this.f42888y, this.f42889z, this.f42863A, this.f42887x, this.f42872i, zzarf, this.f42868e);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzapg mo36188e(int i, int i2) {
        String str = this.f42865b;
        return new zzapg(str, this.f42869f, this.f42870g, this.f42867d, this.f42866c, this.f42871h, this.f42874k, this.f42875l, this.f42876m, this.f42877n, this.f42878o, this.f42880q, this.f42879p, this.f42881r, this.f42882s, this.f42883t, this.f42884u, i, i2, this.f42888y, this.f42889z, this.f42863A, this.f42887x, this.f42872i, this.f42873j, this.f42868e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapg.class == obj.getClass()) {
            zzapg zzapg = (zzapg) obj;
            if (this.f42866c == zzapg.f42866c && this.f42871h == zzapg.f42871h && this.f42874k == zzapg.f42874k && this.f42875l == zzapg.f42875l && this.f42876m == zzapg.f42876m && this.f42877n == zzapg.f42877n && this.f42878o == zzapg.f42878o && this.f42879p == zzapg.f42879p && this.f42882s == zzapg.f42882s && this.f42883t == zzapg.f42883t && this.f42884u == zzapg.f42884u && this.f42885v == zzapg.f42885v && this.f42886w == zzapg.f42886w && this.f42887x == zzapg.f42887x && this.f42888y == zzapg.f42888y && C7836jm.m33653o(this.f42865b, zzapg.f42865b) && C7836jm.m33653o(this.f42889z, zzapg.f42889z) && this.f42863A == zzapg.f42863A && C7836jm.m33653o(this.f42869f, zzapg.f42869f) && C7836jm.m33653o(this.f42870g, zzapg.f42870g) && C7836jm.m33653o(this.f42867d, zzapg.f42867d) && C7836jm.m33653o(this.f42873j, zzapg.f42873j) && C7836jm.m33653o(this.f42868e, zzapg.f42868e) && C7836jm.m33653o(this.f42881r, zzapg.f42881r) && Arrays.equals(this.f42880q, zzapg.f42880q) && this.f42872i.size() == zzapg.f42872i.size()) {
                for (int i = 0; i < this.f42872i.size(); i++) {
                    if (!Arrays.equals(this.f42872i.get(i), zzapg.f42872i.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final zzapg mo36190f(int i) {
        String str = this.f42865b;
        return new zzapg(str, this.f42869f, this.f42870g, this.f42867d, this.f42866c, i, this.f42874k, this.f42875l, this.f42876m, this.f42877n, this.f42878o, this.f42880q, this.f42879p, this.f42881r, this.f42882s, this.f42883t, this.f42884u, this.f42885v, this.f42886w, this.f42888y, this.f42889z, this.f42863A, this.f42887x, this.f42872i, this.f42873j, this.f42868e);
    }

    /* renamed from: g */
    public final zzapg mo36191g(zzatr zzatr) {
        String str = this.f42865b;
        return new zzapg(str, this.f42869f, this.f42870g, this.f42867d, this.f42866c, this.f42871h, this.f42874k, this.f42875l, this.f42876m, this.f42877n, this.f42878o, this.f42880q, this.f42879p, this.f42881r, this.f42882s, this.f42883t, this.f42884u, this.f42885v, this.f42886w, this.f42888y, this.f42889z, this.f42863A, this.f42887x, this.f42872i, this.f42873j, zzatr);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f42864B;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f42865b;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f42869f;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.f42870g;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str4 = this.f42867d;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (((((((((((i11 + i4) * 31) + this.f42866c) * 31) + this.f42874k) * 31) + this.f42875l) * 31) + this.f42882s) * 31) + this.f42883t) * 31;
        String str5 = this.f42889z;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (((i12 + i5) * 31) + this.f42863A) * 31;
        zzarf zzarf = this.f42873j;
        if (zzarf == null) {
            i6 = 0;
        } else {
            i6 = zzarf.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        zzatr zzatr = this.f42868e;
        if (zzatr != null) {
            i8 = zzatr.hashCode();
        }
        int i15 = i14 + i8;
        this.f42864B = i15;
        return i15;
    }

    public final String toString() {
        String str = this.f42865b;
        String str2 = this.f42869f;
        String str3 = this.f42870g;
        int i = this.f42866c;
        String str4 = this.f42889z;
        int i2 = this.f42874k;
        int i3 = this.f42875l;
        float f = this.f42876m;
        int i4 = this.f42882s;
        int i5 = this.f42883t;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42865b);
        parcel.writeString(this.f42869f);
        parcel.writeString(this.f42870g);
        parcel.writeString(this.f42867d);
        parcel.writeInt(this.f42866c);
        parcel.writeInt(this.f42871h);
        parcel.writeInt(this.f42874k);
        parcel.writeInt(this.f42875l);
        parcel.writeFloat(this.f42876m);
        parcel.writeInt(this.f42877n);
        parcel.writeFloat(this.f42878o);
        parcel.writeInt(this.f42880q != null ? 1 : 0);
        byte[] bArr = this.f42880q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f42879p);
        parcel.writeParcelable(this.f42881r, i);
        parcel.writeInt(this.f42882s);
        parcel.writeInt(this.f42883t);
        parcel.writeInt(this.f42884u);
        parcel.writeInt(this.f42885v);
        parcel.writeInt(this.f42886w);
        parcel.writeInt(this.f42888y);
        parcel.writeString(this.f42889z);
        parcel.writeInt(this.f42863A);
        parcel.writeLong(this.f42887x);
        int size = this.f42872i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f42872i.get(i2));
        }
        parcel.writeParcelable(this.f42873j, 0);
        parcel.writeParcelable(this.f42868e, 0);
    }

    zzapg(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzaxe zzaxe, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzarf zzarf, zzatr zzatr) {
        this.f42865b = str;
        this.f42869f = str2;
        this.f42870g = str3;
        this.f42867d = str4;
        this.f42866c = i;
        this.f42871h = i2;
        this.f42874k = i3;
        this.f42875l = i4;
        this.f42876m = f;
        this.f42877n = i5;
        this.f42878o = f2;
        this.f42880q = bArr;
        this.f42879p = i6;
        this.f42881r = zzaxe;
        this.f42882s = i7;
        this.f42883t = i8;
        this.f42884u = i9;
        this.f42885v = i10;
        this.f42886w = i11;
        this.f42888y = i12;
        this.f42889z = str5;
        this.f42863A = i13;
        this.f42887x = j;
        this.f42872i = list == null ? Collections.emptyList() : list;
        this.f42873j = zzarf;
        this.f42868e = zzatr;
    }
}
