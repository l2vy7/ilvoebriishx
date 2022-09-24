package p005a4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p014b4.C1566a;
import p014b4.C1567b;
import p021c4.C2657a;
import p067d4.C5190a;
import p143r3.C5996b;
import p154t3.C6140g;
import p154t3.C6141h;
import p154t3.C6150m;
import p170w3.C6315a;

/* renamed from: a4.b0 */
/* compiled from: SQLiteEventStore */
public class C0073b0 implements C0078c, C1567b {

    /* renamed from: f */
    private static final C5996b f209f = C5996b.m26427b("proto");

    /* renamed from: b */
    private final C0093h0 f210b;

    /* renamed from: c */
    private final C2657a f211c;

    /* renamed from: d */
    private final C2657a f212d;

    /* renamed from: e */
    private final C0080d f213e;

    /* renamed from: a4.b0$b */
    /* compiled from: SQLiteEventStore */
    interface C0075b<T, U> {
        U apply(T t);
    }

    /* renamed from: a4.b0$c */
    /* compiled from: SQLiteEventStore */
    private static class C0076c {

        /* renamed from: a */
        final String f214a;

        /* renamed from: b */
        final String f215b;

        private C0076c(String str, String str2) {
            this.f214a = str;
            this.f215b = str2;
        }
    }

    /* renamed from: a4.b0$d */
    /* compiled from: SQLiteEventStore */
    interface C0077d<T> {
        /* renamed from: a */
        T mo231a();
    }

    C0073b0(C2657a aVar, C2657a aVar2, C0080d dVar, C0093h0 h0Var) {
        this.f210b = h0Var;
        this.f211c = aVar;
        this.f212d = aVar2;
        this.f213e = dVar;
    }

    /* renamed from: B */
    static /* synthetic */ Object m284B(C0073b0 b0Var, List list, C6150m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C6141h.C6142a k = C6141h.m26951a().mo23487j(cursor.getString(1)).mo23486i(cursor.getLong(2)).mo23488k(cursor.getLong(3));
            if (z) {
                k.mo23485h(new C6140g(m295b0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo23485h(new C6140g(m295b0(cursor.getString(4)), b0Var.m293Y(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo23484g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C0095i.m383a(j, mVar, k.mo23481d()));
        }
        return null;
    }

    /* renamed from: C */
    static /* synthetic */ Object m285C(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C0076c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: H */
    static /* synthetic */ Long m286H(C0073b0 b0Var, C6150m mVar, C6141h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.m304l()) {
            return -1L;
        }
        long e = b0Var.m298e(sQLiteDatabase, mVar);
        int e2 = b0Var.f213e.mo201e();
        byte[] a = hVar.mo23474e().mo23517a();
        boolean z = a.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(e));
        contentValues.put("transport_name", hVar.mo23478j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo23476f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo23479k()));
        contentValues.put("payload_encoding", hVar.mo23474e().mo23518b().mo23095a());
        contentValues.put("code", hVar.mo23473d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            double length = (double) a.length;
            double d = (double) e2;
            Double.isNaN(length);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(length / d);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e2, Math.min(i * e2, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : hVar.mo23525i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(MediationMetaData.KEY_NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: Q */
    static /* synthetic */ byte[] m287Q(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: R */
    static /* synthetic */ Object m288R(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: T */
    static /* synthetic */ Object m289T(long j, C6150m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.mo23503b(), String.valueOf(C5190a.m23550a(mVar.mo23505d()))}) < 1) {
            contentValues.put("backend_name", mVar.mo23503b());
            contentValues.put("priority", Integer.valueOf(C5190a.m23550a(mVar.mo23505d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public List<C0095i> m290U(SQLiteDatabase sQLiteDatabase, C6150m mVar) {
        ArrayList arrayList = new ArrayList();
        Long j = m302j(sQLiteDatabase, mVar);
        if (j == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m299e0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{j.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f213e.mo200d())), C0101n.m394a(this, arrayList, mVar));
        return arrayList;
    }

    /* renamed from: W */
    private Map<Long, Set<C0076c>> m291W(SQLiteDatabase sQLiteDatabase, List<C0095i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo214c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m299e0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), C0103p.m396a(hashMap));
        return hashMap;
    }

    /* renamed from: X */
    private static byte[] m292X(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: Y */
    private byte[] m293Y(long j) {
        return (byte[]) m299e0(mo227f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C0102o.m395a());
    }

    /* renamed from: Z */
    private <T> T m294Z(C0077d<T> dVar, C0075b<Throwable, T> bVar) {
        long a = this.f212d.mo9336a();
        while (true) {
            try {
                return dVar.mo231a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f212d.mo9336a() >= ((long) this.f213e.mo198b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: b0 */
    private static C5996b m295b0(String str) {
        if (str == null) {
            return f209f;
        }
        return C5996b.m26427b(str);
    }

    /* renamed from: d */
    private void m296d(SQLiteDatabase sQLiteDatabase) {
        m294Z(C0104q.m397b(sQLiteDatabase), C0105r.m399a());
    }

    /* renamed from: d0 */
    private static String m297d0(Iterable<C0095i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C0095i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo214c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: e */
    private long m298e(SQLiteDatabase sQLiteDatabase, C6150m mVar) {
        Long j = m302j(sQLiteDatabase, mVar);
        if (j != null) {
            return j.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.mo23503b());
        contentValues.put("priority", Integer.valueOf(C5190a.m23550a(mVar.mo23505d())));
        contentValues.put("next_request_ms", 0);
        if (mVar.mo23504c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.mo23504c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: e0 */
    private static <T> T m299e0(Cursor cursor, C0075b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: g */
    private long m300g() {
        return mo227f().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: h */
    private long m301h() {
        return mo227f().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: j */
    private Long m302j(SQLiteDatabase sQLiteDatabase, C6150m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{mVar.mo23503b(), String.valueOf(C5190a.m23550a(mVar.mo23505d()))}));
        if (mVar.mo23504c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.mo23504c(), 0));
        }
        return (Long) m299e0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C0111x.m406a());
    }

    /* renamed from: k */
    private <T> T m303k(C0075b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase f = mo227f();
        f.beginTransaction();
        try {
            T apply = bVar.apply(f);
            f.setTransactionSuccessful();
            return apply;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: l */
    private boolean m304l() {
        return m300g() * m301h() >= this.f213e.mo203f();
    }

    /* renamed from: m */
    private List<C0095i> m305m(List<C0095i> list, Map<Long, Set<C0076c>> map) {
        ListIterator<C0095i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C0095i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo214c()))) {
                C6141h.C6142a l = next.mo213b().mo23526l();
                for (C0076c cVar : map.get(Long.valueOf(next.mo214c()))) {
                    l.mo23529c(cVar.f214a, cVar.f215b);
                }
                listIterator.set(C0095i.m383a(next.mo214c(), next.mo215d(), l.mo23481d()));
            }
        }
        return list;
    }

    /* renamed from: p */
    static /* synthetic */ Object m308p(Throwable th) {
        throw new C1566a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: r */
    static /* synthetic */ SQLiteDatabase m309r(Throwable th) {
        throw new C1566a("Timed out while trying to open db.", th);
    }

    /* renamed from: s */
    static /* synthetic */ Long m310s(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: t */
    static /* synthetic */ Long m311t(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: u */
    static /* synthetic */ Boolean m312u(C0073b0 b0Var, C6150m mVar, SQLiteDatabase sQLiteDatabase) {
        Long j = b0Var.m302j(sQLiteDatabase, mVar);
        if (j == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m299e0(b0Var.mo227f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{j.toString()}), C0108u.m403a());
    }

    /* renamed from: v */
    static /* synthetic */ List m313v(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C6150m.m26992a().mo23509b(cursor.getString(1)).mo23511d(C5190a.m23551b(cursor.getInt(2))).mo23510c(m292X(cursor.getString(3))).mo23508a());
        }
        return arrayList;
    }

    /* renamed from: w */
    static /* synthetic */ List m314w(SQLiteDatabase sQLiteDatabase) {
        return (List) m299e0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C0107t.m402a());
    }

    /* renamed from: B0 */
    public long mo219B0(C6150m mVar) {
        return ((Long) m299e0(mo227f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.mo23503b(), String.valueOf(C5190a.m23550a(mVar.mo23505d()))}), C0113z.m408a())).longValue();
    }

    /* renamed from: D */
    public int mo220D() {
        return ((Integer) m303k(C0100m.m393a(this.f211c.mo9336a() - this.f213e.mo199c()))).intValue();
    }

    /* renamed from: E */
    public void mo221E(Iterable<C0095i> iterable) {
        if (iterable.iterator().hasNext()) {
            mo227f().compileStatement("DELETE FROM events WHERE _id in " + m297d0(iterable)).execute();
        }
    }

    /* renamed from: L */
    public Iterable<C6150m> mo222L() {
        return (Iterable) m303k(C0099l.m392a());
    }

    /* renamed from: M */
    public Iterable<C0095i> mo223M(C6150m mVar) {
        return (Iterable) m303k(C0098k.m391a(this, mVar));
    }

    /* renamed from: b */
    public C0095i mo224b(C6150m mVar, C6141h hVar) {
        C6315a.m27821b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.mo23505d(), hVar.mo23478j(), mVar.mo23503b());
        long longValue = ((Long) m303k(C0110w.m405a(this, mVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C0095i.m383a(longValue, mVar, hVar);
    }

    /* renamed from: c */
    public <T> T mo225c(C1567b.C1568a<T> aVar) {
        SQLiteDatabase f = mo227f();
        m296d(f);
        try {
            T a = aVar.mo7115a();
            f.setTransactionSuccessful();
            return a;
        } finally {
            f.endTransaction();
        }
    }

    public void close() {
        this.f210b.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public SQLiteDatabase mo227f() {
        C0093h0 h0Var = this.f210b;
        h0Var.getClass();
        return (SQLiteDatabase) m294Z(C0106s.m400b(h0Var), C0109v.m404a());
    }

    /* renamed from: s0 */
    public boolean mo228s0(C6150m mVar) {
        return ((Boolean) m303k(C0071a0.m280a(this, mVar))).booleanValue();
    }

    /* renamed from: w0 */
    public void mo229w0(Iterable<C0095i> iterable) {
        if (iterable.iterator().hasNext()) {
            m303k(C0112y.m407a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m297d0(iterable)));
        }
    }

    /* renamed from: y0 */
    public void mo230y0(C6150m mVar, long j) {
        m303k(C0097j.m390a(j, mVar));
    }
}
