package p001a0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import p180z.C6418b;
import p180z.C6419c;

/* renamed from: a0.i */
/* compiled from: NotificationCompat */
public class C0026i {

    /* renamed from: a0.i$a */
    /* compiled from: NotificationCompat */
    public static class C0027a {

        /* renamed from: a */
        final Bundle f32a;

        /* renamed from: b */
        private IconCompat f33b;

        /* renamed from: c */
        private final C0046n[] f34c;

        /* renamed from: d */
        private final C0046n[] f35d;

        /* renamed from: e */
        private boolean f36e;

        /* renamed from: f */
        boolean f37f;

        /* renamed from: g */
        private final int f38g;

        /* renamed from: h */
        private final boolean f39h;
        @Deprecated

        /* renamed from: i */
        public int f40i;

        /* renamed from: j */
        public CharSequence f41j;

        /* renamed from: k */
        public PendingIntent f42k;

        /* renamed from: a0.i$a$a */
        /* compiled from: NotificationCompat */
        public static final class C0028a {

            /* renamed from: a */
            private final IconCompat f43a;

            /* renamed from: b */
            private final CharSequence f44b;

            /* renamed from: c */
            private final PendingIntent f45c;

            /* renamed from: d */
            private boolean f46d;

            /* renamed from: e */
            private final Bundle f47e;

            /* renamed from: f */
            private ArrayList<C0046n> f48f;

            /* renamed from: g */
            private int f49g;

            /* renamed from: h */
            private boolean f50h;

            /* renamed from: i */
            private boolean f51i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0028a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m3325e((Resources) null, "", i) : null, charSequence, pendingIntent, new Bundle(), (C0046n[]) null, true, 0, true, false);
            }

            /* renamed from: b */
            private void m74b() {
                if (this.f51i) {
                    Objects.requireNonNull(this.f45c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public p001a0.C0026i.C0027a mo55a() {
                /*
                    r15 = this;
                    r15.m74b()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList<a0.n> r2 = r15.f48f
                    if (r2 == 0) goto L_0x002f
                    java.util.Iterator r2 = r2.iterator()
                L_0x0015:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x002f
                    java.lang.Object r3 = r2.next()
                    a0.n r3 = (p001a0.C0046n) r3
                    boolean r4 = r3.mo130j()
                    if (r4 == 0) goto L_0x002b
                    r0.add(r3)
                    goto L_0x0015
                L_0x002b:
                    r1.add(r3)
                    goto L_0x0015
                L_0x002f:
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L_0x0038
                    r10 = r3
                    goto L_0x0045
                L_0x0038:
                    int r2 = r0.size()
                    a0.n[] r2 = new p001a0.C0046n[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    a0.n[] r0 = (p001a0.C0046n[]) r0
                    r10 = r0
                L_0x0045:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L_0x004c
                    goto L_0x0059
                L_0x004c:
                    int r0 = r1.size()
                    a0.n[] r0 = new p001a0.C0046n[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    a0.n[] r3 = (p001a0.C0046n[]) r3
                L_0x0059:
                    r9 = r3
                    a0.i$a r0 = new a0.i$a
                    androidx.core.graphics.drawable.IconCompat r5 = r15.f43a
                    java.lang.CharSequence r6 = r15.f44b
                    android.app.PendingIntent r7 = r15.f45c
                    android.os.Bundle r8 = r15.f47e
                    boolean r11 = r15.f46d
                    int r12 = r15.f49g
                    boolean r13 = r15.f50h
                    boolean r14 = r15.f51i
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p001a0.C0026i.C0027a.C0028a.mo55a():a0.i$a");
            }

            private C0028a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0046n[] nVarArr, boolean z, int i, boolean z2, boolean z3) {
                ArrayList<C0046n> arrayList;
                this.f46d = true;
                this.f50h = true;
                this.f43a = iconCompat;
                this.f44b = C0034e.m88h(charSequence);
                this.f45c = pendingIntent;
                this.f47e = bundle;
                if (nVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(nVarArr));
                }
                this.f48f = arrayList;
                this.f46d = z;
                this.f49g = i;
                this.f50h = z2;
                this.f51i = z3;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0027a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3325e((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo44a() {
            return this.f42k;
        }

        /* renamed from: b */
        public boolean mo45b() {
            return this.f36e;
        }

        /* renamed from: c */
        public C0046n[] mo46c() {
            return this.f35d;
        }

        /* renamed from: d */
        public Bundle mo47d() {
            return this.f32a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo48e() {
            return this.f40i;
        }

        /* renamed from: f */
        public IconCompat mo49f() {
            int i;
            if (this.f33b == null && (i = this.f40i) != 0) {
                this.f33b = IconCompat.m3325e((Resources) null, "", i);
            }
            return this.f33b;
        }

        /* renamed from: g */
        public C0046n[] mo50g() {
            return this.f34c;
        }

        /* renamed from: h */
        public int mo51h() {
            return this.f38g;
        }

        /* renamed from: i */
        public boolean mo52i() {
            return this.f37f;
        }

        /* renamed from: j */
        public CharSequence mo53j() {
            return this.f41j;
        }

        /* renamed from: k */
        public boolean mo54k() {
            return this.f39h;
        }

        public C0027a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0046n[]) null, (C0046n[]) null, true, 0, true, false);
        }

        C0027a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0046n[] nVarArr, C0046n[] nVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f37f = true;
            this.f33b = iconCompat;
            if (iconCompat != null && iconCompat.mo3114l() == 2) {
                this.f40i = iconCompat.mo3112g();
            }
            this.f41j = C0034e.m88h(charSequence);
            this.f42k = pendingIntent;
            this.f32a = bundle == null ? new Bundle() : bundle;
            this.f34c = nVarArr;
            this.f35d = nVarArr2;
            this.f36e = z;
            this.f38g = i;
            this.f37f = z2;
            this.f39h = z3;
        }
    }

    /* renamed from: a0.i$b */
    /* compiled from: NotificationCompat */
    public static class C0029b extends C0035f {

        /* renamed from: e */
        private Bitmap f52e;

        /* renamed from: f */
        private IconCompat f53f;

        /* renamed from: g */
        private boolean f54g;

        /* renamed from: a0.i$b$a */
        /* compiled from: NotificationCompat */
        private static class C0030a {
            /* renamed from: a */
            static void m80a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m81b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: a0.i$b$b */
        /* compiled from: NotificationCompat */
        private static class C0031b {
            /* renamed from: a */
            static void m82a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: b */
        public void mo56b(C0025h hVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hVar.mo43a()).setBigContentTitle(this.f105b).bigPicture(this.f52e);
                if (this.f54g) {
                    IconCompat iconCompat = this.f53f;
                    Context context = null;
                    if (iconCompat == null) {
                        C0030a.m80a(bigPicture, (Bitmap) null);
                    } else if (i >= 23) {
                        if (hVar instanceof C0036j) {
                            context = ((C0036j) hVar).mo102f();
                        }
                        C0031b.m82a(bigPicture, this.f53f.mo3122v(context));
                    } else if (iconCompat.mo3114l() == 1) {
                        C0030a.m80a(bigPicture, this.f53f.mo3111f());
                    } else {
                        C0030a.m80a(bigPicture, (Bitmap) null);
                    }
                }
                if (this.f107d) {
                    C0030a.m81b(bigPicture, this.f106c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo57h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: m */
        public C0029b mo58m(Bitmap bitmap) {
            this.f53f = bitmap == null ? null : IconCompat.m3323c(bitmap);
            this.f54g = true;
            return this;
        }

        /* renamed from: n */
        public C0029b mo59n(Bitmap bitmap) {
            this.f52e = bitmap;
            return this;
        }
    }

    /* renamed from: a0.i$c */
    /* compiled from: NotificationCompat */
    public static class C0032c extends C0035f {

        /* renamed from: e */
        private CharSequence f55e;

        /* renamed from: a */
        public void mo60a(Bundle bundle) {
            super.mo60a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f55e);
            }
        }

        /* renamed from: b */
        public void mo56b(C0025h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.mo43a()).setBigContentTitle(this.f105b).bigText(this.f55e);
                if (this.f107d) {
                    bigText.setSummaryText(this.f106c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo57h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: m */
        public C0032c mo61m(CharSequence charSequence) {
            this.f55e = C0034e.m88h(charSequence);
            return this;
        }
    }

    /* renamed from: a0.i$d */
    /* compiled from: NotificationCompat */
    public static final class C0033d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m87a(C0033d dVar) {
            return null;
        }
    }

    /* renamed from: a0.i$f */
    /* compiled from: NotificationCompat */
    public static abstract class C0035f {

        /* renamed from: a */
        protected C0034e f104a;

        /* renamed from: b */
        CharSequence f105b;

        /* renamed from: c */
        CharSequence f106c;

        /* renamed from: d */
        boolean f107d = false;

        /* renamed from: e */
        private Bitmap m123e(int i, int i2, int i3) {
            return m124f(IconCompat.m3324d(this.f104a.f78a, i), i2, i3);
        }

        /* renamed from: f */
        private Bitmap m124f(IconCompat iconCompat, int i, int i2) {
            Drawable q = iconCompat.mo3117q(this.f104a.f78a);
            int intrinsicWidth = i2 == 0 ? q.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = q.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            q.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                q.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            q.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: g */
        private Bitmap m125g(int i, int i2, int i3, int i4) {
            int i5 = C6419c.f26360c;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap e = m123e(i5, i4, i2);
            Canvas canvas = new Canvas(e);
            Drawable mutate = this.f104a.f78a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e;
        }

        /* renamed from: a */
        public void mo60a(Bundle bundle) {
            if (this.f107d) {
                bundle.putCharSequence("android.summaryText", this.f106c);
            }
            CharSequence charSequence = this.f105b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h = mo57h();
            if (h != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h);
            }
        }

        /* renamed from: b */
        public abstract void mo56b(C0025h hVar);

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0206  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo94c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                a0.i$e r1 = r0.f104a
                android.content.Context r1 = r1.f78a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                a0.i$e r2 = r0.f104a
                android.content.Context r2 = r2.f78a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                a0.i$e r2 = r0.f104a
                int r2 = r2.mo76f()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x0052
                if (r11 >= r4) goto L_0x0052
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0044
                int r2 = p180z.C6420d.f26375M
                int r6 = p180z.C6419c.f26359b
                r8.setInt(r2, r5, r6)
                int r2 = p180z.C6420d.f26371I
                int r6 = p180z.C6419c.f26362e
                r8.setInt(r2, r5, r6)
                goto L_0x0052
            L_0x0044:
                int r2 = p180z.C6420d.f26375M
                int r6 = p180z.C6419c.f26358a
                r8.setInt(r2, r5, r6)
                int r2 = p180z.C6420d.f26371I
                int r6 = p180z.C6419c.f26361d
                r8.setInt(r2, r5, r6)
            L_0x0052:
                a0.i$e r2 = r0.f104a
                android.graphics.Bitmap r5 = r2.f87j
                r13 = 8
                if (r5 == 0) goto L_0x00b3
                if (r11 < r12) goto L_0x0069
                int r2 = p180z.C6420d.f26371I
                r8.setViewVisibility(r2, r10)
                a0.i$e r5 = r0.f104a
                android.graphics.Bitmap r5 = r5.f87j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x006e
            L_0x0069:
                int r2 = p180z.C6420d.f26371I
                r8.setViewVisibility(r2, r13)
            L_0x006e:
                if (r17 == 0) goto L_0x00f4
                a0.i$e r2 = r0.f104a
                android.app.Notification r2 = r2.f74S
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p180z.C6418b.f26354e
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = p180z.C6418b.f26355f
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x009e
                a0.i$e r3 = r0.f104a
                android.app.Notification r6 = r3.f74S
                int r6 = r6.icon
                int r3 = r3.mo74d()
                android.graphics.Bitmap r2 = r0.m125g(r6, r2, r5, r3)
                int r3 = p180z.C6420d.f26376N
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00ad
            L_0x009e:
                int r2 = p180z.C6420d.f26376N
                a0.i$e r5 = r0.f104a
                android.app.Notification r5 = r5.f74S
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo95d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00ad:
                int r2 = p180z.C6420d.f26376N
                r8.setViewVisibility(r2, r10)
                goto L_0x00f4
            L_0x00b3:
                if (r17 == 0) goto L_0x00f4
                android.app.Notification r2 = r2.f74S
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p180z.C6420d.f26371I
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00e7
                int r3 = p180z.C6418b.f26353d
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = p180z.C6418b.f26352c
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = p180z.C6418b.f26356g
                int r5 = r1.getDimensionPixelSize(r5)
                a0.i$e r6 = r0.f104a
                android.app.Notification r7 = r6.f74S
                int r7 = r7.icon
                int r6 = r6.mo74d()
                android.graphics.Bitmap r3 = r0.m125g(r7, r3, r5, r6)
                r8.setImageViewBitmap(r2, r3)
                goto L_0x00f4
            L_0x00e7:
                a0.i$e r5 = r0.f104a
                android.app.Notification r5 = r5.f74S
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo95d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00f4:
                a0.i$e r2 = r0.f104a
                java.lang.CharSequence r2 = r2.f82e
                if (r2 == 0) goto L_0x00ff
                int r3 = p180z.C6420d.f26393d0
                r8.setTextViewText(r3, r2)
            L_0x00ff:
                a0.i$e r2 = r0.f104a
                java.lang.CharSequence r2 = r2.f83f
                if (r2 == 0) goto L_0x010c
                int r3 = p180z.C6420d.f26387a0
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x010d
            L_0x010c:
                r2 = 0
            L_0x010d:
                if (r11 >= r4) goto L_0x0117
                a0.i$e r3 = r0.f104a
                android.graphics.Bitmap r3 = r3.f87j
                if (r3 == 0) goto L_0x0117
                r3 = 1
                goto L_0x0118
            L_0x0117:
                r3 = 0
            L_0x0118:
                a0.i$e r4 = r0.f104a
                java.lang.CharSequence r5 = r4.f88k
                if (r5 == 0) goto L_0x0129
                int r2 = p180z.C6420d.f26372J
                r8.setTextViewText(r2, r5)
                r8.setViewVisibility(r2, r10)
            L_0x0126:
                r14 = 1
                r15 = 1
                goto L_0x0164
            L_0x0129:
                int r4 = r4.f89l
                if (r4 <= 0) goto L_0x015d
                int r2 = p180z.C6421e.f26416a
                int r2 = r1.getInteger(r2)
                a0.i$e r3 = r0.f104a
                int r3 = r3.f89l
                if (r3 <= r2) goto L_0x0145
                int r2 = p180z.C6420d.f26372J
                int r3 = p180z.C6422f.f26417a
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x0157
            L_0x0145:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = p180z.C6420d.f26372J
                a0.i$e r4 = r0.f104a
                int r4 = r4.f89l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x0157:
                int r2 = p180z.C6420d.f26372J
                r8.setViewVisibility(r2, r10)
                goto L_0x0126
            L_0x015d:
                int r4 = p180z.C6420d.f26372J
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0164:
                a0.i$e r2 = r0.f104a
                java.lang.CharSequence r2 = r2.f95r
                if (r2 == 0) goto L_0x0186
                if (r11 < r12) goto L_0x0186
                int r3 = p180z.C6420d.f26387a0
                r8.setTextViewText(r3, r2)
                a0.i$e r2 = r0.f104a
                java.lang.CharSequence r2 = r2.f83f
                if (r2 == 0) goto L_0x0181
                int r3 = p180z.C6420d.f26389b0
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x0187
            L_0x0181:
                int r2 = p180z.C6420d.f26389b0
                r8.setViewVisibility(r2, r13)
            L_0x0186:
                r2 = 0
            L_0x0187:
                if (r2 == 0) goto L_0x01a3
                if (r11 < r12) goto L_0x01a3
                if (r19 == 0) goto L_0x0199
                int r2 = p180z.C6418b.f26357h
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = p180z.C6420d.f26387a0
                r8.setTextViewTextSize(r2, r10, r1)
            L_0x0199:
                int r3 = p180z.C6420d.f26373K
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                r2.setViewPadding(r3, r4, r5, r6, r7)
            L_0x01a3:
                a0.i$e r1 = r0.f104a
                long r1 = r1.mo77g()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01f5
                a0.i$e r1 = r0.f104a
                boolean r1 = r1.f92o
                if (r1 == 0) goto L_0x01e4
                if (r11 < r12) goto L_0x01e4
                int r1 = p180z.C6420d.f26370H
                r8.setViewVisibility(r1, r10)
                a0.i$e r2 = r0.f104a
                long r2 = r2.mo77g()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                a0.i$e r2 = r0.f104a
                boolean r2 = r2.f93p
                if (r2 == 0) goto L_0x01f6
                r3 = 24
                if (r11 < r3) goto L_0x01f6
                r8.setChronometerCountDown(r1, r2)
                goto L_0x01f6
            L_0x01e4:
                int r1 = p180z.C6420d.f26391c0
                r8.setViewVisibility(r1, r10)
                a0.i$e r2 = r0.f104a
                long r2 = r2.mo77g()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01f6
            L_0x01f5:
                r9 = r15
            L_0x01f6:
                int r1 = p180z.C6420d.f26377O
                if (r9 == 0) goto L_0x01fc
                r2 = 0
                goto L_0x01fe
            L_0x01fc:
                r2 = 8
            L_0x01fe:
                r8.setViewVisibility(r1, r2)
                int r1 = p180z.C6420d.f26374L
                if (r14 == 0) goto L_0x0206
                goto L_0x0208
            L_0x0206:
                r10 = 8
            L_0x0208:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p001a0.C0026i.C0035f.mo94c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public Bitmap mo95d(int i, int i2) {
            return m123e(i, i2, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo57h() {
            return null;
        }

        /* renamed from: i */
        public RemoteViews mo96i(C0025h hVar) {
            return null;
        }

        /* renamed from: j */
        public RemoteViews mo97j(C0025h hVar) {
            return null;
        }

        /* renamed from: k */
        public RemoteViews mo98k(C0025h hVar) {
            return null;
        }

        /* renamed from: l */
        public void mo99l(C0034e eVar) {
            if (this.f104a != eVar) {
                this.f104a = eVar;
                if (eVar != null) {
                    eVar.mo65D(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m62a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0037k.m145c(notification);
        }
        return null;
    }

    /* renamed from: a0.i$e */
    /* compiled from: NotificationCompat */
    public static class C0034e {

        /* renamed from: A */
        boolean f56A;

        /* renamed from: B */
        boolean f57B;

        /* renamed from: C */
        boolean f58C;

        /* renamed from: D */
        String f59D;

        /* renamed from: E */
        Bundle f60E;

        /* renamed from: F */
        int f61F;

        /* renamed from: G */
        int f62G;

        /* renamed from: H */
        Notification f63H;

        /* renamed from: I */
        RemoteViews f64I;

        /* renamed from: J */
        RemoteViews f65J;

        /* renamed from: K */
        RemoteViews f66K;

        /* renamed from: L */
        String f67L;

        /* renamed from: M */
        int f68M;

        /* renamed from: N */
        String f69N;

        /* renamed from: O */
        long f70O;

        /* renamed from: P */
        int f71P;

        /* renamed from: Q */
        boolean f72Q;

        /* renamed from: R */
        C0033d f73R;

        /* renamed from: S */
        Notification f74S;

        /* renamed from: T */
        boolean f75T;

        /* renamed from: U */
        Icon f76U;
        @Deprecated

        /* renamed from: V */
        public ArrayList<String> f77V;

        /* renamed from: a */
        public Context f78a;

        /* renamed from: b */
        public ArrayList<C0027a> f79b;

        /* renamed from: c */
        public ArrayList<C0045m> f80c;

        /* renamed from: d */
        ArrayList<C0027a> f81d;

        /* renamed from: e */
        CharSequence f82e;

        /* renamed from: f */
        CharSequence f83f;

        /* renamed from: g */
        PendingIntent f84g;

        /* renamed from: h */
        PendingIntent f85h;

        /* renamed from: i */
        RemoteViews f86i;

        /* renamed from: j */
        Bitmap f87j;

        /* renamed from: k */
        CharSequence f88k;

        /* renamed from: l */
        int f89l;

        /* renamed from: m */
        int f90m;

        /* renamed from: n */
        boolean f91n;

        /* renamed from: o */
        boolean f92o;

        /* renamed from: p */
        boolean f93p;

        /* renamed from: q */
        C0035f f94q;

        /* renamed from: r */
        CharSequence f95r;

        /* renamed from: s */
        CharSequence f96s;

        /* renamed from: t */
        CharSequence[] f97t;

        /* renamed from: u */
        int f98u;

        /* renamed from: v */
        int f99v;

        /* renamed from: w */
        boolean f100w;

        /* renamed from: x */
        String f101x;

        /* renamed from: y */
        boolean f102y;

        /* renamed from: z */
        String f103z;

        public C0034e(Context context, String str) {
            this.f79b = new ArrayList<>();
            this.f80c = new ArrayList<>();
            this.f81d = new ArrayList<>();
            this.f91n = true;
            this.f56A = false;
            this.f61F = 0;
            this.f62G = 0;
            this.f68M = 0;
            this.f71P = 0;
            Notification notification = new Notification();
            this.f74S = notification;
            this.f78a = context;
            this.f67L = str;
            notification.when = System.currentTimeMillis();
            this.f74S.audioStreamType = -1;
            this.f90m = 0;
            this.f77V = new ArrayList<>();
            this.f72Q = true;
        }

        /* renamed from: h */
        protected static CharSequence m88h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: i */
        private Bitmap m89i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f78a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C6418b.f26351b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C6418b.f26350a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        /* renamed from: t */
        private void m90t(int i, boolean z) {
            if (z) {
                Notification notification = this.f74S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f74S;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: A */
        public C0034e mo62A(boolean z) {
            this.f91n = z;
            return this;
        }

        /* renamed from: B */
        public C0034e mo63B(int i) {
            this.f74S.icon = i;
            return this;
        }

        /* renamed from: C */
        public C0034e mo64C(Uri uri) {
            Notification notification = this.f74S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: D */
        public C0034e mo65D(C0035f fVar) {
            if (this.f94q != fVar) {
                this.f94q = fVar;
                if (fVar != null) {
                    fVar.mo99l(this);
                }
            }
            return this;
        }

        /* renamed from: E */
        public C0034e mo66E(CharSequence charSequence) {
            this.f95r = m88h(charSequence);
            return this;
        }

        /* renamed from: F */
        public C0034e mo67F(CharSequence charSequence) {
            this.f74S.tickerText = m88h(charSequence);
            return this;
        }

        /* renamed from: G */
        public C0034e mo68G(boolean z) {
            this.f92o = z;
            return this;
        }

        /* renamed from: H */
        public C0034e mo69H(int i) {
            this.f62G = i;
            return this;
        }

        /* renamed from: I */
        public C0034e mo70I(long j) {
            this.f74S.when = j;
            return this;
        }

        /* renamed from: a */
        public C0034e mo71a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f79b.add(new C0027a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C0034e mo72b(C0027a aVar) {
            if (aVar != null) {
                this.f79b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification mo73c() {
            return new C0036j(this).mo100c();
        }

        /* renamed from: d */
        public int mo74d() {
            return this.f61F;
        }

        /* renamed from: e */
        public Bundle mo75e() {
            if (this.f60E == null) {
                this.f60E = new Bundle();
            }
            return this.f60E;
        }

        /* renamed from: f */
        public int mo76f() {
            return this.f90m;
        }

        /* renamed from: g */
        public long mo77g() {
            if (this.f91n) {
                return this.f74S.when;
            }
            return 0;
        }

        /* renamed from: j */
        public C0034e mo78j(boolean z) {
            m90t(16, z);
            return this;
        }

        /* renamed from: k */
        public C0034e mo79k(int i) {
            this.f68M = i;
            return this;
        }

        /* renamed from: l */
        public C0034e mo80l(String str) {
            this.f67L = str;
            return this;
        }

        /* renamed from: m */
        public C0034e mo81m(int i) {
            this.f61F = i;
            return this;
        }

        /* renamed from: n */
        public C0034e mo82n(boolean z) {
            this.f57B = z;
            this.f58C = true;
            return this;
        }

        /* renamed from: o */
        public C0034e mo83o(PendingIntent pendingIntent) {
            this.f84g = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public C0034e mo84p(CharSequence charSequence) {
            this.f83f = m88h(charSequence);
            return this;
        }

        /* renamed from: q */
        public C0034e mo85q(CharSequence charSequence) {
            this.f82e = m88h(charSequence);
            return this;
        }

        /* renamed from: r */
        public C0034e mo86r(int i) {
            Notification notification = this.f74S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: s */
        public C0034e mo87s(PendingIntent pendingIntent) {
            this.f74S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: u */
        public C0034e mo88u(String str) {
            this.f101x = str;
            return this;
        }

        /* renamed from: v */
        public C0034e mo89v(Bitmap bitmap) {
            this.f87j = m89i(bitmap);
            return this;
        }

        /* renamed from: w */
        public C0034e mo90w(boolean z) {
            this.f56A = z;
            return this;
        }

        /* renamed from: x */
        public C0034e mo91x(boolean z) {
            m90t(2, z);
            return this;
        }

        /* renamed from: y */
        public C0034e mo92y(int i) {
            this.f90m = i;
            return this;
        }

        /* renamed from: z */
        public C0034e mo93z(int i, int i2, boolean z) {
            this.f98u = i;
            this.f99v = i2;
            this.f100w = z;
            return this;
        }

        @Deprecated
        public C0034e(Context context) {
            this(context, (String) null);
        }
    }
}
