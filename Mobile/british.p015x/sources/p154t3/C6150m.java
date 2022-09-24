package p154t3;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p143r3.C5998d;
import p154t3.C6132c;

@AutoValue
/* renamed from: t3.m */
/* compiled from: TransportContext */
public abstract class C6150m {

    @AutoValue.Builder
    /* renamed from: t3.m$a */
    /* compiled from: TransportContext */
    public static abstract class C6151a {
        /* renamed from: a */
        public abstract C6150m mo23508a();

        /* renamed from: b */
        public abstract C6151a mo23509b(String str);

        /* renamed from: c */
        public abstract C6151a mo23510c(byte[] bArr);

        /* renamed from: d */
        public abstract C6151a mo23511d(C5998d dVar);
    }

    /* renamed from: a */
    public static C6151a m26992a() {
        return new C6132c.C6134b().mo23511d(C5998d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo23503b();

    /* renamed from: c */
    public abstract byte[] mo23504c();

    /* renamed from: d */
    public abstract C5998d mo23505d();

    /* renamed from: e */
    public C6150m mo23534e(C5998d dVar) {
        return m26992a().mo23509b(mo23503b()).mo23511d(dVar).mo23510c(mo23504c()).mo23508a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo23503b();
        objArr[1] = mo23505d();
        objArr[2] = mo23504c() == null ? "" : Base64.encodeToString(mo23504c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
