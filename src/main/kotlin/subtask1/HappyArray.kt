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


        var sadArrayNew = sadArray.toCollection(ArrayList())

        var ss = sadArray.size - 2

        for (i in 1..ss) {
            if (sadArray[i] > (sadArray[i - 1] + sadArray[i + 1])) {
                sadArrayNew.remove(sadArray[i])


            }

        }
        var sadArrayResult = sadArrayNew
            .toIntArray()


        var sadArrayNew1 = sadArrayResult.toCollection(ArrayList())

        var sss = sadArrayResult.size - 2

        for (i in 1..sss) {
            if (sadArrayResult[i] > (sadArrayResult[i - 1] + sadArrayResult[i + 1])) {
                sadArrayNew1.remove(sadArrayResult[i])


            }

        }
        var sadArrayResult1 = sadArrayNew1.toIntArray()
        return sadArrayResult1
        throw NotImplementedError("Not implemented")

    }
}
