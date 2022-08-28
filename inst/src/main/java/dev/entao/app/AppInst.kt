@file:Suppress("MemberVisibilityCanBePrivate", "unused", "ObjectPropertyName")

package dev.entao.app

import android.app.Application
import android.content.Context

object AppInst {
    private var _appContext: Context? = null

    //invoke this function before all
    fun setApplicationContext(context: Context) {
        _appContext = if (context is Application) {
            context
        } else {
            context.applicationContext
        }
    }


    val context: Context by lazy {
        _appContext ?: error("You should invoke setApplicationContext(context) first!")
    }

    val density: Float by lazy {
        context.resources.displayMetrics.density
    }
    val scaledDensity: Float by lazy {
        context.resources.displayMetrics.scaledDensity
    }
}