System.in.withReader {
    def country = []

    for (i in 0..9)
        country << it.readLine()

    country.each() {  it }
    println(country)
}
