package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray1 = sadArray.toCollection(ArrayList())
        var s = sadArray.size - 2
        for (i in 1..s) {
            if (sadArray[i] > (sadArray[i - 1] + sadArray[i + 1])) {
                sadArray1.remove(sadArray[i])


            }


        }

        var sadArray = sadArray1.toIntArray()
        return sadArray
        throw NotImplementedError("Not implemented")

    }
}
