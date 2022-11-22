package kr.ac.kumoh.S20180735

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val songs = ArrayList<String>()
    private val _list = MutableLiveData<ArrayList<String>>()
    val list: LiveData<ArrayList<String>>
        get() = _list

    init {
        _list.value = songs
    }

    //fun get() : LiveData<ArrayList<String>> = list
    fun add(song : String) {
        songs.add(song)
        _list.value = songs
    }
   // fun getSong(i: Int) = songs[i]
   // fun getSize() = songs.size
}