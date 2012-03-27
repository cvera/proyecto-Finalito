
package modelos;


public class Usuario {
    String nombre;
<<<<<<< HEAD
    String apellidoPaterno;
    String apellidoMaterno;
    String dni;
    String correoE;
    String fechaIngreso;
    String userName;
    String passWord;
    String confpassWord;
    String cargo;
    String rol;

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.correoE = correoE;
        this.fechaIngreso = fechaIngreso;
        this.userName = userName;
        this.passWord = passWord;
        this.confpassWord = confpassWord;
        this.cargo = cargo;
        this.rol = rol;
    }

   

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getConfpassWord() {
        return confpassWord;
    }

    public void setConfpassWord(String confpassWord) {
        this.confpassWord = confpassWord;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
=======
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
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
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

<<<<<<< HEAD
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

=======
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
<<<<<<< HEAD
    

    
    
=======
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
}
