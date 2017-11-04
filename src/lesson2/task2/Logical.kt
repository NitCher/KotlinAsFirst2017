@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
        sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {

    return (number / 1000 + (number % 1000 / 100) == number % 100 / 10 + number % 10)
}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = TODO()

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(x1: Double, y1: Double, r1: Double,
                 x2: Double, y2: Double, r2: Double): Boolean {
    return r2 >= r1 + Math.sqrt(sqr(x1 - x2) + sqr(y1 - y2))
}



/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = when {
  a <= r && b <= r && (a <= s || b <= s) -> true
  a <= r && c <= r && (a <= s || c <= s) -> true
  b <= r && c <= r && (b <= s || c <= s) -> true
  a <= s && b <= s && (a <= r || b <= r) -> true
  a <= s && c <= s && (a <= r || c <= r) -> true
  b <= s && c <= s && (b <= r || c <= r) -> true
  else -> false
}

/*
Я попытался написать слеюдующую программу:
{
    val max1 = maxOf(a, b, c)
    val max2 = when {
        max1 == a -> maxOf(b, c)
        max1 == b -> maxOf(a, c)
        else -> maxOf(b, a)
    }
    when {
         (max1 <= s && max2 <= s) && (max1 <= r || max2 <= r) -> true
         (max1 <= r && max2 <= r) && (max1 <= s || max2 <= s) -> true
         else -> false
    }
}
Но она, все же, выдавала ошибку, могу узнать где я... сделал не так ?
*/

