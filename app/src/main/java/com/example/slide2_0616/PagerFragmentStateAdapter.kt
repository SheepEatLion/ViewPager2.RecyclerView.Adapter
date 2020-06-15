package com.example.slide2_0616


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter


class PagerFragmentStateAdapter(private val bgColors: List<Int>, fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment =
        PagerFragment.newInstance(bgColors[position], position)

    override fun getCount(): Int = bgColors.size

}