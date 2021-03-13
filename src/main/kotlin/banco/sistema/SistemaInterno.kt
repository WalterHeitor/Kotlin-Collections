package Alura.sistema

import Alura.Funcionario.Autenticavel


class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String, autenticado: () -> Unit={}){
        if(admin.autentica(senha)){
            println("Bem vindo ao WalterBank ")
            autenticado()
        }else {
            println("Falha na autenticacao")
        }
    }
}