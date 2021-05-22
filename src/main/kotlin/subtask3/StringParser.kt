package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = inputString.substringAfter('<').substringBefore('>')
        val result1 = inputString.substringAfter('(').substringBefore(')')
        val result2 = inputString.substringAfter('[').substringBefore(']')
        val mass: Array<String> = arrayOf(result, result2, result1)

        return mass
        throw NotImplementedError("Not implemented")
    }
}
