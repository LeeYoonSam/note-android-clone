package com.ys.note.data.lcoal.converters

import androidx.room.TypeConverters
import java.util.Date

class DateConverter {
    @TypeConverters
    fun toDate(date: Long?): Date? {
        return date?.let { Date(it) }
    }

    @TypeConverters
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}