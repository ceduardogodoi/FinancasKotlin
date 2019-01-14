package br.com.alura.financaskotlin.model

import java.math.BigDecimal
import java.util.Calendar

/* Internamente o Kotlin esta usando getters and setters */
class Transacao(val valor: BigDecimal,
                val categoria: String = "Indefinida",
                val tipo: Tipo,
                val data: Calendar = Calendar.getInstance())
