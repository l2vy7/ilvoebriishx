package p148s3;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p148s3.C6048i;

@AutoValue
/* renamed from: s3.o */
/* compiled from: NetworkConnectionInfo */
public abstract class C6060o {

    @AutoValue.Builder
    /* renamed from: s3.o$a */
    /* compiled from: NetworkConnectionInfo */
    public static abstract class C6061a {
        /* renamed from: a */
        public abstract C6060o mo23246a();

        /* renamed from: b */
        public abstract C6061a mo23247b(C6062b bVar);

        /* renamed from: c */
        public abstract C6061a mo23248c(C6063c cVar);
    }

    /* renamed from: s3.o$b */
    /* compiled from: NetworkConnectionInfo */
    public enum C6062b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: x */
        private static final SparseArray<C6062b> f25216x = null;

        /* renamed from: b */
        private final int f25218b;

        static {
            C6062b bVar;
            C6062b bVar2;
            C6062b bVar3;
            C6062b bVar4;
            C6062b bVar5;
            C6062b bVar6;
            C6062b bVar7;
            C6062b bVar8;
            C6062b bVar9;
            C6062b bVar10;
            C6062b bVar11;
            C6062b bVar12;
            C6062b bVar13;
            C6062b bVar14;
            C6062b bVar15;
            C6062b bVar16;
            C6062b bVar17;
            C6062b bVar18;
            C6062b bVar19;
            C6062b bVar20;
            SparseArray<C6062b> sparseArray = new SparseArray<>();
            f25216x = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private C6062b(int i) {
            this.f25218b = i;
        }

        /* renamed from: a */
        public static C6062b m26667a(int i) {
            return f25216x.get(i);
        }

        /* renamed from: d */
        public int mo23251d() {
            return this.f25218b;
        }
    }

    /* renamed from: s3.o$c */
    /* compiled from: NetworkConnectionInfo */
    public enum C6063c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: v */
        private static final SparseArray<C6063c> f25238v = null;

        /* renamed from: b */
        private final int f25240b;

        static {
            C6063c cVar;
            C6063c cVar2;
            C6063c cVar3;
            C6063c cVar4;
            C6063c cVar5;
            C6063c cVar6;
            C6063c cVar7;
            C6063c cVar8;
            C6063c cVar9;
            C6063c cVar10;
            C6063c cVar11;
            C6063c cVar12;
            C6063c cVar13;
            C6063c cVar14;
            C6063c cVar15;
            C6063c cVar16;
            C6063c cVar17;
            C6063c cVar18;
            C6063c cVar19;
            SparseArray<C6063c> sparseArray = new SparseArray<>();
            f25238v = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private C6063c(int i) {
            this.f25240b = i;
        }

        /* renamed from: a */
        public static C6063c m26669a(int i) {
            return f25238v.get(i);
        }

        /* renamed from: d */
        public int mo23252d() {
            return this.f25240b;
        }
    }

    /* renamed from: a */
    public static C6061a m26661a() {
        return new C6048i.C6050b();
    }

    /* renamed from: b */
    public abstract C6062b mo23241b();

    /* renamed from: c */
    public abstract C6063c mo23242c();
}
