package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: Sta */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a */
    public final transient String f54566a;

    /* renamed from: b */
    public final transient boolean f54567b;

    /* renamed from: c */
    public final transient boolean f54568c;

    /* renamed from: d */
    public final transient Set<String> f54569d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    /* compiled from: Sta */
    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a */
        public final transient String f54570a;

        private MainThreadComparator() {
            this.f54570a = Looper.getMainLooper().getThread().getName();
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str.startsWith(this.f54570a)) {
                return -1;
            }
            if (str2.startsWith(this.f54570a)) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    /* compiled from: Sta */
    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j, StackTraceElement stackTraceElement2) {
            this.skipBeforeAmount = j;
            this.stackTraceElement = stackTraceElement2;
        }

        /* renamed from: a */
        public long mo46228a() {
            return this.skipBeforeAmount;
        }

        /* renamed from: b */
        public StackTraceElement mo46229b() {
            return this.stackTraceElement;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.ThreadsState$b */
    /* compiled from: Sta */
    public static class C12280b {

        /* renamed from: a */
        public String f54571a;

        /* renamed from: b */
        public String f54572b;

        /* renamed from: c */
        public Set<String> f54573c;

        /* renamed from: d */
        public long f54574d;

        /* renamed from: e */
        public boolean f54575e;

        /* renamed from: f */
        public boolean f54576f;
    }

    public ThreadsState(C12280b bVar) {
        this.f54566a = bVar.f54571a;
        this.f54567b = bVar.f54575e;
        this.f54568c = bVar.f54576f;
        this.delay = bVar.f54574d;
        this.handlerDescription = bVar.f54572b;
        this.f54569d = bVar.f54573c;
        mo46221a();
    }

    /* renamed from: a */
    public final void mo46221a() {
        Thread thread = Looper.getMainLooper().getThread();
        String a = m53234a(thread);
        TreeMap treeMap = new TreeMap(new MainThreadComparator());
        boolean z = false;
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread2 = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
                ShrunkStackTraceElement[] b = mo46224b(stackTraceElementArr);
                if (b != null && b.length > 0) {
                    Thread.State state = thread2.getState();
                    if (thread2 == thread) {
                        if (!mo46222a(stackTraceElementArr)) {
                            z = true;
                            treeMap.put(a, b);
                        } else {
                            return;
                        }
                    } else if (!this.f54568c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(m53234a(thread2), b);
                    }
                } else if (thread2 == thread) {
                    return;
                }
            } else if (thread2 == thread) {
                return;
            }
        }
        if (!z) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b2 = mo46224b(stackTrace);
            if (b2 != null && b2.length > 0 && !mo46222a(stackTrace)) {
                treeMap.put(a, b2);
            } else {
                return;
            }
        }
        this.threadsStackTraces = treeMap;
    }

    /* renamed from: b */
    public long mo46223b() {
        return this.delay;
    }

    /* renamed from: c */
    public String mo46225c() {
        return this.handlerDescription;
    }

    /* renamed from: d */
    public Map<String, ShrunkStackTraceElement[]> mo46226d() {
        return this.threadsStackTraces;
    }

    /* renamed from: b */
    public final ShrunkStackTraceElement[] mo46224b(StackTraceElement[] stackTraceElementArr) {
        ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        String className;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        StackTraceElement stackTraceElement = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < stackTraceElementArr2.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr2[i];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z3 = i < 3;
                String str = this.f54566a;
                boolean z4 = str == null || className.startsWith(str);
                if (z4) {
                    z = true;
                }
                if (!this.f54567b || z4 || z3 || z2) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j, stackTraceElement));
                        stackTraceElement = null;
                        j = 0;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z2 = z4;
            }
            i++;
        }
        if (stackTraceElement != null) {
            shrunkStackTraceElementArr = null;
            arrayList.add(new ShrunkStackTraceElement(j + 1, (StackTraceElement) null));
        } else {
            shrunkStackTraceElementArr = null;
        }
        return z ? (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]) : shrunkStackTraceElementArr;
    }

    /* renamed from: a */
    public final boolean mo46222a(StackTraceElement[] stackTraceElementArr) {
        if (this.f54569d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (!(className == null || methodName == null)) {
                if (this.f54569d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m53234a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
