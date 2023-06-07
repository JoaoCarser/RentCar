/*
*   Transferencias de objetos. 
*   Recebemos atraves dele os objetos e podemos fornecer eles a qualquer momento.
*/
package DTO;


public class UsuarioDTO {
    
    private int idUsuario;
    private String loginUser, senhaUser;

    
    public int getIdUsuario() {
        return idUsuario;
    }

    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    public String getLoginUser() {
        return loginUser;
    }

   
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

   
    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }
}
