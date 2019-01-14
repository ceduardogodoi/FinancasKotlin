package br.com.alura.financaskotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financaskotlin.R
import br.com.alura.financaskotlin.model.Tipo
import br.com.alura.financaskotlin.model.Transacao
import br.com.alura.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
            Transacao(tipo = Tipo.DESPESA, data = Calendar.getInstance(), valor = BigDecimal(20.5)), // Named Parameter
            Transacao(BigDecimal(100.0), "Economia", Tipo.RECEITA),
            Transacao(valor = BigDecimal(200.0), tipo = Tipo.DESPESA),
            Transacao(valor = BigDecimal(500.0), categoria = "Premio", tipo = Tipo.RECEITA)
        )

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}
