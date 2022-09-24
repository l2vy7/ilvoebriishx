package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p150t.C6077a;

/* renamed from: androidx.versionedparcelable.b */
/* compiled from: VersionedParcelParcel */
class C1367b extends C1366a {

    /* renamed from: d */
    private final SparseIntArray f6069d;

    /* renamed from: e */
    private final Parcel f6070e;

    /* renamed from: f */
    private final int f6071f;

    /* renamed from: g */
    private final int f6072g;

    /* renamed from: h */
    private final String f6073h;

    /* renamed from: i */
    private int f6074i;

    /* renamed from: j */
    private int f6075j;

    /* renamed from: k */
    private int f6076k;

    C1367b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6077a(), new C6077a(), new C6077a());
    }

    /* renamed from: A */
    public void mo6551A(byte[] bArr) {
        if (bArr != null) {
            this.f6070e.writeInt(bArr.length);
            this.f6070e.writeByteArray(bArr);
            return;
        }
        this.f6070e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6553C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6070e, 0);
    }

    /* renamed from: E */
    public void mo6555E(int i) {
        this.f6070e.writeInt(i);
    }

    /* renamed from: G */
    public void mo6557G(Parcelable parcelable) {
        this.f6070e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo6559I(String str) {
        this.f6070e.writeString(str);
    }

    /* renamed from: a */
    public void mo6564a() {
        int i = this.f6074i;
        if (i >= 0) {
            int i2 = this.f6069d.get(i);
            int dataPosition = this.f6070e.dataPosition();
            this.f6070e.setDataPosition(i2);
            this.f6070e.writeInt(dataPosition - i2);
            this.f6070e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1366a mo6565b() {
        Parcel parcel = this.f6070e;
        int dataPosition = parcel.dataPosition();
        int i = this.f6075j;
        if (i == this.f6071f) {
            i = this.f6072g;
        }
        int i2 = i;
        return new C1367b(parcel, dataPosition, i2, this.f6073h + "  ", this.f6066a, this.f6067b, this.f6068c);
    }

    /* renamed from: g */
    public boolean mo6567g() {
        return this.f6070e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo6569i() {
        int readInt = this.f6070e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6070e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo6571k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6070e);
    }

    /* renamed from: m */
    public boolean mo6573m(int i) {
        while (this.f6075j < this.f6072g) {
            int i2 = this.f6076k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f6070e.setDataPosition(this.f6075j);
            int readInt = this.f6070e.readInt();
            this.f6076k = this.f6070e.readInt();
            this.f6075j += readInt;
        }
        if (this.f6076k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo6575o() {
        return this.f6070e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo6577q() {
        return this.f6070e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo6579s() {
        return this.f6070e.readString();
    }

    /* renamed from: w */
    public void mo6583w(int i) {
        mo6564a();
        this.f6074i = i;
        this.f6069d.put(i, this.f6070e.dataPosition());
        mo6555E(0);
        mo6555E(i);
    }

    /* renamed from: y */
    public void mo6585y(boolean z) {
        this.f6070e.writeInt(z ? 1 : 0);
    }

    private C1367b(Parcel parcel, int i, int i2, String str, C6077a<String, Method> aVar, C6077a<String, Method> aVar2, C6077a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f6069d = new SparseIntArray();
        this.f6074i = -1;
        this.f6075j = 0;
        this.f6076k = -1;
        this.f6070e = parcel;
        this.f6071f = i;
        this.f6072g = i2;
        this.f6075j = i;
        this.f6073h = str;
    }
}
