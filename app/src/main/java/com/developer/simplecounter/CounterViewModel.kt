package com.developer.simplecounter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    val repo = CounterModel.CounterRepo()
    private val _count = mutableStateOf(repo.getCounter().count)
    val count: MutableState<Int> = _count

    fun increment(){
        repo.increment()
        _count.value = repo.getCounter().count
    }

    fun decrement(){
        repo.decrement()
        _count.value = repo.getCounter().count
    }
}