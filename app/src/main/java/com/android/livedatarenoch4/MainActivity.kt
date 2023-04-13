package com.android.livedatarenoch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.livedatarenoch4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
lateinit var binding : ActivityMainBinding
lateinit var adapterBarang : BarangAdapter
//vm//deklar var vm
lateinit var barangViewModel: BarangViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //vm // inisialisasi aka init barng viewmodel dan adapter barang
        barangViewModel = ViewModelProvider(this).get(BarangViewModel::class.java)
        adapterBarang = BarangAdapter(ArrayList())

        //observe data dari vm - livedata
        barangViewModel.getData()
        barangViewModel.barangVM.observe(this, Observer {
            //memanggil function callback dari adapter
            adapterBarang.getDataBarang(it as ArrayList<ListBarang>)
        })

        binding.rvProduct.adapter = adapterBarang
        //perubahan kolom menjadi 3
        val lm = GridLayoutManager(this,3)
        binding.rvProduct.layoutManager = lm

    }
}