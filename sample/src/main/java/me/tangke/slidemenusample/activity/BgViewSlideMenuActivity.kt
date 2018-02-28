package me.tangke.slidemenusample.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.Gravity
import me.tangke.slidemenu.anko.slideMenu
import org.jetbrains.anko.*

/**
 * Created by niantuo on 2018/2/28.
 * 添加默认的背景
 */

class BgViewSlideMenuActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        slideMenu {
            frameLayout {
                backgroundResource = android.R.color.holo_red_dark
                textView {
                    text = "背景view"
                }
            }.lparams(matchParent, matchParent)

            frameLayout {
                backgroundResource = android.R.color.black
                textView {
                    text = "菜单菜单菜单菜单"
                    textColor = resources.getColor(android.R.color.white)
                }.lparams {
                    gravity = Gravity.CENTER_VERTICAL
                }
            }.lparams(dip(200), matchParent, rolePrimaryMenu)

            frameLayout {
                textView {
                    text = "内容view"
                }.lparams {
                    gravity = Gravity.CENTER
                }
                backgroundResource = android.R.color.transparent
            }.lparams(matchParent, matchParent, roleContent)
        }

    }
}
