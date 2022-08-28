@file:Suppress("unused")

package dev.entao.app

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.content.res.ResourcesCompat

val Int.resColor: Int get() = ResourcesCompat.getColor(AppInst.context.resources, this, AppInst.context.theme)
val Int.resDrawable: Drawable get() = ResourcesCompat.getDrawable(AppInst.context.resources, this, AppInst.context.theme) ?: error("NO image resource: $this ")
val Int.resString: String get() = AppInst.context.resources.getString(this)
val Int.resBitmap: Bitmap get() = BitmapFactory.decodeResource(AppInst.context.resources, this)


//dp => px
val Int.dp: Int get() = (this * AppInst.density).toInt()
val Float.dp: Float get() = this * AppInst.density
val Double.dp: Double get() = this * AppInst.density

//sp => px
val Int.sp: Float get() = this * AppInst.scaledDensity
val Float.sp: Float get() = this * AppInst.scaledDensity
val Double.sp: Float get() = (this * AppInst.scaledDensity).toFloat()

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


