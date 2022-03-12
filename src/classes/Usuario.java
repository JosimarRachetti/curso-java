package classes;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;
// sobre escrevendo metodo equals padrão para validar se objetos são iguais
    public boolean equals(Object objeto) {
        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;

        }else{
            return false;
        }
    }

}
