package p099k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p073f.C5246i;

/* renamed from: k.d */
/* compiled from: ContextThemeWrapper */
public class C5525d extends ContextWrapper {

    /* renamed from: a */
    private int f23963a;

    /* renamed from: b */
    private Resources.Theme f23964b;

    /* renamed from: c */
    private LayoutInflater f23965c;

    /* renamed from: d */
    private Configuration f23966d;

    /* renamed from: e */
    private Resources f23967e;

    public C5525d() {
        super((Context) null);
    }

    /* renamed from: b */
    private Resources m24641b() {
        if (this.f23967e == null) {
            Configuration configuration = this.f23966d;
            if (configuration == null) {
                this.f23967e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f23967e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f23966d);
                this.f23967e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f23967e;
    }

    /* renamed from: d */
    private void m24642d() {
        boolean z = this.f23964b == null;
        if (z) {
            this.f23964b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f23964b.setTo(theme);
            }
        }
        mo22018e(this.f23964b, this.f23963a, z);
    }

    /* renamed from: a */
    public void mo22015a(Configuration configuration) {
        if (this.f23967e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f23966d == null) {
            this.f23966d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo22017c() {
        return this.f23963a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22018e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m24641b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f23965c == null) {
            this.f23965c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f23965c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f23964b;
        if (theme != null) {
            return theme;
        }
        if (this.f23963a == 0) {
            this.f23963a = C5246i.f22979e;
        }
        m24642d();
        return this.f23964b;
    }

    public void setTheme(int i) {
        if (this.f23963a != i) {
            this.f23963a = i;
            m24642d();
        }
    }

    public C5525d(Context context, int i) {
        super(context);
        this.f23963a = i;
    }

    public C5525d(Context context, Resources.Theme theme) {
        super(context);
        this.f23964b = theme;
    }
}
