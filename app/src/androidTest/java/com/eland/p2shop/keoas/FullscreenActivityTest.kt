package com.eland.p2shop.keoas

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.MediumTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.eland.p2shop.keoas.Activity.MainActivity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.ExternalResource
import org.junit.runner.RunWith

/**
 * Created by liuwenbin on 2017/12/13.
 * 虽然青春不在，但不能自我放逐.
 */
@RunWith(AndroidJUnit4::class)
@MediumTest
class FullscreenActivityTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<FullscreenActivity>(FullscreenActivity::class.java)

    @Test
    fun handleGoLoginActivity() {
        onView(withId(R.id.dummy_button)).perform(click())
    }

    companion object {
        val fullRule: ExternalResource = object : ExternalResource() {
            override fun before() {

            }
        }
    }

}