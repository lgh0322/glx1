package com.vaca.glx1

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet

class Fuck1 : GLSurfaceView {

    constructor(context: Context) : super(context) {
        init()
    }


    constructor(context: Context,attrs:AttributeSet) : super(context,attrs) {
        init()
    }
    fun init(){
        setEGLContextClientVersion(2)
        preserveEGLContextOnPause=true
        setRenderer(Fuck2())
    }

}