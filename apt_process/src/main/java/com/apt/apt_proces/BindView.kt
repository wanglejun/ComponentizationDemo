package com.apt.apt_proces

import com.apt.apt_annotation.BindView
import com.google.auto.service.AutoService
import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.TypeSpec
import java.io.IOException
import java.util.*
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.element.TypeElement

//@AutoService(Processor::class)
class BindViewProcessor: AbstractProcessor() {
    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        var supportTypes = LinkedHashSet<String>()
        supportTypes.add(BindView::class.java.canonicalName)
        return supportTypes
    }

    override fun process(p0: MutableSet<out TypeElement>?, p1: RoundEnvironment?): Boolean {
        //创建类
        val autoClass = TypeSpec.classBuilder("AutoClass").build()
        val javaFile = JavaFile.builder("com.apt.apt_process",autoClass).build()
        try {
            javaFile.writeTo(processingEnv.filer)
        }catch (e:IOException){
            e.printStackTrace()
        }
        return true
    }
}
