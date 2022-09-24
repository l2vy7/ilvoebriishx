package com.startapp;

/* renamed from: com.startapp.w1 */
/* compiled from: Sta */
public abstract class C12404w1<T> {

    /* renamed from: a */
    public volatile T f55021a;

    /* renamed from: a */
    public abstract T mo21238a();

    /* renamed from: b */
    public T mo46698b() {
        T t = this.f55021a;
        if (t == null) {
            synchronized (this) {
                t = this.f55021a;
                if (t == null) {
                    t = mo21238a();
                    this.f55021a = t;
                }
            }
        }
        return t;
    }
}
