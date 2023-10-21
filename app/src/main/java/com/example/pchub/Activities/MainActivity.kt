package com.example.pchub.Activities

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.pchub.Fragment.GuideFragment
import com.example.pchub.Fragment.HomeFragment
import com.example.pchub.Fragment.UserFragment
import com.example.pchub.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: MeowBottomNavigation = findViewById(R.id.bottomNavigation)
        addFragment(HomeFragment.newInstance())
        bottomNavigation.show(1)
        bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.baseline_book_24))
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.outline_home_work_24))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.baseline_shopping_bag_24))

        bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                0 -> {
                    replaceFragment(GuideFragment.newInstance())
                }

                1 -> {
                    replaceFragment(HomeFragment.newInstance())
                }

                2 -> {
                    replaceFragment(UserFragment.newInstance())
                }
            }
        }
        val fragmentToLoad = intent.getIntExtra("fragmentToLoad", -1)
        if (fragmentToLoad != -1) {
            when (fragmentToLoad) {
                0 -> {
                    replaceFragment(HomeFragment.newInstance())
                }

                1 -> {
                    replaceFragment(GuideFragment.newInstance())
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentcontainer ,fragment).addToBackStack(fragment::class.java.simpleName).commit()

    }

    private fun addFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentcontainer ,fragment).addToBackStack(fragment::class.java.simpleName).commit()
    }


}