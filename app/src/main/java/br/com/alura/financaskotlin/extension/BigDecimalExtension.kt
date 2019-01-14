package br.com.alura.financaskotlin.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formataParaBrasileiro(): String {
    val formatoBrasileiro = DecimalFormat.getCurrencyInstance(Locale("pt", "BR"))

    return formatoBrasileiro.format(this)
}