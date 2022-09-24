package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.media.l */
/* compiled from: MediaRouteDescriptor */
public final class C0983l {

    /* renamed from: a */
    final Bundle f4505a;

    /* renamed from: b */
    List<String> f4506b;

    /* renamed from: c */
    List<IntentFilter> f4507c;

    C0983l(Bundle bundle) {
        this.f4505a = bundle;
    }

    /* renamed from: e */
    public static C0983l m5016e(Bundle bundle) {
        if (bundle != null) {
            return new C0983l(bundle);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo4602a() {
        return this.f4505a;
    }

    /* renamed from: b */
    public boolean mo4603b() {
        return this.f4505a.getBoolean("canDisconnect", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4604c() {
        if (this.f4507c == null) {
            ArrayList parcelableArrayList = this.f4505a.getParcelableArrayList("controlFilters");
            this.f4507c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f4507c = Collections.emptyList();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4605d() {
        if (this.f4506b == null) {
            ArrayList<String> stringArrayList = this.f4505a.getStringArrayList("groupMemberIds");
            this.f4506b = stringArrayList;
            if (stringArrayList == null) {
                this.f4506b = Collections.emptyList();
            }
        }
    }

    /* renamed from: f */
    public int mo4606f() {
        return this.f4505a.getInt("connectionState", 0);
    }

    /* renamed from: g */
    public List<IntentFilter> mo4607g() {
        mo4604c();
        return this.f4507c;
    }

    /* renamed from: h */
    public String mo4608h() {
        return this.f4505a.getString(IronSourceConstants.EVENTS_STATUS);
    }

    /* renamed from: i */
    public int mo4609i() {
        return this.f4505a.getInt("deviceType");
    }

    /* renamed from: j */
    public Bundle mo4610j() {
        return this.f4505a.getBundle("extras");
    }

    /* renamed from: k */
    public List<String> mo4611k() {
        mo4605d();
        return this.f4506b;
    }

    /* renamed from: l */
    public Uri mo4612l() {
        String string = this.f4505a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* renamed from: m */
    public String mo4613m() {
        return this.f4505a.getString(TtmlNode.ATTR_ID);
    }

    /* renamed from: n */
    public int mo4614n() {
        return this.f4505a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    /* renamed from: o */
    public int mo4615o() {
        return this.f4505a.getInt("minClientVersion", 1);
    }

    /* renamed from: p */
    public String mo4616p() {
        return this.f4505a.getString(MediationMetaData.KEY_NAME);
    }

    /* renamed from: q */
    public int mo4617q() {
        return this.f4505a.getInt("playbackStream", -1);
    }

    /* renamed from: r */
    public int mo4618r() {
        return this.f4505a.getInt("playbackType", 1);
    }

    /* renamed from: s */
    public int mo4619s() {
        return this.f4505a.getInt("presentationDisplayId", -1);
    }

    /* renamed from: t */
    public IntentSender mo4620t() {
        return (IntentSender) this.f4505a.getParcelable("settingsIntent");
    }

    public String toString() {
        return "MediaRouteDescriptor{ " + "id=" + mo4613m() + ", groupMemberIds=" + mo4611k() + ", name=" + mo4616p() + ", description=" + mo4608h() + ", iconUri=" + mo4612l() + ", isEnabled=" + mo4625x() + ", connectionState=" + mo4606f() + ", controlFilters=" + Arrays.toString(mo4607g().toArray()) + ", playbackType=" + mo4618r() + ", playbackStream=" + mo4617q() + ", deviceType=" + mo4609i() + ", volume=" + mo4622u() + ", volumeMax=" + mo4624w() + ", volumeHandling=" + mo4623v() + ", presentationDisplayId=" + mo4619s() + ", extras=" + mo4610j() + ", isValid=" + mo4626y() + ", minClientVersion=" + mo4615o() + ", maxClientVersion=" + mo4614n() + " }";
    }

    /* renamed from: u */
    public int mo4622u() {
        return this.f4505a.getInt("volume");
    }

    /* renamed from: v */
    public int mo4623v() {
        return this.f4505a.getInt("volumeHandling", 0);
    }

    /* renamed from: w */
    public int mo4624w() {
        return this.f4505a.getInt("volumeMax");
    }

    /* renamed from: x */
    public boolean mo4625x() {
        return this.f4505a.getBoolean("enabled", true);
    }

    /* renamed from: y */
    public boolean mo4626y() {
        mo4604c();
        return !TextUtils.isEmpty(mo4613m()) && !TextUtils.isEmpty(mo4616p()) && !this.f4507c.contains((Object) null);
    }

    /* renamed from: androidx.mediarouter.media.l$a */
    /* compiled from: MediaRouteDescriptor */
    public static final class C0984a {

        /* renamed from: a */
        private final Bundle f4508a;

        /* renamed from: b */
        private ArrayList<String> f4509b;

        /* renamed from: c */
        private ArrayList<IntentFilter> f4510c;

        public C0984a(String str, String str2) {
            this.f4508a = new Bundle();
            mo4639m(str);
            mo4640n(str2);
        }

        /* renamed from: a */
        public C0984a mo4627a(IntentFilter intentFilter) {
            if (intentFilter != null) {
                if (this.f4510c == null) {
                    this.f4510c = new ArrayList<>();
                }
                if (!this.f4510c.contains(intentFilter)) {
                    this.f4510c.add(intentFilter);
                }
                return this;
            }
            throw new IllegalArgumentException("filter must not be null");
        }

        /* renamed from: b */
        public C0984a mo4628b(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter a : collection) {
                        mo4627a(a);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        /* renamed from: c */
        public C0984a mo4629c(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f4509b == null) {
                    this.f4509b = new ArrayList<>();
                }
                if (!this.f4509b.contains(str)) {
                    this.f4509b.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("groupMemberId must not be empty");
        }

        /* renamed from: d */
        public C0984a mo4630d(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String c : collection) {
                        mo4629c(c);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("groupMemberIds must not be null");
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: e */
        public C0983l mo4631e() {
            ArrayList<IntentFilter> arrayList = this.f4510c;
            if (arrayList != null) {
                this.f4508a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f4509b;
            if (arrayList2 != null) {
                this.f4508a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new C0983l(this.f4508a);
        }

        /* renamed from: f */
        public C0984a mo4632f(boolean z) {
            this.f4508a.putBoolean("canDisconnect", z);
            return this;
        }

        /* renamed from: g */
        public C0984a mo4633g(int i) {
            this.f4508a.putInt("connectionState", i);
            return this;
        }

        /* renamed from: h */
        public C0984a mo4634h(String str) {
            this.f4508a.putString(IronSourceConstants.EVENTS_STATUS, str);
            return this;
        }

        /* renamed from: i */
        public C0984a mo4635i(int i) {
            this.f4508a.putInt("deviceType", i);
            return this;
        }

        /* renamed from: j */
        public C0984a mo4636j(boolean z) {
            this.f4508a.putBoolean("enabled", z);
            return this;
        }

        /* renamed from: k */
        public C0984a mo4637k(Bundle bundle) {
            this.f4508a.putBundle("extras", bundle);
            return this;
        }

        /* renamed from: l */
        public C0984a mo4638l(Uri uri) {
            if (uri != null) {
                this.f4508a.putString("iconUri", uri.toString());
                return this;
            }
            throw new IllegalArgumentException("iconUri must not be null");
        }

        /* renamed from: m */
        public C0984a mo4639m(String str) {
            this.f4508a.putString(TtmlNode.ATTR_ID, str);
            return this;
        }

        /* renamed from: n */
        public C0984a mo4640n(String str) {
            this.f4508a.putString(MediationMetaData.KEY_NAME, str);
            return this;
        }

        /* renamed from: o */
        public C0984a mo4641o(int i) {
            this.f4508a.putInt("playbackStream", i);
            return this;
        }

        /* renamed from: p */
        public C0984a mo4642p(int i) {
            this.f4508a.putInt("playbackType", i);
            return this;
        }

        /* renamed from: q */
        public C0984a mo4643q(int i) {
            this.f4508a.putInt("presentationDisplayId", i);
            return this;
        }

        /* renamed from: r */
        public C0984a mo4644r(int i) {
            this.f4508a.putInt("volume", i);
            return this;
        }

        /* renamed from: s */
        public C0984a mo4645s(int i) {
            this.f4508a.putInt("volumeHandling", i);
            return this;
        }

        /* renamed from: t */
        public C0984a mo4646t(int i) {
            this.f4508a.putInt("volumeMax", i);
            return this;
        }

        public C0984a(C0983l lVar) {
            if (lVar != null) {
                this.f4508a = new Bundle(lVar.f4505a);
                if (!lVar.mo4611k().isEmpty()) {
                    this.f4509b = new ArrayList<>(lVar.mo4611k());
                }
                if (!lVar.mo4607g().isEmpty()) {
                    this.f4510c = new ArrayList<>(lVar.f4507c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
