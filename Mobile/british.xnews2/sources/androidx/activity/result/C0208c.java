package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0015c;
import p067e.C5191a;

/* renamed from: androidx.activity.result.c */
/* compiled from: ActivityResultRegistry */
public abstract class C0208c {

    /* renamed from: a */
    private final AtomicInteger f541a = new AtomicInteger(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: b */
    private final Map<Integer, String> f542b = new HashMap();

    /* renamed from: c */
    private final Map<String, Integer> f543c = new HashMap();

    /* renamed from: d */
    private final transient Map<String, C0210b<?>> f544d = new HashMap();

    /* renamed from: e */
    private final Bundle f545e = new Bundle();

    /* renamed from: androidx.activity.result.c$a */
    /* compiled from: ActivityResultRegistry */
    class C0209a extends C0207b<I> {

        /* renamed from: a */
        final /* synthetic */ int f546a;

        /* renamed from: b */
        final /* synthetic */ C5191a f547b;

        /* renamed from: c */
        final /* synthetic */ String f548c;

        C0209a(int i, C5191a aVar, String str) {
            this.f546a = i;
            this.f547b = aVar;
            this.f548c = str;
        }

        /* renamed from: b */
        public void mo699b(I i, C0015c cVar) {
            C0208c.this.mo662e(this.f546a, this.f547b, i, cVar);
        }

        /* renamed from: c */
        public void mo700c() {
            C0208c.this.mo706j(this.f548c);
        }
    }

    /* renamed from: androidx.activity.result.c$b */
    /* compiled from: ActivityResultRegistry */
    private static class C0210b<O> {

        /* renamed from: a */
        final C0206a<O> f550a;

        /* renamed from: b */
        final C5191a<?, O> f551b;

        C0210b(C0206a<O> aVar, C5191a<?, O> aVar2) {
            this.f550a = aVar;
            this.f551b = aVar2;
        }
    }

    /* renamed from: a */
    private void m938a(int i, String str) {
        this.f542b.put(Integer.valueOf(i), str);
        this.f543c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m939d(String str, int i, Intent intent, C0210b<O> bVar) {
        C0206a<O> aVar;
        if (bVar == null || (aVar = bVar.f550a) == null) {
            this.f545e.putParcelable(str, new ActivityResult(i, intent));
        } else {
            aVar.mo697a(bVar.f551b.mo3633c(i, intent));
        }
    }

    /* renamed from: i */
    private int m940i(String str) {
        Integer num = this.f543c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int andIncrement = this.f541a.getAndIncrement();
        m938a(andIncrement, str);
        return andIncrement;
    }

    /* renamed from: b */
    public final boolean mo701b(int i, int i2, Intent intent) {
        String str = this.f542b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m939d(str, i2, intent, this.f544d.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean mo702c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        C0210b bVar;
        C0206a<O> aVar;
        String str = this.f542b.get(Integer.valueOf(i));
        if (str == null || (bVar = this.f544d.get(str)) == null || (aVar = bVar.f550a) == null) {
            return false;
        }
        aVar.mo697a(o);
        return true;
    }

    /* renamed from: e */
    public abstract <I, O> void mo662e(int i, C5191a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i2, C0015c cVar);

    /* renamed from: f */
    public final void mo703f(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    m938a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
                this.f541a.set(size);
                this.f545e.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    /* renamed from: g */
    public final void mo704g(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f542b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f542b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", this.f545e);
    }

    /* renamed from: h */
    public final <I, O> C0207b<I> mo705h(String str, C5191a<I, O> aVar, C0206a<O> aVar2) {
        int i = m940i(str);
        this.f544d.put(str, new C0210b(aVar2, aVar));
        ActivityResult activityResult = (ActivityResult) this.f545e.getParcelable(str);
        if (activityResult != null) {
            this.f545e.remove(str);
            aVar2.mo697a(aVar.mo3633c(activityResult.mo676b(), activityResult.mo675a()));
        }
        return new C0209a(i, aVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo706j(String str) {
        Integer remove = this.f543c.remove(str);
        if (remove != null) {
            this.f542b.remove(remove);
        }
        this.f544d.remove(str);
        if (this.f545e.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f545e.getParcelable(str));
            this.f545e.remove(str);
        }
    }
}
