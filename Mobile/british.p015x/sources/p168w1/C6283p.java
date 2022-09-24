package p168w1;

import androidx.work.C1418a;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1483m;
import androidx.work.C1494q;
import androidx.work.C1501w;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p121o.C5857a;

/* renamed from: w1.p */
/* compiled from: WorkSpec */
public final class C6283p {

    /* renamed from: s */
    private static final String f25939s = C1483m.m7773f("WorkSpec");

    /* renamed from: t */
    public static final C5857a<List<C6286c>, List<C1501w>> f25940t = new C6284a();

    /* renamed from: a */
    public String f25941a;

    /* renamed from: b */
    public C1501w.C1502a f25942b = C1501w.C1502a.ENQUEUED;

    /* renamed from: c */
    public String f25943c;

    /* renamed from: d */
    public String f25944d;

    /* renamed from: e */
    public C1427e f25945e;

    /* renamed from: f */
    public C1427e f25946f;

    /* renamed from: g */
    public long f25947g;

    /* renamed from: h */
    public long f25948h;

    /* renamed from: i */
    public long f25949i;

    /* renamed from: j */
    public C1423c f25950j;

    /* renamed from: k */
    public int f25951k;

    /* renamed from: l */
    public C1418a f25952l;

    /* renamed from: m */
    public long f25953m;

    /* renamed from: n */
    public long f25954n;

    /* renamed from: o */
    public long f25955o;

    /* renamed from: p */
    public long f25956p;

    /* renamed from: q */
    public boolean f25957q;

    /* renamed from: r */
    public C1494q f25958r;

    /* renamed from: w1.p$a */
    /* compiled from: WorkSpec */
    class C6284a implements C5857a<List<C6286c>, List<C1501w>> {
        C6284a() {
        }

        /* renamed from: a */
        public List<C1501w> apply(List<C6286c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C6286c a : list) {
                arrayList.add(a.mo23981a());
            }
            return arrayList;
        }
    }

    /* renamed from: w1.p$b */
    /* compiled from: WorkSpec */
    public static class C6285b {

        /* renamed from: a */
        public String f25959a;

        /* renamed from: b */
        public C1501w.C1502a f25960b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6285b)) {
                return false;
            }
            C6285b bVar = (C6285b) obj;
            if (this.f25960b != bVar.f25960b) {
                return false;
            }
            return this.f25959a.equals(bVar.f25959a);
        }

        public int hashCode() {
            return (this.f25959a.hashCode() * 31) + this.f25960b.hashCode();
        }
    }

    /* renamed from: w1.p$c */
    /* compiled from: WorkSpec */
    public static class C6286c {

        /* renamed from: a */
        public String f25961a;

        /* renamed from: b */
        public C1501w.C1502a f25962b;

        /* renamed from: c */
        public C1427e f25963c;

        /* renamed from: d */
        public int f25964d;

        /* renamed from: e */
        public List<String> f25965e;

        /* renamed from: f */
        public List<C1427e> f25966f;

        /* renamed from: a */
        public C1501w mo23981a() {
            C1427e eVar;
            List<C1427e> list = this.f25966f;
            if (list == null || list.isEmpty()) {
                eVar = C1427e.f6331c;
            } else {
                eVar = this.f25966f.get(0);
            }
            return new C1501w(UUID.fromString(this.f25961a), this.f25962b, this.f25963c, this.f25965e, eVar, this.f25964d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6286c)) {
                return false;
            }
            C6286c cVar = (C6286c) obj;
            if (this.f25964d != cVar.f25964d) {
                return false;
            }
            String str = this.f25961a;
            if (str == null ? cVar.f25961a != null : !str.equals(cVar.f25961a)) {
                return false;
            }
            if (this.f25962b != cVar.f25962b) {
                return false;
            }
            C1427e eVar = this.f25963c;
            if (eVar == null ? cVar.f25963c != null : !eVar.equals(cVar.f25963c)) {
                return false;
            }
            List<String> list = this.f25965e;
            if (list == null ? cVar.f25965e != null : !list.equals(cVar.f25965e)) {
                return false;
            }
            List<C1427e> list2 = this.f25966f;
            List<C1427e> list3 = cVar.f25966f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f25961a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C1501w.C1502a aVar = this.f25962b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C1427e eVar = this.f25963c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f25964d) * 31;
            List<String> list = this.f25965e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C1427e> list2 = this.f25966f;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }
    }

    public C6283p(String str, String str2) {
        C1427e eVar = C1427e.f6331c;
        this.f25945e = eVar;
        this.f25946f = eVar;
        this.f25950j = C1423c.f6310i;
        this.f25952l = C1418a.EXPONENTIAL;
        this.f25953m = 30000;
        this.f25956p = -1;
        this.f25958r = C1494q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f25941a = str;
        this.f25943c = str2;
    }

    /* renamed from: a */
    public long mo23969a() {
        long j;
        boolean z = false;
        if (mo23971c()) {
            if (this.f25952l == C1418a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f25953m * ((long) this.f25951k);
            } else {
                j = (long) Math.scalb((float) this.f25953m, this.f25951k - 1);
            }
            return this.f25954n + Math.min(18000000, j);
        }
        long j2 = 0;
        if (mo23972d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f25954n;
            long j4 = j3 == 0 ? currentTimeMillis + this.f25947g : j3;
            long j5 = this.f25949i;
            long j6 = this.f25948h;
            if (j5 != j6) {
                z = true;
            }
            if (z) {
                if (j3 == 0) {
                    j2 = j5 * -1;
                }
                return j4 + j6 + j2;
            }
            if (j3 != 0) {
                j2 = j6;
            }
            return j4 + j2;
        }
        long j7 = this.f25954n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f25947g;
    }

    /* renamed from: b */
    public boolean mo23970b() {
        return !C1423c.f6310i.equals(this.f25950j);
    }

    /* renamed from: c */
    public boolean mo23971c() {
        return this.f25942b == C1501w.C1502a.ENQUEUED && this.f25951k > 0;
    }

    /* renamed from: d */
    public boolean mo23972d() {
        return this.f25948h != 0;
    }

    /* renamed from: e */
    public void mo23973e(long j) {
        if (j < 900000) {
            C1483m.m7771c().mo7017h(f25939s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j = 900000;
        }
        mo23975f(j, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6283p.class != obj.getClass()) {
            return false;
        }
        C6283p pVar = (C6283p) obj;
        if (this.f25947g != pVar.f25947g || this.f25948h != pVar.f25948h || this.f25949i != pVar.f25949i || this.f25951k != pVar.f25951k || this.f25953m != pVar.f25953m || this.f25954n != pVar.f25954n || this.f25955o != pVar.f25955o || this.f25956p != pVar.f25956p || this.f25957q != pVar.f25957q || !this.f25941a.equals(pVar.f25941a) || this.f25942b != pVar.f25942b || !this.f25943c.equals(pVar.f25943c)) {
            return false;
        }
        String str = this.f25944d;
        if (str == null ? pVar.f25944d != null : !str.equals(pVar.f25944d)) {
            return false;
        }
        if (this.f25945e.equals(pVar.f25945e) && this.f25946f.equals(pVar.f25946f) && this.f25950j.equals(pVar.f25950j) && this.f25952l == pVar.f25952l && this.f25958r == pVar.f25958r) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo23975f(long j, long j2) {
        if (j < 900000) {
            C1483m.m7771c().mo7017h(f25939s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j = 900000;
        }
        if (j2 < DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS) {
            C1483m.m7771c().mo7017h(f25939s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS)}), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            C1483m.m7771c().mo7017h(f25939s, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)}), new Throwable[0]);
            j2 = j;
        }
        this.f25948h = j;
        this.f25949i = j2;
    }

    public int hashCode() {
        int hashCode = ((((this.f25941a.hashCode() * 31) + this.f25942b.hashCode()) * 31) + this.f25943c.hashCode()) * 31;
        String str = this.f25944d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f25947g;
        long j2 = this.f25948h;
        long j3 = this.f25949i;
        long j4 = this.f25953m;
        long j5 = this.f25954n;
        long j6 = this.f25955o;
        long j7 = this.f25956p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f25945e.hashCode()) * 31) + this.f25946f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f25950j.hashCode()) * 31) + this.f25951k) * 31) + this.f25952l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f25957q ? 1 : 0)) * 31) + this.f25958r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f25941a + "}";
    }

    public C6283p(C6283p pVar) {
        C1427e eVar = C1427e.f6331c;
        this.f25945e = eVar;
        this.f25946f = eVar;
        this.f25950j = C1423c.f6310i;
        this.f25952l = C1418a.EXPONENTIAL;
        this.f25953m = 30000;
        this.f25956p = -1;
        this.f25958r = C1494q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f25941a = pVar.f25941a;
        this.f25943c = pVar.f25943c;
        this.f25942b = pVar.f25942b;
        this.f25944d = pVar.f25944d;
        this.f25945e = new C1427e(pVar.f25945e);
        this.f25946f = new C1427e(pVar.f25946f);
        this.f25947g = pVar.f25947g;
        this.f25948h = pVar.f25948h;
        this.f25949i = pVar.f25949i;
        this.f25950j = new C1423c(pVar.f25950j);
        this.f25951k = pVar.f25951k;
        this.f25952l = pVar.f25952l;
        this.f25953m = pVar.f25953m;
        this.f25954n = pVar.f25954n;
        this.f25955o = pVar.f25955o;
        this.f25956p = pVar.f25956p;
        this.f25957q = pVar.f25957q;
        this.f25958r = pVar.f25958r;
    }
}
