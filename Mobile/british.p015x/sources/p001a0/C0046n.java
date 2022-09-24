package p001a0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: a0.n */
/* compiled from: RemoteInput */
public final class C0046n {

    /* renamed from: a */
    private final String f154a;

    /* renamed from: b */
    private final CharSequence f155b;

    /* renamed from: c */
    private final CharSequence[] f156c;

    /* renamed from: d */
    private final boolean f157d;

    /* renamed from: e */
    private final int f158e;

    /* renamed from: f */
    private final Bundle f159f;

    /* renamed from: g */
    private final Set<String> f160g;

    /* renamed from: a */
    static RemoteInput m179a(C0046n nVar) {
        Set<String> d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(nVar.mo129i()).setLabel(nVar.mo128h()).setChoices(nVar.mo125e()).setAllowFreeFormInput(nVar.mo123c()).addExtras(nVar.mo127g());
        if (Build.VERSION.SDK_INT >= 26 && (d = nVar.mo124d()) != null) {
            for (String allowDataType : d) {
                addExtras.setAllowDataType(allowDataType, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(nVar.mo126f());
        }
        return addExtras.build();
    }

    /* renamed from: b */
    static RemoteInput[] m180b(C0046n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            remoteInputArr[i] = m179a(nVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: c */
    public boolean mo123c() {
        return this.f157d;
    }

    /* renamed from: d */
    public Set<String> mo124d() {
        return this.f160g;
    }

    /* renamed from: e */
    public CharSequence[] mo125e() {
        return this.f156c;
    }

    /* renamed from: f */
    public int mo126f() {
        return this.f158e;
    }

    /* renamed from: g */
    public Bundle mo127g() {
        return this.f159f;
    }

    /* renamed from: h */
    public CharSequence mo128h() {
        return this.f155b;
    }

    /* renamed from: i */
    public String mo129i() {
        return this.f154a;
    }

    /* renamed from: j */
    public boolean mo130j() {
        return !mo123c() && (mo125e() == null || mo125e().length == 0) && mo124d() != null && !mo124d().isEmpty();
    }
}
