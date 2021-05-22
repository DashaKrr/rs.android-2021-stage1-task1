package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum=bill.sum()
        val sumTogether=sum-bill[k]
        val result=when{
            b==sumTogether/2->"Bon Appetit"
            b>sumTogether/2->b-sumTogether/2
            else -> throw NotImplementedError("Not implemented")
        }
        return result.toString()

    }
}
