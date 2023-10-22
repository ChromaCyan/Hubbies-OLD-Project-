package com.example.onboarding

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.pchub.Activities.ViewPageAdapter
import com.example.pchub.R
import com.example.pchub.viewmodel.mainscreen

class Startup : AppCompatActivity() {

    private lateinit var mSlideViewPager: ViewPager
    private lateinit var mDotLayout: LinearLayout
    private lateinit var backBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var skipBtn: Button
    private lateinit var dots: Array<TextView>
    private lateinit var viewPagerAdapter: ViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)

        backBtn = findViewById(R.id.backBtn)
        nextBtn = findViewById(R.id.nextBtn)
        skipBtn = findViewById(R.id.skipButton)
        mSlideViewPager = findViewById(R.id.slideViewPager)


        backBtn.setOnClickListener {
            if (getItem(0) > 0) {
                mSlideViewPager.setCurrentItem(getItem(-1), true)
            }
        }

        nextBtn.setOnClickListener {
            if (getItem(0) < 3) {
                mSlideViewPager.setCurrentItem(getItem(1), true)
            } else {
                val intent = Intent(this, mainscreen::class.java)
                startActivity(intent)
                finish()
            }
        }

        skipBtn.setOnClickListener {
            val intent = Intent(this, mainscreen::class.java)
            startActivity(intent)
            finish()
        }

        viewPagerAdapter = ViewPageAdapter(this)
        mSlideViewPager.adapter = viewPagerAdapter

        setUpIndicator(0)
        mSlideViewPager.addOnPageChangeListener(viewListener)
    }

    private fun setUpIndicator(position: Int) {
        dots = Array(4) { TextView(this) }
        mDotLayout.removeAllViews()

        for (i in dots.indices) {
            dots[i] = TextView(this)
            dots[i].text = Html.fromHtml("&#8226")
            dots[i].textSize = 35f
            dots[i].setTextColor(resources.getColor(R.color.inactive, theme))
            mDotLayout.addView(dots[i])
        }

        dots[position].setTextColor(resources.getColor(R.color.active, theme))
    }

    private val viewListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            // Do nothing here
        }

        override fun onPageSelected(position: Int) {
            setUpIndicator(position)

            if (position > 0) {
                backBtn.visibility = View.VISIBLE
            } else {
                backBtn.visibility = View.INVISIBLE
            }
        }

        override fun onPageScrollStateChanged(state: Int) {
            // Do nothing here
        }
    }

    private fun getItem(i: Int): Int {
        return mSlideViewPager.currentItem + i
    }
}
