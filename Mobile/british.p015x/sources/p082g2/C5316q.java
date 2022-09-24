package p082g2;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p065d2.C5154a;
import p065d2.C5159f;

/* renamed from: g2.q */
/* compiled from: GlideException */
public final class C5316q extends Exception {

    /* renamed from: h */
    private static final StackTraceElement[] f23470h = new StackTraceElement[0];

    /* renamed from: b */
    private final List<Throwable> f23471b;

    /* renamed from: c */
    private C5159f f23472c;

    /* renamed from: d */
    private C5154a f23473d;

    /* renamed from: e */
    private Class<?> f23474e;

    /* renamed from: f */
    private String f23475f;

    /* renamed from: g */
    private Exception f23476g;

    public C5316q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m23967a(Throwable th, List<Throwable> list) {
        if (th instanceof C5316q) {
            for (Throwable a : ((C5316q) th).mo21600e()) {
                m23967a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m23968b(List<Throwable> list, Appendable appendable) {
        try {
            m23969c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m23969c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C5316q) {
                ((C5316q) th).m23971h(appendable);
            } else {
                m23970d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m23970d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m23971h(Appendable appendable) {
        m23970d(this, appendable);
        m23968b(mo21600e(), new C5317a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo21600e() {
        return this.f23471b;
    }

    /* renamed from: f */
    public List<Throwable> mo21601f() {
        ArrayList arrayList = new ArrayList();
        m23967a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo21603g(String str) {
        List<Throwable> f = mo21601f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f23475f);
        String str3 = "";
        if (this.f23474e != null) {
            str = ", " + this.f23474e;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f23473d != null) {
            str2 = ", " + this.f23473d;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f23472c != null) {
            str3 = ", " + this.f23472c;
        }
        sb.append(str3);
        List<Throwable> f = mo21601f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" causes:");
        }
        for (Throwable next : f) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo21605i(C5159f fVar, C5154a aVar) {
        mo21606j(fVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo21606j(C5159f fVar, C5154a aVar, Class<?> cls) {
        this.f23472c = fVar;
        this.f23473d = aVar;
        this.f23474e = cls;
    }

    /* renamed from: k */
    public void mo21607k(Exception exc) {
        this.f23476g = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C5316q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m23971h(printStream);
    }

    public C5316q(String str, List<Throwable> list) {
        this.f23475f = str;
        setStackTrace(f23470h);
        this.f23471b = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m23971h(printWriter);
    }

    /* renamed from: g2.q$a */
    /* compiled from: GlideException */
    private static final class C5317a implements Appendable {

        /* renamed from: b */
        private final Appendable f23477b;

        /* renamed from: c */
        private boolean f23478c = true;

        C5317a(Appendable appendable) {
            this.f23477b = appendable;
        }

        /* renamed from: a */
        private CharSequence m23978a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f23478c) {
                this.f23478c = false;
                this.f23477b.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f23478c = z;
            this.f23477b.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m23978a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m23978a(charSequence);
            boolean z = false;
            if (this.f23478c) {
                this.f23478c = false;
                this.f23477b.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f23478c = z;
            this.f23477b.append(a, i, i2);
            return this;
        }
    }
}
