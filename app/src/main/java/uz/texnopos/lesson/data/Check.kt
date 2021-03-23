package uz.texnopos.lesson.data

class Check<T>(val a: T, val b: T) {
    fun max() : T {
        if (a is Int) {
            if ((a as Int) > (b as Int)) return a
            else return b
        } else {
            return a
        }

    }
}
