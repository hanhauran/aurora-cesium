package aurora.cesium.utils;

import cesiumlanguagewriter.JulianDate;

import java.sql.Timestamp;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public final class Times {
    private Times() {}

    public static JulianDate trans2JulianDate(ZonedDateTime zonedDateTime) {
        return new JulianDate(zonedDateTime);
    }

    public static JulianDate trans2JulianDate(LocalDateTime localDateTime) {
        return new JulianDate(localDateTime.atZone(ZoneId.systemDefault()));
    }

    public static JulianDate trans2JulianDate(Date date) {
        return trans2JulianDate(trans2LocalDateTime(date));
    }

    public static JulianDate trans2JulianDate(Calendar calendar) {
        return trans2JulianDate(trans2LocalDateTime(calendar));
    }

    public static JulianDate trans2JulianDate(Timestamp timestamp) {
        return trans2JulianDate(trans2LocalDateTime(timestamp));
    }

    public static JulianDate trans2JulianDate(Instant instant) {
        return trans2JulianDate(trans2LocalDateTime(instant));
    }

    public static Date trans2Date(Calendar calendar) {
        return Date.from(calendar.toInstant());
    }

    public static Date trans2Date(Timestamp timestamp) {
        return Date.from(timestamp.toInstant());
    }

    public static Date trans2Date(Instant instant) {
        return Date.from(instant);
    }

    public static Date trans2Date(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date trans2Date(ZonedDateTime zonedDateTime) {
        return Date.from(zonedDateTime.toInstant());
    }

    public static Calendar trans2Calendar(Date date) {
        return GregorianCalendar.from(ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
    }

    public static Calendar trans2Calendar(Timestamp timestamp) {
        return GregorianCalendar.from(ZonedDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault()));
    }

    public static Calendar trans2Calendar(Instant instant) {
        return GregorianCalendar.from(ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()));
    }

    public static Calendar trans2Calendar(LocalDateTime localDateTime) {
        return GregorianCalendar.from(ZonedDateTime.of(localDateTime, ZoneId.systemDefault()));
    }

    public static Calendar trans2Calendar(ZonedDateTime zonedDateTime) {
        return GregorianCalendar.from(zonedDateTime);
    }

    public static Timestamp trans2Timestamp(Date date) {
        return Timestamp.from(date.toInstant());
    }

    public static Timestamp trans2Timestamp(Calendar calendar) {
        return Timestamp.from(calendar.toInstant());
    }

    public static Timestamp trans2Timestamp(Instant instant) {
        return Timestamp.from(instant);
    }

    public static Timestamp trans2Timestamp(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime);
    }

    public static Timestamp trans2Timestamp(ZonedDateTime zonedDateTime) {
        return Timestamp.valueOf(zonedDateTime.toLocalDateTime());
    }

    public static Instant trans2Instant(Date date) {
        return date.toInstant();
    }

    public static Instant trans2Instant(Calendar calendar) {
        return calendar.toInstant();
    }

    public static Instant trans2Instant(Timestamp timestamp) {
        return timestamp.toInstant();
    }

    public static Instant trans2Instant(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.of(ZoneId.systemDefault().getId()));
    }

    public static Instant trans2Instant(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toInstant();
    }

    public static LocalDateTime trans2LocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDateTime trans2LocalDateTime(Calendar calendar) {
        return calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDateTime trans2LocalDateTime(Timestamp timestamp) {
        return timestamp.toLocalDateTime();
    }

    public static LocalDateTime trans2LocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public static LocalDateTime trans2LocalDateTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalDateTime();
    }

    public static LocalDate trans2LocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate trans2LocalDate(Calendar calendar) {
        return calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate trans2LocalDate(Timestamp timestamp) {
        return timestamp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate trans2LocalDate(Instant instant) {
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate trans2LocalDate(LocalDateTime localDateTime) {
        return localDateTime.toLocalDate();
    }

    public static LocalDate trans2LocalDate(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalDate();
    }

    public static LocalTime trans2LocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalTime trans2LocalTime(Calendar calendar) {
        return calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalTime trans2LocalTime(Timestamp timestamp) {
        return timestamp.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalTime trans2LocalTime(Instant instant) {
        return instant.atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalTime trans2LocalTime(LocalDateTime localDateTime) {
        return localDateTime.toLocalTime();
    }

    public static LocalTime trans2LocalTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalTime();
    }
}
