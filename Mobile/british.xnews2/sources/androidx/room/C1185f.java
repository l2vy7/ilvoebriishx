package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p090i1.C5435a;
import p090i1.C5436b;
import p090i1.C5444f;
import p115n.C5762b;

/* renamed from: androidx.room.f */
/* compiled from: InvalidationTracker */
public class C1185f {

    /* renamed from: m */
    private static final String[] f5437m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f5438a;

    /* renamed from: b */
    final String[] f5439b;

    /* renamed from: c */
    private Map<String, Set<String>> f5440c;

    /* renamed from: d */
    final C1199i f5441d;

    /* renamed from: e */
    AtomicBoolean f5442e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f5443f = false;

    /* renamed from: g */
    volatile C5444f f5444g;

    /* renamed from: h */
    private C1187b f5445h;

    /* renamed from: i */
    private final C1184e f5446i;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j */
    final C5762b<C1188c, C1189d> f5447j = new C5762b<>();

    /* renamed from: k */
    private C1190g f5448k;

    /* renamed from: l */
    Runnable f5449l = new C1186a();

    /* renamed from: androidx.room.f$a */
    /* compiled from: InvalidationTracker */
    class C1186a implements Runnable {
        C1186a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m6578a() {
            HashSet hashSet = new HashSet();
            Cursor query = C1185f.this.f5441d.query(new C5435a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                C1185f.this.f5444g.mo21908I();
            }
            return hashSet;
        }

        public void run() {
            C5436b writableDatabase;
            Lock closeLock = C1185f.this.f5441d.getCloseLock();
            Set<Integer> set = null;
            try {
                closeLock.lock();
                if (!C1185f.this.mo5867c()) {
                    closeLock.unlock();
                } else if (!C1185f.this.f5442e.compareAndSet(true, false)) {
                    closeLock.unlock();
                } else if (C1185f.this.f5441d.inTransaction()) {
                    closeLock.unlock();
                } else {
                    C1199i iVar = C1185f.this.f5441d;
                    if (iVar.mWriteAheadLoggingEnabled) {
                        writableDatabase = iVar.getOpenHelper().getWritableDatabase();
                        writableDatabase.mo21901z();
                        set = m6578a();
                        writableDatabase.mo21893O();
                        writableDatabase.mo21896a0();
                    } else {
                        set = m6578a();
                    }
                    closeLock.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C1185f.this.f5447j) {
                            Iterator<Map.Entry<C1188c, C1189d>> it = C1185f.this.f5447j.iterator();
                            while (it.hasNext()) {
                                ((C1189d) it.next().getValue()).mo5883a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    closeLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                writableDatabase.mo21896a0();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.f$b */
    /* compiled from: InvalidationTracker */
    static class C1187b {

        /* renamed from: a */
        final long[] f5451a;

        /* renamed from: b */
        final boolean[] f5452b;

        /* renamed from: c */
        final int[] f5453c;

        /* renamed from: d */
        boolean f5454d;

        /* renamed from: e */
        boolean f5455e;

        C1187b(int i) {
            long[] jArr = new long[i];
            this.f5451a = jArr;
            boolean[] zArr = new boolean[i];
            this.f5452b = zArr;
            this.f5453c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo5877a() {
            synchronized (this) {
                if (this.f5454d) {
                    if (!this.f5455e) {
                        int length = this.f5451a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f5451a[i] > 0;
                                boolean[] zArr = this.f5452b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f5453c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f5453c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f5455e = true;
                                this.f5454d = false;
                                int[] iArr2 = this.f5453c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5878b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5451a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f5454d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5879c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5451a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f5454d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5880d() {
            synchronized (this) {
                this.f5455e = false;
            }
        }
    }

    /* renamed from: androidx.room.f$c */
    /* compiled from: InvalidationTracker */
    public static abstract class C1188c {

        /* renamed from: a */
        final String[] f5456a;

        public C1188c(String[] strArr) {
            this.f5456a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5881a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo5882b(Set<String> set);
    }

    /* renamed from: androidx.room.f$d */
    /* compiled from: InvalidationTracker */
    static class C1189d {

        /* renamed from: a */
        final int[] f5457a;

        /* renamed from: b */
        private final String[] f5458b;

        /* renamed from: c */
        final C1188c f5459c;

        /* renamed from: d */
        private final Set<String> f5460d;

        C1189d(C1188c cVar, int[] iArr, String[] strArr) {
            this.f5459c = cVar;
            this.f5457a = iArr;
            this.f5458b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f5460d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f5460d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5883a(Set<Integer> set) {
            int length = this.f5457a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f5457a[i]))) {
                    if (length == 1) {
                        set2 = this.f5460d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f5458b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f5459c.mo5882b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5884b(String[] strArr) {
            Set<String> set = null;
            if (this.f5458b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f5458b[0])) {
                        set = this.f5460d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5458b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5459c.mo5882b(set);
            }
        }
    }

    public C1185f(C1199i iVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5441d = iVar;
        this.f5445h = new C1187b(strArr.length);
        this.f5438a = new HashMap<>();
        this.f5440c = map2;
        this.f5446i = new C1184e(iVar);
        int length = strArr.length;
        this.f5439b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5438a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f5439b[i] = str2.toLowerCase(locale);
            } else {
                this.f5439b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f5438a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f5438a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private static void m6564b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: h */
    private String[] m6565h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f5440c.containsKey(lowerCase)) {
                hashSet.addAll(this.f5440c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: j */
    private void m6566j(C5436b bVar, int i) {
        bVar.mo21890G("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f5439b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5437m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m6564b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.mo21890G(sb.toString());
        }
    }

    /* renamed from: l */
    private void m6567l(C5436b bVar, int i) {
        String str = this.f5439b[i];
        StringBuilder sb = new StringBuilder();
        for (String b : f5437m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m6564b(sb, str, b);
            bVar.mo21890G(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo5866a(C1188c cVar) {
        C1189d i;
        String[] h = m6565h(cVar.f5456a);
        int[] iArr = new int[h.length];
        int length = h.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = this.f5438a.get(h[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + h[i2]);
            }
        }
        C1189d dVar = new C1189d(cVar, iArr, h);
        synchronized (this.f5447j) {
            i = this.f5447j.mo22566i(cVar, dVar);
        }
        if (i == null && this.f5445h.mo5878b(iArr)) {
            mo5874m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5867c() {
        if (!this.f5441d.isOpen()) {
            return false;
        }
        if (!this.f5443f) {
            this.f5441d.getOpenHelper().getWritableDatabase();
        }
        if (this.f5443f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5868d(C5436b bVar) {
        synchronized (this) {
            if (this.f5443f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.mo21890G("PRAGMA temp_store = MEMORY;");
            bVar.mo21890G("PRAGMA recursive_triggers='ON';");
            bVar.mo21890G("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo5875n(bVar);
            this.f5444g = bVar.mo21891J("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f5443f = true;
        }
    }

    /* renamed from: e */
    public void mo5869e(String... strArr) {
        synchronized (this.f5447j) {
            Iterator<Map.Entry<C1188c, C1189d>> it = this.f5447j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C1188c) next.getKey()).mo5881a()) {
                    ((C1189d) next.getValue()).mo5884b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo5870f() {
        if (this.f5442e.compareAndSet(false, true)) {
            this.f5441d.getQueryExecutor().execute(this.f5449l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void mo5871g(C1188c cVar) {
        C1189d j;
        synchronized (this.f5447j) {
            j = this.f5447j.mo22567j(cVar);
        }
        if (j != null && this.f5445h.mo5879c(j.f5457a)) {
            mo5874m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5872i(Context context, String str) {
        this.f5448k = new C1190g(context, str, this, this.f5441d.getQueryExecutor());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5873k() {
        C1190g gVar = this.f5448k;
        if (gVar != null) {
            gVar.mo5885a();
            this.f5448k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5874m() {
        if (this.f5441d.isOpen()) {
            mo5875n(this.f5441d.getOpenHelper().getWritableDatabase());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5875n(C5436b bVar) {
        if (!bVar.mo21898n0()) {
            while (true) {
                try {
                    Lock closeLock = this.f5441d.getCloseLock();
                    closeLock.lock();
                    try {
                        int[] a = this.f5445h.mo5877a();
                        if (a == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.mo21901z();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m6566j(bVar, i);
                            } else if (i2 == 2) {
                                m6567l(bVar, i);
                            }
                        }
                        bVar.mo21893O();
                        bVar.mo21896a0();
                        this.f5445h.mo5880d();
                        closeLock.unlock();
                    } catch (Throwable th) {
                        closeLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }
}
