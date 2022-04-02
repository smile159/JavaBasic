# JavaBasic

# 前言

本项目只是本人学习Java使用的，可能有错误，仅供参考

# 环境

* IDEA 2021.1
* JDK1.8

# 日期类

## 1.Date(java.util.Date)

**该类大量方法已经被弃用，只有少量方法可以使用**

### 1.1 Date()

**源码**

```java
public Date(){
    this(System.currentTimeMillis());
}
```

**功能**

空参构造函数，调用自身的有参构造并传入System.currentTimeMillis()参数

### 1.2 Date(long date)

**源码**

```java
public Date(long date){
    fastTime=date;
}
```

**分析**

有参构造函数

### 1.3 getTime()

**源码**

```java
public long getTime(){
    return getTimeImpl();
}
```

**功能**

获取long类型的时间戳

**分析**

通过内部的getTimeImpl函数返回fastTime，最终 得到一个long类型的时间戳

### 1.4 setTime(long time)
**源码**
```java
public void setTime(long time) {
    fastTime = time;
    cdate = null;
}
```
**功能**

设置Date的fastTime属性

**分析**

将传进来的time给fastTime

### 1.5 before(Date when)
**源码**
```java
public boolean before(Date when) {
    return getMillisOf(this) < getMillisOf(when);
}
```
**功能**

判断指定when日期是否在Date日期之前

**分析**

通过获取两个日期的时间戳进行比较

### 1.6 after(Date when)
**源码**
```java
public boolean after(Date when) {
    return getMillisOf(this) > getMillisOf(when);
}
```
**功能**

判断指定when日期是否在Date日期之后

**分析**

通过获取两个日期的时间戳进行比较


### 1.7 equals(Object obj)

**源码**
```java
public boolean equals(Object obj) {
    return obj instanceof Date && getTime() == ((Date) obj).getTime();
}
```
**功能**

判断两个日期是否相等

**分析**

先判断参数是否是Date的实例，再强转使用==判断

### 1.8 compareTo(Date anotherDate)
**源码**
```java
public int compareTo(Date anotherDate) {
    long thisTime = getMillisOf(this);
    long anotherTime = getMillisOf(anotherDate);
    return (thisTime<anotherTime ? -1 : (thisTime==anotherTime ? 0 : 1));
}
```
**功能**

比较两个日期是否相等

**分析**

略


### 1.9 from(Instant instant)*
**源码**
```java
public static Date from(Instant instant) {
    try {
    return new Date(instant.toEpochMilli());
    } catch (ArithmeticException ex) {
    throw new IllegalArgumentException(ex);
    }
}
```
**功能**

将Instant对象转换成Date对象

**分析**

略

### 1.10 Instant toInstant()

**源码**
```java
public Instant toInstant() {
    return Instant.ofEpochMilli(getTime());
    }
```
**功能**

将Date转换成Instant对象

**分析**

略

## Date(java.sql.Date)

## Instant

## LocalDate

## LocalTime

## LocalDateTime