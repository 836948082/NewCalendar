package com.runtai.calendarlib.MaterialCalendar;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface OnDateLongChangedListener {

    void onDateLongChanged(@NonNull MaterialCalendarView widget, @Nullable CalendarDay date);

}
