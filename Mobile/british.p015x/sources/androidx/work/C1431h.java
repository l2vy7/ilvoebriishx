package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.h */
/* compiled from: ForegroundInfo */
public final class C1431h {

    /* renamed from: a */
    private final int f6342a;

    /* renamed from: b */
    private final int f6343b;

    /* renamed from: c */
    private final Notification f6344c;

    public C1431h(int i, Notification notification, int i2) {
        this.f6342a = i;
        this.f6344c = notification;
        this.f6343b = i2;
    }

    /* renamed from: a */
    public int mo6912a() {
        return this.f6343b;
    }

    /* renamed from: b */
    public Notification mo6913b() {
        return this.f6344c;
    }

    /* renamed from: c */
    public int mo6914c() {
        return this.f6342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1431h.class != obj.getClass()) {
            return false;
        }
        C1431h hVar = (C1431h) obj;
        if (this.f6342a == hVar.f6342a && this.f6343b == hVar.f6343b) {
            return this.f6344c.equals(hVar.f6344c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6342a * 31) + this.f6343b) * 31) + this.f6344c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f6342a + ", mForegroundServiceType=" + this.f6343b + ", mNotification=" + this.f6344c + '}';
    }
}
