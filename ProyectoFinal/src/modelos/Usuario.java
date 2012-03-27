
package modelos;


public class Usuario {
    String nombre;
    String apellido;
    String userName;
    String passWord;

    public Usuario(String nombre, String apellido, String userName, String passWord) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
