package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p080g1.C5267a;
import p085h1.C5374e;
import p090i1.C5435a;
import p090i1.C5436b;
import p090i1.C5437c;
import p090i1.C5443e;
import p090i1.C5444f;
import p095j1.C5499c;
import p109m.C5676a;

/* renamed from: androidx.room.i */
/* compiled from: RoomDatabase */
public abstract class C1199i {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
    @Deprecated
    protected List<C1201b> mCallbacks;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    @Deprecated
    protected volatile C5436b mDatabase;
    private final C1185f mInvalidationTracker = createInvalidationTracker();
    private C5437c mOpenHelper;
    private Executor mQueryExecutor;
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;

    /* renamed from: androidx.room.i$a */
    /* compiled from: RoomDatabase */
    public static class C1200a<T extends C1199i> {

        /* renamed from: a */
        private final Class<T> f5482a;

        /* renamed from: b */
        private final String f5483b;

        /* renamed from: c */
        private final Context f5484c;

        /* renamed from: d */
        private ArrayList<C1201b> f5485d;

        /* renamed from: e */
        private Executor f5486e;

        /* renamed from: f */
        private Executor f5487f;

        /* renamed from: g */
        private C5437c.C5441c f5488g;

        /* renamed from: h */
        private boolean f5489h;

        /* renamed from: i */
        private C1202c f5490i = C1202c.AUTOMATIC;

        /* renamed from: j */
        private boolean f5491j;

        /* renamed from: k */
        private boolean f5492k = true;

        /* renamed from: l */
        private boolean f5493l;

        /* renamed from: m */
        private final C1203d f5494m = new C1203d();

        /* renamed from: n */
        private Set<Integer> f5495n;

        /* renamed from: o */
        private Set<Integer> f5496o;

        /* renamed from: p */
        private String f5497p;

        /* renamed from: q */
        private File f5498q;

        C1200a(Context context, Class<T> cls, String str) {
            this.f5484c = context;
            this.f5482a = cls;
            this.f5483b = str;
        }

        /* renamed from: a */
        public C1200a<T> mo5918a(C1201b bVar) {
            if (this.f5485d == null) {
                this.f5485d = new ArrayList<>();
            }
            this.f5485d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C1200a<T> mo5919b(C5267a... aVarArr) {
            if (this.f5496o == null) {
                this.f5496o = new HashSet();
            }
            for (C5267a aVar : aVarArr) {
                this.f5496o.add(Integer.valueOf(aVar.f23286a));
                this.f5496o.add(Integer.valueOf(aVar.f23287b));
            }
            this.f5494m.mo5929b(aVarArr);
            return this;
        }

        /* renamed from: c */
        public C1200a<T> mo5920c() {
            this.f5489h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        public T mo5921d() {
            Executor executor;
            if (this.f5484c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f5482a != null) {
                Executor executor2 = this.f5486e;
                if (executor2 == null && this.f5487f == null) {
                    Executor d = C5676a.m25077d();
                    this.f5487f = d;
                    this.f5486e = d;
                } else if (executor2 != null && this.f5487f == null) {
                    this.f5487f = executor2;
                } else if (executor2 == null && (executor = this.f5487f) != null) {
                    this.f5486e = executor;
                }
                Set<Integer> set = this.f5496o;
                if (!(set == null || this.f5495n == null)) {
                    for (Integer next : set) {
                        if (this.f5495n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f5488g == null) {
                    this.f5488g = new C5499c();
                }
                String str = this.f5497p;
                if (!(str == null && this.f5498q == null)) {
                    if (this.f5483b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f5498q == null) {
                        this.f5488g = new C1210n(str, this.f5498q, this.f5488g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f5484c;
                String str2 = this.f5483b;
                C5437c.C5441c cVar = this.f5488g;
                C1203d dVar = this.f5494m;
                ArrayList<C1201b> arrayList = this.f5485d;
                boolean z = this.f5489h;
                C1202c b = this.f5490i.mo5928b(context);
                Executor executor3 = this.f5486e;
                Executor executor4 = this.f5487f;
                boolean z2 = this.f5491j;
                boolean z3 = this.f5492k;
                boolean z4 = this.f5493l;
                boolean z5 = z3;
                boolean z6 = z4;
                C1176a aVar = new C1176a(context, str2, cVar, dVar, arrayList, z, b, executor3, executor4, z2, z5, z6, this.f5495n, this.f5497p, this.f5498q);
                T t = (C1199i) C1198h.m6592b(this.f5482a, C1199i.DB_IMPL_SUFFIX);
                t.init(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: e */
        public C1200a<T> mo5922e() {
            this.f5492k = false;
            this.f5493l = true;
            return this;
        }

        /* renamed from: f */
        public C1200a<T> mo5923f(C5437c.C5441c cVar) {
            this.f5488g = cVar;
            return this;
        }

        /* renamed from: g */
        public C1200a<T> mo5924g(Executor executor) {
            this.f5486e = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.i$b */
    /* compiled from: RoomDatabase */
    public static abstract class C1201b {
        /* renamed from: a */
        public void mo5925a(C5436b bVar) {
        }

        /* renamed from: b */
        public void mo5926b(C5436b bVar) {
        }

        /* renamed from: c */
        public void mo5927c(C5436b bVar) {
        }
    }

    /* renamed from: androidx.room.i$c */
    /* compiled from: RoomDatabase */
    public enum C1202c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        private static boolean m6604a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        /* renamed from: b */
        public C1202c mo5928b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m6604a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.i$d */
    /* compiled from: RoomDatabase */
    public static class C1203d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C5267a>> f5503a = new HashMap<>();

        /* renamed from: a */
        private void m6606a(C5267a aVar) {
            int i = aVar.f23286a;
            int i2 = aVar.f23287b;
            TreeMap treeMap = this.f5503a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f5503a.put(Integer.valueOf(i), treeMap);
            }
            C5267a aVar2 = (C5267a) treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* renamed from: d */
        private List<C5267a> m6607d(List<C5267a> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f5503a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        /* renamed from: b */
        public void mo5929b(C5267a... aVarArr) {
            for (C5267a a : aVarArr) {
                m6606a(a);
            }
        }

        /* renamed from: c */
        public List<C5267a> mo5930c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m6607d(new ArrayList(), i2 > i, i, i2);
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        C5436b writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.mo5875n(writableDatabase);
        writableDatabase.mo21901z();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            try {
                writeLock.lock();
                this.mInvalidationTracker.mo5873k();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public C5444f compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().mo21891J(str);
    }

    /* access modifiers changed from: protected */
    public abstract C1185f createInvalidationTracker();

    /* access modifiers changed from: protected */
    public abstract C5437c createOpenHelper(C1176a aVar);

    @Deprecated
    public void endTransaction() {
        this.mOpenHelper.getWritableDatabase().mo21896a0();
        if (!inTransaction()) {
            this.mInvalidationTracker.mo5870f();
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    /* access modifiers changed from: package-private */
    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public C1185f getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public C5437c getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    /* access modifiers changed from: package-private */
    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().mo21898n0();
    }

    public void init(C1176a aVar) {
        C5437c createOpenHelper = createOpenHelper(aVar);
        this.mOpenHelper = createOpenHelper;
        if (createOpenHelper instanceof C1209m) {
            ((C1209m) createOpenHelper).mo5955d(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f5424g == C1202c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.mOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.mCallbacks = aVar.f5422e;
        this.mQueryExecutor = aVar.f5425h;
        this.mTransactionExecutor = new C1212p(aVar.f5426i);
        this.mAllowMainThreadQueries = aVar.f5423f;
        this.mWriteAheadLoggingEnabled = z;
        if (aVar.f5427j) {
            this.mInvalidationTracker.mo5872i(aVar.f5419b, aVar.f5420c);
        }
    }

    /* access modifiers changed from: protected */
    public void internalInitInvalidationTracker(C5436b bVar) {
        this.mInvalidationTracker.mo5868d(bVar);
    }

    public boolean isOpen() {
        C5436b bVar = this.mDatabase;
        return bVar != null && bVar.mo21899q();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().mo21897c0(new C5435a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().mo21893O();
    }

    public Cursor query(C5443e eVar) {
        return query(eVar, (CancellationSignal) null);
    }

    public Cursor query(C5443e eVar, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.mOpenHelper.getWritableDatabase().mo21897c0(eVar);
        }
        return this.mOpenHelper.getWritableDatabase().mo21892K(eVar, cancellationSignal);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            endTransaction();
            return call;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            C5374e.m24194a(e2);
            endTransaction();
            return null;
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }
}
