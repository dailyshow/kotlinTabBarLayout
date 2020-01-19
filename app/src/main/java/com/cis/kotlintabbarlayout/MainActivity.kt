package com.cis.kotlintabbarlayout

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var fragList = ArrayList<SubFragment>()
    var titleList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        tabs.setTabTextColors(Color.WHITE, Color.RED)

        for (i in 0..9) {
            val sub = SubFragment()
            sub.str1 = "Sub ${i + 1}"

            fragList.add(sub)
            titleList.add("tab ${i + 1}")
        }

        pager.adapter = PagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(pager)
    }

    inner class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
        override fun getItem(position: Int): Fragment {
            return fragList.get(position)
        }

        override fun getCount(): Int {
            return fragList.size
        }

        // tab버튼에 표시될 타이틀
        override fun getPageTitle(position: Int): CharSequence? {
            return titleList.get(position)
        }
    }
}
