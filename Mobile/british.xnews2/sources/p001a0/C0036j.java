package p001a0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.C0026i;
import p149t.C6079b;

/* renamed from: a0.j */
/* compiled from: NotificationCompatBuilder */
class C0036j implements C0025h {

    /* renamed from: a */
    private final Context f108a;

    /* renamed from: b */
    private final Notification.Builder f109b;

    /* renamed from: c */
    private final C0026i.C0034e f110c;

    /* renamed from: d */
    private RemoteViews f111d;

    /* renamed from: e */
    private RemoteViews f112e;

    /* renamed from: f */
    private final List<Bundle> f113f = new ArrayList();

    /* renamed from: g */
    private final Bundle f114g = new Bundle();

    /* renamed from: h */
    private int f115h;

    /* renamed from: i */
    private RemoteViews f116i;

    C0036j(C0026i.C0034e eVar) {
        Icon icon;
        List<String> list;
        List<String> e;
        this.f110c = eVar;
        this.f108a = eVar.f78a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f109b = new Notification.Builder(eVar.f78a, eVar.f67L);
        } else {
            this.f109b = new Notification.Builder(eVar.f78a);
        }
        Notification notification = eVar.f74S;
        this.f109b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f86i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f82e).setContentText(eVar.f83f).setContentInfo(eVar.f88k).setContentIntent(eVar.f84g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f85h, (notification.flags & 128) != 0).setLargeIcon(eVar.f87j).setNumber(eVar.f89l).setProgress(eVar.f98u, eVar.f99v, eVar.f100w);
        if (i < 21) {
            this.f109b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f109b.setSubText(eVar.f95r).setUsesChronometer(eVar.f92o).setPriority(eVar.f90m);
            Iterator<C0026i.C0027a> it = eVar.f79b.iterator();
            while (it.hasNext()) {
                m135b(it.next());
            }
            Bundle bundle = eVar.f60E;
            if (bundle != null) {
                this.f114g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f56A) {
                    this.f114g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f101x;
                if (str != null) {
                    this.f114g.putString("android.support.groupKey", str);
                    if (eVar.f102y) {
                        this.f114g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f114g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f103z;
                if (str2 != null) {
                    this.f114g.putString("android.support.sortKey", str2);
                }
            }
            this.f111d = eVar.f64I;
            this.f112e = eVar.f65J;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            this.f109b.setShowWhen(eVar.f91n);
        }
        if (i2 >= 19 && i2 < 21 && (e = m136e(m137g(eVar.f80c), eVar.f77V)) != null && !e.isEmpty()) {
            this.f114g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i2 >= 20) {
            this.f109b.setLocalOnly(eVar.f56A).setGroup(eVar.f101x).setGroupSummary(eVar.f102y).setSortKey(eVar.f103z);
            this.f115h = eVar.f71P;
        }
        if (i2 >= 21) {
            this.f109b.setCategory(eVar.f59D).setColor(eVar.f61F).setVisibility(eVar.f62G).setPublicVersion(eVar.f63H).setSound(notification.sound, notification.audioAttributes);
            if (i2 < 28) {
                list = m136e(m137g(eVar.f80c), eVar.f77V);
            } else {
                list = eVar.f77V;
            }
            if (list != null && !list.isEmpty()) {
                for (String addPerson : list) {
                    this.f109b.addPerson(addPerson);
                }
            }
            this.f116i = eVar.f66K;
            if (eVar.f81d.size() > 0) {
                Bundle bundle2 = eVar.mo75e().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i3 = 0; i3 < eVar.f81d.size(); i3++) {
                    bundle4.putBundle(Integer.toString(i3), C0037k.m144b(eVar.f81d.get(i3)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.mo75e().putBundle("android.car.EXTENSIONS", bundle2);
                this.f114g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = eVar.f76U) != null) {
            this.f109b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f109b.setExtras(eVar.f60E).setRemoteInputHistory(eVar.f97t);
            RemoteViews remoteViews = eVar.f64I;
            if (remoteViews != null) {
                this.f109b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f65J;
            if (remoteViews2 != null) {
                this.f109b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f66K;
            if (remoteViews3 != null) {
                this.f109b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f109b.setBadgeIconType(eVar.f68M).setSettingsText(eVar.f96s).setShortcutId(eVar.f69N).setTimeoutAfter(eVar.f70O).setGroupAlertBehavior(eVar.f71P);
            if (eVar.f58C) {
                this.f109b.setColorized(eVar.f57B);
            }
            if (!TextUtils.isEmpty(eVar.f67L)) {
                this.f109b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<C0045m> it2 = eVar.f80c.iterator();
            while (it2.hasNext()) {
                this.f109b.addPerson(it2.next().mo122h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f109b.setAllowSystemGeneratedContextualActions(eVar.f72Q);
            this.f109b.setBubbleMetadata(C0026i.C0033d.m87a(eVar.f73R));
        }
        if (eVar.f75T) {
            if (this.f110c.f102y) {
                this.f115h = 2;
            } else {
                this.f115h = 1;
            }
            this.f109b.setVibrate((long[]) null);
            this.f109b.setSound((Uri) null);
            int i6 = notification.defaults & -2;
            notification.defaults = i6;
            int i7 = i6 & -3;
            notification.defaults = i7;
            this.f109b.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f110c.f101x)) {
                    this.f109b.setGroup("silent");
                }
                this.f109b.setGroupAlertBehavior(this.f115h);
            }
        }
    }

    /* renamed from: b */
    private void m135b(C0026i.C0027a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat f = aVar.mo49f();
            if (i >= 23) {
                builder = new Notification.Action.Builder(f != null ? f.mo3121u() : null, aVar.mo53j(), aVar.mo44a());
            } else {
                builder = new Notification.Action.Builder(f != null ? f.mo3112g() : 0, aVar.mo53j(), aVar.mo44a());
            }
            if (aVar.mo50g() != null) {
                for (RemoteInput addRemoteInput : C0046n.m180b(aVar.mo50g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo47d() != null) {
                bundle = new Bundle(aVar.mo47d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo45b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo45b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo51h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo51h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo54k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo52i());
            builder.addExtras(bundle);
            this.f109b.addAction(builder.build());
        } else if (i >= 16) {
            this.f113f.add(C0037k.m148f(this.f109b, aVar));
        }
    }

    /* renamed from: e */
    private static List<String> m136e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6079b bVar = new C6079b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: g */
    private static List<String> m137g(List<C0045m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0045m g : list) {
            arrayList.add(g.mo121g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m138h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo43a() {
        return this.f109b;
    }

    /* renamed from: c */
    public Notification mo100c() {
        Bundle a;
        RemoteViews k;
        RemoteViews i;
        C0026i.C0035f fVar = this.f110c.f94q;
        if (fVar != null) {
            fVar.mo56b(this);
        }
        RemoteViews j = fVar != null ? fVar.mo97j(this) : null;
        Notification d = mo101d();
        if (j != null) {
            d.contentView = j;
        } else {
            RemoteViews remoteViews = this.f110c.f64I;
            if (remoteViews != null) {
                d.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 < 16 || fVar == null || (i = fVar.mo96i(this)) == null)) {
            d.bigContentView = i;
        }
        if (!(i2 < 21 || fVar == null || (k = this.f110c.f94q.mo98k(this)) == null)) {
            d.headsUpContentView = k;
        }
        if (!(i2 < 16 || fVar == null || (a = C0026i.m62a(d)) == null)) {
            fVar.mo60a(a);
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo101d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f109b.build();
        }
        if (i >= 24) {
            Notification build = this.f109b.build();
            if (this.f115h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f115h != 2)) {
                    m138h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f115h == 1) {
                    m138h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f109b.setExtras(this.f114g);
            Notification build2 = this.f109b.build();
            RemoteViews remoteViews = this.f111d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f112e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f116i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f115h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f115h != 2)) {
                    m138h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f115h == 1) {
                    m138h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f109b.setExtras(this.f114g);
            Notification build3 = this.f109b.build();
            RemoteViews remoteViews4 = this.f111d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f112e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f115h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f115h != 2)) {
                    m138h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f115h == 1) {
                    m138h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0037k.m143a(this.f113f);
            if (a != null) {
                this.f114g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f109b.setExtras(this.f114g);
            Notification build4 = this.f109b.build();
            RemoteViews remoteViews6 = this.f111d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f112e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f109b.getNotification();
        } else {
            Notification build5 = this.f109b.build();
            Bundle a2 = C0026i.m62a(build5);
            Bundle bundle = new Bundle(this.f114g);
            for (String str : this.f114g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0037k.m143a(this.f113f);
            if (a3 != null) {
                C0026i.m62a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f111d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f112e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo102f() {
        return this.f108a;
    }
}
