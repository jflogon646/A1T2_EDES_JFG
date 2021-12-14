fun main() {
    print("Introduzca una serie de numeros separados por comas: ")
    var texto = readLine()!!
    var listadoTexto = texto.split(",".toRegex()).toTypedArray()
    var cantidad = listadoTexto.size
    var listaNumeros = IntArray(cantidad)

    for (i in (0 until cantidad)) {
        listaNumeros[i] = listadoTexto[i].toInt()
    }

    var temporal = 0

    for (i in (0 until cantidad - 1)) {
        for (j in (0 until cantidad - 1)) {
            if (listaNumeros[j] > listaNumeros[j + 1]) {
                temporal = listaNumeros[j]
                listaNumeros[j] = listaNumeros[j + 1]
                listaNumeros[j + 1] = temporal
            }
        }
    }

    var salida: String = ""
    print("Lista de números ordenados de forma ascendente: ")
    for (i in (0 until cantidad)) {
        salida += "${listaNumeros[i]}"
        if (i != cantidad) {
            salida += ", "
        }
    }
    println(salida)
    salida = ""
    print("Lista de números ordenados de forma descendente: ")
    for (i in (cantidad - 1 downTo 0)) {
        salida += "${listaNumeros[i]}"
        if (i != 0) {
            salida += ", "
        }
    }
    println(salida)
}