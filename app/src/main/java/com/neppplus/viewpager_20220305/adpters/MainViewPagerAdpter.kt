package com.neppplus.viewpager_20220305.adpters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20220305.fragments.HelloFragment
import com.neppplus.viewpager_20220305.fragments.MyInfoFragment
import com.neppplus.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdpter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3

    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {

            return MyNameFragment()

        }
        else if (position == 1) {

            return  MyInfoFragment()

        }
        else {

            return  HelloFragment()

        }

    }

}