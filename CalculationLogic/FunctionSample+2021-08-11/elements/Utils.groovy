/**
 *
 * @param number - some number to round
 * @param decimalPlaces
 * @return
 */

BigDecimal round(BigDecimal number, int decimalPlaces) {
    if (number == null) {
        return null
    }
    return number.setScale(decimalPlaces, RoundingMode.HALF_UP)
}

String fullName(String firstName, String lastName) {
    return lastName+", "+firstName
}