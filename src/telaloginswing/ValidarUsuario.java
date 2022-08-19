package telaloginswing;
public class ValidarUsuario {
    
    static boolean validarUsuario(String nome, String senha){
        String[] nomeUsuario = new String[]{"Rodrigo"};
        String[] senhaUsuario = new String[]{"1234"};
        boolean nomeValidacao = false, senhaValidacao = false;
        
        for(String nomes : nomeUsuario){
            if(nome.equals(nomes)){
                nomeValidacao = true;
            }
        }
        for(String senhas : senhaUsuario){
            if(senha.equals(senhas)){
                senhaValidacao = true;
            }
        }
        boolean resultado = ((nomeValidacao == true) && (senhaValidacao == true));
        return resultado;
    }   
}
