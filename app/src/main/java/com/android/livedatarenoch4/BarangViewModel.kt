package com.android.livedatarenoch4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BarangViewModel : ViewModel() {
    val list = arrayListOf(
        ListBarang("Senter", "20000", "Dzulkipli", R.drawable.ic_launcher_foreground),
        ListBarang("Lakban", "5000", "Dzulkipli", R.drawable.ic_launcher_foreground),
        ListBarang("Baterai ABC", "2500", "Dzulkipli", R.drawable.ic_launcher_foreground),
        ListBarang("Kabel", "10000", "Dzulkipli", R.drawable.ic_launcher_foreground),
        ListBarang("Paku", "500", "Dzulkipli", R.drawable.ic_launcher_foreground)
    )

    val barangVM : MutableLiveData<List<ListBarang>> = MutableLiveData()

    //mengisi variabel product vm dengan data di arraylist
    fun getData(){
        barangVM.value = list
    }
}