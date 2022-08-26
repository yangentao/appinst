@file:Suppress("unused")

package dev.entao.app

import android.view.View

//dp => px
val Int.dp: Int get() = (this * AppInst.density).toInt()
val Float.dp: Float get() = this * AppInst.density
val Double.dp: Double get() = this * AppInst.density

//sp => px
val Int.sp: Int get() = (this * AppInst.scaledDensity).toInt()
val Float.sp: Float get() = this * AppInst.scaledDensity
val Double.sp: Double get() = this * AppInst.scaledDensity

fun <T : View> T.requireId(): T {
    if (this.id == View.NO_ID) {
        this.id = View.generateViewId()
    }
    return this
}

val View.idx: Int
    get() {
        if (this.id == View.NO_ID) {
            this.id = View.generateViewId()
        }
        return this.id
    }

