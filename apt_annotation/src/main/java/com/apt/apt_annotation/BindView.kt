package com.apt.apt_annotation

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class BindView(val value: Int)

