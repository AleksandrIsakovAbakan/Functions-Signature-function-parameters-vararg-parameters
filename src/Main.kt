fun main() {
    var a = 5
    val n = 7
    println("Функция возведения числа $a в степень $n: " + raisingNumberToPower(a, n))
    println()

    a = 5
    var b = 8
    println("вычисляет произведение всех целых чисел от $a до $b включительно: "
            + productOfAllIntegersFromAToBInclusive(a, b))
    println()

    a = 18
    b = 48
    println("Вычисленный наибольший общий делитель $a и $b : " + calculatedGreatestCommonDivisor(a, b))
}

/*
Написать функцию возведения числа a в степень n.
*/
fun raisingNumberToPower(a: Int, n: Int): Int{
    var temp = 0
    for (i in 1..n) if (i == 1) temp = a else temp *= a
    return temp
}

/*
Написать функцию, которая принимает два целых числа a и b (a<b).
Она вычисляет произведение всех целых чисел от a до b включительно.
*/
fun productOfAllIntegersFromAToBInclusive(a: Int, b: Int): Int {
    var result = 0
    for (i in a..b) if (i == a) result = a else result *= i
    return result
}

/*
Написать функцию, которая принимает два целых числа a и b.
Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 */
fun calculatedGreatestCommonDivisor(a: Int, b: Int): Int {
    var aTemp = a
    var bTemp = b
    while (bTemp != 0) {
        val temp = aTemp % bTemp
        aTemp = bTemp
        bTemp = temp
    }
    return aTemp
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/