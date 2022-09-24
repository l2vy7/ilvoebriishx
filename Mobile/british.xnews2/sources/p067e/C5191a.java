package p067e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* renamed from: e.a */
/* compiled from: ActivityResultContract */
public abstract class C5191a<I, O> {

    /* renamed from: e.a$a */
    /* compiled from: ActivityResultContract */
    public static final class C5192a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a */
        private final T f22664a;

        public C5192a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f22664a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T mo21379a() {
            return this.f22664a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo3632a(Context context, @SuppressLint({"UnknownNullness"}) I i);

    /* renamed from: b */
    public C5192a<O> mo21378b(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo3633c(int i, Intent intent);
}
