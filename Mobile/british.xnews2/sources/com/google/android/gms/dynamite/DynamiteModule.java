package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6485g;
import p198d5.C10487a;
import p198d5.C10489b;
import p202e5.C10513c;
import p202e5.C10514d;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class DynamiteModule {

    /* renamed from: b */
    public static final C7469b f29454b = new C7475d();

    /* renamed from: c */
    public static final C7469b f29455c = new C7476e();

    /* renamed from: d */
    public static final C7469b f29456d = new C7477f();

    /* renamed from: e */
    public static final C7469b f29457e = new C7478g();

    /* renamed from: f */
    public static final C7469b f29458f = new C7479h();

    /* renamed from: g */
    public static final C7469b f29459g = new C7480i();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static Boolean f29460h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    private static String f29461i = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: j */
    private static boolean f29462j = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: k */
    private static int f29463k = -1;

    /* renamed from: l */
    private static final ThreadLocal<C7482k> f29464l = new ThreadLocal<>();

    /* renamed from: m */
    private static final ThreadLocal<Long> f29465m = new C7473b();

    /* renamed from: n */
    private static final C7469b.C7470a f29466n = new C7474c();

    /* renamed from: o */
    public static final C7469b f29467o = new C7481j();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: p */
    private static C7484m f29468p;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: q */
    private static C7485n f29469q;

    /* renamed from: a */
    private final Context f29470a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class C7468a extends Exception {
        /* synthetic */ C7468a(String str, C10514d dVar) {
            super(str);
        }

        /* synthetic */ C7468a(String str, Throwable th, C10514d dVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7469b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public interface C7470a {
            /* renamed from: a */
            int mo30251a(Context context, String str, boolean z) throws C7468a;

            /* renamed from: b */
            int mo30252b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class C7471b {

            /* renamed from: a */
            public int f29471a = 0;

            /* renamed from: b */
            public int f29472b = 0;

            /* renamed from: c */
            public int f29473c = 0;
        }

        /* renamed from: a */
        C7471b mo30250a(Context context, String str, C7470a aVar) throws C7468a;
    }

    private DynamiteModule(Context context) {
        C4604n.m20098k(context);
        this.f29470a = context;
    }

    /* renamed from: a */
    public static int m30155a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C7408m.m30028a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m30156c(Context context, String str) {
        return m30158f(context, str, false);
    }

    /* renamed from: e */
    public static DynamiteModule m30157e(Context context, C7469b bVar, String str) throws C7468a {
        String str2;
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        C10487a aVar;
        C7485n nVar;
        Boolean valueOf;
        C10487a aVar2;
        Context context2 = context;
        C7469b bVar2 = bVar;
        String str3 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<C7482k> threadLocal = f29464l;
        C7482k kVar = threadLocal.get();
        C7482k kVar2 = new C7482k((C10513c) null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f29465m;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C7469b.C7471b a = bVar2.mo30250a(context2, str3, f29466n);
            int i2 = a.f29471a;
            int i3 = a.f29472b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str3);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str3);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a.f29473c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f29471a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f29472b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule h = m30160h(context2, str3);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.f29474a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(kVar);
                        return h;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f29472b;
                            try {
                                synchronized (cls) {
                                    bool = f29460h;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str3);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (cls) {
                                            nVar = f29469q;
                                        }
                                        if (nVar != null) {
                                            C7482k kVar3 = threadLocal.get();
                                            if (kVar3 == null || kVar3.f29474a == null) {
                                                throw new C7468a("No result cursor", (C10514d) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = kVar3.f29474a;
                                            C10489b.m48195m6(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f29463k >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVar2 = nVar.mo30263m6(C10489b.m48195m6(applicationContext), str3, i5, C10489b.m48195m6(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVar2 = nVar.mo30262f3(C10489b.m48195m6(applicationContext), str3, i5, C10489b.m48195m6(cursor2));
                                            }
                                            Context context3 = (Context) C10489b.m48194f3(aVar2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new C7468a("Failed to get module context", (C10514d) null);
                                            }
                                        } else {
                                            throw new C7468a("DynamiteLoaderV2 was not cached.", (C10514d) null);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str3);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        Log.i("DynamiteModule", sb3.toString());
                                        C7484m k = m30163k(context);
                                        if (k != null) {
                                            int zze = k.zze();
                                            if (zze >= 3) {
                                                C7482k kVar4 = threadLocal.get();
                                                if (kVar4 != null) {
                                                    aVar = k.mo30258o6(C10489b.m48195m6(context), str3, i5, C10489b.m48195m6(kVar4.f29474a));
                                                } else {
                                                    throw new C7468a("No cached result cursor holder", (C10514d) null);
                                                }
                                            } else if (zze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVar = k.mo30259p6(C10489b.m48195m6(context), str3, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVar = k.mo30257n6(C10489b.m48195m6(context), str3, i5);
                                            }
                                            if (C10489b.m48194f3(aVar) != null) {
                                                dynamiteModule = new DynamiteModule((Context) C10489b.m48194f3(aVar));
                                            } else {
                                                throw new C7468a("Failed to load remote module.", (C10514d) null);
                                            }
                                        } else {
                                            throw new C7468a("Failed to create IDynamiteLoader.", (C10514d) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = kVar2.f29474a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(kVar);
                                    return dynamiteModule;
                                }
                                throw new C7468a("Failed to determine which loading route to use.", (C10514d) null);
                            } catch (RemoteException e) {
                                throw new C7468a("Failed to load remote module.", e, (C10514d) null);
                            } catch (C7468a e2) {
                                throw e2;
                            } catch (Throwable th) {
                                C6485g.m28260a(context2, th);
                                throw new C7468a("Failed to load remote module.", th, (C10514d) null);
                            }
                        } catch (C7468a e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            if (valueOf2.length() != 0) {
                                str2 = "Failed to load remote module: ".concat(valueOf2);
                            } else {
                                str2 = new String("Failed to load remote module: ");
                            }
                            Log.w("DynamiteModule", str2);
                            int i6 = a.f29471a;
                            if (i6 != 0) {
                                if (bVar.mo30250a(context2, str3, new C7483l(i6, 0)).f29473c == -1) {
                                    DynamiteModule h2 = m30160h(context2, str3);
                                    if (i != 0) {
                                        f29465m.set(Long.valueOf(longValue));
                                    }
                                    return h2;
                                }
                            }
                            throw new C7468a("Remote load failed. No local fallback found.", e3, (C10514d) null);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(i4);
                        throw new C7468a(sb4.toString(), (C10514d) null);
                    }
                }
            }
            int i7 = a.f29471a;
            int i8 = a.f29472b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str3);
            sb5.append(" found. Local version is ");
            sb5.append(i7);
            sb5.append(" and remote version is ");
            sb5.append(i8);
            sb5.append(".");
            throw new C7468a(sb5.toString(), (C10514d) null);
        } finally {
            if (longValue == 0) {
                f29465m.remove();
            } else {
                f29465m.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = kVar2.f29474a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f29464l.set(kVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x003a=Splitter:B:18:0x003a, B:24:0x004a=Splitter:B:24:0x004a, B:43:0x008e=Splitter:B:43:0x008e} */
    /* renamed from: f */
    public static int m30158f(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r1 = f29460h     // Catch:{ all -> 0x01c4 }
            r2 = 0
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0037:
            m30161i(r4)     // Catch:{ a -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x003d:
            boolean r4 = f29462j     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x009b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            boolean r5 = r4.equals(r2)     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x004a
            goto L_0x009b
        L_0x004a:
            int r5 = m30159g(r9, r10, r11)     // Catch:{ a -> 0x0091 }
            java.lang.String r6 = f29461i     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x008e
            boolean r6 = r6.isEmpty()     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x0059
            goto L_0x008e
        L_0x0059:
            java.lang.ClassLoader r6 = p202e5.C10512b.m48242a()     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0091 }
            r7 = 29
            if (r6 < r7) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0091 }
            java.lang.String r7 = f29461i     // Catch:{ a -> 0x0091 }
            com.google.android.gms.common.internal.C4604n.m20098k(r7)     // Catch:{ a -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ a -> 0x0091 }
            goto L_0x0083
        L_0x0075:
            com.google.android.gms.dynamite.a r6 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x0091 }
            java.lang.String r7 = f29461i     // Catch:{ a -> 0x0091 }
            com.google.android.gms.common.internal.C4604n.m20098k(r7)     // Catch:{ a -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ a -> 0x0091 }
        L_0x0083:
            m30161i(r6)     // Catch:{ a -> 0x0091 }
            r1.set(r2, r6)     // Catch:{ a -> 0x0091 }
            f29460h = r4     // Catch:{ a -> 0x0091 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            return r5
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            return r5
        L_0x0091:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x009b:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00d0
        L_0x00a6:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r1 = move-exception
        L_0x00ae:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c4 }
            int r4 = r1.length()     // Catch:{ all -> 0x01c4 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01c4 }
            r5.append(r1)     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c4 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c4 }
        L_0x00d0:
            f29460h = r1     // Catch:{ all -> 0x01c4 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x0100
            int r9 = m30159g(r9, r10, r11)     // Catch:{ a -> 0x00df }
            return r9
        L_0x00df:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01c7 }
            int r2 = r10.length()     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01c7 }
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01c7 }
            r10.<init>(r0)     // Catch:{ all -> 0x01c7 }
        L_0x00fc:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01c7 }
            return r1
        L_0x0100:
            com.google.android.gms.dynamite.m r3 = m30163k(r9)     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x0108
            goto L_0x01bb
        L_0x0108:
            int r0 = r3.zze()     // Catch:{ RemoteException -> 0x0195 }
            r4 = 3
            if (r0 < r4) goto L_0x0170
            java.lang.ThreadLocal<com.google.android.gms.dynamite.k> r0 = f29464l     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.C7482k) r0     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            android.database.Cursor r0 = r0.f29474a     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            int r1 = r0.getInt(r1)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0123:
            d5.a r4 = p198d5.C10489b.m48195m6(r9)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.ThreadLocal<java.lang.Long> r0 = f29465m     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0195 }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x0195 }
            r5 = r10
            r6 = r11
            d5.a r10 = r3.mo30260q6(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r10 = p198d5.C10489b.m48194f3(r10)     // Catch:{ RemoteException -> 0x0195 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0195 }
            if (r10 == 0) goto L_0x015d
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 != 0) goto L_0x0148
            goto L_0x015d
        L_0x0148:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 <= 0) goto L_0x0155
            boolean r0 = m30162j(r10)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r10
        L_0x0156:
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x015b:
            r1 = r11
            goto L_0x01bb
        L_0x015d:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r10 == 0) goto L_0x01bb
            r10.close()     // Catch:{ all -> 0x01c7 }
            goto L_0x01bb
        L_0x016a:
            r11 = move-exception
            r2 = r10
            goto L_0x01be
        L_0x016d:
            r11 = move-exception
            r2 = r10
            goto L_0x0197
        L_0x0170:
            r4 = 2
            if (r0 != r4) goto L_0x0183
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0195 }
            d5.a r0 = p198d5.C10489b.m48195m6(r9)     // Catch:{ RemoteException -> 0x0195 }
            int r1 = r3.mo30256m6(r0, r10, r11)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0183:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0195 }
            d5.a r0 = p198d5.C10489b.m48195m6(r9)     // Catch:{ RemoteException -> 0x0195 }
            int r1 = r3.mo30255f3(r0, r10, r11)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0193:
            r11 = r10
            goto L_0x01be
        L_0x0195:
            r10 = move-exception
            r11 = r10
        L_0x0197:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01bc }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01bc }
            int r3 = r11.length()     // Catch:{ all -> 0x01bc }
            if (r3 == 0) goto L_0x01ae
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x01bc }
            goto L_0x01b3
        L_0x01ae:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01bc }
            r11.<init>(r0)     // Catch:{ all -> 0x01bc }
        L_0x01b3:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01bc }
            if (r2 == 0) goto L_0x01bb
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x01bb:
            return r1
        L_0x01bc:
            r10 = move-exception
            goto L_0x0193
        L_0x01be:
            if (r2 == 0) goto L_0x01c3
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x01c3:
            throw r11     // Catch:{ all -> 0x01c7 }
        L_0x01c4:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            throw r10     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r10 = move-exception
            p006a5.C6485g.m28260a(r9, r10)
            goto L_0x01cd
        L_0x01cc:
            throw r10
        L_0x01cd:
            goto L_0x01cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m30158f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m30159g(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.C7468a {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = f29465m     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r12.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r10 == 0) goto L_0x00a0
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009e }
            if (r11 == 0) goto L_0x00a0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009e }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009e }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f29461i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f29463k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f29462j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m30162j(r10)     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x008e:
            if (r11 != 0) goto L_0x0096
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            return r12
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            r11 = move-exception
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009e }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x00af:
            r10 = move-exception
            r11 = r10
            goto L_0x00c4
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.C7468a     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00ba
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            r0 = r10
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m30159g(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m30160h(Context context, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Selected local version of ".concat(valueOf);
        } else {
            str2 = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", str2);
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: i */
    private static void m30161i(ClassLoader classLoader) throws C7468a {
        C7485n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C7485n) {
                    nVar = (C7485n) queryLocalInterface;
                } else {
                    nVar = new C7485n(iBinder);
                }
            }
            f29469q = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C7468a("Failed to instantiate dynamite loader", e, (C10514d) null);
        }
    }

    /* renamed from: j */
    private static boolean m30162j(Cursor cursor) {
        C7482k kVar = f29464l.get();
        if (kVar == null || kVar.f29474a != null) {
            return false;
        }
        kVar.f29474a = cursor;
        return true;
    }

    /* renamed from: k */
    private static C7484m m30163k(Context context) {
        C7484m mVar;
        synchronized (DynamiteModule.class) {
            C7484m mVar2 = f29468p;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof C7484m ? (C7484m) queryLocalInterface : new C7484m(iBinder);
                }
                if (mVar != null) {
                    f29468p = mVar;
                    return mVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    /* renamed from: b */
    public Context mo30248b() {
        return this.f29470a;
    }

    /* renamed from: d */
    public IBinder mo30249d(String str) throws C7468a {
        try {
            return (IBinder) this.f29470a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C7468a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C10514d) null);
        }
    }
}
