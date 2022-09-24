package com.startapp;

import com.startapp.networkTest.enums.MultiSimVariants;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.startapp.s6 */
/* compiled from: Sta */
public class C12179s6 implements Cloneable {
    public int ActiveSimCount = -1;
    public int ActiveSimCountMax = -1;
    public int DefaultDataSimId = -1;
    public int DefaultSimId = -1;
    public int DefaultSmsSimId = -1;
    public int DefaultVoiceSimId = -1;
    public MultiSimVariants MultiSimVariant = MultiSimVariants.Unknown;
    @C5010hb(type = ArrayList.class, value = C12166r9.class)
    public ArrayList<C12166r9> SimInfos = new ArrayList<>();

    public C12166r9 getDefaultDataSimInfo() {
        Iterator<C12166r9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C12166r9 next = it.next();
            if (next.SubscriptionId == this.DefaultDataSimId) {
                return next;
            }
        }
        return new C12166r9();
    }

    public C12166r9 getDefaultSmsSimInfo() {
        Iterator<C12166r9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C12166r9 next = it.next();
            if (next.SubscriptionId == this.DefaultSmsSimId) {
                return next;
            }
        }
        return new C12166r9();
    }

    public C12166r9 getDefaultVoiceSimInfo() {
        Iterator<C12166r9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C12166r9 next = it.next();
            if (next.SubscriptionId == this.DefaultVoiceSimId) {
                return next;
            }
        }
        return new C12166r9();
    }

    public C12166r9 getSimInfoSubId(int i) {
        Iterator<C12166r9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C12166r9 next = it.next();
            if (next.SubscriptionId == i) {
                return next;
            }
        }
        return new C12166r9();
    }
}
