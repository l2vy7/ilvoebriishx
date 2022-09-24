package p001a0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0600b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a0.p */
/* compiled from: TaskStackBuilder */
public final class C0048p implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f161b = new ArrayList<>();

    /* renamed from: c */
    private final Context f162c;

    /* renamed from: a0.p$a */
    /* compiled from: TaskStackBuilder */
    public interface C0049a {
        /* renamed from: f */
        Intent mo139f();
    }

    private C0048p(Context context) {
        this.f162c = context;
    }

    /* renamed from: e */
    public static C0048p m189e(Context context) {
        return new C0048p(context);
    }

    /* renamed from: a */
    public C0048p mo131a(Intent intent) {
        this.f161b.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0048p mo132b(Activity activity) {
        Intent f = activity instanceof C0049a ? ((C0049a) activity).mo139f() : null;
        if (f == null) {
            f = C0024g.m55a(activity);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(this.f162c.getPackageManager());
            }
            mo133c(component);
            mo131a(f);
        }
        return this;
    }

    /* renamed from: c */
    public C0048p mo133c(ComponentName componentName) {
        int size = this.f161b.size();
        try {
            Intent b = C0024g.m56b(this.f162c, componentName);
            while (b != null) {
                this.f161b.add(size, b);
                b = C0024g.m56b(this.f162c, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public PendingIntent mo134f(int i, int i2) {
        return mo135g(i, i2, (Bundle) null);
    }

    /* renamed from: g */
    public PendingIntent mo135g(int i, int i2, Bundle bundle) {
        if (!this.f161b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f161b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (Build.VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.f162c, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.f162c, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f161b.iterator();
    }

    /* renamed from: j */
    public void mo137j() {
        mo138q((Bundle) null);
    }

    /* renamed from: q */
    public void mo138q(Bundle bundle) {
        if (!this.f161b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f161b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0600b.m3299k(this.f162c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f162c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
