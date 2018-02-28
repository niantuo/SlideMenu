package me.tangke.slidemenu.anko

import android.app.Activity
import android.content.Context
import android.view.View
import me.tangke.slidemenu.SlideMenu
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.wrapContent

/**
 * Created by niantuo on 2018/2/28.
 * 侧边栏
 */
open class _SlideMenu(ctx: Context) : SlideMenu(ctx) {

    val roleContent = Role.CONTENT
    val rolePrimaryMenu = Role.PRIMARY
    val roleSecondMenu = Role.SECOND

    fun <T : View> T.lparams(
            width: Int = wrapContent,
            height: Int = wrapContent,
            role: Role = Role.DEFAULT
    ): T {
        val layoutParams = SlideMenu.LayoutParams(width, height, role.role)
        this@lparams.layoutParams = layoutParams
        return this
    }

    enum class Role(val role: Int) {
        CONTENT(LayoutParams.ROLE_CONTENT), PRIMARY(LayoutParams.ROLE_PRIMARY_MENU),
        SECOND(LayoutParams.ROLE_SECONDARY_MENU), DEFAULT(LayoutParams.ROLE_DEFAULT)
    }
}

fun Activity.slideMenu(): _SlideMenu {
    return slideMenu { }
}

inline fun Activity.slideMenu(init: (_SlideMenu.() -> Unit)): _SlideMenu {
    return ankoView({ _SlideMenu(it) }, 0, init)
}
