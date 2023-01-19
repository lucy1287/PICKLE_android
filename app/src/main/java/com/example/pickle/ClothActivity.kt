package com.example.pickle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.pickle.databinding.ActivityClothBinding

class ClothActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityClothBinding
    private lateinit var viewpager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewBinding = ActivityClothBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        //어댑터 설정
        viewpager = viewBinding.viewPager2
        viewpager.adapter = ViewPagerAdapter(getImageList())
        viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        //indicator 설정
        val indicator = viewBinding.indicator
        indicator.setViewPager(viewpager)

        val btnOrder = viewBinding.btnOrder
        btnOrder.setOnClickListener {
            val bottomSheet = BottomSheetFragment(applicationContext)
            //bottomSheet.setContentView(R.layout.fragment_bottom_sheet)
            bottomSheet.show(supportFragmentManager, bottomSheet.tag)
        }
    }

    private fun getImageList(): ArrayList<Int> {
        return arrayListOf<Int>(
            R.drawable.cardigan1,
            R.drawable.cardigan2,
            R.drawable.cardigan3,
            R.drawable.cardigan4)
    }
}