package com.android.livedatarenoch4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.livedatarenoch4.databinding.ItemBarangBinding
import java.util.ArrayList

class BarangAdapter(var listBarang : ArrayList<ListBarang>): RecyclerView.Adapter<BarangAdapter.ViewHolder>() {
    class ViewHolder(val binding : ItemBarangBinding):RecyclerView.ViewHolder(binding.root) {
        fun bindBarang(itemData : ListBarang){
            binding.barang = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    var view = ItemBarangBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindBarang(listBarang[position])
        }

    override fun getItemCount(): Int {
    return listBarang.size
    }

    //method untuk recall data
    //buat function getdatabarang
    //akan dibanggil di main activity
    fun getDataBarang(itemBarang : ArrayList<ListBarang>){
        //listBarang dari variable constructor arlst pada class barangadapter
        this.listBarang = itemBarang
    }
}