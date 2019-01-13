package br.com.alura.financaskotlin.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String {
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro, Locale("pt", "BR"))

    return format.format(this.time)
}
