package com.dio.santander.banklineapi.doman

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //ToDo Mapear "idConta -> idCorrentista"
    val idCorrentista: Int
)
