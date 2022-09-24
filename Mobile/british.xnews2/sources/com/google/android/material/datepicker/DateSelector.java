package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import p104l0.C5644d;

public interface DateSelector<S> extends Parcelable {
    /* renamed from: H */
    Collection<C5644d<Long, Long>> mo40418H();

    /* renamed from: U */
    View mo40419U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C10133l<S> lVar);

    /* renamed from: c */
    String mo40420c(Context context);

    /* renamed from: f0 */
    int mo40421f0(Context context);

    /* renamed from: k0 */
    boolean mo40422k0();

    /* renamed from: o0 */
    Collection<Long> mo40423o0();

    /* renamed from: r0 */
    S mo40424r0();

    /* renamed from: x0 */
    void mo40425x0(long j);
}
