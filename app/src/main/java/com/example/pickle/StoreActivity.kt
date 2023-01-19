package com.example.pickle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pickle.databinding.ActivityPickupBinding
import com.example.pickle.databinding.ActivityStoreBinding

class StoreActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStoreBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStoreBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val dataList: ArrayList<Data> = arrayListOf()

        dataList.apply {
            add(Data("매장1", "옷1", "10000"))
            add(Data("매장1", "옷2", "15000"))
            add(Data("매장1", "옷3", "10000"))
            add(Data("매장1", "옷4", "20000"))
            add(Data("매장1", "옷5", "10000"))
        }

        val dataRVadapter = DataRVAdapter(dataList)

        viewBinding.rvData.adapter = dataRVadapter
        viewBinding.rvData.layoutManager = GridLayoutManager(applicationContext, 2)
    }
}