package com.developer.simplecounter

data class CounterModel(var count: Int) {

    class CounterRepo{
        private val counter = CounterModel(0)

        fun getCounter() = counter

        fun increment(){
            ++counter.count
        }

        fun decrement(){
            --counter.count
        }
    }
}